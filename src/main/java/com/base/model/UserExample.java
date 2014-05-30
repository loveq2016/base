package com.base.model;import com.util.mybatis.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample extends BaseExample {
    

    

    protected List<Criteria> oredCriteria;

    public UserExample() {
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
        distinct = false;   join = null; column = null; isCache = false;groupBy = null;having = null;
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

        public void addCriterion(String condition) {
            if (condition == null) {
                log.error("值为空,Value for condition cannot be null");
            return ;}
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                log.error("值为空,Value for " + property + " cannot be null");
            return ;}
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                log.error("值为空,Between values for " + property + " cannot be null");
            return ;}
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull(String as) {
            addCriterion(as+".id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull(String as) {
            addCriterion(as+".id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String as,Integer value) {
            addCriterion(as+".id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String as,Integer value) {
            addCriterion(as+".id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String as,Integer value) {
            addCriterion(as+".id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String as,Integer value) {
            addCriterion(as+".id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(String as,List<Integer> values) {
            addCriterion(as+".id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(String as,List<Integer> values) {
            addCriterion(as+".id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull(String as) {
            addCriterion(as+".user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull(String as) {
            addCriterion(as+".user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String as,String value) {
            addCriterion(as+".user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String as,String value) {
            addCriterion(as+".user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String as,String value) {
            addCriterion(as+".user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String as,String value) {
            addCriterion(as+".user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String as,String value) {
            addCriterion(as+".user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String as,String value) {
            addCriterion(as+".user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(String as,List<String> values) {
            addCriterion(as+".user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(String as,List<String> values) {
            addCriterion(as+".user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String as,String value1, String value2) {
            addCriterion(as+".user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String as,String value1, String value2) {
            addCriterion(as+".user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull(String as) {
            addCriterion(as+".password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull(String as) {
            addCriterion(as+".password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String as,String value) {
            addCriterion(as+".password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String as,String value) {
            addCriterion(as+".password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String as,String value) {
            addCriterion(as+".password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String as,String value) {
            addCriterion(as+".password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String as,String value) {
            addCriterion(as+".password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String as,String value) {
            addCriterion(as+".password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(String as,List<String> values) {
            addCriterion(as+".password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(String as,List<String> values) {
            addCriterion(as+".password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String as,String value1, String value2) {
            addCriterion(as+".password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String as,String value1, String value2) {
            addCriterion(as+".password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull(String as) {
            addCriterion(as+".country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull(String as) {
            addCriterion(as+".country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String as,Integer value) {
            addCriterion(as+".country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String as,Integer value) {
            addCriterion(as+".country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String as,Integer value) {
            addCriterion(as+".country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String as,Integer value) {
            addCriterion(as+".country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(String as,List<Integer> values) {
            addCriterion(as+".country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(String as,List<Integer> values) {
            addCriterion(as+".country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNull(String as) {
            addCriterion(as+".expired_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNotNull(String as) {
            addCriterion(as+".expired_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateEqualTo(String as,Date value) {
            addCriterion(as+".expired_date =", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotEqualTo(String as,Date value) {
            addCriterion(as+".expired_date <>", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThan(String as,Date value) {
            addCriterion(as+".expired_date >", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThanOrEqualTo(String as,Date value) {
            addCriterion(as+".expired_date >=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThan(String as,Date value) {
            addCriterion(as+".expired_date <", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThanOrEqualTo(String as,Date value) {
            addCriterion(as+".expired_date <=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIn(String as,List<Date> values) {
            addCriterion(as+".expired_date in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotIn(String as,List<Date> values) {
            addCriterion(as+".expired_date not in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateBetween(String as,Date value1, Date value2) {
            addCriterion(as+".expired_date between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotBetween(String as,Date value1, Date value2) {
            addCriterion(as+".expired_date not between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIsNull(String as) {
            addCriterion(as+".credentials_expired is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIsNotNull(String as) {
            addCriterion(as+".credentials_expired is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredEqualTo(String as,String value) {
            addCriterion(as+".credentials_expired =", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotEqualTo(String as,String value) {
            addCriterion(as+".credentials_expired <>", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredGreaterThan(String as,String value) {
            addCriterion(as+".credentials_expired >", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".credentials_expired >=", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLessThan(String as,String value) {
            addCriterion(as+".credentials_expired <", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".credentials_expired <=", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLike(String as,String value) {
            addCriterion(as+".credentials_expired like", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotLike(String as,String value) {
            addCriterion(as+".credentials_expired not like", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIn(String as,List<String> values) {
            addCriterion(as+".credentials_expired in", values, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotIn(String as,List<String> values) {
            addCriterion(as+".credentials_expired not in", values, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredBetween(String as,String value1, String value2) {
            addCriterion(as+".credentials_expired between", value1, value2, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotBetween(String as,String value1, String value2) {
            addCriterion(as+".credentials_expired not between", value1, value2, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull(String as) {
            addCriterion(as+".full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull(String as) {
            addCriterion(as+".full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String as,String value) {
            addCriterion(as+".full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String as,String value) {
            addCriterion(as+".full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String as,String value) {
            addCriterion(as+".full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String as,String value) {
            addCriterion(as+".full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String as,String value) {
            addCriterion(as+".full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String as,String value) {
            addCriterion(as+".full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(String as,List<String> values) {
            addCriterion(as+".full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(String as,List<String> values) {
            addCriterion(as+".full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String as,String value1, String value2) {
            addCriterion(as+".full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String as,String value1, String value2) {
            addCriterion(as+".full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull(String as) {
            addCriterion(as+".org is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull(String as) {
            addCriterion(as+".org is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(String as,Integer value) {
            addCriterion(as+".org =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(String as,Integer value) {
            addCriterion(as+".org <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(String as,Integer value) {
            addCriterion(as+".org >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".org >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(String as,Integer value) {
            addCriterion(as+".org <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".org <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(String as,List<Integer> values) {
            addCriterion(as+".org in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(String as,List<Integer> values) {
            addCriterion(as+".org not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".org between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".org not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull(String as) {
            addCriterion(as+".gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull(String as) {
            addCriterion(as+".gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String as,Integer value) {
            addCriterion(as+".gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String as,Integer value) {
            addCriterion(as+".gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String as,Integer value) {
            addCriterion(as+".gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String as,Integer value) {
            addCriterion(as+".gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(String as,List<Integer> values) {
            addCriterion(as+".gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(String as,List<Integer> values) {
            addCriterion(as+".gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull(String as) {
            addCriterion(as+".age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull(String as) {
            addCriterion(as+".age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String as,Integer value) {
            addCriterion(as+".age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String as,Integer value) {
            addCriterion(as+".age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String as,Integer value) {
            addCriterion(as+".age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String as,Integer value) {
            addCriterion(as+".age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(String as,List<Integer> values) {
            addCriterion(as+".age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(String as,List<Integer> values) {
            addCriterion(as+".age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull(String as) {
            addCriterion(as+".address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull(String as) {
            addCriterion(as+".address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String as,String value) {
            addCriterion(as+".address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String as,String value) {
            addCriterion(as+".address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String as,String value) {
            addCriterion(as+".address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String as,String value) {
            addCriterion(as+".address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String as,String value) {
            addCriterion(as+".address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String as,String value) {
            addCriterion(as+".address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(String as,List<String> values) {
            addCriterion(as+".address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(String as,List<String> values) {
            addCriterion(as+".address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String as,String value1, String value2) {
            addCriterion(as+".address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String as,String value1, String value2) {
            addCriterion(as+".address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull(String as) {
            addCriterion(as+".phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull(String as) {
            addCriterion(as+".phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String as,String value) {
            addCriterion(as+".phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String as,String value) {
            addCriterion(as+".phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String as,String value) {
            addCriterion(as+".phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String as,String value) {
            addCriterion(as+".phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String as,String value) {
            addCriterion(as+".phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String as,String value) {
            addCriterion(as+".phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(String as,List<String> values) {
            addCriterion(as+".phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(String as,List<String> values) {
            addCriterion(as+".phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String as,String value1, String value2) {
            addCriterion(as+".phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String as,String value1, String value2) {
            addCriterion(as+".phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull(String as) {
            addCriterion(as+".mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull(String as) {
            addCriterion(as+".mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String as,String value) {
            addCriterion(as+".mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String as,String value) {
            addCriterion(as+".mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String as,String value) {
            addCriterion(as+".mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String as,String value) {
            addCriterion(as+".mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String as,String value) {
            addCriterion(as+".mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String as,String value) {
            addCriterion(as+".mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(String as,List<String> values) {
            addCriterion(as+".mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(String as,List<String> values) {
            addCriterion(as+".mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String as,String value1, String value2) {
            addCriterion(as+".mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String as,String value1, String value2) {
            addCriterion(as+".mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSsnIsNull(String as) {
            addCriterion(as+".ssn is null");
            return (Criteria) this;
        }

        public Criteria andSsnIsNotNull(String as) {
            addCriterion(as+".ssn is not null");
            return (Criteria) this;
        }

        public Criteria andSsnEqualTo(String as,String value) {
            addCriterion(as+".ssn =", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotEqualTo(String as,String value) {
            addCriterion(as+".ssn <>", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThan(String as,String value) {
            addCriterion(as+".ssn >", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".ssn >=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThan(String as,String value) {
            addCriterion(as+".ssn <", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".ssn <=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLike(String as,String value) {
            addCriterion(as+".ssn like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotLike(String as,String value) {
            addCriterion(as+".ssn not like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnIn(String as,List<String> values) {
            addCriterion(as+".ssn in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotIn(String as,List<String> values) {
            addCriterion(as+".ssn not in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnBetween(String as,String value1, String value2) {
            addCriterion(as+".ssn between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotBetween(String as,String value1, String value2) {
            addCriterion(as+".ssn not between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andMailIsNull(String as) {
            addCriterion(as+".mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull(String as) {
            addCriterion(as+".mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String as,String value) {
            addCriterion(as+".mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String as,String value) {
            addCriterion(as+".mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String as,String value) {
            addCriterion(as+".mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String as,String value) {
            addCriterion(as+".mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String as,String value) {
            addCriterion(as+".mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String as,String value) {
            addCriterion(as+".mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(String as,List<String> values) {
            addCriterion(as+".mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(String as,List<String> values) {
            addCriterion(as+".mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String as,String value1, String value2) {
            addCriterion(as+".mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String as,String value1, String value2) {
            addCriterion(as+".mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull(String as) {
            addCriterion(as+".user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull(String as) {
            addCriterion(as+".user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String as,Integer value) {
            addCriterion(as+".user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String as,Integer value) {
            addCriterion(as+".user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String as,Integer value) {
            addCriterion(as+".user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String as,Integer value) {
            addCriterion(as+".user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(String as,List<Integer> values) {
            addCriterion(as+".user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(String as,List<Integer> values) {
            addCriterion(as+".user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIsNull(String as) {
            addCriterion(as+".notify_mode is null");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIsNotNull(String as) {
            addCriterion(as+".notify_mode is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyModeEqualTo(String as,Integer value) {
            addCriterion(as+".notify_mode =", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotEqualTo(String as,Integer value) {
            addCriterion(as+".notify_mode <>", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeGreaterThan(String as,Integer value) {
            addCriterion(as+".notify_mode >", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".notify_mode >=", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeLessThan(String as,Integer value) {
            addCriterion(as+".notify_mode <", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".notify_mode <=", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIn(String as,List<Integer> values) {
            addCriterion(as+".notify_mode in", values, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotIn(String as,List<Integer> values) {
            addCriterion(as+".notify_mode not in", values, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".notify_mode between", value1, value2, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".notify_mode not between", value1, value2, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull(String as) {
            addCriterion(as+".description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull(String as) {
            addCriterion(as+".description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String as,String value) {
            addCriterion(as+".description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String as,String value) {
            addCriterion(as+".description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String as,String value) {
            addCriterion(as+".description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String as,String value) {
            addCriterion(as+".description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String as,String value) {
            addCriterion(as+".description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String as,String value) {
            addCriterion(as+".description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(String as,List<String> values) {
            addCriterion(as+".description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(String as,List<String> values) {
            addCriterion(as+".description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String as,String value1, String value2) {
            addCriterion(as+".description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String as,String value1, String value2) {
            addCriterion(as+".description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull(String as) {
            addCriterion(as+".creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull(String as) {
            addCriterion(as+".creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String as,Integer value) {
            addCriterion(as+".creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String as,Integer value) {
            addCriterion(as+".creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String as,Integer value) {
            addCriterion(as+".creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String as,Integer value) {
            addCriterion(as+".creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(String as,List<Integer> values) {
            addCriterion(as+".creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(String as,List<Integer> values) {
            addCriterion(as+".creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull(String as) {
            addCriterion(as+".status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull(String as) {
            addCriterion(as+".status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String as,Integer value) {
            addCriterion(as+".status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String as,Integer value) {
            addCriterion(as+".status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String as,Integer value) {
            addCriterion(as+".status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String as,Integer value) {
            addCriterion(as+".status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(String as,List<Integer> values) {
            addCriterion(as+".status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(String as,List<Integer> values) {
            addCriterion(as+".status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull(String as) {
            addCriterion(as+".creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull(String as) {
            addCriterion(as+".creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(String as,Date value) {
            addCriterion(as+".creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(String as,Date value) {
            addCriterion(as+".creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(String as,Date value) {
            addCriterion(as+".creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(String as,Date value) {
            addCriterion(as+".creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(String as,Date value) {
            addCriterion(as+".creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(String as,Date value) {
            addCriterion(as+".creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(String as,List<Date> values) {
            addCriterion(as+".creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(String as,List<Date> values) {
            addCriterion(as+".creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(String as,Date value1, Date value2) {
            addCriterion(as+".creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(String as,Date value1, Date value2) {
            addCriterion(as+".creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull(String as) {
            addCriterion(as+".update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull(String as) {
            addCriterion(as+".update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String as,Date value) {
            addCriterion(as+".update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String as,Date value) {
            addCriterion(as+".update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String as,Date value) {
            addCriterion(as+".update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String as,Date value) {
            addCriterion(as+".update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String as,Date value) {
            addCriterion(as+".update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String as,Date value) {
            addCriterion(as+".update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(String as,List<Date> values) {
            addCriterion(as+".update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(String as,List<Date> values) {
            addCriterion(as+".update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String as,Date value1, Date value2) {
            addCriterion(as+".update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String as,Date value1, Date value2) {
            addCriterion(as+".update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRetentionIsNull(String as) {
            addCriterion(as+".retention is null");
            return (Criteria) this;
        }

        public Criteria andRetentionIsNotNull(String as) {
            addCriterion(as+".retention is not null");
            return (Criteria) this;
        }

        public Criteria andRetentionEqualTo(String as,String value) {
            addCriterion(as+".retention =", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotEqualTo(String as,String value) {
            addCriterion(as+".retention <>", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionGreaterThan(String as,String value) {
            addCriterion(as+".retention >", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".retention >=", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionLessThan(String as,String value) {
            addCriterion(as+".retention <", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".retention <=", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionLike(String as,String value) {
            addCriterion(as+".retention like", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotLike(String as,String value) {
            addCriterion(as+".retention not like", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionIn(String as,List<String> values) {
            addCriterion(as+".retention in", values, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotIn(String as,List<String> values) {
            addCriterion(as+".retention not in", values, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionBetween(String as,String value1, String value2) {
            addCriterion(as+".retention between", value1, value2, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotBetween(String as,String value1, String value2) {
            addCriterion(as+".retention not between", value1, value2, "retention");
            return (Criteria) this;
        }

        public Criteria andExtIsNull(String as) {
            addCriterion(as+".ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull(String as) {
            addCriterion(as+".ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String as,String value) {
            addCriterion(as+".ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String as,String value) {
            addCriterion(as+".ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String as,String value) {
            addCriterion(as+".ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String as,String value) {
            addCriterion(as+".ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String as,String value) {
            addCriterion(as+".ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String as,String value) {
            addCriterion(as+".ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(String as,List<String> values) {
            addCriterion(as+".ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(String as,List<String> values) {
            addCriterion(as+".ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String as,String value1, String value2) {
            addCriterion(as+".ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String as,String value1, String value2) {
            addCriterion(as+".ext not between", value1, value2, "ext");
            return (Criteria) this;
        }public Criteria andIdIsNull() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNull() {
            addCriterion("expired_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNotNull() {
            addCriterion("expired_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateEqualTo(Date value) {
            addCriterion("expired_date =", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotEqualTo(Date value) {
            addCriterion("expired_date <>", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThan(Date value) {
            addCriterion("expired_date >", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expired_date >=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThan(Date value) {
            addCriterion("expired_date <", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThanOrEqualTo(Date value) {
            addCriterion("expired_date <=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIn(List<Date> values) {
            addCriterion("expired_date in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotIn(List<Date> values) {
            addCriterion("expired_date not in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateBetween(Date value1, Date value2) {
            addCriterion("expired_date between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotBetween(Date value1, Date value2) {
            addCriterion("expired_date not between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIsNull() {
            addCriterion("credentials_expired is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIsNotNull() {
            addCriterion("credentials_expired is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredEqualTo(String value) {
            addCriterion("credentials_expired =", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotEqualTo(String value) {
            addCriterion("credentials_expired <>", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredGreaterThan(String value) {
            addCriterion("credentials_expired >", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_expired >=", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLessThan(String value) {
            addCriterion("credentials_expired <", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLessThanOrEqualTo(String value) {
            addCriterion("credentials_expired <=", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredLike(String value) {
            addCriterion("credentials_expired like", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotLike(String value) {
            addCriterion("credentials_expired not like", value, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredIn(List<String> values) {
            addCriterion("credentials_expired in", values, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotIn(List<String> values) {
            addCriterion("credentials_expired not in", values, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredBetween(String value1, String value2) {
            addCriterion("credentials_expired between", value1, value2, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andCredentialsExpiredNotBetween(String value1, String value2) {
            addCriterion("credentials_expired not between", value1, value2, "credentialsExpired");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("org is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("org is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(Integer value) {
            addCriterion("org =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(Integer value) {
            addCriterion("org <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(Integer value) {
            addCriterion("org >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("org >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(Integer value) {
            addCriterion("org <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(Integer value) {
            addCriterion("org <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<Integer> values) {
            addCriterion("org in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<Integer> values) {
            addCriterion("org not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(Integer value1, Integer value2) {
            addCriterion("org between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("org not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSsnIsNull() {
            addCriterion("ssn is null");
            return (Criteria) this;
        }

        public Criteria andSsnIsNotNull() {
            addCriterion("ssn is not null");
            return (Criteria) this;
        }

        public Criteria andSsnEqualTo(String value) {
            addCriterion("ssn =", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotEqualTo(String value) {
            addCriterion("ssn <>", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThan(String value) {
            addCriterion("ssn >", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThanOrEqualTo(String value) {
            addCriterion("ssn >=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThan(String value) {
            addCriterion("ssn <", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThanOrEqualTo(String value) {
            addCriterion("ssn <=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLike(String value) {
            addCriterion("ssn like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotLike(String value) {
            addCriterion("ssn not like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnIn(List<String> values) {
            addCriterion("ssn in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotIn(List<String> values) {
            addCriterion("ssn not in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnBetween(String value1, String value2) {
            addCriterion("ssn between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotBetween(String value1, String value2) {
            addCriterion("ssn not between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIsNull() {
            addCriterion("notify_mode is null");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIsNotNull() {
            addCriterion("notify_mode is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyModeEqualTo(Integer value) {
            addCriterion("notify_mode =", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotEqualTo(Integer value) {
            addCriterion("notify_mode <>", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeGreaterThan(Integer value) {
            addCriterion("notify_mode >", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_mode >=", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeLessThan(Integer value) {
            addCriterion("notify_mode <", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeLessThanOrEqualTo(Integer value) {
            addCriterion("notify_mode <=", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIn(List<Integer> values) {
            addCriterion("notify_mode in", values, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotIn(List<Integer> values) {
            addCriterion("notify_mode not in", values, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeBetween(Integer value1, Integer value2) {
            addCriterion("notify_mode between", value1, value2, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_mode not between", value1, value2, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
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

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRetentionIsNull() {
            addCriterion("retention is null");
            return (Criteria) this;
        }

        public Criteria andRetentionIsNotNull() {
            addCriterion("retention is not null");
            return (Criteria) this;
        }

        public Criteria andRetentionEqualTo(String value) {
            addCriterion("retention =", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotEqualTo(String value) {
            addCriterion("retention <>", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionGreaterThan(String value) {
            addCriterion("retention >", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionGreaterThanOrEqualTo(String value) {
            addCriterion("retention >=", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionLessThan(String value) {
            addCriterion("retention <", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionLessThanOrEqualTo(String value) {
            addCriterion("retention <=", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionLike(String value) {
            addCriterion("retention like", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotLike(String value) {
            addCriterion("retention not like", value, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionIn(List<String> values) {
            addCriterion("retention in", values, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotIn(List<String> values) {
            addCriterion("retention not in", values, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionBetween(String value1, String value2) {
            addCriterion("retention between", value1, value2, "retention");
            return (Criteria) this;
        }

        public Criteria andRetentionNotBetween(String value1, String value2) {
            addCriterion("retention not between", value1, value2, "retention");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
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
