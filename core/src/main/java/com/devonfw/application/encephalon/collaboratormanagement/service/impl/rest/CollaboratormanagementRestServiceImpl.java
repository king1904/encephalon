package com.devonfw.application.encephalon.collaboratormanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.Collaboratormanagement;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorCto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;
import com.devonfw.application.encephalon.collaboratormanagement.service.api.rest.CollaboratormanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Collaboratormanagement}.
 */
@Named("CollaboratormanagementRestService")
public class CollaboratormanagementRestServiceImpl implements CollaboratormanagementRestService {

  @Inject
  private Collaboratormanagement collaboratormanagement;

  @Override
  public CollaboratorEto getCollaborator(long id) {

    return this.collaboratormanagement.findCollaborator(id);
  }

  @Override
  public CollaboratorEto saveCollaborator(CollaboratorEto collaborator) {

    return this.collaboratormanagement.saveCollaborator(collaborator);
  }

  @Override
  public void deleteCollaborator(long id) {

    this.collaboratormanagement.deleteCollaborator(id);
  }

  @Override
  public Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo searchCriteriaTo) {

    return this.collaboratormanagement.findCollaborators(searchCriteriaTo);
  }

  @Override
  public CollaboratorCto getCollaboratorCto(long id) {

    return this.collaboratormanagement.findCollaboratorCto(id);
  }

  @Override
  public Page<CollaboratorCto> findCollaboratorCtos(CollaboratorSearchCriteriaTo searchCriteriaTo) {

    return this.collaboratormanagement.findCollaboratorCtos(searchCriteriaTo);
  }

}
