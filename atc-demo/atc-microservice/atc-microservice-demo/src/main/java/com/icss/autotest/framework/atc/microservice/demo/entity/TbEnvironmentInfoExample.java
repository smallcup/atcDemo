package com.icss.autotest.framework.atc.microservice.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TbEnvironmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEnvironmentInfoExample() {
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

        public Criteria andDbTypeIsNull() {
            addCriterion("db_type is null");
            return (Criteria) this;
        }

        public Criteria andDbTypeIsNotNull() {
            addCriterion("db_type is not null");
            return (Criteria) this;
        }

        public Criteria andDbTypeEqualTo(String value) {
            addCriterion("db_type =", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotEqualTo(String value) {
            addCriterion("db_type <>", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeGreaterThan(String value) {
            addCriterion("db_type >", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeGreaterThanOrEqualTo(String value) {
            addCriterion("db_type >=", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeLessThan(String value) {
            addCriterion("db_type <", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeLessThanOrEqualTo(String value) {
            addCriterion("db_type <=", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeLike(String value) {
            addCriterion("db_type like", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotLike(String value) {
            addCriterion("db_type not like", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeIn(List<String> values) {
            addCriterion("db_type in", values, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotIn(List<String> values) {
            addCriterion("db_type not in", values, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeBetween(String value1, String value2) {
            addCriterion("db_type between", value1, value2, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotBetween(String value1, String value2) {
            addCriterion("db_type not between", value1, value2, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbIpIsNull() {
            addCriterion("db_ip is null");
            return (Criteria) this;
        }

        public Criteria andDbIpIsNotNull() {
            addCriterion("db_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDbIpEqualTo(String value) {
            addCriterion("db_ip =", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpNotEqualTo(String value) {
            addCriterion("db_ip <>", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpGreaterThan(String value) {
            addCriterion("db_ip >", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpGreaterThanOrEqualTo(String value) {
            addCriterion("db_ip >=", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpLessThan(String value) {
            addCriterion("db_ip <", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpLessThanOrEqualTo(String value) {
            addCriterion("db_ip <=", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpLike(String value) {
            addCriterion("db_ip like", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpNotLike(String value) {
            addCriterion("db_ip not like", value, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpIn(List<String> values) {
            addCriterion("db_ip in", values, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpNotIn(List<String> values) {
            addCriterion("db_ip not in", values, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpBetween(String value1, String value2) {
            addCriterion("db_ip between", value1, value2, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbIpNotBetween(String value1, String value2) {
            addCriterion("db_ip not between", value1, value2, "dbIp");
            return (Criteria) this;
        }

        public Criteria andDbPortIsNull() {
            addCriterion("db_port is null");
            return (Criteria) this;
        }

        public Criteria andDbPortIsNotNull() {
            addCriterion("db_port is not null");
            return (Criteria) this;
        }

        public Criteria andDbPortEqualTo(String value) {
            addCriterion("db_port =", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotEqualTo(String value) {
            addCriterion("db_port <>", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortGreaterThan(String value) {
            addCriterion("db_port >", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortGreaterThanOrEqualTo(String value) {
            addCriterion("db_port >=", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortLessThan(String value) {
            addCriterion("db_port <", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortLessThanOrEqualTo(String value) {
            addCriterion("db_port <=", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortLike(String value) {
            addCriterion("db_port like", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotLike(String value) {
            addCriterion("db_port not like", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortIn(List<String> values) {
            addCriterion("db_port in", values, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotIn(List<String> values) {
            addCriterion("db_port not in", values, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortBetween(String value1, String value2) {
            addCriterion("db_port between", value1, value2, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotBetween(String value1, String value2) {
            addCriterion("db_port not between", value1, value2, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbUsernameIsNull() {
            addCriterion("db_username is null");
            return (Criteria) this;
        }

        public Criteria andDbUsernameIsNotNull() {
            addCriterion("db_username is not null");
            return (Criteria) this;
        }

        public Criteria andDbUsernameEqualTo(String value) {
            addCriterion("db_username =", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameNotEqualTo(String value) {
            addCriterion("db_username <>", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameGreaterThan(String value) {
            addCriterion("db_username >", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("db_username >=", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameLessThan(String value) {
            addCriterion("db_username <", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameLessThanOrEqualTo(String value) {
            addCriterion("db_username <=", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameLike(String value) {
            addCriterion("db_username like", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameNotLike(String value) {
            addCriterion("db_username not like", value, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameIn(List<String> values) {
            addCriterion("db_username in", values, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameNotIn(List<String> values) {
            addCriterion("db_username not in", values, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameBetween(String value1, String value2) {
            addCriterion("db_username between", value1, value2, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbUsernameNotBetween(String value1, String value2) {
            addCriterion("db_username not between", value1, value2, "dbUsername");
            return (Criteria) this;
        }

        public Criteria andDbPasswordIsNull() {
            addCriterion("db_password is null");
            return (Criteria) this;
        }

        public Criteria andDbPasswordIsNotNull() {
            addCriterion("db_password is not null");
            return (Criteria) this;
        }

        public Criteria andDbPasswordEqualTo(String value) {
            addCriterion("db_password =", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordNotEqualTo(String value) {
            addCriterion("db_password <>", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordGreaterThan(String value) {
            addCriterion("db_password >", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("db_password >=", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordLessThan(String value) {
            addCriterion("db_password <", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordLessThanOrEqualTo(String value) {
            addCriterion("db_password <=", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordLike(String value) {
            addCriterion("db_password like", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordNotLike(String value) {
            addCriterion("db_password not like", value, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordIn(List<String> values) {
            addCriterion("db_password in", values, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordNotIn(List<String> values) {
            addCriterion("db_password not in", values, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordBetween(String value1, String value2) {
            addCriterion("db_password between", value1, value2, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andDbPasswordNotBetween(String value1, String value2) {
            addCriterion("db_password not between", value1, value2, "dbPassword");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolIsNull() {
            addCriterion("tb_environment_infocol is null");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolIsNotNull() {
            addCriterion("tb_environment_infocol is not null");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolEqualTo(String value) {
            addCriterion("tb_environment_infocol =", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolNotEqualTo(String value) {
            addCriterion("tb_environment_infocol <>", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolGreaterThan(String value) {
            addCriterion("tb_environment_infocol >", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolGreaterThanOrEqualTo(String value) {
            addCriterion("tb_environment_infocol >=", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolLessThan(String value) {
            addCriterion("tb_environment_infocol <", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolLessThanOrEqualTo(String value) {
            addCriterion("tb_environment_infocol <=", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolLike(String value) {
            addCriterion("tb_environment_infocol like", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolNotLike(String value) {
            addCriterion("tb_environment_infocol not like", value, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolIn(List<String> values) {
            addCriterion("tb_environment_infocol in", values, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolNotIn(List<String> values) {
            addCriterion("tb_environment_infocol not in", values, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolBetween(String value1, String value2) {
            addCriterion("tb_environment_infocol between", value1, value2, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbEnvironmentInfocolNotBetween(String value1, String value2) {
            addCriterion("tb_environment_infocol not between", value1, value2, "tbEnvironmentInfocol");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdIsNull() {
            addCriterion("tb_app_info_id is null");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdIsNotNull() {
            addCriterion("tb_app_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdEqualTo(String value) {
            addCriterion("tb_app_info_id =", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdNotEqualTo(String value) {
            addCriterion("tb_app_info_id <>", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdGreaterThan(String value) {
            addCriterion("tb_app_info_id >", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("tb_app_info_id >=", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdLessThan(String value) {
            addCriterion("tb_app_info_id <", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdLessThanOrEqualTo(String value) {
            addCriterion("tb_app_info_id <=", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdLike(String value) {
            addCriterion("tb_app_info_id like", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdNotLike(String value) {
            addCriterion("tb_app_info_id not like", value, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdIn(List<String> values) {
            addCriterion("tb_app_info_id in", values, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdNotIn(List<String> values) {
            addCriterion("tb_app_info_id not in", values, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdBetween(String value1, String value2) {
            addCriterion("tb_app_info_id between", value1, value2, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andTbAppInfoIdNotBetween(String value1, String value2) {
            addCriterion("tb_app_info_id not between", value1, value2, "tbAppInfoId");
            return (Criteria) this;
        }

        public Criteria andDbNameIsNull() {
            addCriterion("db_name is null");
            return (Criteria) this;
        }

        public Criteria andDbNameIsNotNull() {
            addCriterion("db_name is not null");
            return (Criteria) this;
        }

        public Criteria andDbNameEqualTo(String value) {
            addCriterion("db_name =", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotEqualTo(String value) {
            addCriterion("db_name <>", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameGreaterThan(String value) {
            addCriterion("db_name >", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameGreaterThanOrEqualTo(String value) {
            addCriterion("db_name >=", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLessThan(String value) {
            addCriterion("db_name <", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLessThanOrEqualTo(String value) {
            addCriterion("db_name <=", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLike(String value) {
            addCriterion("db_name like", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotLike(String value) {
            addCriterion("db_name not like", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameIn(List<String> values) {
            addCriterion("db_name in", values, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotIn(List<String> values) {
            addCriterion("db_name not in", values, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameBetween(String value1, String value2) {
            addCriterion("db_name between", value1, value2, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotBetween(String value1, String value2) {
            addCriterion("db_name not between", value1, value2, "dbName");
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