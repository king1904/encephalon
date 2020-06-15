package com.devonfw.application.encephalon.collaboratormanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.encephalon.collaboratormanagement.common.api.Collaborator}s.
 */
public class CollaboratorSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long calendar_id;

  private Long type_id;

  private String first_name;

  private String last_name;

  private Timestamp company_start_date;

  private Timestamp Company_end_date;

  private Boolean active;

  private Timestamp create_date;

  private String create_user;

  private Timestamp modif_date;

  private String modif_user;

  private StringSearchConfigTo first_nameOption;

  private StringSearchConfigTo last_nameOption;

  private StringSearchConfigTo create_userOption;

  private StringSearchConfigTo modif_userOption;

  /**
   * @return calendar_idId
   */

  public Long getCalendar_id() {

    return this.calendar_id;
  }

  /**
   * @param calendar_id setter for calendar_id attribute
   */

  public void setCalendar_id(Long calendar_id) {

    this.calendar_id = calendar_id;
  }

  /**
   * @return type_idId
   */

  public Long getType_id() {

    return this.type_id;
  }

  /**
   * @param type_id setter for type_id attribute
   */

  public void setType_id(Long type_id) {

    this.type_id = type_id;
  }

  /**
   * @return first_nameId
   */

  public String getFirst_name() {

    return this.first_name;
  }

  /**
   * @param first_name setter for first_name attribute
   */

  public void setFirst_name(String first_name) {

    this.first_name = first_name;
  }

  /**
   * @return last_nameId
   */

  public String getLast_name() {

    return this.last_name;
  }

  /**
   * @param last_name setter for last_name attribute
   */

  public void setLast_name(String last_name) {

    this.last_name = last_name;
  }

  /**
   * @return company_start_dateId
   */

  public Timestamp getCompany_start_date() {

    return this.company_start_date;
  }

  /**
   * @param company_start_date setter for company_start_date attribute
   */

  public void setCompany_start_date(Timestamp company_start_date) {

    this.company_start_date = company_start_date;
  }

  /**
   * @return Company_end_dateId
   */

  public Timestamp getCompany_end_date() {

    return this.Company_end_date;
  }

  /**
   * @param Company_end_date setter for Company_end_date attribute
   */

  public void setCompany_end_date(Timestamp Company_end_date) {

    this.Company_end_date = Company_end_date;
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
   * @return the {@link StringSearchConfigTo} used to search for {@link #getFirst_name() first_name}.
   */
  public StringSearchConfigTo getFirst_nameOption() {

    return this.first_nameOption;
  }

  /**
   * @param first_nameOption new value of {@link #getFirst_nameOption()}.
   */
  public void setFirst_nameOption(StringSearchConfigTo first_nameOption) {

    this.first_nameOption = first_nameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getLast_name() last_name}.
   */
  public StringSearchConfigTo getLast_nameOption() {

    return this.last_nameOption;
  }

  /**
   * @param last_nameOption new value of {@link #getLast_nameOption()}.
   */
  public void setLast_nameOption(StringSearchConfigTo last_nameOption) {

    this.last_nameOption = last_nameOption;
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
