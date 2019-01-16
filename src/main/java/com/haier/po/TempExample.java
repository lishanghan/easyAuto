package com.haier.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempExample() {
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

        public Criteria andTestingidIsNull() {
            addCriterion("testingId is null");
            return (Criteria) this;
        }

        public Criteria andTestingidIsNotNull() {
            addCriterion("testingId is not null");
            return (Criteria) this;
        }

        public Criteria andTestingidEqualTo(String value) {
            addCriterion("testingId =", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidNotEqualTo(String value) {
            addCriterion("testingId <>", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidGreaterThan(String value) {
            addCriterion("testingId >", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidGreaterThanOrEqualTo(String value) {
            addCriterion("testingId >=", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidLessThan(String value) {
            addCriterion("testingId <", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidLessThanOrEqualTo(String value) {
            addCriterion("testingId <=", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidLike(String value) {
            addCriterion("testingId like", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidNotLike(String value) {
            addCriterion("testingId not like", value, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidIn(List<String> values) {
            addCriterion("testingId in", values, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidNotIn(List<String> values) {
            addCriterion("testingId not in", values, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidBetween(String value1, String value2) {
            addCriterion("testingId between", value1, value2, "testingid");
            return (Criteria) this;
        }

        public Criteria andTestingidNotBetween(String value1, String value2) {
            addCriterion("testingId not between", value1, value2, "testingid");
            return (Criteria) this;
        }

        public Criteria andServicekeyIsNull() {
            addCriterion("serviceKey is null");
            return (Criteria) this;
        }

        public Criteria andServicekeyIsNotNull() {
            addCriterion("serviceKey is not null");
            return (Criteria) this;
        }

        public Criteria andServicekeyEqualTo(String value) {
            addCriterion("serviceKey =", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyNotEqualTo(String value) {
            addCriterion("serviceKey <>", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyGreaterThan(String value) {
            addCriterion("serviceKey >", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyGreaterThanOrEqualTo(String value) {
            addCriterion("serviceKey >=", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyLessThan(String value) {
            addCriterion("serviceKey <", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyLessThanOrEqualTo(String value) {
            addCriterion("serviceKey <=", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyLike(String value) {
            addCriterion("serviceKey like", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyNotLike(String value) {
            addCriterion("serviceKey not like", value, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyIn(List<String> values) {
            addCriterion("serviceKey in", values, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyNotIn(List<String> values) {
            addCriterion("serviceKey not in", values, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyBetween(String value1, String value2) {
            addCriterion("serviceKey between", value1, value2, "servicekey");
            return (Criteria) this;
        }

        public Criteria andServicekeyNotBetween(String value1, String value2) {
            addCriterion("serviceKey not between", value1, value2, "servicekey");
            return (Criteria) this;
        }

        public Criteria andIuriIsNull() {
            addCriterion("iUri is null");
            return (Criteria) this;
        }

        public Criteria andIuriIsNotNull() {
            addCriterion("iUri is not null");
            return (Criteria) this;
        }

        public Criteria andIuriEqualTo(String value) {
            addCriterion("iUri =", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriNotEqualTo(String value) {
            addCriterion("iUri <>", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriGreaterThan(String value) {
            addCriterion("iUri >", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriGreaterThanOrEqualTo(String value) {
            addCriterion("iUri >=", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriLessThan(String value) {
            addCriterion("iUri <", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriLessThanOrEqualTo(String value) {
            addCriterion("iUri <=", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriLike(String value) {
            addCriterion("iUri like", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriNotLike(String value) {
            addCriterion("iUri not like", value, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriIn(List<String> values) {
            addCriterion("iUri in", values, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriNotIn(List<String> values) {
            addCriterion("iUri not in", values, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriBetween(String value1, String value2) {
            addCriterion("iUri between", value1, value2, "iuri");
            return (Criteria) this;
        }

        public Criteria andIuriNotBetween(String value1, String value2) {
            addCriterion("iUri not between", value1, value2, "iuri");
            return (Criteria) this;
        }

        public Criteria andTempkeyIsNull() {
            addCriterion("tempKey is null");
            return (Criteria) this;
        }

        public Criteria andTempkeyIsNotNull() {
            addCriterion("tempKey is not null");
            return (Criteria) this;
        }

        public Criteria andTempkeyEqualTo(String value) {
            addCriterion("tempKey =", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyNotEqualTo(String value) {
            addCriterion("tempKey <>", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyGreaterThan(String value) {
            addCriterion("tempKey >", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyGreaterThanOrEqualTo(String value) {
            addCriterion("tempKey >=", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyLessThan(String value) {
            addCriterion("tempKey <", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyLessThanOrEqualTo(String value) {
            addCriterion("tempKey <=", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyLike(String value) {
            addCriterion("tempKey like", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyNotLike(String value) {
            addCriterion("tempKey not like", value, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyIn(List<String> values) {
            addCriterion("tempKey in", values, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyNotIn(List<String> values) {
            addCriterion("tempKey not in", values, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyBetween(String value1, String value2) {
            addCriterion("tempKey between", value1, value2, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempkeyNotBetween(String value1, String value2) {
            addCriterion("tempKey not between", value1, value2, "tempkey");
            return (Criteria) this;
        }

        public Criteria andTempvalueIsNull() {
            addCriterion("tempValue is null");
            return (Criteria) this;
        }

        public Criteria andTempvalueIsNotNull() {
            addCriterion("tempValue is not null");
            return (Criteria) this;
        }

        public Criteria andTempvalueEqualTo(String value) {
            addCriterion("tempValue =", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueNotEqualTo(String value) {
            addCriterion("tempValue <>", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueGreaterThan(String value) {
            addCriterion("tempValue >", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueGreaterThanOrEqualTo(String value) {
            addCriterion("tempValue >=", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueLessThan(String value) {
            addCriterion("tempValue <", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueLessThanOrEqualTo(String value) {
            addCriterion("tempValue <=", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueLike(String value) {
            addCriterion("tempValue like", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueNotLike(String value) {
            addCriterion("tempValue not like", value, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueIn(List<String> values) {
            addCriterion("tempValue in", values, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueNotIn(List<String> values) {
            addCriterion("tempValue not in", values, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueBetween(String value1, String value2) {
            addCriterion("tempValue between", value1, value2, "tempvalue");
            return (Criteria) this;
        }

        public Criteria andTempvalueNotBetween(String value1, String value2) {
            addCriterion("tempValue not between", value1, value2, "tempvalue");
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