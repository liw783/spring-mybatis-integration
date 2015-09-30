package com.liw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppFdRrUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppFdRrUserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIsNull() {
            addCriterion("dateCreated is null");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIsNotNull() {
            addCriterion("dateCreated is not null");
            return (Criteria) this;
        }

        public Criteria andDatecreatedEqualTo(Date value) {
            addCriterion("dateCreated =", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotEqualTo(Date value) {
            addCriterion("dateCreated <>", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedGreaterThan(Date value) {
            addCriterion("dateCreated >", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("dateCreated >=", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedLessThan(Date value) {
            addCriterion("dateCreated <", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedLessThanOrEqualTo(Date value) {
            addCriterion("dateCreated <=", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIn(List<Date> values) {
            addCriterion("dateCreated in", values, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotIn(List<Date> values) {
            addCriterion("dateCreated not in", values, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedBetween(Date value1, Date value2) {
            addCriterion("dateCreated between", value1, value2, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotBetween(Date value1, Date value2) {
            addCriterion("dateCreated not between", value1, value2, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedIsNull() {
            addCriterion("dateModified is null");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedIsNotNull() {
            addCriterion("dateModified is not null");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedEqualTo(Date value) {
            addCriterion("dateModified =", value, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedNotEqualTo(Date value) {
            addCriterion("dateModified <>", value, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedGreaterThan(Date value) {
            addCriterion("dateModified >", value, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("dateModified >=", value, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedLessThan(Date value) {
            addCriterion("dateModified <", value, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedLessThanOrEqualTo(Date value) {
            addCriterion("dateModified <=", value, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedIn(List<Date> values) {
            addCriterion("dateModified in", values, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedNotIn(List<Date> values) {
            addCriterion("dateModified not in", values, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedBetween(Date value1, Date value2) {
            addCriterion("dateModified between", value1, value2, "datemodified");
            return (Criteria) this;
        }

        public Criteria andDatemodifiedNotBetween(Date value1, Date value2) {
            addCriterion("dateModified not between", value1, value2, "datemodified");
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