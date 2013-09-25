package com.base.model;import com.util.mybatis.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourcesExample extends BaseExample {
    

    

    protected List<Criteria> oredCriteria;

    public ResourcesExample() {
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

        public Criteria andLinkUrlIsNull(String as) {
            addCriterion(as+".link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull(String as) {
            addCriterion(as+".link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String as,String value) {
            addCriterion(as+".link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String as,String value) {
            addCriterion(as+".link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String as,String value) {
            addCriterion(as+".link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String as,String value) {
            addCriterion(as+".link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String as,String value) {
            addCriterion(as+".link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String as,String value) {
            addCriterion(as+".link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(String as,List<String> values) {
            addCriterion(as+".link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(String as,List<String> values) {
            addCriterion(as+".link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String as,String value1, String value2) {
            addCriterion(as+".link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String as,String value1, String value2) {
            addCriterion(as+".link_url not between", value1, value2, "linkUrl");
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

        public Criteria andParentIdIsNull(String as) {
            addCriterion(as+".parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull(String as) {
            addCriterion(as+".parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String as,Integer value) {
            addCriterion(as+".parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String as,Integer value) {
            addCriterion(as+".parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String as,Integer value) {
            addCriterion(as+".parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String as,Integer value) {
            addCriterion(as+".parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(String as,List<Integer> values) {
            addCriterion(as+".parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(String as,List<Integer> values) {
            addCriterion(as+".parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull(String as) {
            addCriterion(as+".sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull(String as) {
            addCriterion(as+".sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(String as,Integer value) {
            addCriterion(as+".sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(String as,Integer value) {
            addCriterion(as+".sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(String as,Integer value) {
            addCriterion(as+".sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(String as,Integer value) {
            addCriterion(as+".sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(String as,List<Integer> values) {
            addCriterion(as+".sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(String as,List<Integer> values) {
            addCriterion(as+".sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull(String as) {
            addCriterion(as+".type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull(String as) {
            addCriterion(as+".type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String as,Integer value) {
            addCriterion(as+".type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String as,Integer value) {
            addCriterion(as+".type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String as,Integer value) {
            addCriterion(as+".type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String as,Integer value) {
            addCriterion(as+".type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(String as,List<Integer> values) {
            addCriterion(as+".type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(String as,List<Integer> values) {
            addCriterion(as+".type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".type not between", value1, value2, "type");
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

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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
