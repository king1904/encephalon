package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of DeliveryUnit
 */
public class DeliveryUnitCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private DeliveryUnitEto deliveryUnit;

  public DeliveryUnitEto getDeliveryUnit() {

    return deliveryUnit;
  }

  public void setDeliveryUnit(DeliveryUnitEto deliveryUnit) {

    this.deliveryUnit = deliveryUnit;
  }

}
