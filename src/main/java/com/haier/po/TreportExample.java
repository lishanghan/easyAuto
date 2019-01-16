package com.haier.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TreportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReportpathIsNull() {
            addCriterion("reportPath is null");
            return (Criteria) this;
        }

        public Criteria andReportpathIsNotNull() {
            addCriterion("reportPath is not null");
            return (Criteria) this;
        }

        public Criteria andReportpathEqualTo(String value) {
            addCriterion("reportPath =", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotEqualTo(String value) {
            addCriterion("reportPath <>", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathGreaterThan(String value) {
            addCriterion("reportPath >", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathGreaterThanOrEqualTo(String value) {
            addCriterion("reportPath >=", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathLessThan(String value) {
            addCriterion("reportPath <", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathLessThanOrEqualTo(String value) {
            addCriterion("reportPath <=", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathLike(String value) {
            addCriterion("reportPath like", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotLike(String value) {
            addCriterion("reportPath not like", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathIn(List<String> values) {
            addCriterion("reportPath in", values, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotIn(List<String> values) {
            addCriterion("reportPath not in", values, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathBetween(String value1, String value2) {
            addCriterion("reportPath between", value1, value2, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotBetween(String value1, String value2) {
            addCriterion("reportPath not between", value1, value2, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNull() {
            addCriterion("reportName is null");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNotNull() {
            addCriterion("reportName is not null");
            return (Criteria) this;
        }

        public Criteria andReportnameEqualTo(String value) {
            addCriterion("reportName =", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotEqualTo(String value) {
            addCriterion("reportName <>", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThan(String value) {
            addCriterion("reportName >", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThanOrEqualTo(String value) {
            addCriterion("reportName >=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThan(String value) {
            addCriterion("reportName <", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThanOrEqualTo(String value) {
            addCriterion("reportName <=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLike(String value) {
            addCriterion("reportName like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotLike(String value) {
            addCriterion("reportName not like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameIn(List<String> values) {
            addCriterion("reportName in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotIn(List<String> values) {
            addCriterion("reportName not in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameBetween(String value1, String value2) {
            addCriterion("reportName between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotBetween(String value1, String value2) {
            addCriterion("reportName not between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("reportType is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("reportType is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(Integer value) {
            addCriterion("reportType =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(Integer value) {
            addCriterion("reportType <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(Integer value) {
            addCriterion("reportType >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportType >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(Integer value) {
            addCriterion("reportType <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(Integer value) {
            addCriterion("reportType <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<Integer> values) {
            addCriterion("reportType in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<Integer> values) {
            addCriterion("reportType not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(Integer value1, Integer value2) {
            addCriterion("reportType between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reportType not between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andIsschedulerIsNull() {
            addCriterion("isScheduler is null");
            return (Criteria) this;
        }

        public Criteria andIsschedulerIsNotNull() {
            addCriterion("isScheduler is not null");
            return (Criteria) this;
        }

        public Criteria andIsschedulerEqualTo(Integer value) {
            addCriterion("isScheduler =", value, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerNotEqualTo(Integer value) {
            addCriterion("isScheduler <>", value, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerGreaterThan(Integer value) {
            addCriterion("isScheduler >", value, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerGreaterThanOrEqualTo(Integer value) {
            addCriterion("isScheduler >=", value, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerLessThan(Integer value) {
            addCriterion("isScheduler <", value, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerLessThanOrEqualTo(Integer value) {
            addCriterion("isScheduler <=", value, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerIn(List<Integer> values) {
            addCriterion("isScheduler in", values, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerNotIn(List<Integer> values) {
            addCriterion("isScheduler not in", values, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerBetween(Integer value1, Integer value2) {
            addCriterion("isScheduler between", value1, value2, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andIsschedulerNotBetween(Integer value1, Integer value2) {
            addCriterion("isScheduler not between", value1, value2, "isscheduler");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNull() {
            addCriterion("customId is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("customId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(Integer value) {
            addCriterion("customId =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(Integer value) {
            addCriterion("customId <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(Integer value) {
            addCriterion("customId >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("customId >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(Integer value) {
            addCriterion("customId <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(Integer value) {
            addCriterion("customId <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<Integer> values) {
            addCriterion("customId in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<Integer> values) {
            addCriterion("customId not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(Integer value1, Integer value2) {
            addCriterion("customId between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(Integer value1, Integer value2) {
            addCriterion("customId not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNull() {
            addCriterion("customName is null");
            return (Criteria) this;
        }

        public Criteria andCustomnameIsNotNull() {
            addCriterion("customName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnameEqualTo(String value) {
            addCriterion("customName =", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotEqualTo(String value) {
            addCriterion("customName <>", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThan(String value) {
            addCriterion("customName >", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameGreaterThanOrEqualTo(String value) {
            addCriterion("customName >=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThan(String value) {
            addCriterion("customName <", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLessThanOrEqualTo(String value) {
            addCriterion("customName <=", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameLike(String value) {
            addCriterion("customName like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotLike(String value) {
            addCriterion("customName not like", value, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameIn(List<String> values) {
            addCriterion("customName in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotIn(List<String> values) {
            addCriterion("customName not in", values, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameBetween(String value1, String value2) {
            addCriterion("customName between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andCustomnameNotBetween(String value1, String value2) {
            addCriterion("customName not between", value1, value2, "customname");
            return (Criteria) this;
        }

        public Criteria andEnvidIsNull() {
            addCriterion("envId is null");
            return (Criteria) this;
        }

        public Criteria andEnvidIsNotNull() {
            addCriterion("envId is not null");
            return (Criteria) this;
        }

        public Criteria andEnvidEqualTo(Integer value) {
            addCriterion("envId =", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotEqualTo(Integer value) {
            addCriterion("envId <>", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidGreaterThan(Integer value) {
            addCriterion("envId >", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("envId >=", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidLessThan(Integer value) {
            addCriterion("envId <", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidLessThanOrEqualTo(Integer value) {
            addCriterion("envId <=", value, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidIn(List<Integer> values) {
            addCriterion("envId in", values, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotIn(List<Integer> values) {
            addCriterion("envId not in", values, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidBetween(Integer value1, Integer value2) {
            addCriterion("envId between", value1, value2, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvidNotBetween(Integer value1, Integer value2) {
            addCriterion("envId not between", value1, value2, "envid");
            return (Criteria) this;
        }

        public Criteria andEnvkeyIsNull() {
            addCriterion("envKey is null");
            return (Criteria) this;
        }

        public Criteria andEnvkeyIsNotNull() {
            addCriterion("envKey is not null");
            return (Criteria) this;
        }

        public Criteria andEnvkeyEqualTo(String value) {
            addCriterion("envKey =", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyNotEqualTo(String value) {
            addCriterion("envKey <>", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyGreaterThan(String value) {
            addCriterion("envKey >", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyGreaterThanOrEqualTo(String value) {
            addCriterion("envKey >=", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyLessThan(String value) {
            addCriterion("envKey <", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyLessThanOrEqualTo(String value) {
            addCriterion("envKey <=", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyLike(String value) {
            addCriterion("envKey like", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyNotLike(String value) {
            addCriterion("envKey not like", value, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyIn(List<String> values) {
            addCriterion("envKey in", values, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyNotIn(List<String> values) {
            addCriterion("envKey not in", values, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyBetween(String value1, String value2) {
            addCriterion("envKey between", value1, value2, "envkey");
            return (Criteria) this;
        }

        public Criteria andEnvkeyNotBetween(String value1, String value2) {
            addCriterion("envKey not between", value1, value2, "envkey");
            return (Criteria) this;
        }

        public Criteria andServiceidsIsNull() {
            addCriterion("serviceIds is null");
            return (Criteria) this;
        }

        public Criteria andServiceidsIsNotNull() {
            addCriterion("serviceIds is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidsEqualTo(String value) {
            addCriterion("serviceIds =", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotEqualTo(String value) {
            addCriterion("serviceIds <>", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsGreaterThan(String value) {
            addCriterion("serviceIds >", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsGreaterThanOrEqualTo(String value) {
            addCriterion("serviceIds >=", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsLessThan(String value) {
            addCriterion("serviceIds <", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsLessThanOrEqualTo(String value) {
            addCriterion("serviceIds <=", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsLike(String value) {
            addCriterion("serviceIds like", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotLike(String value) {
            addCriterion("serviceIds not like", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsIn(List<String> values) {
            addCriterion("serviceIds in", values, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotIn(List<String> values) {
            addCriterion("serviceIds not in", values, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsBetween(String value1, String value2) {
            addCriterion("serviceIds between", value1, value2, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotBetween(String value1, String value2) {
            addCriterion("serviceIds not between", value1, value2, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServicenamesIsNull() {
            addCriterion("serviceNames is null");
            return (Criteria) this;
        }

        public Criteria andServicenamesIsNotNull() {
            addCriterion("serviceNames is not null");
            return (Criteria) this;
        }

        public Criteria andServicenamesEqualTo(String value) {
            addCriterion("serviceNames =", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesNotEqualTo(String value) {
            addCriterion("serviceNames <>", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesGreaterThan(String value) {
            addCriterion("serviceNames >", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesGreaterThanOrEqualTo(String value) {
            addCriterion("serviceNames >=", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesLessThan(String value) {
            addCriterion("serviceNames <", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesLessThanOrEqualTo(String value) {
            addCriterion("serviceNames <=", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesLike(String value) {
            addCriterion("serviceNames like", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesNotLike(String value) {
            addCriterion("serviceNames not like", value, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesIn(List<String> values) {
            addCriterion("serviceNames in", values, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesNotIn(List<String> values) {
            addCriterion("serviceNames not in", values, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesBetween(String value1, String value2) {
            addCriterion("serviceNames between", value1, value2, "servicenames");
            return (Criteria) this;
        }

        public Criteria andServicenamesNotBetween(String value1, String value2) {
            addCriterion("serviceNames not between", value1, value2, "servicenames");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNull() {
            addCriterion("testTime is null");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNotNull() {
            addCriterion("testTime is not null");
            return (Criteria) this;
        }

        public Criteria andTesttimeEqualTo(Date value) {
            addCriterion("testTime =", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotEqualTo(Date value) {
            addCriterion("testTime <>", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThan(Date value) {
            addCriterion("testTime >", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testTime >=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThan(Date value) {
            addCriterion("testTime <", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThanOrEqualTo(Date value) {
            addCriterion("testTime <=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeIn(List<Date> values) {
            addCriterion("testTime in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotIn(List<Date> values) {
            addCriterion("testTime not in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeBetween(Date value1, Date value2) {
            addCriterion("testTime between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotBetween(Date value1, Date value2) {
            addCriterion("testTime not between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}