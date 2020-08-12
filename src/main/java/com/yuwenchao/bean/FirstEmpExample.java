package com.yuwenchao.bean;

import java.util.ArrayList;
import java.util.List;

public class FirstEmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstEmpExample() {
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

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstGenderIsNull() {
            addCriterion("first_gender is null");
            return (Criteria) this;
        }

        public Criteria andFirstGenderIsNotNull() {
            addCriterion("first_gender is not null");
            return (Criteria) this;
        }

        public Criteria andFirstGenderEqualTo(String value) {
            addCriterion("first_gender =", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderNotEqualTo(String value) {
            addCriterion("first_gender <>", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderGreaterThan(String value) {
            addCriterion("first_gender >", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderGreaterThanOrEqualTo(String value) {
            addCriterion("first_gender >=", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderLessThan(String value) {
            addCriterion("first_gender <", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderLessThanOrEqualTo(String value) {
            addCriterion("first_gender <=", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderLike(String value) {
            addCriterion("first_gender like", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderNotLike(String value) {
            addCriterion("first_gender not like", value, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderIn(List<String> values) {
            addCriterion("first_gender in", values, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderNotIn(List<String> values) {
            addCriterion("first_gender not in", values, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderBetween(String value1, String value2) {
            addCriterion("first_gender between", value1, value2, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstGenderNotBetween(String value1, String value2) {
            addCriterion("first_gender not between", value1, value2, "firstGender");
            return (Criteria) this;
        }

        public Criteria andFirstAgeIsNull() {
            addCriterion("first_age is null");
            return (Criteria) this;
        }

        public Criteria andFirstAgeIsNotNull() {
            addCriterion("first_age is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAgeEqualTo(Integer value) {
            addCriterion("first_age =", value, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeNotEqualTo(Integer value) {
            addCriterion("first_age <>", value, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeGreaterThan(Integer value) {
            addCriterion("first_age >", value, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_age >=", value, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeLessThan(Integer value) {
            addCriterion("first_age <", value, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeLessThanOrEqualTo(Integer value) {
            addCriterion("first_age <=", value, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeIn(List<Integer> values) {
            addCriterion("first_age in", values, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeNotIn(List<Integer> values) {
            addCriterion("first_age not in", values, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeBetween(Integer value1, Integer value2) {
            addCriterion("first_age between", value1, value2, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("first_age not between", value1, value2, "firstAge");
            return (Criteria) this;
        }

        public Criteria andFirstEmailIsNull() {
            addCriterion("first_email is null");
            return (Criteria) this;
        }

        public Criteria andFirstEmailIsNotNull() {
            addCriterion("first_email is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEmailEqualTo(String value) {
            addCriterion("first_email =", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailNotEqualTo(String value) {
            addCriterion("first_email <>", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailGreaterThan(String value) {
            addCriterion("first_email >", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailGreaterThanOrEqualTo(String value) {
            addCriterion("first_email >=", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailLessThan(String value) {
            addCriterion("first_email <", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailLessThanOrEqualTo(String value) {
            addCriterion("first_email <=", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailLike(String value) {
            addCriterion("first_email like", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailNotLike(String value) {
            addCriterion("first_email not like", value, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailIn(List<String> values) {
            addCriterion("first_email in", values, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailNotIn(List<String> values) {
            addCriterion("first_email not in", values, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailBetween(String value1, String value2) {
            addCriterion("first_email between", value1, value2, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstEmailNotBetween(String value1, String value2) {
            addCriterion("first_email not between", value1, value2, "firstEmail");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneIsNull() {
            addCriterion("first_phone is null");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneIsNotNull() {
            addCriterion("first_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneEqualTo(String value) {
            addCriterion("first_phone =", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneNotEqualTo(String value) {
            addCriterion("first_phone <>", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneGreaterThan(String value) {
            addCriterion("first_phone >", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("first_phone >=", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneLessThan(String value) {
            addCriterion("first_phone <", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneLessThanOrEqualTo(String value) {
            addCriterion("first_phone <=", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneLike(String value) {
            addCriterion("first_phone like", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneNotLike(String value) {
            addCriterion("first_phone not like", value, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneIn(List<String> values) {
            addCriterion("first_phone in", values, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneNotIn(List<String> values) {
            addCriterion("first_phone not in", values, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneBetween(String value1, String value2) {
            addCriterion("first_phone between", value1, value2, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstPhoneNotBetween(String value1, String value2) {
            addCriterion("first_phone not between", value1, value2, "firstPhone");
            return (Criteria) this;
        }

        public Criteria andFirstAddressIsNull() {
            addCriterion("first_address is null");
            return (Criteria) this;
        }

        public Criteria andFirstAddressIsNotNull() {
            addCriterion("first_address is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAddressEqualTo(String value) {
            addCriterion("first_address =", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressNotEqualTo(String value) {
            addCriterion("first_address <>", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressGreaterThan(String value) {
            addCriterion("first_address >", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressGreaterThanOrEqualTo(String value) {
            addCriterion("first_address >=", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressLessThan(String value) {
            addCriterion("first_address <", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressLessThanOrEqualTo(String value) {
            addCriterion("first_address <=", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressLike(String value) {
            addCriterion("first_address like", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressNotLike(String value) {
            addCriterion("first_address not like", value, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressIn(List<String> values) {
            addCriterion("first_address in", values, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressNotIn(List<String> values) {
            addCriterion("first_address not in", values, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressBetween(String value1, String value2) {
            addCriterion("first_address between", value1, value2, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstAddressNotBetween(String value1, String value2) {
            addCriterion("first_address not between", value1, value2, "firstAddress");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryIsNull() {
            addCriterion("first_salary is null");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryIsNotNull() {
            addCriterion("first_salary is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryEqualTo(Double value) {
            addCriterion("first_salary =", value, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryNotEqualTo(Double value) {
            addCriterion("first_salary <>", value, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryGreaterThan(Double value) {
            addCriterion("first_salary >", value, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("first_salary >=", value, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryLessThan(Double value) {
            addCriterion("first_salary <", value, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryLessThanOrEqualTo(Double value) {
            addCriterion("first_salary <=", value, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryIn(List<Double> values) {
            addCriterion("first_salary in", values, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryNotIn(List<Double> values) {
            addCriterion("first_salary not in", values, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryBetween(Double value1, Double value2) {
            addCriterion("first_salary between", value1, value2, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andFirstSalaryNotBetween(Double value1, Double value2) {
            addCriterion("first_salary not between", value1, value2, "firstSalary");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("d_id like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("d_id not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("d_id not between", value1, value2, "dId");
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