package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.encephalon.deliveryUnitmanagement.common.api.DeliveryUnit}s.
 */
public class DeliveryUnitSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long org_unit_id;

  private String short_desc;

  private String long_desc;

  private Integer working_hours;

  private Boolean active;

  private Timestamp create_date;

  private String create_user;

  private Timestamp modif_date;

  private String modif_user;

  private StringSearchConfigTo short_descOption;

  private StringSearchConfigTo long_descOption;

  private StringSearchConfigTo create_userOption;

  private StringSearchConfigTo modif_userOption;

  /**
   * @return org_unit_idId
   */

  public Long getOrg_unit_id() {

    return this.org_unit_id;
  }

  /**
   * @param org_unit_id setter for org_unit_id attribute
   */

  public void setOrg_unit_id(Long org_unit_id) {

    this.org_unit_id = org_unit_id;
  }

  /**
   * @return short_descId
   */

  public String getShort_desc() {

    return this.short_desc;
  }

  /**
   * @param short_desc setter for short_desc attribute
   */

  public void setShort_desc(String short_desc) {

    this.short_desc = short_desc;
  }

  /**
   * @return long_descId
   */

  public String getLong_desc() {

    return this.long_desc;
  }

  /**
   * @param long_desc setter for long_desc attribute
   */

  public void setLong_desc(String long_desc) {

    this.long_desc = long_desc;
  }

  /**
   * @return working_hoursId
   */

  public Integer getWorking_hours() {

    return this.working_hours;
  }

  /**
   * @param working_hours setter for working_hours attribute
   */

  public void setWorking_hours(Integer working_hours) {

    this.working_hours = working_hours;
  }

  /**
   * @return activeId
   */

  public Boolean getActive() {

    return this.active;
  }

  /**
   * @param active setter for active attribute
   */

  public void setActive(Boolean active) {

    this.active = active;
  }

  /**
   * @return create_dateId
   */

  public Timestamp getCreate_date() {

    return this.create_date;
  }

  /**
   * @param create_date setter for create_date attribute
   */

  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  /**
   * @return create_userId
   */

  public String getCreate_user() {

    return this.create_user;
  }

  /**
   * @param create_user setter for create_user attribute
   */

  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  /**
   * @return modif_dateId
   */

  public Timestamp getModif_date() {

    return this.modif_date;
  }

  /**
   * @param modif_date setter for modif_date attribute
   */

  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  /**
   * @return modif_userId
   */

  public String getModif_user() {

    return this.modif_user;
  }

  /**
   * @param modif_user setter for modif_user attribute
   */

  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getShort_desc() short_desc}.
   */
  public StringSearchConfigTo getShort_descOption() {

    return this.short_descOption;
  }

  /**
   * @param short_descOption new value of {@link #getShort_descOption()}.
   */
  public void setShort_descOption(StringSearchConfigTo short_descOption) {

    this.short_descOption = short_descOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getLong_desc() long_desc}.
   */
  public StringSearchConfigTo getLong_descOption() {

    return this.long_descOption;
  }

  /**
   * @param long_descOption new value of {@link #getLong_descOption()}.
   */
  public void setLong_descOption(StringSearchConfigTo long_descOption) {

    this.long_descOption = long_descOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getCreate_user() create_user}.
   */
  public StringSearchConfigTo getCreate_userOption() {

    return this.create_userOption;
  }

  /**
   * @param create_userOption new value of {@link #getCreate_userOption()}.
   */
  public void setCreate_userOption(StringSearchConfigTo create_userOption) {

    this.create_userOption = create_userOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getModif_user() modif_user}.
   */
  public StringSearchConfigTo getModif_userOption() {

    return this.modif_userOption;
  }

  /**
   * @param modif_userOption new value of {@link #getModif_userOption()}.
   */
  public void setModif_userOption(StringSearchConfigTo modif_userOption) {

    this.modif_userOption = modif_userOption;
  }

}
