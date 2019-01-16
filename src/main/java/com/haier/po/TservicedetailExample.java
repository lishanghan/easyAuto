package com.haier.po;

import java.util.ArrayList;
import java.util.List;

public class TservicedetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TservicedetailExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("serviceId is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Integer value) {
            addCriterion("serviceId =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Integer value) {
            addCriterion("serviceId <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Integer value) {
            addCriterion("serviceId >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serviceId >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Integer value) {
            addCriterion("serviceId <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Integer value) {
            addCriterion("serviceId <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Integer> values) {
            addCriterion("serviceId in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Integer> values) {
            addCriterion("serviceId not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Integer value1, Integer value2) {
            addCriterion("serviceId between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("serviceId not between", value1, value2, "serviceid");
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

        public Criteria andHostinfoIsNull() {
            addCriterion("hostInfo is null");
            return (Criteria) this;
        }

        public Criteria andHostinfoIsNotNull() {
            addCriterion("hostInfo is not null");
            return (Criteria) this;
        }

        public Criteria andHostinfoEqualTo(String value) {
            addCriterion("hostInfo =", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoNotEqualTo(String value) {
            addCriterion("hostInfo <>", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoGreaterThan(String value) {
            addCriterion("hostInfo >", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoGreaterThanOrEqualTo(String value) {
            addCriterion("hostInfo >=", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoLessThan(String value) {
            addCriterion("hostInfo <", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoLessThanOrEqualTo(String value) {
            addCriterion("hostInfo <=", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoLike(String value) {
            addCriterion("hostInfo like", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoNotLike(String value) {
            addCriterion("hostInfo not like", value, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoIn(List<String> values) {
            addCriterion("hostInfo in", values, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoNotIn(List<String> values) {
            addCriterion("hostInfo not in", values, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoBetween(String value1, String value2) {
            addCriterion("hostInfo between", value1, value2, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andHostinfoNotBetween(String value1, String value2) {
            addCriterion("hostInfo not between", value1, value2, "hostinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoIsNull() {
            addCriterion("dbInfo is null");
            return (Criteria) this;
        }

        public Criteria andDbinfoIsNotNull() {
            addCriterion("dbInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDbinfoEqualTo(String value) {
            addCriterion("dbInfo =", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoNotEqualTo(String value) {
            addCriterion("dbInfo <>", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoGreaterThan(String value) {
            addCriterion("dbInfo >", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoGreaterThanOrEqualTo(String value) {
            addCriterion("dbInfo >=", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoLessThan(String value) {
            addCriterion("dbInfo <", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoLessThanOrEqualTo(String value) {
            addCriterion("dbInfo <=", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoLike(String value) {
            addCriterion("dbInfo like", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoNotLike(String value) {
            addCriterion("dbInfo not like", value, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoIn(List<String> values) {
            addCriterion("dbInfo in", values, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoNotIn(List<String> values) {
            addCriterion("dbInfo not in", values, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoBetween(String value1, String value2) {
            addCriterion("dbInfo between", value1, value2, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andDbinfoNotBetween(String value1, String value2) {
            addCriterion("dbInfo not between", value1, value2, "dbinfo");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlIsNull() {
            addCriterion("swaggerUrl is null");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlIsNotNull() {
            addCriterion("swaggerUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlEqualTo(String value) {
            addCriterion("swaggerUrl =", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlNotEqualTo(String value) {
            addCriterion("swaggerUrl <>", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlGreaterThan(String value) {
            addCriterion("swaggerUrl >", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlGreaterThanOrEqualTo(String value) {
            addCriterion("swaggerUrl >=", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlLessThan(String value) {
            addCriterion("swaggerUrl <", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlLessThanOrEqualTo(String value) {
            addCriterion("swaggerUrl <=", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlLike(String value) {
            addCriterion("swaggerUrl like", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlNotLike(String value) {
            addCriterion("swaggerUrl not like", value, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlIn(List<String> values) {
            addCriterion("swaggerUrl in", values, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlNotIn(List<String> values) {
            addCriterion("swaggerUrl not in", values, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlBetween(String value1, String value2) {
            addCriterion("swaggerUrl between", value1, value2, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andSwaggerurlNotBetween(String value1, String value2) {
            addCriterion("swaggerUrl not between", value1, value2, "swaggerurl");
            return (Criteria) this;
        }

        public Criteria andClazzIsNull() {
            addCriterion("clazz is null");
            return (Criteria) this;
        }

        public Criteria andClazzIsNotNull() {
            addCriterion("clazz is not null");
            return (Criteria) this;
        }

        public Criteria andClazzEqualTo(String value) {
            addCriterion("clazz =", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotEqualTo(String value) {
            addCriterion("clazz <>", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzGreaterThan(String value) {
            addCriterion("clazz >", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzGreaterThanOrEqualTo(String value) {
            addCriterion("clazz >=", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzLessThan(String value) {
            addCriterion("clazz <", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzLessThanOrEqualTo(String value) {
            addCriterion("clazz <=", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzLike(String value) {
            addCriterion("clazz like", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotLike(String value) {
            addCriterion("clazz not like", value, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzIn(List<String> values) {
            addCriterion("clazz in", values, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotIn(List<String> values) {
            addCriterion("clazz not in", values, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzBetween(String value1, String value2) {
            addCriterion("clazz between", value1, value2, "clazz");
            return (Criteria) this;
        }

        public Criteria andClazzNotBetween(String value1, String value2) {
            addCriterion("clazz not between", value1, value2, "clazz");
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