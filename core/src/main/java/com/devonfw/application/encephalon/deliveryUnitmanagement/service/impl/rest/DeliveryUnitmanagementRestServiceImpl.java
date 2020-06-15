package com.devonfw.application.encephalon.deliveryUnitmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.DeliveryUnitmanagement;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitCto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitSearchCriteriaTo;
import com.devonfw.application.encephalon.deliveryUnitmanagement.service.api.rest.DeliveryUnitmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link DeliveryUnitmanagement}.
 */
@Named("DeliveryUnitmanagementRestService")
public class DeliveryUnitmanagementRestServiceImpl implements DeliveryUnitmanagementRestService {

  @Inject
  private DeliveryUnitmanagement deliveryunitmanagement;

  @Override
  public DeliveryUnitEto getDeliveryUnit(long id) {

    return this.deliveryunitmanagement.findDeliveryUnit(id);
  }

  @Override
  public DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryunit) {

    return this.deliveryunitmanagement.saveDeliveryUnit(deliveryunit);
  }

  @Override
  public void deleteDeliveryUnit(long id) {

    this.deliveryunitmanagement.deleteDeliveryUnit(id);
  }

  @Override
  public Page<DeliveryUnitEto> findDeliveryUnits(DeliveryUnitSearchCriteriaTo searchCriteriaTo) {

    return this.deliveryunitmanagement.findDeliveryUnits(searchCriteriaTo);
  }

  @Override
  public DeliveryUnitCto getDeliveryUnitCto(long id) {

    return this.deliveryunitmanagement.findDeliveryUnitCto(id);
  }

  @Override
  public Page<DeliveryUnitCto> findDeliveryUnitCtos(DeliveryUnitSearchCriteriaTo searchCriteriaTo) {

    return this.deliveryunitmanagement.findDeliveryUnitCtos(searchCriteriaTo);
  }

}
