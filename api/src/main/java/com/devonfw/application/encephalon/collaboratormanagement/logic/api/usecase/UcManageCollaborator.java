package com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;

/**
 * Interface of UcManageCollaborator to centralize documentation and signatures of methods.
 */
public interface UcManageCollaborator {

  /**
   * Deletes a collaborator from the database by its id 'collaboratorId'.
   *
   * @param collaboratorId Id of the collaborator to delete
   * @return boolean <code>true</code> if the collaborator can be deleted, <code>false</code> otherwise
   */
  boolean deleteCollaborator(long collaboratorId);

  /**
   * Saves a collaborator and store it in the database.
   *
   * @param collaborator the {@link CollaboratorEto} to create.
   * @return the new {@link CollaboratorEto} that has been saved with ID and version.
   */
  CollaboratorEto saveCollaborator(CollaboratorEto collaborator);

}
