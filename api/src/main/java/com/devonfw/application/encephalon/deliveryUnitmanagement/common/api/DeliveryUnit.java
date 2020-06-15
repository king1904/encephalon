package com.devonfw.application.encephalon.deliveryUnitmanagement.common.api;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.ApplicationEntity;

public interface DeliveryUnit extends ApplicationEntity {

  /**
   * @return org_unit_idId
   */

  public Long getOrg_unit_id();

  /**
   * @param org_unit_id setter for org_unit_id attribute
   */

  public void setOrg_unit_id(Long org_unit_id);

  /**
   * @return short_descId
   */

  public String getShort_desc();

  /**
   * @param short_desc setter for short_desc attribute
   */

  public void setShort_desc(String short_desc);

  /**
   * @return long_descId
   */

  public String getLong_desc();

  /**
   * @param long_desc setter for long_desc attribute
   */

  public void setLong_desc(String long_desc);

  /**
   * @return working_hoursId
   */

  public Integer getWorking_hours();

  /**
   * @param working_hours setter for working_hours attribute
   */

  public void setWorking_hours(Integer working_hours);

  /**
   * @return activeId
   */

  public boolean isActive();

  /**
   * @param active setter for active attribute
   */

  public void setActive(boolean active);

  /**
   * @return create_dateId
   */

  public Timestamp getCreate_date();

  /**
   * @param create_date setter for create_date attribute
   */

  public void setCreate_date(Timestamp create_date);

  /**
   * @return create_userId
   */

  public String getCreate_user();

  /**
   * @param create_user setter for create_user attribute
   */

  public void setCreate_user(String create_user);

  /**
   * @return modif_dateId
   */

  public Timestamp getModif_date();

  /**
   * @param modif_date setter for modif_date attribute
   */

  public void setModif_date(Timestamp modif_date);

  /**
   * @return modif_userId
   */

  public String getModif_user();

  /**
   * @param modif_user setter for modif_user attribute
   */

  public void setModif_user(String modif_user);

}
