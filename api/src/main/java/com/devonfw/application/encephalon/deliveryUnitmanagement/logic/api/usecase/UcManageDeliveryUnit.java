package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.usecase;

import com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to.DeliveryUnitEto;

/**
 * Interface of UcManageDeliveryUnit to centralize documentation and signatures of methods.
 */
public interface UcManageDeliveryUnit {

  /**
   * Deletes a deliveryUnit from the database by its id 'deliveryUnitId'.
   *
   * @param deliveryUnitId Id of the deliveryUnit to delete
   * @return boolean <code>true</code> if the deliveryUnit can be deleted, <code>false</code> otherwise
   */
  boolean deleteDeliveryUnit(long deliveryUnitId);

  /**
   * Saves a deliveryUnit and store it in the database.
   *
   * @param deliveryUnit the {@link DeliveryUnitEto} to create.
   * @return the new {@link DeliveryUnitEto} that has been saved with ID and version.
   */
  DeliveryUnitEto saveDeliveryUnit(DeliveryUnitEto deliveryUnit);

}
