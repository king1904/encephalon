package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitCto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;
import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitSearchCriteriaTo;

public interface UcFindDeliveryUnit {

  /**
   * Returns a DeliveryUnit by its id 'id'.
   *
   * @param id The id 'id' of the DeliveryUnit.
   * @return The {@link DeliveryUnitEto} with id 'id'
   */
  DeliveryUnitEto findDeliveryUnit(long id);

  /**
   * Returns a paginated list of DeliveryUnits matching the search criteria.
   *
   * @param criteria the {@link DeliveryUnitSearchCriteriaTo}.
   * @return the {@link List} of matching {@link DeliveryUnitEto}s.
   */
  Page<DeliveryUnitEto> findDeliveryUnits(DeliveryUnitSearchCriteriaTo criteria);

  /**
   * @param criteria
   * @return
   */
  Page<DeliveryUnitCto> findDeliveryUnitCtos(DeliveryUnitSearchCriteriaTo criteria);

  /**
   * @param id
   * @return
   */
  DeliveryUnitCto findDeliveryUnitCto(long id);

  /**
   * @param deliveryunit
   * @return
   */
  DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryunit);

  /**
   * @param id
   * @return
   */
  boolean deleteDeliveryUnit(long id);

}
