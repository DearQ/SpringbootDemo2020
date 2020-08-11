package com.t05g1.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImagesExample() {
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

        public Criteria andUriDaIsNull() {
            addCriterion("uriDa is null");
            return (Criteria) this;
        }

        public Criteria andUriDaIsNotNull() {
            addCriterion("uriDa is not null");
            return (Criteria) this;
        }

        public Criteria andUriDaEqualTo(String value) {
            addCriterion("uriDa =", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaNotEqualTo(String value) {
            addCriterion("uriDa <>", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaGreaterThan(String value) {
            addCriterion("uriDa >", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaGreaterThanOrEqualTo(String value) {
            addCriterion("uriDa >=", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaLessThan(String value) {
            addCriterion("uriDa <", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaLessThanOrEqualTo(String value) {
            addCriterion("uriDa <=", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaLike(String value) {
            addCriterion("uriDa like", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaNotLike(String value) {
            addCriterion("uriDa not like", value, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaIn(List<String> values) {
            addCriterion("uriDa in", values, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaNotIn(List<String> values) {
            addCriterion("uriDa not in", values, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaBetween(String value1, String value2) {
            addCriterion("uriDa between", value1, value2, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriDaNotBetween(String value1, String value2) {
            addCriterion("uriDa not between", value1, value2, "uriDa");
            return (Criteria) this;
        }

        public Criteria andUriZIsNull() {
            addCriterion("uriZ is null");
            return (Criteria) this;
        }

        public Criteria andUriZIsNotNull() {
            addCriterion("uriZ is not null");
            return (Criteria) this;
        }

        public Criteria andUriZEqualTo(String value) {
            addCriterion("uriZ =", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZNotEqualTo(String value) {
            addCriterion("uriZ <>", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZGreaterThan(String value) {
            addCriterion("uriZ >", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZGreaterThanOrEqualTo(String value) {
            addCriterion("uriZ >=", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZLessThan(String value) {
            addCriterion("uriZ <", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZLessThanOrEqualTo(String value) {
            addCriterion("uriZ <=", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZLike(String value) {
            addCriterion("uriZ like", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZNotLike(String value) {
            addCriterion("uriZ not like", value, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZIn(List<String> values) {
            addCriterion("uriZ in", values, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZNotIn(List<String> values) {
            addCriterion("uriZ not in", values, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZBetween(String value1, String value2) {
            addCriterion("uriZ between", value1, value2, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriZNotBetween(String value1, String value2) {
            addCriterion("uriZ not between", value1, value2, "uriZ");
            return (Criteria) this;
        }

        public Criteria andUriXIsNull() {
            addCriterion("uriX is null");
            return (Criteria) this;
        }

        public Criteria andUriXIsNotNull() {
            addCriterion("uriX is not null");
            return (Criteria) this;
        }

        public Criteria andUriXEqualTo(String value) {
            addCriterion("uriX =", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXNotEqualTo(String value) {
            addCriterion("uriX <>", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXGreaterThan(String value) {
            addCriterion("uriX >", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXGreaterThanOrEqualTo(String value) {
            addCriterion("uriX >=", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXLessThan(String value) {
            addCriterion("uriX <", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXLessThanOrEqualTo(String value) {
            addCriterion("uriX <=", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXLike(String value) {
            addCriterion("uriX like", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXNotLike(String value) {
            addCriterion("uriX not like", value, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXIn(List<String> values) {
            addCriterion("uriX in", values, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXNotIn(List<String> values) {
            addCriterion("uriX not in", values, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXBetween(String value1, String value2) {
            addCriterion("uriX between", value1, value2, "uriX");
            return (Criteria) this;
        }

        public Criteria andUriXNotBetween(String value1, String value2) {
            addCriterion("uriX not between", value1, value2, "uriX");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNull() {
            addCriterion("commId is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("commId is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("commId =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("commId <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("commId >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commId >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("commId <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("commId <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("commId in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("commId not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("commId between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commId not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andColourIdIsNull() {
            addCriterion("colourId is null");
            return (Criteria) this;
        }

        public Criteria andColourIdIsNotNull() {
            addCriterion("colourId is not null");
            return (Criteria) this;
        }

        public Criteria andColourIdEqualTo(Integer value) {
            addCriterion("colourId =", value, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdNotEqualTo(Integer value) {
            addCriterion("colourId <>", value, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdGreaterThan(Integer value) {
            addCriterion("colourId >", value, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("colourId >=", value, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdLessThan(Integer value) {
            addCriterion("colourId <", value, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdLessThanOrEqualTo(Integer value) {
            addCriterion("colourId <=", value, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdIn(List<Integer> values) {
            addCriterion("colourId in", values, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdNotIn(List<Integer> values) {
            addCriterion("colourId not in", values, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdBetween(Integer value1, Integer value2) {
            addCriterion("colourId between", value1, value2, "colourId");
            return (Criteria) this;
        }

        public Criteria andColourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("colourId not between", value1, value2, "colourId");
            return (Criteria) this;
        }

        public Criteria andUriTypeIsNull() {
            addCriterion("uriType is null");
            return (Criteria) this;
        }

        public Criteria andUriTypeIsNotNull() {
            addCriterion("uriType is not null");
            return (Criteria) this;
        }

        public Criteria andUriTypeEqualTo(Integer value) {
            addCriterion("uriType =", value, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeNotEqualTo(Integer value) {
            addCriterion("uriType <>", value, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeGreaterThan(Integer value) {
            addCriterion("uriType >", value, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uriType >=", value, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeLessThan(Integer value) {
            addCriterion("uriType <", value, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeLessThanOrEqualTo(Integer value) {
            addCriterion("uriType <=", value, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeIn(List<Integer> values) {
            addCriterion("uriType in", values, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeNotIn(List<Integer> values) {
            addCriterion("uriType not in", values, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeBetween(Integer value1, Integer value2) {
            addCriterion("uriType between", value1, value2, "uriType");
            return (Criteria) this;
        }

        public Criteria andUriTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("uriType not between", value1, value2, "uriType");
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