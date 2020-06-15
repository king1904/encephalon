package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.deliveryUnitmanagement.dataaccess.api.DeliveryUnitEntity;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.usecase.UcManageDeliveryUnit;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.base.usecase.AbstractDeliveryUnitUc;

/**
 * Use case implementation for modifying and deleting DeliveryUnits
 */
@Named
@Validated
@Transactional
public class UcManageDeliveryUnitImpl extends AbstractDeliveryUnitUc implements UcManageDeliveryUnit {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageDeliveryUnitImpl.class);

  @Override
  public boolean deleteDeliveryUnit(long deliveryUnitId) {

    DeliveryUnitEntity deliveryUnit = getDeliveryUnitRepository().find(deliveryUnitId);
    getDeliveryUnitRepository().delete(deliveryUnit);
    LOG.debug("The deliveryUnit with id '{}' has been deleted.", deliveryUnitId);
    return true;
  }

  @Override
  public DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryUnit) {

    Objects.requireNonNull(deliveryUnit, "deliveryUnit");

    DeliveryUnitEntity deliveryUnitEntity = getBeanMapper().map(deliveryUnit, DeliveryUnitEntity.class);

    // initialize, validate deliveryUnitEntity here if necessary
    DeliveryUnitEntity resultEntity = getDeliveryUnitRepository().save(deliveryUnitEntity);
    LOG.debug("DeliveryUnit with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, DeliveryUnitEto.class);
  }
}
