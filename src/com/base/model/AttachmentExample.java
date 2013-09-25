package com.base.model;import com.util.mybatis.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttachmentExample extends BaseExample {
    

    

    protected List<Criteria> oredCriteria;

    public AttachmentExample() {
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

        public Criteria andAppNameIsNull(String as) {
            addCriterion(as+".app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull(String as) {
            addCriterion(as+".app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String as,String value) {
            addCriterion(as+".app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String as,String value) {
            addCriterion(as+".app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String as,String value) {
            addCriterion(as+".app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String as,String value) {
            addCriterion(as+".app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String as,String value) {
            addCriterion(as+".app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String as,String value) {
            addCriterion(as+".app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(String as,List<String> values) {
            addCriterion(as+".app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(String as,List<String> values) {
            addCriterion(as+".app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String as,String value1, String value2) {
            addCriterion(as+".app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String as,String value1, String value2) {
            addCriterion(as+".app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull(String as) {
            addCriterion(as+".name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull(String as) {
            addCriterion(as+".name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String as,String value) {
            addCriterion(as+".name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String as,String value) {
            addCriterion(as+".name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String as,String value) {
            addCriterion(as+".name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String as,String value) {
            addCriterion(as+".name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String as,String value) {
            addCriterion(as+".name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String as,String value) {
            addCriterion(as+".name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(String as,List<String> values) {
            addCriterion(as+".name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(String as,List<String> values) {
            addCriterion(as+".name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String as,String value1, String value2) {
            addCriterion(as+".name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String as,String value1, String value2) {
            addCriterion(as+".name not between", value1, value2, "name");
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

        public Criteria andIsDownloadIsNull(String as) {
            addCriterion(as+".is_download is null");
            return (Criteria) this;
        }

        public Criteria andIsDownloadIsNotNull(String as) {
            addCriterion(as+".is_download is not null");
            return (Criteria) this;
        }

        public Criteria andIsDownloadEqualTo(String as,String value) {
            addCriterion(as+".is_download =", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotEqualTo(String as,String value) {
            addCriterion(as+".is_download <>", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThan(String as,String value) {
            addCriterion(as+".is_download >", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".is_download >=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThan(String as,String value) {
            addCriterion(as+".is_download <", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".is_download <=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLike(String as,String value) {
            addCriterion(as+".is_download like", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotLike(String as,String value) {
            addCriterion(as+".is_download not like", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadIn(String as,List<String> values) {
            addCriterion(as+".is_download in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotIn(String as,List<String> values) {
            addCriterion(as+".is_download not in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadBetween(String as,String value1, String value2) {
            addCriterion(as+".is_download between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotBetween(String as,String value1, String value2) {
            addCriterion(as+".is_download not between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNull(String as) {
            addCriterion(as+".upload_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull(String as) {
            addCriterion(as+".upload_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(String as,Integer value) {
            addCriterion(as+".upload_user_id =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(String as,Integer value) {
            addCriterion(as+".upload_user_id <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(String as,Integer value) {
            addCriterion(as+".upload_user_id >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".upload_user_id >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(String as,Integer value) {
            addCriterion(as+".upload_user_id <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".upload_user_id <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(String as,List<Integer> values) {
            addCriterion(as+".upload_user_id in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(String as,List<Integer> values) {
            addCriterion(as+".upload_user_id not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".upload_user_id between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".upload_user_id not between", value1, value2, "uploadUserId");
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

        public Criteria andStatusEqualTo(String as,String value) {
            addCriterion(as+".status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String as,String value) {
            addCriterion(as+".status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String as,String value) {
            addCriterion(as+".status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String as,String value) {
            addCriterion(as+".status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String as,String value) {
            addCriterion(as+".status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String as,String value) {
            addCriterion(as+".status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(String as,List<String> values) {
            addCriterion(as+".status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(String as,List<String> values) {
            addCriterion(as+".status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String as,String value1, String value2) {
            addCriterion(as+".status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String as,String value1, String value2) {
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

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andIsDownloadIsNull() {
            addCriterion("is_download is null");
            return (Criteria) this;
        }

        public Criteria andIsDownloadIsNotNull() {
            addCriterion("is_download is not null");
            return (Criteria) this;
        }

        public Criteria andIsDownloadEqualTo(String value) {
            addCriterion("is_download =", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotEqualTo(String value) {
            addCriterion("is_download <>", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThan(String value) {
            addCriterion("is_download >", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("is_download >=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThan(String value) {
            addCriterion("is_download <", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThanOrEqualTo(String value) {
            addCriterion("is_download <=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLike(String value) {
            addCriterion("is_download like", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotLike(String value) {
            addCriterion("is_download not like", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadIn(List<String> values) {
            addCriterion("is_download in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotIn(List<String> values) {
            addCriterion("is_download not in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadBetween(String value1, String value2) {
            addCriterion("is_download between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotBetween(String value1, String value2) {
            addCriterion("is_download not between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNull() {
            addCriterion("upload_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull() {
            addCriterion("upload_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(Integer value) {
            addCriterion("upload_user_id =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(Integer value) {
            addCriterion("upload_user_id <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(Integer value) {
            addCriterion("upload_user_id >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_user_id >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(Integer value) {
            addCriterion("upload_user_id <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("upload_user_id <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(List<Integer> values) {
            addCriterion("upload_user_id in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(List<Integer> values) {
            addCriterion("upload_user_id not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(Integer value1, Integer value2) {
            addCriterion("upload_user_id between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_user_id not between", value1, value2, "uploadUserId");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
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
