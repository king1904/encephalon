package com.devonfw.application.encephalon.collaboratormanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.collaboratormanagement.logic.api.Collaboratormanagement;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorCto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorEto;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Collaboratormanagement}.
 */
@Path("/collaboratormanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CollaboratormanagementRestService {

  /**
   * Delegates to {@link Collaboratormanagement#findCollaboratorCto}.
   *
   * @param id the ID of the {@link CollaboratorCto}
   * @return the {@link CollaboratorCto}
   */
  @GET
  @Path("/collaborator/cto/{id}/")
  public CollaboratorCto getCollaboratorCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Collaboratormanagement#findCollaboratorCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding collaborators.
   * @return the {@link Page list} of matching {@link CollaboratorCto}s.
   */
  @Path("/collaborator/cto/search")
  @POST
  public Page<CollaboratorCto> findCollaboratorCtos(CollaboratorSearchCriteriaTo searchCriteriaTo);

  /**
   * @param id
   * @return
   */
  CollaboratorEto getCollaborator(long id);

  /**
   * @param collaborator
   * @return
   */
  CollaboratorEto saveCollaborator(CollaboratorEto collaborator);

  /**
   * @param id
   */
  void deleteCollaborator(long id);

  /**
   * @param searchCriteriaTo
   * @return
   */
  Page<CollaboratorEto> findCollaborators(CollaboratorSearchCriteriaTo searchCriteriaTo);

}
