package com.haier.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcaseExample() {
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

        public Criteria andCasenameIsNull() {
            addCriterion("caseName is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("caseName is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("caseName =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("caseName <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("caseName >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("caseName >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("caseName <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("caseName <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("caseName like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("caseName not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("caseName in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("caseName not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("caseName between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("caseName not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andIidIsNull() {
            addCriterion("iId is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iId is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iId =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iId <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iId >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iId >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iId <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iId <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iId in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iId not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iId between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iId not between", value1, value2, "iid");
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

        public Criteria andTestclassIsNull() {
            addCriterion("testClass is null");
            return (Criteria) this;
        }

        public Criteria andTestclassIsNotNull() {
            addCriterion("testClass is not null");
            return (Criteria) this;
        }

        public Criteria andTestclassEqualTo(String value) {
            addCriterion("testClass =", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassNotEqualTo(String value) {
            addCriterion("testClass <>", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassGreaterThan(String value) {
            addCriterion("testClass >", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassGreaterThanOrEqualTo(String value) {
            addCriterion("testClass >=", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassLessThan(String value) {
            addCriterion("testClass <", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassLessThanOrEqualTo(String value) {
            addCriterion("testClass <=", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassLike(String value) {
            addCriterion("testClass like", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassNotLike(String value) {
            addCriterion("testClass not like", value, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassIn(List<String> values) {
            addCriterion("testClass in", values, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassNotIn(List<String> values) {
            addCriterion("testClass not in", values, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassBetween(String value1, String value2) {
            addCriterion("testClass between", value1, value2, "testclass");
            return (Criteria) this;
        }

        public Criteria andTestclassNotBetween(String value1, String value2) {
            addCriterion("testClass not between", value1, value2, "testclass");
            return (Criteria) this;
        }

        public Criteria andRequestheaderIsNull() {
            addCriterion("requestHeader is null");
            return (Criteria) this;
        }

        public Criteria andRequestheaderIsNotNull() {
            addCriterion("requestHeader is not null");
            return (Criteria) this;
        }

        public Criteria andRequestheaderEqualTo(String value) {
            addCriterion("requestHeader =", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderNotEqualTo(String value) {
            addCriterion("requestHeader <>", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderGreaterThan(String value) {
            addCriterion("requestHeader >", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderGreaterThanOrEqualTo(String value) {
            addCriterion("requestHeader >=", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderLessThan(String value) {
            addCriterion("requestHeader <", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderLessThanOrEqualTo(String value) {
            addCriterion("requestHeader <=", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderLike(String value) {
            addCriterion("requestHeader like", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderNotLike(String value) {
            addCriterion("requestHeader not like", value, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderIn(List<String> values) {
            addCriterion("requestHeader in", values, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderNotIn(List<String> values) {
            addCriterion("requestHeader not in", values, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderBetween(String value1, String value2) {
            addCriterion("requestHeader between", value1, value2, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestheaderNotBetween(String value1, String value2) {
            addCriterion("requestHeader not between", value1, value2, "requestheader");
            return (Criteria) this;
        }

        public Criteria andRequestparamIsNull() {
            addCriterion("requestParam is null");
            return (Criteria) this;
        }

        public Criteria andRequestparamIsNotNull() {
            addCriterion("requestParam is not null");
            return (Criteria) this;
        }

        public Criteria andRequestparamEqualTo(String value) {
            addCriterion("requestParam =", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotEqualTo(String value) {
            addCriterion("requestParam <>", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamGreaterThan(String value) {
            addCriterion("requestParam >", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamGreaterThanOrEqualTo(String value) {
            addCriterion("requestParam >=", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamLessThan(String value) {
            addCriterion("requestParam <", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamLessThanOrEqualTo(String value) {
            addCriterion("requestParam <=", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamLike(String value) {
            addCriterion("requestParam like", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotLike(String value) {
            addCriterion("requestParam not like", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamIn(List<String> values) {
            addCriterion("requestParam in", values, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotIn(List<String> values) {
            addCriterion("requestParam not in", values, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamBetween(String value1, String value2) {
            addCriterion("requestParam between", value1, value2, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotBetween(String value1, String value2) {
            addCriterion("requestParam not between", value1, value2, "requestparam");
            return (Criteria) this;
        }

        public Criteria andAsserttypeIsNull() {
            addCriterion("assertType is null");
            return (Criteria) this;
        }

        public Criteria andAsserttypeIsNotNull() {
            addCriterion("assertType is not null");
            return (Criteria) this;
        }

        public Criteria andAsserttypeEqualTo(Integer value) {
            addCriterion("assertType =", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotEqualTo(Integer value) {
            addCriterion("assertType <>", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeGreaterThan(Integer value) {
            addCriterion("assertType >", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("assertType >=", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeLessThan(Integer value) {
            addCriterion("assertType <", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeLessThanOrEqualTo(Integer value) {
            addCriterion("assertType <=", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeIn(List<Integer> values) {
            addCriterion("assertType in", values, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotIn(List<Integer> values) {
            addCriterion("assertType not in", values, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeBetween(Integer value1, Integer value2) {
            addCriterion("assertType between", value1, value2, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("assertType not between", value1, value2, "asserttype");
            return (Criteria) this;
        }

        public Criteria andExpectedIsNull() {
            addCriterion("expected is null");
            return (Criteria) this;
        }

        public Criteria andExpectedIsNotNull() {
            addCriterion("expected is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedEqualTo(String value) {
            addCriterion("expected =", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotEqualTo(String value) {
            addCriterion("expected <>", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedGreaterThan(String value) {
            addCriterion("expected >", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedGreaterThanOrEqualTo(String value) {
            addCriterion("expected >=", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLessThan(String value) {
            addCriterion("expected <", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLessThanOrEqualTo(String value) {
            addCriterion("expected <=", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLike(String value) {
            addCriterion("expected like", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotLike(String value) {
            addCriterion("expected not like", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedIn(List<String> values) {
            addCriterion("expected in", values, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotIn(List<String> values) {
            addCriterion("expected not in", values, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedBetween(String value1, String value2) {
            addCriterion("expected between", value1, value2, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotBetween(String value1, String value2) {
            addCriterion("expected not between", value1, value2, "expected");
            return (Criteria) this;
        }

        public Criteria andCafterIsNull() {
            addCriterion("cAfter is null");
            return (Criteria) this;
        }

        public Criteria andCafterIsNotNull() {
            addCriterion("cAfter is not null");
            return (Criteria) this;
        }

        public Criteria andCafterEqualTo(String value) {
            addCriterion("cAfter =", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterNotEqualTo(String value) {
            addCriterion("cAfter <>", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterGreaterThan(String value) {
            addCriterion("cAfter >", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterGreaterThanOrEqualTo(String value) {
            addCriterion("cAfter >=", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterLessThan(String value) {
            addCriterion("cAfter <", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterLessThanOrEqualTo(String value) {
            addCriterion("cAfter <=", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterLike(String value) {
            addCriterion("cAfter like", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterNotLike(String value) {
            addCriterion("cAfter not like", value, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterIn(List<String> values) {
            addCriterion("cAfter in", values, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterNotIn(List<String> values) {
            addCriterion("cAfter not in", values, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterBetween(String value1, String value2) {
            addCriterion("cAfter between", value1, value2, "cafter");
            return (Criteria) this;
        }

        public Criteria andCafterNotBetween(String value1, String value2) {
            addCriterion("cAfter not between", value1, value2, "cafter");
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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