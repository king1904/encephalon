package com.devonfw.application.encephalon.collaboratormanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.repo.CollaboratorRepository;
import com.devonfw.application.encephalon.general.logic.base.AbstractUc;

/**
 * Abstract use case for Collaborators, which provides access to the commonly necessary data access objects.
 */
public class AbstractCollaboratorUc extends AbstractUc {

  /** @see #getCollaboratorRepository() */
  @Inject
  private CollaboratorRepository collaboratorRepository;

  /**
   * Returns the field 'collaboratorRepository'.
   * 
   * @return the {@link CollaboratorRepository} instance.
   */
  public CollaboratorRepository getCollaboratorRepository() {

    return this.collaboratorRepository;
  }

}
