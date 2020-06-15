package com.devonfw.application.encephalon.collaboratormanagement.logic.api;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase.UcFindCollaborator;

/**
 * Interface for Collaboratormanagement component.
 */
public interface Collaboratormanagement extends UcFindCollaborator {

  /**
   * @param id
   * @return
   */
  @Override
  CollaboratorEto findCollaborator(long id);

  /**
   * @param collaborator
   * @return
   */
  CollaboratorEto saveCollaborator(CollaboratorEto collaborator);

  /**
   * @param id
   * @return
   */
  boolean deleteCollaborator(long id);

  /**
   * @param searchCriteriaTo
   * @return
   */
  @Override
  Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo searchCriteriaTo);

}
