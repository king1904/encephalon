package com.devonfw.application.encephalon.deliveryUnitmanagement.dataaccess.api;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devonfw.application.encephalon.deliveryUnitmanagement.common.api.DeliveryUnit;
import com.devonfw.application.encephalon.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author ychaalae
 */
@Entity
@Table(name = "`DELIVERY_UNIT`", schema = "`Encephalon`")
public class DeliveryUnitEntity extends ApplicationPersistenceEntity implements DeliveryUnit {

  @Column(name = "org_unit_id")
  private Long org_unit_id;

  @Column(name = "short_desc")
  private String short_desc;

  @Column(name = "long_desc")
  private String long_desc;

  @Column(name = "working_hours")
  private Integer working_hours;

  @Column(name = "active")
  private boolean active;

  @Column(name = "create_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp create_date;

  @Column(name = "create_user")
  private String create_user;

  @Column(name = "modif_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp modif_date;

  @Column(name = "modif_user")
  private String modif_user;

  private static final long serialVersionUID = 1L;

  /**
   * @return org_unit_id
   */
  @Override
  public Long getOrg_unit_id() {

    return this.org_unit_id;
  }

  /**
   * @param org_unit_id new value of {@link #getorg_unit_id}.
   */
  @Override
  public void setOrg_unit_id(Long org_unit_id) {

    this.org_unit_id = org_unit_id;
  }

  /**
   * @return short_desc
   */
  @Override
  public String getShort_desc() {

    return this.short_desc;
  }

  /**
   * @param short_desc new value of {@link #getshort_desc}.
   */
  @Override
  public void setShort_desc(String short_desc) {

    this.short_desc = short_desc;
  }

  /**
   * @return long_desc
   */
  @Override
  public String getLong_desc() {

    return this.long_desc;
  }

  /**
   * @param long_desc new value of {@link #getlong_desc}.
   */
  @Override
  public void setLong_desc(String long_desc) {

    this.long_desc = long_desc;
  }

  /**
   * @return working_hours
   */
  @Override
  public Integer getWorking_hours() {

    return this.working_hours;
  }

  /**
   * @param working_hours new value of {@link #getworking_hours}.
   */
  @Override
  public void setWorking_hours(Integer working_hours) {

    this.working_hours = working_hours;
  }

  /**
   * @return active
   */
  @Override
  public boolean isActive() {

    return this.active;
  }

  /**
   * @param active new value of {@link #getactive}.
   */
  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  /**
   * @return create_date
   */
  @Override
  public Timestamp getCreate_date() {

    return this.create_date;
  }

  /**
   * @param create_date new value of {@link #getcreate_date}.
   */
  @Override
  public void setCreate_date(Timestamp create_date) {

    this.create_date = create_date;
  }

  /**
   * @return create_user
   */
  @Override
  public String getCreate_user() {

    return this.create_user;
  }

  /**
   * @param create_user new value of {@link #getcreate_user}.
   */
  @Override
  public void setCreate_user(String create_user) {

    this.create_user = create_user;
  }

  /**
   * @return modif_date
   */
  @Override
  public Timestamp getModif_date() {

    return this.modif_date;
  }

  /**
   * @param modif_date new value of {@link #getmodif_date}.
   */
  @Override
  public void setModif_date(Timestamp modif_date) {

    this.modif_date = modif_date;
  }

  /**
   * @return modif_user
   */
  @Override
  public String getModif_user() {

    return this.modif_user;
  }

  /**
   * @param modif_user new value of {@link #getmodif_user}.
   */
  @Override
  public void setModif_user(String modif_user) {

    this.modif_user = modif_user;
  }

}
