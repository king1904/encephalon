package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.DeliveryUnitmanagement;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitCto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitSearchCriteriaTo;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.usecase.UcFindDeliveryUnit;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.usecase.UcManageDeliveryUnit;
import com.devonfw.application.encephalon.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of deliveryUnitmanagement
 */
@Named
public class DeliveryUnitmanagementImpl extends AbstractComponentFacade implements DeliveryUnitmanagement {

  @Inject
  private UcFindDeliveryUnit ucFindDeliveryUnit;

  @Inject
  private UcManageDeliveryUnit ucManageDeliveryUnit;

  @Override
  public DeliveryUnitEto findDeliveryUnit(long id) {

    return this.ucFindDeliveryUnit.findDeliveryUnit(id);
  }

  @Override
  public Page<DeliveryUnitEto> findDeliveryUnits(DeliveryUnitSearchCriteriaTo criteria) {

    return this.ucFindDeliveryUnit.findDeliveryUnits(criteria);
  }

  @Override
  public DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryunit) {

    return this.ucManageDeliveryUnit.saveDeliveryUnit(deliveryunit);
  }

  @Override
  public boolean deleteDeliveryUnit(long id) {

    return this.ucManageDeliveryUnit.deleteDeliveryUnit(id);
  }

  @Override
  public DeliveryUnitCto findDeliveryUnitCto(long id) {

    return ucFindDeliveryUnit.findDeliveryUnitCto(id);
  }

  @Override
  public Page<DeliveryUnitCto> findDeliveryUnitCtos(DeliveryUnitSearchCriteriaTo criteria) {

    return ucFindDeliveryUnit.findDeliveryUnitCtos(criteria);
  }

}
