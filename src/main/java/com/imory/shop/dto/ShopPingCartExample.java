package com.imory.shop.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopPingCartExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public ShopPingCartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop_idEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThan(Integer value) {
            addCriterion("shop_id <", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Integer value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Integer value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Integer value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Integer> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsIsNull() {
            addCriterion("is_product_exists is null");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsIsNotNull() {
            addCriterion("is_product_exists is not null");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsEqualTo(Boolean value) {
            addCriterion("is_product_exists =", value, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsNotEqualTo(Boolean value) {
            addCriterion("is_product_exists <>", value, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsGreaterThan(Boolean value) {
            addCriterion("is_product_exists >", value, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_product_exists >=", value, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsLessThan(Boolean value) {
            addCriterion("is_product_exists <", value, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsLessThanOrEqualTo(Boolean value) {
            addCriterion("is_product_exists <=", value, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsIn(List<Boolean> values) {
            addCriterion("is_product_exists in", values, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsNotIn(List<Boolean> values) {
            addCriterion("is_product_exists not in", values, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsBetween(Boolean value1, Boolean value2) {
            addCriterion("is_product_exists between", value1, value2, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andIs_product_existsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_product_exists not between", value1, value2, "is_product_exists");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_timeEqualTo(Date value) {
            addCriterion("created_time =", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThan(Date value) {
            addCriterion("created_time >", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThan(Date value) {
            addCriterion("created_time <", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeIn(List<Date> values) {
            addCriterion("created_time in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "created_time");
            return (Criteria) this;
        }

        public Criteria andCreated_timeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "created_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shoppingcart
     *
     * @mbggenerated do_not_delete_during_merge Thu Oct 05 08:44:33 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shoppingcart
     *
     * @mbggenerated Thu Oct 05 08:44:33 CST 2017
     */
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