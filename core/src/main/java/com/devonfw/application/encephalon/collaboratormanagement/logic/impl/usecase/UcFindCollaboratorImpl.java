package com.devonfw.application.encephalon.collaboratormanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.CollaboratorEntity;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorCto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase.UcFindCollaborator;
import com.devonfw.application.encephalon.collaboratormanagement.logic.base.usecase.AbstractCollaboratorUc;

/**
 * Use case implementation for searching, filtering and getting Collaborators
 */
@Named
@Validated
@Transactional
public class UcFindCollaboratorImpl extends AbstractCollaboratorUc implements UcFindCollaborator {

  /**
   * Logger instance.
   */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCollaboratorImpl.class);

  @Override
  public CollaboratorEto findCollaborator(long id) {

    LOG.debug("Get Collaborator with id {} from database.", id);
    Optional<CollaboratorEntity> foundEntity = getCollaboratorRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), CollaboratorEto.class);
    else
      return null;
  }

  @Override
  public Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo criteria) {

    Page<CollaboratorEntity> collaborators = getCollaboratorRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(collaborators, CollaboratorEto.class);
  }

  @Override
  public CollaboratorCto findCollaboratorCto(long id) {

    LOG.debug("Get CollaboratorCto with id {} from database.", id);
    CollaboratorEntity entity = getCollaboratorRepository().find(id);
    CollaboratorCto cto = new CollaboratorCto();
    cto.setCollaborator(getBeanMapper().map(entity, CollaboratorEto.class));

    return cto;
  }

  @Override
  public Page<CollaboratorCto> findCollaboratorCtos(CollaboratorSearchCriteriaTo criteria) {

    Page<CollaboratorEntity> collaborators = getCollaboratorRepository().findByCriteria(criteria);
    List<CollaboratorCto> ctos = new ArrayList<>();
    for (CollaboratorEntity entity : collaborators.getContent()) {
      CollaboratorCto cto = new CollaboratorCto();
      cto.setCollaborator(getBeanMapper().map(entity, CollaboratorEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, collaborators.getTotalElements());
  }

}
