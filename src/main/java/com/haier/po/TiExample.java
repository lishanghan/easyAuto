package com.haier.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TiExample() {
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

        public Criteria andIrequestmethodIsNull() {
            addCriterion("iRequestMethod is null");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodIsNotNull() {
            addCriterion("iRequestMethod is not null");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodEqualTo(Integer value) {
            addCriterion("iRequestMethod =", value, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodNotEqualTo(Integer value) {
            addCriterion("iRequestMethod <>", value, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodGreaterThan(Integer value) {
            addCriterion("iRequestMethod >", value, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("iRequestMethod >=", value, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodLessThan(Integer value) {
            addCriterion("iRequestMethod <", value, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodLessThanOrEqualTo(Integer value) {
            addCriterion("iRequestMethod <=", value, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodIn(List<Integer> values) {
            addCriterion("iRequestMethod in", values, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodNotIn(List<Integer> values) {
            addCriterion("iRequestMethod not in", values, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodBetween(Integer value1, Integer value2) {
            addCriterion("iRequestMethod between", value1, value2, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIrequestmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("iRequestMethod not between", value1, value2, "irequestmethod");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeIsNull() {
            addCriterion("iContentType is null");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeIsNotNull() {
            addCriterion("iContentType is not null");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeEqualTo(Integer value) {
            addCriterion("iContentType =", value, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeNotEqualTo(Integer value) {
            addCriterion("iContentType <>", value, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeGreaterThan(Integer value) {
            addCriterion("iContentType >", value, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iContentType >=", value, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeLessThan(Integer value) {
            addCriterion("iContentType <", value, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeLessThanOrEqualTo(Integer value) {
            addCriterion("iContentType <=", value, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeIn(List<Integer> values) {
            addCriterion("iContentType in", values, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeNotIn(List<Integer> values) {
            addCriterion("iContentType not in", values, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeBetween(Integer value1, Integer value2) {
            addCriterion("iContentType between", value1, value2, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIcontenttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iContentType not between", value1, value2, "icontenttype");
            return (Criteria) this;
        }

        public Criteria andIheadersampleIsNull() {
            addCriterion("iHeaderSample is null");
            return (Criteria) this;
        }

        public Criteria andIheadersampleIsNotNull() {
            addCriterion("iHeaderSample is not null");
            return (Criteria) this;
        }

        public Criteria andIheadersampleEqualTo(String value) {
            addCriterion("iHeaderSample =", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleNotEqualTo(String value) {
            addCriterion("iHeaderSample <>", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleGreaterThan(String value) {
            addCriterion("iHeaderSample >", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleGreaterThanOrEqualTo(String value) {
            addCriterion("iHeaderSample >=", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleLessThan(String value) {
            addCriterion("iHeaderSample <", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleLessThanOrEqualTo(String value) {
            addCriterion("iHeaderSample <=", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleLike(String value) {
            addCriterion("iHeaderSample like", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleNotLike(String value) {
            addCriterion("iHeaderSample not like", value, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleIn(List<String> values) {
            addCriterion("iHeaderSample in", values, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleNotIn(List<String> values) {
            addCriterion("iHeaderSample not in", values, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleBetween(String value1, String value2) {
            addCriterion("iHeaderSample between", value1, value2, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIheadersampleNotBetween(String value1, String value2) {
            addCriterion("iHeaderSample not between", value1, value2, "iheadersample");
            return (Criteria) this;
        }

        public Criteria andIparamtypeIsNull() {
            addCriterion("iParamType is null");
            return (Criteria) this;
        }

        public Criteria andIparamtypeIsNotNull() {
            addCriterion("iParamType is not null");
            return (Criteria) this;
        }

        public Criteria andIparamtypeEqualTo(Integer value) {
            addCriterion("iParamType =", value, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeNotEqualTo(Integer value) {
            addCriterion("iParamType <>", value, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeGreaterThan(Integer value) {
            addCriterion("iParamType >", value, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iParamType >=", value, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeLessThan(Integer value) {
            addCriterion("iParamType <", value, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeLessThanOrEqualTo(Integer value) {
            addCriterion("iParamType <=", value, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeIn(List<Integer> values) {
            addCriterion("iParamType in", values, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeNotIn(List<Integer> values) {
            addCriterion("iParamType not in", values, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeBetween(Integer value1, Integer value2) {
            addCriterion("iParamType between", value1, value2, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iParamType not between", value1, value2, "iparamtype");
            return (Criteria) this;
        }

        public Criteria andIparamsampleIsNull() {
            addCriterion("iParamSample is null");
            return (Criteria) this;
        }

        public Criteria andIparamsampleIsNotNull() {
            addCriterion("iParamSample is not null");
            return (Criteria) this;
        }

        public Criteria andIparamsampleEqualTo(String value) {
            addCriterion("iParamSample =", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleNotEqualTo(String value) {
            addCriterion("iParamSample <>", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleGreaterThan(String value) {
            addCriterion("iParamSample >", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleGreaterThanOrEqualTo(String value) {
            addCriterion("iParamSample >=", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleLessThan(String value) {
            addCriterion("iParamSample <", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleLessThanOrEqualTo(String value) {
            addCriterion("iParamSample <=", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleLike(String value) {
            addCriterion("iParamSample like", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleNotLike(String value) {
            addCriterion("iParamSample not like", value, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleIn(List<String> values) {
            addCriterion("iParamSample in", values, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleNotIn(List<String> values) {
            addCriterion("iParamSample not in", values, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleBetween(String value1, String value2) {
            addCriterion("iParamSample between", value1, value2, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIparamsampleNotBetween(String value1, String value2) {
            addCriterion("iParamSample not between", value1, value2, "iparamsample");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeIsNull() {
            addCriterion("iResponseType is null");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeIsNotNull() {
            addCriterion("iResponseType is not null");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeEqualTo(Integer value) {
            addCriterion("iResponseType =", value, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeNotEqualTo(Integer value) {
            addCriterion("iResponseType <>", value, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeGreaterThan(Integer value) {
            addCriterion("iResponseType >", value, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("iResponseType >=", value, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeLessThan(Integer value) {
            addCriterion("iResponseType <", value, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeLessThanOrEqualTo(Integer value) {
            addCriterion("iResponseType <=", value, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeIn(List<Integer> values) {
            addCriterion("iResponseType in", values, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeNotIn(List<Integer> values) {
            addCriterion("iResponseType not in", values, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeBetween(Integer value1, Integer value2) {
            addCriterion("iResponseType between", value1, value2, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIresponsetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("iResponseType not between", value1, value2, "iresponsetype");
            return (Criteria) this;
        }

        public Criteria andIdevIsNull() {
            addCriterion("iDev is null");
            return (Criteria) this;
        }

        public Criteria andIdevIsNotNull() {
            addCriterion("iDev is not null");
            return (Criteria) this;
        }

        public Criteria andIdevEqualTo(String value) {
            addCriterion("iDev =", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevNotEqualTo(String value) {
            addCriterion("iDev <>", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevGreaterThan(String value) {
            addCriterion("iDev >", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevGreaterThanOrEqualTo(String value) {
            addCriterion("iDev >=", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevLessThan(String value) {
            addCriterion("iDev <", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevLessThanOrEqualTo(String value) {
            addCriterion("iDev <=", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevLike(String value) {
            addCriterion("iDev like", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevNotLike(String value) {
            addCriterion("iDev not like", value, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevIn(List<String> values) {
            addCriterion("iDev in", values, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevNotIn(List<String> values) {
            addCriterion("iDev not in", values, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevBetween(String value1, String value2) {
            addCriterion("iDev between", value1, value2, "idev");
            return (Criteria) this;
        }

        public Criteria andIdevNotBetween(String value1, String value2) {
            addCriterion("iDev not between", value1, value2, "idev");
            return (Criteria) this;
        }

        public Criteria andCasecountIsNull() {
            addCriterion("caseCount is null");
            return (Criteria) this;
        }

        public Criteria andCasecountIsNotNull() {
            addCriterion("caseCount is not null");
            return (Criteria) this;
        }

        public Criteria andCasecountEqualTo(Integer value) {
            addCriterion("caseCount =", value, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountNotEqualTo(Integer value) {
            addCriterion("caseCount <>", value, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountGreaterThan(Integer value) {
            addCriterion("caseCount >", value, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("caseCount >=", value, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountLessThan(Integer value) {
            addCriterion("caseCount <", value, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountLessThanOrEqualTo(Integer value) {
            addCriterion("caseCount <=", value, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountIn(List<Integer> values) {
            addCriterion("caseCount in", values, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountNotIn(List<Integer> values) {
            addCriterion("caseCount not in", values, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountBetween(Integer value1, Integer value2) {
            addCriterion("caseCount between", value1, value2, "casecount");
            return (Criteria) this;
        }

        public Criteria andCasecountNotBetween(Integer value1, Integer value2) {
            addCriterion("caseCount not between", value1, value2, "casecount");
            return (Criteria) this;
        }

        public Criteria andIstatusIsNull() {
            addCriterion("iStatus is null");
            return (Criteria) this;
        }

        public Criteria andIstatusIsNotNull() {
            addCriterion("iStatus is not null");
            return (Criteria) this;
        }

        public Criteria andIstatusEqualTo(Integer value) {
            addCriterion("iStatus =", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotEqualTo(Integer value) {
            addCriterion("iStatus <>", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusGreaterThan(Integer value) {
            addCriterion("iStatus >", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iStatus >=", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusLessThan(Integer value) {
            addCriterion("iStatus <", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusLessThanOrEqualTo(Integer value) {
            addCriterion("iStatus <=", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusIn(List<Integer> values) {
            addCriterion("iStatus in", values, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotIn(List<Integer> values) {
            addCriterion("iStatus not in", values, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusBetween(Integer value1, Integer value2) {
            addCriterion("iStatus between", value1, value2, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iStatus not between", value1, value2, "istatus");
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