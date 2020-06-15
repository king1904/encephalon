package com.devonfw.application.encephalon.deliveryUnitmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.DeliveryUnitmanagement;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitCto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link DeliveryUnitmanagement}.
 */
@Path("/deliveryUnitmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface DeliveryUnitmanagementRestService {

  /**
   * Delegates to {@link DeliveryUnitmanagement#findDeliveryUnitCto}.
   *
   * @param id the ID of the {@link DeliveryUnitCto}
   * @return the {@link DeliveryUnitCto}
   */
  @GET
  @Path("/deliveryunit/cto/{id}/")
  public DeliveryUnitCto getDeliveryUnitCto(@PathParam("id") long id);

  /**
   * Delegates to {@link DeliveryUnitmanagement#findDeliveryUnitCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding deliveryunits.
   * @return the {@link Page list} of matching {@link DeliveryUnitCto}s.
   */
  @Path("/deliveryunit/cto/search")
  @POST
  public Page<DeliveryUnitCto> findDeliveryUnitCtos(DeliveryUnitSearchCriteriaTo searchCriteriaTo);

  /**
   * @param id
   * @return
   */
  DeliveryUnitEto getDeliveryUnit(long id);

  /**
   * @param deliveryunit
   * @return
   */
  DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryunit);

  /**
   * @param id
   */
  void deleteDeliveryUnit(long id);

  /**
   * @param searchCriteriaTo
   * @return
   */
  Page<DeliveryUnitEto> findDeliveryUnits(DeliveryUnitSearchCriteriaTo searchCriteriaTo);

}
