package com.base.model;import com.util.mybatis.BaseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample extends BaseExample {
    

    

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andTitleIsNull(String as) {
            addCriterion(as+".title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull(String as) {
            addCriterion(as+".title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String as,String value) {
            addCriterion(as+".title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String as,String value) {
            addCriterion(as+".title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String as,String value) {
            addCriterion(as+".title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String as,String value) {
            addCriterion(as+".title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String as,String value) {
            addCriterion(as+".title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String as,String value) {
            addCriterion(as+".title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(String as,List<String> values) {
            addCriterion(as+".title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(String as,List<String> values) {
            addCriterion(as+".title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String as,String value1, String value2) {
            addCriterion(as+".title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String as,String value1, String value2) {
            addCriterion(as+".title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPlayAddressIsNull(String as) {
            addCriterion(as+".play_address is null");
            return (Criteria) this;
        }

        public Criteria andPlayAddressIsNotNull(String as) {
            addCriterion(as+".play_address is not null");
            return (Criteria) this;
        }

        public Criteria andPlayAddressEqualTo(String as,String value) {
            addCriterion(as+".play_address =", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotEqualTo(String as,String value) {
            addCriterion(as+".play_address <>", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressGreaterThan(String as,String value) {
            addCriterion(as+".play_address >", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".play_address >=", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressLessThan(String as,String value) {
            addCriterion(as+".play_address <", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".play_address <=", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressLike(String as,String value) {
            addCriterion(as+".play_address like", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotLike(String as,String value) {
            addCriterion(as+".play_address not like", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressIn(String as,List<String> values) {
            addCriterion(as+".play_address in", values, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotIn(String as,List<String> values) {
            addCriterion(as+".play_address not in", values, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressBetween(String as,String value1, String value2) {
            addCriterion(as+".play_address between", value1, value2, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotBetween(String as,String value1, String value2) {
            addCriterion(as+".play_address not between", value1, value2, "playAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressIsNull(String as) {
            addCriterion(as+".thumbnail_address is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressIsNotNull(String as) {
            addCriterion(as+".thumbnail_address is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressEqualTo(String as,String value) {
            addCriterion(as+".thumbnail_address =", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotEqualTo(String as,String value) {
            addCriterion(as+".thumbnail_address <>", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressGreaterThan(String as,String value) {
            addCriterion(as+".thumbnail_address >", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".thumbnail_address >=", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressLessThan(String as,String value) {
            addCriterion(as+".thumbnail_address <", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".thumbnail_address <=", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressLike(String as,String value) {
            addCriterion(as+".thumbnail_address like", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotLike(String as,String value) {
            addCriterion(as+".thumbnail_address not like", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressIn(String as,List<String> values) {
            addCriterion(as+".thumbnail_address in", values, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotIn(String as,List<String> values) {
            addCriterion(as+".thumbnail_address not in", values, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressBetween(String as,String value1, String value2) {
            addCriterion(as+".thumbnail_address between", value1, value2, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotBetween(String as,String value1, String value2) {
            addCriterion(as+".thumbnail_address not between", value1, value2, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull(String as) {
            addCriterion(as+".size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull(String as) {
            addCriterion(as+".size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String as,Integer value) {
            addCriterion(as+".size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String as,Integer value) {
            addCriterion(as+".size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String as,Integer value) {
            addCriterion(as+".size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String as,Integer value) {
            addCriterion(as+".size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(String as,List<Integer> values) {
            addCriterion(as+".size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(String as,List<Integer> values) {
            addCriterion(as+".size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIsNull(String as) {
            addCriterion(as+".subtitles is null");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIsNotNull(String as) {
            addCriterion(as+".subtitles is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitlesEqualTo(String as,String value) {
            addCriterion(as+".subtitles =", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotEqualTo(String as,String value) {
            addCriterion(as+".subtitles <>", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesGreaterThan(String as,String value) {
            addCriterion(as+".subtitles >", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".subtitles >=", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLessThan(String as,String value) {
            addCriterion(as+".subtitles <", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".subtitles <=", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLike(String as,String value) {
            addCriterion(as+".subtitles like", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotLike(String as,String value) {
            addCriterion(as+".subtitles not like", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIn(String as,List<String> values) {
            addCriterion(as+".subtitles in", values, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotIn(String as,List<String> values) {
            addCriterion(as+".subtitles not in", values, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesBetween(String as,String value1, String value2) {
            addCriterion(as+".subtitles between", value1, value2, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotBetween(String as,String value1, String value2) {
            addCriterion(as+".subtitles not between", value1, value2, "subtitles");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIsNull(String as) {
            addCriterion(as+".recording_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIsNotNull(String as) {
            addCriterion(as+".recording_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeEqualTo(String as,Date value) {
            addCriterion(as+".recording_time =", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotEqualTo(String as,Date value) {
            addCriterion(as+".recording_time <>", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeGreaterThan(String as,Date value) {
            addCriterion(as+".recording_time >", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeGreaterThanOrEqualTo(String as,Date value) {
            addCriterion(as+".recording_time >=", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeLessThan(String as,Date value) {
            addCriterion(as+".recording_time <", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeLessThanOrEqualTo(String as,Date value) {
            addCriterion(as+".recording_time <=", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIn(String as,List<Date> values) {
            addCriterion(as+".recording_time in", values, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotIn(String as,List<Date> values) {
            addCriterion(as+".recording_time not in", values, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeBetween(String as,Date value1, Date value2) {
            addCriterion(as+".recording_time between", value1, value2, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotBetween(String as,Date value1, Date value2) {
            addCriterion(as+".recording_time not between", value1, value2, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNull(String as) {
            addCriterion(as+".labels is null");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNotNull(String as) {
            addCriterion(as+".labels is not null");
            return (Criteria) this;
        }

        public Criteria andLabelsEqualTo(String as,String value) {
            addCriterion(as+".labels =", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotEqualTo(String as,String value) {
            addCriterion(as+".labels <>", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThan(String as,String value) {
            addCriterion(as+".labels >", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".labels >=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThan(String as,String value) {
            addCriterion(as+".labels <", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".labels <=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLike(String as,String value) {
            addCriterion(as+".labels like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotLike(String as,String value) {
            addCriterion(as+".labels not like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsIn(String as,List<String> values) {
            addCriterion(as+".labels in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotIn(String as,List<String> values) {
            addCriterion(as+".labels not in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsBetween(String as,String value1, String value2) {
            addCriterion(as+".labels between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotBetween(String as,String value1, String value2) {
            addCriterion(as+".labels not between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNull(String as) {
            addCriterion(as+".speaker is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNotNull(String as) {
            addCriterion(as+".speaker is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerEqualTo(String as,String value) {
            addCriterion(as+".speaker =", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotEqualTo(String as,String value) {
            addCriterion(as+".speaker <>", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThan(String as,String value) {
            addCriterion(as+".speaker >", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".speaker >=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThan(String as,String value) {
            addCriterion(as+".speaker <", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".speaker <=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLike(String as,String value) {
            addCriterion(as+".speaker like", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotLike(String as,String value) {
            addCriterion(as+".speaker not like", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerIn(String as,List<String> values) {
            addCriterion(as+".speaker in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotIn(String as,List<String> values) {
            addCriterion(as+".speaker not in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerBetween(String as,String value1, String value2) {
            addCriterion(as+".speaker between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotBetween(String as,String value1, String value2) {
            addCriterion(as+".speaker not between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull(String as) {
            addCriterion(as+".organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull(String as) {
            addCriterion(as+".organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String as,String value) {
            addCriterion(as+".organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String as,String value) {
            addCriterion(as+".organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String as,String value) {
            addCriterion(as+".organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String as,String value) {
            addCriterion(as+".organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String as,String value) {
            addCriterion(as+".organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String as,String value) {
            addCriterion(as+".organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(String as,List<String> values) {
            addCriterion(as+".organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(String as,List<String> values) {
            addCriterion(as+".organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String as,String value1, String value2) {
            addCriterion(as+".organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String as,String value1, String value2) {
            addCriterion(as+".organization not between", value1, value2, "organization");
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

        public Criteria andPlayCountIsNull(String as) {
            addCriterion(as+".play_count is null");
            return (Criteria) this;
        }

        public Criteria andPlayCountIsNotNull(String as) {
            addCriterion(as+".play_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlayCountEqualTo(String as,Integer value) {
            addCriterion(as+".play_count =", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotEqualTo(String as,Integer value) {
            addCriterion(as+".play_count <>", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThan(String as,Integer value) {
            addCriterion(as+".play_count >", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".play_count >=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThan(String as,Integer value) {
            addCriterion(as+".play_count <", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".play_count <=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountIn(String as,List<Integer> values) {
            addCriterion(as+".play_count in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotIn(String as,List<Integer> values) {
            addCriterion(as+".play_count not in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".play_count between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".play_count not between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull(String as) {
            addCriterion(as+".comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull(String as) {
            addCriterion(as+".comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String as,Integer value) {
            addCriterion(as+".comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String as,Integer value) {
            addCriterion(as+".comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String as,Integer value) {
            addCriterion(as+".comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String as,Integer value) {
            addCriterion(as+".comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(String as,List<Integer> values) {
            addCriterion(as+".comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(String as,List<Integer> values) {
            addCriterion(as+".comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNull(String as) {
            addCriterion(as+".is_comment is null");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNotNull(String as) {
            addCriterion(as+".is_comment is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommentEqualTo(String as,Integer value) {
            addCriterion(as+".is_comment =", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotEqualTo(String as,Integer value) {
            addCriterion(as+".is_comment <>", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThan(String as,Integer value) {
            addCriterion(as+".is_comment >", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".is_comment >=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThan(String as,Integer value) {
            addCriterion(as+".is_comment <", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".is_comment <=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentIn(String as,List<Integer> values) {
            addCriterion(as+".is_comment in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotIn(String as,List<Integer> values) {
            addCriterion(as+".is_comment not in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".is_comment between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".is_comment not between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull(String as) {
            addCriterion(as+".is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull(String as) {
            addCriterion(as+".is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String as,Integer value) {
            addCriterion(as+".is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String as,Integer value) {
            addCriterion(as+".is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String as,Integer value) {
            addCriterion(as+".is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String as,Integer value) {
            addCriterion(as+".is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(String as,List<Integer> values) {
            addCriterion(as+".is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(String as,List<Integer> values) {
            addCriterion(as+".is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".is_hot not between", value1, value2, "isHot");
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

        public Criteria andIsDownloadEqualTo(String as,Integer value) {
            addCriterion(as+".is_download =", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotEqualTo(String as,Integer value) {
            addCriterion(as+".is_download <>", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThan(String as,Integer value) {
            addCriterion(as+".is_download >", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".is_download >=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThan(String as,Integer value) {
            addCriterion(as+".is_download <", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".is_download <=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadIn(String as,List<Integer> values) {
            addCriterion(as+".is_download in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotIn(String as,List<Integer> values) {
            addCriterion(as+".is_download not in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".is_download between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".is_download not between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull(String as) {
            addCriterion(as+".language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull(String as) {
            addCriterion(as+".language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String as,String value) {
            addCriterion(as+".language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String as,String value) {
            addCriterion(as+".language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String as,String value) {
            addCriterion(as+".language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String as,String value) {
            addCriterion(as+".language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String as,String value) {
            addCriterion(as+".language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String as,String value) {
            addCriterion(as+".language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(String as,List<String> values) {
            addCriterion(as+".language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(String as,List<String> values) {
            addCriterion(as+".language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String as,String value1, String value2) {
            addCriterion(as+".language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String as,String value1, String value2) {
            addCriterion(as+".language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andBitRateIsNull(String as) {
            addCriterion(as+".bit_rate is null");
            return (Criteria) this;
        }

        public Criteria andBitRateIsNotNull(String as) {
            addCriterion(as+".bit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBitRateEqualTo(String as,Integer value) {
            addCriterion(as+".bit_rate =", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateNotEqualTo(String as,Integer value) {
            addCriterion(as+".bit_rate <>", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateGreaterThan(String as,Integer value) {
            addCriterion(as+".bit_rate >", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".bit_rate >=", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateLessThan(String as,Integer value) {
            addCriterion(as+".bit_rate <", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".bit_rate <=", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateIn(String as,List<Integer> values) {
            addCriterion(as+".bit_rate in", values, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateNotIn(String as,List<Integer> values) {
            addCriterion(as+".bit_rate not in", values, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".bit_rate between", value1, value2, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".bit_rate not between", value1, value2, "bitRate");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull(String as) {
            addCriterion(as+".copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull(String as) {
            addCriterion(as+".copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String as,String value) {
            addCriterion(as+".copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String as,String value) {
            addCriterion(as+".copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String as,String value) {
            addCriterion(as+".copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String as,String value) {
            addCriterion(as+".copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String as,String value) {
            addCriterion(as+".copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String as,String value) {
            addCriterion(as+".copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(String as,List<String> values) {
            addCriterion(as+".copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(String as,List<String> values) {
            addCriterion(as+".copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String as,String value1, String value2) {
            addCriterion(as+".copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String as,String value1, String value2) {
            addCriterion(as+".copyright not between", value1, value2, "copyright");
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

        public Criteria andProblemIsNull(String as) {
            addCriterion(as+".problem is null");
            return (Criteria) this;
        }

        public Criteria andProblemIsNotNull(String as) {
            addCriterion(as+".problem is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEqualTo(String as,String value) {
            addCriterion(as+".problem =", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotEqualTo(String as,String value) {
            addCriterion(as+".problem <>", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThan(String as,String value) {
            addCriterion(as+".problem >", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".problem >=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThan(String as,String value) {
            addCriterion(as+".problem <", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".problem <=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLike(String as,String value) {
            addCriterion(as+".problem like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotLike(String as,String value) {
            addCriterion(as+".problem not like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemIn(String as,List<String> values) {
            addCriterion(as+".problem in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotIn(String as,List<String> values) {
            addCriterion(as+".problem not in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemBetween(String as,String value1, String value2) {
            addCriterion(as+".problem between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotBetween(String as,String value1, String value2) {
            addCriterion(as+".problem not between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull(String as) {
            addCriterion(as+".answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull(String as) {
            addCriterion(as+".answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String as,String value) {
            addCriterion(as+".answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String as,String value) {
            addCriterion(as+".answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String as,String value) {
            addCriterion(as+".answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String as,String value) {
            addCriterion(as+".answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String as,String value) {
            addCriterion(as+".answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String as,String value) {
            addCriterion(as+".answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(String as,List<String> values) {
            addCriterion(as+".answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(String as,List<String> values) {
            addCriterion(as+".answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String as,String value1, String value2) {
            addCriterion(as+".answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String as,String value1, String value2) {
            addCriterion(as+".answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andProtectTypeIsNull(String as) {
            addCriterion(as+".protect_type is null");
            return (Criteria) this;
        }

        public Criteria andProtectTypeIsNotNull(String as) {
            addCriterion(as+".protect_type is not null");
            return (Criteria) this;
        }

        public Criteria andProtectTypeEqualTo(String as,String value) {
            addCriterion(as+".protect_type =", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotEqualTo(String as,String value) {
            addCriterion(as+".protect_type <>", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeGreaterThan(String as,String value) {
            addCriterion(as+".protect_type >", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeGreaterThanOrEqualTo(String as,String value) {
            addCriterion(as+".protect_type >=", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeLessThan(String as,String value) {
            addCriterion(as+".protect_type <", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeLessThanOrEqualTo(String as,String value) {
            addCriterion(as+".protect_type <=", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeLike(String as,String value) {
            addCriterion(as+".protect_type like", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotLike(String as,String value) {
            addCriterion(as+".protect_type not like", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeIn(String as,List<String> values) {
            addCriterion(as+".protect_type in", values, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotIn(String as,List<String> values) {
            addCriterion(as+".protect_type not in", values, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeBetween(String as,String value1, String value2) {
            addCriterion(as+".protect_type between", value1, value2, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotBetween(String as,String value1, String value2) {
            addCriterion(as+".protect_type not between", value1, value2, "protectType");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPlayAddressIsNull() {
            addCriterion("play_address is null");
            return (Criteria) this;
        }

        public Criteria andPlayAddressIsNotNull() {
            addCriterion("play_address is not null");
            return (Criteria) this;
        }

        public Criteria andPlayAddressEqualTo(String value) {
            addCriterion("play_address =", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotEqualTo(String value) {
            addCriterion("play_address <>", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressGreaterThan(String value) {
            addCriterion("play_address >", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressGreaterThanOrEqualTo(String value) {
            addCriterion("play_address >=", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressLessThan(String value) {
            addCriterion("play_address <", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressLessThanOrEqualTo(String value) {
            addCriterion("play_address <=", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressLike(String value) {
            addCriterion("play_address like", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotLike(String value) {
            addCriterion("play_address not like", value, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressIn(List<String> values) {
            addCriterion("play_address in", values, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotIn(List<String> values) {
            addCriterion("play_address not in", values, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressBetween(String value1, String value2) {
            addCriterion("play_address between", value1, value2, "playAddress");
            return (Criteria) this;
        }

        public Criteria andPlayAddressNotBetween(String value1, String value2) {
            addCriterion("play_address not between", value1, value2, "playAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressIsNull() {
            addCriterion("thumbnail_address is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressIsNotNull() {
            addCriterion("thumbnail_address is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressEqualTo(String value) {
            addCriterion("thumbnail_address =", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotEqualTo(String value) {
            addCriterion("thumbnail_address <>", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressGreaterThan(String value) {
            addCriterion("thumbnail_address >", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_address >=", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressLessThan(String value) {
            addCriterion("thumbnail_address <", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_address <=", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressLike(String value) {
            addCriterion("thumbnail_address like", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotLike(String value) {
            addCriterion("thumbnail_address not like", value, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressIn(List<String> values) {
            addCriterion("thumbnail_address in", values, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotIn(List<String> values) {
            addCriterion("thumbnail_address not in", values, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressBetween(String value1, String value2) {
            addCriterion("thumbnail_address between", value1, value2, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andThumbnailAddressNotBetween(String value1, String value2) {
            addCriterion("thumbnail_address not between", value1, value2, "thumbnailAddress");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIsNull() {
            addCriterion("subtitles is null");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIsNotNull() {
            addCriterion("subtitles is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitlesEqualTo(String value) {
            addCriterion("subtitles =", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotEqualTo(String value) {
            addCriterion("subtitles <>", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesGreaterThan(String value) {
            addCriterion("subtitles >", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesGreaterThanOrEqualTo(String value) {
            addCriterion("subtitles >=", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLessThan(String value) {
            addCriterion("subtitles <", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLessThanOrEqualTo(String value) {
            addCriterion("subtitles <=", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLike(String value) {
            addCriterion("subtitles like", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotLike(String value) {
            addCriterion("subtitles not like", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIn(List<String> values) {
            addCriterion("subtitles in", values, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotIn(List<String> values) {
            addCriterion("subtitles not in", values, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesBetween(String value1, String value2) {
            addCriterion("subtitles between", value1, value2, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotBetween(String value1, String value2) {
            addCriterion("subtitles not between", value1, value2, "subtitles");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIsNull() {
            addCriterion("recording_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIsNotNull() {
            addCriterion("recording_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeEqualTo(Date value) {
            addCriterion("recording_time =", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotEqualTo(Date value) {
            addCriterion("recording_time <>", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeGreaterThan(Date value) {
            addCriterion("recording_time >", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recording_time >=", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeLessThan(Date value) {
            addCriterion("recording_time <", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeLessThanOrEqualTo(Date value) {
            addCriterion("recording_time <=", value, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeIn(List<Date> values) {
            addCriterion("recording_time in", values, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotIn(List<Date> values) {
            addCriterion("recording_time not in", values, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeBetween(Date value1, Date value2) {
            addCriterion("recording_time between", value1, value2, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andRecordingTimeNotBetween(Date value1, Date value2) {
            addCriterion("recording_time not between", value1, value2, "recordingTime");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNull() {
            addCriterion("labels is null");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNotNull() {
            addCriterion("labels is not null");
            return (Criteria) this;
        }

        public Criteria andLabelsEqualTo(String value) {
            addCriterion("labels =", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotEqualTo(String value) {
            addCriterion("labels <>", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThan(String value) {
            addCriterion("labels >", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThanOrEqualTo(String value) {
            addCriterion("labels >=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThan(String value) {
            addCriterion("labels <", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThanOrEqualTo(String value) {
            addCriterion("labels <=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLike(String value) {
            addCriterion("labels like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotLike(String value) {
            addCriterion("labels not like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsIn(List<String> values) {
            addCriterion("labels in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotIn(List<String> values) {
            addCriterion("labels not in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsBetween(String value1, String value2) {
            addCriterion("labels between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotBetween(String value1, String value2) {
            addCriterion("labels not between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNull() {
            addCriterion("speaker is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNotNull() {
            addCriterion("speaker is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerEqualTo(String value) {
            addCriterion("speaker =", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotEqualTo(String value) {
            addCriterion("speaker <>", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThan(String value) {
            addCriterion("speaker >", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThanOrEqualTo(String value) {
            addCriterion("speaker >=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThan(String value) {
            addCriterion("speaker <", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThanOrEqualTo(String value) {
            addCriterion("speaker <=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLike(String value) {
            addCriterion("speaker like", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotLike(String value) {
            addCriterion("speaker not like", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerIn(List<String> values) {
            addCriterion("speaker in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotIn(List<String> values) {
            addCriterion("speaker not in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerBetween(String value1, String value2) {
            addCriterion("speaker between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotBetween(String value1, String value2) {
            addCriterion("speaker not between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
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

        public Criteria andPlayCountIsNull() {
            addCriterion("play_count is null");
            return (Criteria) this;
        }

        public Criteria andPlayCountIsNotNull() {
            addCriterion("play_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlayCountEqualTo(Integer value) {
            addCriterion("play_count =", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotEqualTo(Integer value) {
            addCriterion("play_count <>", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThan(Integer value) {
            addCriterion("play_count >", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_count >=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThan(Integer value) {
            addCriterion("play_count <", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThanOrEqualTo(Integer value) {
            addCriterion("play_count <=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountIn(List<Integer> values) {
            addCriterion("play_count in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotIn(List<Integer> values) {
            addCriterion("play_count not in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountBetween(Integer value1, Integer value2) {
            addCriterion("play_count between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("play_count not between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Integer value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Integer value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Integer value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Integer value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Integer value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Integer> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Integer> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Integer value1, Integer value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNull() {
            addCriterion("is_comment is null");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNotNull() {
            addCriterion("is_comment is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommentEqualTo(Integer value) {
            addCriterion("is_comment =", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotEqualTo(Integer value) {
            addCriterion("is_comment <>", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThan(Integer value) {
            addCriterion("is_comment >", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_comment >=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThan(Integer value) {
            addCriterion("is_comment <", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThanOrEqualTo(Integer value) {
            addCriterion("is_comment <=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentIn(List<Integer> values) {
            addCriterion("is_comment in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotIn(List<Integer> values) {
            addCriterion("is_comment not in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentBetween(Integer value1, Integer value2) {
            addCriterion("is_comment between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_comment not between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
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

        public Criteria andIsDownloadEqualTo(Integer value) {
            addCriterion("is_download =", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotEqualTo(Integer value) {
            addCriterion("is_download <>", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThan(Integer value) {
            addCriterion("is_download >", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_download >=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThan(Integer value) {
            addCriterion("is_download <", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("is_download <=", value, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadIn(List<Integer> values) {
            addCriterion("is_download in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotIn(List<Integer> values) {
            addCriterion("is_download not in", values, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadBetween(Integer value1, Integer value2) {
            addCriterion("is_download between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andIsDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_download not between", value1, value2, "isDownload");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andBitRateIsNull() {
            addCriterion("bit_rate is null");
            return (Criteria) this;
        }

        public Criteria andBitRateIsNotNull() {
            addCriterion("bit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBitRateEqualTo(Integer value) {
            addCriterion("bit_rate =", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateNotEqualTo(Integer value) {
            addCriterion("bit_rate <>", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateGreaterThan(Integer value) {
            addCriterion("bit_rate >", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bit_rate >=", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateLessThan(Integer value) {
            addCriterion("bit_rate <", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateLessThanOrEqualTo(Integer value) {
            addCriterion("bit_rate <=", value, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateIn(List<Integer> values) {
            addCriterion("bit_rate in", values, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateNotIn(List<Integer> values) {
            addCriterion("bit_rate not in", values, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateBetween(Integer value1, Integer value2) {
            addCriterion("bit_rate between", value1, value2, "bitRate");
            return (Criteria) this;
        }

        public Criteria andBitRateNotBetween(Integer value1, Integer value2) {
            addCriterion("bit_rate not between", value1, value2, "bitRate");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
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

        public Criteria andProblemIsNull() {
            addCriterion("problem is null");
            return (Criteria) this;
        }

        public Criteria andProblemIsNotNull() {
            addCriterion("problem is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEqualTo(String value) {
            addCriterion("problem =", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotEqualTo(String value) {
            addCriterion("problem <>", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThan(String value) {
            addCriterion("problem >", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThanOrEqualTo(String value) {
            addCriterion("problem >=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThan(String value) {
            addCriterion("problem <", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThanOrEqualTo(String value) {
            addCriterion("problem <=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLike(String value) {
            addCriterion("problem like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotLike(String value) {
            addCriterion("problem not like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemIn(List<String> values) {
            addCriterion("problem in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotIn(List<String> values) {
            addCriterion("problem not in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemBetween(String value1, String value2) {
            addCriterion("problem between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotBetween(String value1, String value2) {
            addCriterion("problem not between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andProtectTypeIsNull() {
            addCriterion("protect_type is null");
            return (Criteria) this;
        }

        public Criteria andProtectTypeIsNotNull() {
            addCriterion("protect_type is not null");
            return (Criteria) this;
        }

        public Criteria andProtectTypeEqualTo(String value) {
            addCriterion("protect_type =", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotEqualTo(String value) {
            addCriterion("protect_type <>", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeGreaterThan(String value) {
            addCriterion("protect_type >", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("protect_type >=", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeLessThan(String value) {
            addCriterion("protect_type <", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeLessThanOrEqualTo(String value) {
            addCriterion("protect_type <=", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeLike(String value) {
            addCriterion("protect_type like", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotLike(String value) {
            addCriterion("protect_type not like", value, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeIn(List<String> values) {
            addCriterion("protect_type in", values, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotIn(List<String> values) {
            addCriterion("protect_type not in", values, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeBetween(String value1, String value2) {
            addCriterion("protect_type between", value1, value2, "protectType");
            return (Criteria) this;
        }

        public Criteria andProtectTypeNotBetween(String value1, String value2) {
            addCriterion("protect_type not between", value1, value2, "protectType");
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
