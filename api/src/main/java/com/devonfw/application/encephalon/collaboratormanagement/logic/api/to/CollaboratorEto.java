package com.devonfw.application.encephalon.collaboratormanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.encephalon.collaboratormanagement.common.api.Collaborator;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Collaborator
 */
public class CollaboratorEto extends AbstractEto implements Collaborator {

  private static final long serialVersionUID = 1L;

  private Long calendar_id;

  private Long type_id;

  private String first_name;

  private String last_name;

  private Timestamp company_start_date;

  private Timestamp Company_end_date;

  private boolean active;

  private Timestamp create_date;

  private String create_user;

  private Timestamp modif_date;

  private String modif_user;

  @Override
  public Long getCalendar_id() {

    return this.calendar_id;
  }

  @Override
  public void setCalendar_id(Long calendar_id) {

    this.calendar_id = calendar_id;
  }

  @Override
  public Long getType_id() {

    return this.type_id;
  }

  @Override
  public void setType_id(Long type_id) {

    this.type_id = type_id;
  }

  @Override
  public String getFirst_name() {

    return this.first_name;
  }

  @Override
  public void setFirst_name(String first_name) {

    this.first_name = first_name;
  }

  @Override
  public String getLast_name() {

    return this.last_name;
  }

  @Override
  public void setLast_name(String last_name) {

    this.last_name = last_name;
  }

  @Override
  public Timestamp getCompany_start_date() {

    return this.company_start_date;
  }

  @Override
  public void setCompany_start_date(Timestamp company_start_date) {

    this.company_start_date = company_start_date;
  }

  @Override
  public Timestamp getCompany_end_date() {

    return this.Company_end_date;
  }

  @Override
  public void setCompany_end_date(Timestamp Company_end_date) {

    this.Company_end_date = Company_end_date;
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
    result = prime * result + ((this.calendar_id == null) ? 0 : this.calendar_id.hashCode());
    result = prime * result + ((this.type_id == null) ? 0 : this.type_id.hashCode());
    result = prime * result + ((this.first_name == null) ? 0 : this.first_name.hashCode());
    result = prime * result + ((this.last_name == null) ? 0 : this.last_name.hashCode());
    result = prime * result + ((this.company_start_date == null) ? 0 : this.company_start_date.hashCode());
    result = prime * result + ((this.Company_end_date == null) ? 0 : this.Company_end_date.hashCode());
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
    CollaboratorEto other = (CollaboratorEto) obj;
    if (this.calendar_id == null) {
      if (other.calendar_id != null) {
        return false;
      }
    } else if (!this.calendar_id.equals(other.calendar_id)) {
      return false;
    }
    if (this.type_id == null) {
      if (other.type_id != null) {
        return false;
      }
    } else if (!this.type_id.equals(other.type_id)) {
      return false;
    }
    if (this.first_name == null) {
      if (other.first_name != null) {
        return false;
      }
    } else if (!this.first_name.equals(other.first_name)) {
      return false;
    }
    if (this.last_name == null) {
      if (other.last_name != null) {
        return false;
      }
    } else if (!this.last_name.equals(other.last_name)) {
      return false;
    }
    if (this.company_start_date == null) {
      if (other.company_start_date != null) {
        return false;
      }
    } else if (!this.company_start_date.equals(other.company_start_date)) {
      return false;
    }
    if (this.Company_end_date == null) {
      if (other.Company_end_date != null) {
        return false;
      }
    } else if (!this.Company_end_date.equals(other.Company_end_date)) {
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
