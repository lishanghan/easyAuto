package com.haier.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcustomExample() {
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

        public Criteria andStrategyIsNull() {
            addCriterion("strategy is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIsNotNull() {
            addCriterion("strategy is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyEqualTo(String value) {
            addCriterion("strategy =", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotEqualTo(String value) {
            addCriterion("strategy <>", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyGreaterThan(String value) {
            addCriterion("strategy >", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("strategy >=", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyLessThan(String value) {
            addCriterion("strategy <", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyLessThanOrEqualTo(String value) {
            addCriterion("strategy <=", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyLike(String value) {
            addCriterion("strategy like", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotLike(String value) {
            addCriterion("strategy not like", value, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyIn(List<String> values) {
            addCriterion("strategy in", values, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotIn(List<String> values) {
            addCriterion("strategy not in", values, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyBetween(String value1, String value2) {
            addCriterion("strategy between", value1, value2, "strategy");
            return (Criteria) this;
        }

        public Criteria andStrategyNotBetween(String value1, String value2) {
            addCriterion("strategy not between", value1, value2, "strategy");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIntersectIsNull() {
            addCriterion("intersect is null");
            return (Criteria) this;
        }

        public Criteria andIntersectIsNotNull() {
            addCriterion("intersect is not null");
            return (Criteria) this;
        }

        public Criteria andIntersectEqualTo(Integer value) {
            addCriterion("intersect =", value, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectNotEqualTo(Integer value) {
            addCriterion("intersect <>", value, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectGreaterThan(Integer value) {
            addCriterion("intersect >", value, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectGreaterThanOrEqualTo(Integer value) {
            addCriterion("intersect >=", value, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectLessThan(Integer value) {
            addCriterion("intersect <", value, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectLessThanOrEqualTo(Integer value) {
            addCriterion("intersect <=", value, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectIn(List<Integer> values) {
            addCriterion("intersect in", values, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectNotIn(List<Integer> values) {
            addCriterion("intersect not in", values, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectBetween(Integer value1, Integer value2) {
            addCriterion("intersect between", value1, value2, "intersect");
            return (Criteria) this;
        }

        public Criteria andIntersectNotBetween(Integer value1, Integer value2) {
            addCriterion("intersect not between", value1, value2, "intersect");
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