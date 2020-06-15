package com.devonfw.application.encephalon.deliveryUnitmanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.deliveryUnitmanagement.common.api.DeliveryUnit;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of DeliveryUnit
 */
public class DeliveryUnitEto extends AbstractEto implements DeliveryUnit {

  private static final long serialVersionUID = 1L;

  private Long org_unit_id;

  private String short_desc;

  private String long_desc;

  private Integer working_hours;

  private boolean active;

  private Timestamp create_date;

  private String create_user;

  private Timestamp modif_date;

  private String modif_user;

  @Override
  public Long getOrg_unit_id() {

    return this.org_unit_id;
  }

  @Override
  public void setOrg_unit_id(Long org_unit_id) {

    this.org_unit_id = org_unit_id;
  }

  @Override
  public String getShort_desc() {

    return this.short_desc;
  }

  @Override
  public void setShort_desc(String short_desc) {

    this.short_desc = short_desc;
  }

  @Override
  public String getLong_desc() {

    return this.long_desc;
  }

  @Override
  public void setLong_desc(String long_desc) {

    this.long_desc = long_desc;
  }

  @Override
  public Integer getWorking_hours() {

    return this.working_hours;
  }

  @Override
  public void setWorking_hours(Integer working_hours) {

    this.working_hours = working_hours;
  }

  @Override
  public boolean isActive() {

    return this.active;
  }

  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  @Override
  public Timestamp getCreate_date() {

    return this.create_date;
  }

  @Override
  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  @Override
  public String getCreate_user() {

    return this.create_user;
  }

  @Override
  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  @Override
  public Timestamp getModif_date() {

    return this.modif_date;
  }

  @Override
  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  @Override
  public String getModif_user() {

    return this.modif_user;
  }

  @Override
  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.org_unit_id == null) ? 0 : this.org_unit_id.hashCode());
    result = prime * result + ((this.short_desc == null) ? 0 : this.short_desc.hashCode());
    result = prime * result + ((this.long_desc == null) ? 0 : this.long_desc.hashCode());
    result = prime * result + ((this.working_hours == null) ? 0 : this.working_hours.hashCode());
    result = prime * result + ((Boolean) this.active).hashCode();
    result = prime * result + ((this.create_date == null) ? 0 : this.create_date.hashCode());
    result = prime * result + ((this.create_user == null) ? 0 : this.create_user.hashCode());
    result = prime * result + ((this.modif_date == null) ? 0 : this.modif_date.hashCode());
    result = prime * result + ((this.modif_user == null) ? 0 : this.modif_user.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    DeliveryUnitEto other = (DeliveryUnitEto) obj;
    if (this.org_unit_id == null) {
      if (other.org_unit_id != null) {
        return false;
      }
    } else if (!this.org_unit_id.equals(other.org_unit_id)) {
      return false;
    }
    if (this.short_desc == null) {
      if (other.short_desc != null) {
        return false;
      }
    } else if (!this.short_desc.equals(other.short_desc)) {
      return false;
    }
    if (this.long_desc == null) {
      if (other.long_desc != null) {
        return false;
      }
    } else if (!this.long_desc.equals(other.long_desc)) {
      return false;
    }
    if (this.working_hours == null) {
      if (other.working_hours != null) {
        return false;
      }
    } else if (!this.working_hours.equals(other.working_hours)) {
      return false;
    }
    if (this.active != other.active) {
      return false;
    }
    if (this.create_date == null) {
      if (other.create_date != null) {
        return false;
      }
    } else if (!this.create_date.equals(other.create_date)) {
      return false;
    }
    if (this.create_user == null) {
      if (other.create_user != null) {
        return false;
      }
    } else if (!this.create_user.equals(other.create_user)) {
      return false;
    }
    if (this.modif_date == null) {
      if (other.modif_date != null) {
        return false;
      }
    } else if (!this.modif_date.equals(other.modif_date)) {
      return false;
    }
    if (this.modif_user == null) {
      if (other.modif_user != null) {
        return false;
      }
    } else if (!this.modif_user.equals(other.modif_user)) {
      return false;
    }
    return true;
  }
}
