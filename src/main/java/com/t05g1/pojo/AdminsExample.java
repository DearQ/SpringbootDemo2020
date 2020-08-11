package com.t05g1.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminsExample() {
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

        public Criteria andA_idIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andA_idIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andA_idEqualTo(Integer value) {
            addCriterion("a_id =", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idGreaterThan(Integer value) {
            addCriterion("a_id >", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idLessThan(Integer value) {
            addCriterion("a_id <", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idIn(List<Integer> values) {
            addCriterion("a_id in", values, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_idNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "a_id");
            return (Criteria) this;
        }

        public Criteria andA_adminNameIsNull() {
            addCriterion("a_adminName is null");
            return (Criteria) this;
        }

        public Criteria andA_adminNameIsNotNull() {
            addCriterion("a_adminName is not null");
            return (Criteria) this;
        }

        public Criteria andA_adminNameEqualTo(String value) {
            addCriterion("a_adminName =", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameNotEqualTo(String value) {
            addCriterion("a_adminName <>", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameGreaterThan(String value) {
            addCriterion("a_adminName >", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameGreaterThanOrEqualTo(String value) {
            addCriterion("a_adminName >=", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameLessThan(String value) {
            addCriterion("a_adminName <", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameLessThanOrEqualTo(String value) {
            addCriterion("a_adminName <=", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameLike(String value) {
            addCriterion("a_adminName like", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameNotLike(String value) {
            addCriterion("a_adminName not like", value, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameIn(List<String> values) {
            addCriterion("a_adminName in", values, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameNotIn(List<String> values) {
            addCriterion("a_adminName not in", values, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameBetween(String value1, String value2) {
            addCriterion("a_adminName between", value1, value2, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_adminNameNotBetween(String value1, String value2) {
            addCriterion("a_adminName not between", value1, value2, "a_adminName");
            return (Criteria) this;
        }

        public Criteria andA_passwordIsNull() {
            addCriterion("a_password is null");
            return (Criteria) this;
        }

        public Criteria andA_passwordIsNotNull() {
            addCriterion("a_password is not null");
            return (Criteria) this;
        }

        public Criteria andA_passwordEqualTo(String value) {
            addCriterion("a_password =", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotEqualTo(String value) {
            addCriterion("a_password <>", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordGreaterThan(String value) {
            addCriterion("a_password >", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("a_password >=", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordLessThan(String value) {
            addCriterion("a_password <", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordLessThanOrEqualTo(String value) {
            addCriterion("a_password <=", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordLike(String value) {
            addCriterion("a_password like", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotLike(String value) {
            addCriterion("a_password not like", value, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordIn(List<String> values) {
            addCriterion("a_password in", values, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotIn(List<String> values) {
            addCriterion("a_password not in", values, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordBetween(String value1, String value2) {
            addCriterion("a_password between", value1, value2, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_passwordNotBetween(String value1, String value2) {
            addCriterion("a_password not between", value1, value2, "a_password");
            return (Criteria) this;
        }

        public Criteria andA_holderIsNull() {
            addCriterion("a_holder is null");
            return (Criteria) this;
        }

        public Criteria andA_holderIsNotNull() {
            addCriterion("a_holder is not null");
            return (Criteria) this;
        }

        public Criteria andA_holderEqualTo(String value) {
            addCriterion("a_holder =", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderNotEqualTo(String value) {
            addCriterion("a_holder <>", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderGreaterThan(String value) {
            addCriterion("a_holder >", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderGreaterThanOrEqualTo(String value) {
            addCriterion("a_holder >=", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderLessThan(String value) {
            addCriterion("a_holder <", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderLessThanOrEqualTo(String value) {
            addCriterion("a_holder <=", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderLike(String value) {
            addCriterion("a_holder like", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderNotLike(String value) {
            addCriterion("a_holder not like", value, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderIn(List<String> values) {
            addCriterion("a_holder in", values, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderNotIn(List<String> values) {
            addCriterion("a_holder not in", values, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderBetween(String value1, String value2) {
            addCriterion("a_holder between", value1, value2, "a_holder");
            return (Criteria) this;
        }

        public Criteria andA_holderNotBetween(String value1, String value2) {
            addCriterion("a_holder not between", value1, value2, "a_holder");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andA_headportraitIsNull() {
            addCriterion("a_headportrait is null");
            return (Criteria) this;
        }

        public Criteria andA_headportraitIsNotNull() {
            addCriterion("a_headportrait is not null");
            return (Criteria) this;
        }

        public Criteria andA_headportraitEqualTo(String value) {
            addCriterion("a_headportrait =", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitNotEqualTo(String value) {
            addCriterion("a_headportrait <>", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitGreaterThan(String value) {
            addCriterion("a_headportrait >", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitGreaterThanOrEqualTo(String value) {
            addCriterion("a_headportrait >=", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitLessThan(String value) {
            addCriterion("a_headportrait <", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitLessThanOrEqualTo(String value) {
            addCriterion("a_headportrait <=", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitLike(String value) {
            addCriterion("a_headportrait like", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitNotLike(String value) {
            addCriterion("a_headportrait not like", value, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitIn(List<String> values) {
            addCriterion("a_headportrait in", values, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitNotIn(List<String> values) {
            addCriterion("a_headportrait not in", values, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitBetween(String value1, String value2) {
            addCriterion("a_headportrait between", value1, value2, "a_headportrait");
            return (Criteria) this;
        }

        public Criteria andA_headportraitNotBetween(String value1, String value2) {
            addCriterion("a_headportrait not between", value1, value2, "a_headportrait");
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