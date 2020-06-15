package com.devonfw.application.encephalon.collaboratormanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorCto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;

public interface UcFindCollaborator {

  /**
   * Returns a composite Collaborator by its id 'id'.
   *
   * @param id The id 'id' of the Collaborator.
   * @return The {@link CollaboratorCto} with id 'id'
   */
  CollaboratorCto findCollaboratorCto(long id);

  /**
   * Returns a paginated list of composite Collaborators matching the search criteria.
   *
   * @param criteria the {@link CollaboratorSearchCriteriaTo}.
   * @return the {@link List} of matching {@link CollaboratorCto}s.
   */
  Page<CollaboratorCto> findCollaboratorCtos(CollaboratorSearchCriteriaTo criteria);

  /**
   * @param id
   * @return
   */
  CollaboratorEto findCollaborator(long id);

  /**
   * @param criteria
   * @return
   */
  Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo criteria);

}
