package com.devonfw.application.encephalon.collaboratormanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.CollaboratorEntity;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase.UcManageCollaborator;
import com.devonfw.application.encephalon.collaboratormanagement.logic.base.usecase.AbstractCollaboratorUc;

/**
 * Use case implementation for modifying and deleting Collaborators
 */
@Named
@Validated
@Transactional
public class UcManageCollaboratorImpl extends AbstractCollaboratorUc implements UcManageCollaborator {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageCollaboratorImpl.class);

  @Override
  public boolean deleteCollaborator(long collaboratorId) {

    CollaboratorEntity collaborator = getCollaboratorRepository().find(collaboratorId);
    getCollaboratorRepository().delete(collaborator);
    LOG.debug("The collaborator with id '{}' has been deleted.", collaboratorId);
    return true;
  }

  @Override
  public CollaboratorEto saveCollaborator(CollaboratorEto collaborator) {

    Objects.requireNonNull(collaborator, "collaborator");

    CollaboratorEntity collaboratorEntity = getBeanMapper().map(collaborator, CollaboratorEntity.class);

    // initialize, validate collaboratorEntity here if necessary
    CollaboratorEntity resultEntity = getCollaboratorRepository().save(collaboratorEntity);
    LOG.debug("Collaborator with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, CollaboratorEto.class);
  }
}
