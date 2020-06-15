package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.encephalon.deliveryUnitmanagement.dataaccess.api.DeliveryUnitEntity;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitCto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitSearchCriteriaTo;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.usecase.UcFindDeliveryUnit;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.base.usecase.AbstractDeliveryUnitUc;

/**
 * Use case implementation for searching, filtering and getting DeliveryUnits
 */
@Named
@Validated
@Transactional
public class UcFindDeliveryUnitImpl extends AbstractDeliveryUnitUc implements UcFindDeliveryUnit {

  /**
   * Logger instance.
   */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindDeliveryUnitImpl.class);

  @Override
  public DeliveryUnitEto findDeliveryUnit(long id) {

    LOG.debug("Get DeliveryUnit with id {} from database.", id);
    Optional<DeliveryUnitEntity> foundEntity = getDeliveryUnitRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), DeliveryUnitEto.class);
    else
      return null;
  }

  @Override
  public Page<DeliveryUnitEto> findDeliveryUnits(DeliveryUnitSearchCriteriaTo criteria) {

    Page<DeliveryUnitEntity> deliveryunits = getDeliveryUnitRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(deliveryunits, DeliveryUnitEto.class);
  }

  @Override
  public DeliveryUnitCto findDeliveryUnitCto(long id) {

    LOG.debug("Get DeliveryUnitCto with id {} from database.", id);
    DeliveryUnitEntity entity = getDeliveryUnitRepository().find(id);
    DeliveryUnitCto cto = new DeliveryUnitCto();
    cto.setDeliveryUnit(getBeanMapper().map(entity, DeliveryUnitEto.class));

    return cto;
  }

  @Override
  public Page<DeliveryUnitCto> findDeliveryUnitCtos(DeliveryUnitSearchCriteriaTo criteria) {

    Page<DeliveryUnitEntity> deliveryunits = getDeliveryUnitRepository().findByCriteria(criteria);
    List<DeliveryUnitCto> ctos = new ArrayList<>();
    for (DeliveryUnitEntity entity : deliveryunits.getContent()) {
      DeliveryUnitCto cto = new DeliveryUnitCto();
      cto.setDeliveryUnit(getBeanMapper().map(entity, DeliveryUnitEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, deliveryunits.getTotalElements());
  }

  @Override
  public DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryunit) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean deleteDeliveryUnit(long id) {

    // TODO Auto-generated method stub
    return false;
  }

}
