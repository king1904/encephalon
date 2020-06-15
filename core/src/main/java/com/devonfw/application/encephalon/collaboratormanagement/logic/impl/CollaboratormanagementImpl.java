package com.devonfw.application.encephalon.collaboratormanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.Collaboratormanagement;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorCto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase.UcFindCollaborator;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase.UcManageCollaborator;
import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of collaboratormanagement
 */
@Named
public class CollaboratormanagementImpl extends AbstractComponentFacade implements Collaboratormanagement {

  @Inject
  private UcFindCollaborator ucFindCollaborator;

  @Inject
  private UcManageCollaborator ucManageCollaborator;

  @Override
  public CollaboratorEto findCollaborator(long id) {

    return this.ucFindCollaborator.findCollaborator(id);
  }

  @Override
  public Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo criteria) {

    return this.ucFindCollaborator.findCollaborators(criteria);
  }

  @Override
  public CollaboratorEto saveCollaborator(CollaboratorEto collaborator) {

    return this.ucManageCollaborator.saveCollaborator(collaborator);
  }

  @Override
  public boolean deleteCollaborator(long id) {

    return this.ucManageCollaborator.deleteCollaborator(id);
  }

  @Override
  public CollaboratorCto findCollaboratorCto(long id) {

    return ucFindCollaborator.findCollaboratorCto(id);
  }

  @Override
  public Page<CollaboratorCto> findCollaboratorCtos(CollaboratorSearchCriteriaTo criteria) {

    return ucFindCollaborator.findCollaboratorCtos(criteria);
  }

}
