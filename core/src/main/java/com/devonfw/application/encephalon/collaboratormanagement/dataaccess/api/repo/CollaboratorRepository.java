package com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.sql.Timestamp;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.encephalon.collaboratormanagement.dataaccess.api.CollaboratorEntity;
import com.devonfw.application.encephalon.collaboratormanagement.logic.api.to.CollaboratorSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link CollaboratorEntity}
 */
public interface CollaboratorRepository extends DefaultRepository<CollaboratorEntity> {

  /**
   * @param criteria the {@link CollaboratorSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link CollaboratorEntity} objects that matched the search. If no pageable is set,
   *         it will return a unique page with all the objects that matched the search.
   */
  default Page<CollaboratorEntity> findByCriteria(CollaboratorSearchCriteriaTo criteria) {

    CollaboratorEntity alias = newDslAlias();
    JPAQuery<CollaboratorEntity> query = newDslQuery(alias);

    Long calendar_id = criteria.getCalendar_id();
    if (calendar_id != null) {
      query.where($(alias.getCalendar_id()).eq(calendar_id));
    }
    Long type_id = criteria.getType_id();
    if (type_id != null) {
      query.where($(alias.getType_id()).eq(type_id));
    }
    String first_name = criteria.getFirst_name();
    if (first_name != null && !first_name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getFirst_name()), first_name, criteria.getFirst_nameOption());
    }
    String last_name = criteria.getLast_name();
    if (last_name != null && !last_name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getLast_name()), last_name, criteria.getLast_nameOption());
    }
    Timestamp company_start_date = criteria.getCompany_start_date();
    if (company_start_date != null) {
      query.where($(alias.getCompany_start_date()).eq(company_start_date));
    }
    Timestamp Company_end_date = criteria.getCompany_end_date();
    if (Company_end_date != null) {
      query.where($(alias.getCompany_end_date()).eq(Company_end_date));
    }
    Boolean active = criteria.getActive();
    if (active != null) {
      query.where($(alias.isActive()).eq(active));
    }
    Timestamp create_date = criteria.getCreate_date();
    if (create_date != null) {
      query.where($(alias.getCreate_date()).eq(create_date));
    }
    String create_user = criteria.getCreate_user();
    if (create_user != null && !create_user.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getCreate_user()), create_user, criteria.getCreate_userOption());
    }
    Timestamp modif_date = criteria.getModif_date();
    if (modif_date != null) {
      query.where($(alias.getModif_date()).eq(modif_date));
    }
    String modif_user = criteria.getModif_user();
    if (modif_user != null && !modif_user.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getModif_user()), modif_user, criteria.getModif_userOption());
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   *
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<CollaboratorEntity> query, CollaboratorEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "calendar_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getCalendar_id()).asc());
            } else {
              query.orderBy($(alias.getCalendar_id()).desc());
            }
            break;
          case "type_id":
            if (next.isAscending()) {
              query.orderBy($(alias.getType_id()).asc());
            } else {
              query.orderBy($(alias.getType_id()).desc());
            }
            break;
          case "first_name":
            if (next.isAscending()) {
              query.orderBy($(alias.getFirst_name()).asc());
            } else {
              query.orderBy($(alias.getFirst_name()).desc());
            }
            break;
          case "last_name":
            if (next.isAscending()) {
              query.orderBy($(alias.getLast_name()).asc());
            } else {
              query.orderBy($(alias.getLast_name()).desc());
            }
            break;
          case "company_start_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getCompany_start_date()).asc());
            } else {
              query.orderBy($(alias.getCompany_start_date()).desc());
            }
            break;
          case "Company_end_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getCompany_end_date()).asc());
            } else {
              query.orderBy($(alias.getCompany_end_date()).desc());
            }
            break;
          case "active":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_user()).asc());
            } else {
              query.orderBy($(alias.getModif_user()).desc());
            }
            break;
          case "create_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getCreate_date()).asc());
            } else {
              query.orderBy($(alias.getCreate_date()).desc());
            }
            break;
          case "create_user":
            if (next.isAscending()) {
              query.orderBy($(alias.getCreate_user()).asc());
            } else {
              query.orderBy($(alias.getCreate_user()).desc());
            }
            break;
          case "modif_date":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_date()).asc());
            } else {
              query.orderBy($(alias.getModif_date()).desc());
            }
            break;
          case "modif_user":
            if (next.isAscending()) {
              query.orderBy($(alias.getModif_user()).asc());
            } else {
              query.orderBy($(alias.getModif_user()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}