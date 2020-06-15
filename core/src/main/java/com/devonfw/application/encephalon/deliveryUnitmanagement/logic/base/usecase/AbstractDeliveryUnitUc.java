package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.encephalon.deliveryUnitmanagement.dataaccess.api.repo.DeliveryUnitRepository;
import com.devonfw.application.encephalon.general.logic.base.AbstractUc;

/**
 * Abstract use case for DeliveryUnits, which provides access to the commonly necessary data access objects.
 */
public class AbstractDeliveryUnitUc extends AbstractUc {

  /** @see #getDeliveryUnitRepository() */
  @Inject
  private DeliveryUnitRepository deliveryUnitRepository;

  /**
   * Returns the field 'deliveryUnitRepository'.
   * 
   * @return the {@link DeliveryUnitRepository} instance.
   */
  public DeliveryUnitRepository getDeliveryUnitRepository() {

    return this.deliveryUnitRepository;
  }

}
