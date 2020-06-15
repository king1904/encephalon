package com.devonfw.application.encephalon.collaboratormanagement.common.api;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.ApplicationEntity;

public interface Collaborator extends ApplicationEntity {

  /**
   * @return calendar_idId
   */

  public Long getCalendar_id();

  /**
   * @param calendar_id setter for calendar_id attribute
   */

  public void setCalendar_id(Long calendar_id);

  /**
   * @return type_idId
   */

  public Long getType_id();

  /**
   * @param type_id setter for type_id attribute
   */

  public void setType_id(Long type_id);

  /**
   * @return first_nameId
   */

  public String getFirst_name();

  /**
   * @param first_name setter for first_name attribute
   */

  public void setFirst_name(String first_name);

  /**
   * @return last_nameId
   */

  public String getLast_name();

  /**
   * @param last_name setter for last_name attribute
   */

  public void setLast_name(String last_name);

  /**
   * @return company_start_dateId
   */

  public Timestamp getCompany_start_date();

  /**
   * @param company_start_date setter for company_start_date attribute
   */

  public void setCompany_start_date(Timestamp company_start_date);

  /**
   * @return Company_end_dateId
   */

  public Timestamp getCompany_end_date();

  /**
   * @param Company_end_date setter for Company_end_date attribute
   */

  public void setCompany_end_date(Timestamp Company_end_date);

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
