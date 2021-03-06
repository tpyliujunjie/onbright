package com.bright.apollo.common.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSceneExample implements Serializable{
    /**  
	 *   
	 */
	private static final long serialVersionUID = 3541257962421035404L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public TSceneExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
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
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
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

        public Criteria andSceneNumberIsNull() {
            addCriterion("scene_number is null");
            return (Criteria) this;
        }

        public Criteria andSceneNumberIsNotNull() {
            addCriterion("scene_number is not null");
            return (Criteria) this;
        }

        public Criteria andSceneNumberEqualTo(Integer value) {
            addCriterion("scene_number =", value, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberNotEqualTo(Integer value) {
            addCriterion("scene_number <>", value, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberGreaterThan(Integer value) {
            addCriterion("scene_number >", value, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_number >=", value, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberLessThan(Integer value) {
            addCriterion("scene_number <", value, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scene_number <=", value, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberIn(List<Integer> values) {
            addCriterion("scene_number in", values, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberNotIn(List<Integer> values) {
            addCriterion("scene_number not in", values, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberBetween(Integer value1, Integer value2) {
            addCriterion("scene_number between", value1, value2, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_number not between", value1, value2, "sceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNull() {
            addCriterion("scene_name is null");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNotNull() {
            addCriterion("scene_name is not null");
            return (Criteria) this;
        }

        public Criteria andSceneNameEqualTo(String value) {
            addCriterion("scene_name =", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotEqualTo(String value) {
            addCriterion("scene_name <>", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThan(String value) {
            addCriterion("scene_name >", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThanOrEqualTo(String value) {
            addCriterion("scene_name >=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThan(String value) {
            addCriterion("scene_name <", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThanOrEqualTo(String value) {
            addCriterion("scene_name <=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLike(String value) {
            addCriterion("scene_name like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotLike(String value) {
            addCriterion("scene_name not like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameIn(List<String> values) {
            addCriterion("scene_name in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotIn(List<String> values) {
            addCriterion("scene_name not in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameBetween(String value1, String value2) {
            addCriterion("scene_name between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotBetween(String value1, String value2) {
            addCriterion("scene_name not between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdIsNull() {
            addCriterion("obox_serial_id is null");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdIsNotNull() {
            addCriterion("obox_serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdEqualTo(String value) {
            addCriterion("obox_serial_id =", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdNotEqualTo(String value) {
            addCriterion("obox_serial_id <>", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdGreaterThan(String value) {
            addCriterion("obox_serial_id >", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdGreaterThanOrEqualTo(String value) {
            addCriterion("obox_serial_id >=", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdLessThan(String value) {
            addCriterion("obox_serial_id <", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdLessThanOrEqualTo(String value) {
            addCriterion("obox_serial_id <=", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdLike(String value) {
            addCriterion("obox_serial_id like", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdNotLike(String value) {
            addCriterion("obox_serial_id not like", value, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdIn(List<String> values) {
            addCriterion("obox_serial_id in", values, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdNotIn(List<String> values) {
            addCriterion("obox_serial_id not in", values, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdBetween(String value1, String value2) {
            addCriterion("obox_serial_id between", value1, value2, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSerialIdNotBetween(String value1, String value2) {
            addCriterion("obox_serial_id not between", value1, value2, "oboxSerialId");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberIsNull() {
            addCriterion("obox_scene_number is null");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberIsNotNull() {
            addCriterion("obox_scene_number is not null");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberEqualTo(Integer value) {
            addCriterion("obox_scene_number =", value, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberNotEqualTo(Integer value) {
            addCriterion("obox_scene_number <>", value, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberGreaterThan(Integer value) {
            addCriterion("obox_scene_number >", value, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("obox_scene_number >=", value, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberLessThan(Integer value) {
            addCriterion("obox_scene_number <", value, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberLessThanOrEqualTo(Integer value) {
            addCriterion("obox_scene_number <=", value, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberIn(List<Integer> values) {
            addCriterion("obox_scene_number in", values, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberNotIn(List<Integer> values) {
            addCriterion("obox_scene_number not in", values, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberBetween(Integer value1, Integer value2) {
            addCriterion("obox_scene_number between", value1, value2, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andOboxSceneNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("obox_scene_number not between", value1, value2, "oboxSceneNumber");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNull() {
            addCriterion("scene_status is null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNotNull() {
            addCriterion("scene_status is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusEqualTo(Byte value) {
            addCriterion("scene_status =", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotEqualTo(Byte value) {
            addCriterion("scene_status <>", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThan(Byte value) {
            addCriterion("scene_status >", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("scene_status >=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThan(Byte value) {
            addCriterion("scene_status <", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThanOrEqualTo(Byte value) {
            addCriterion("scene_status <=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIn(List<Byte> values) {
            addCriterion("scene_status in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotIn(List<Byte> values) {
            addCriterion("scene_status not in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusBetween(Byte value1, Byte value2) {
            addCriterion("scene_status between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("scene_status not between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNull() {
            addCriterion("scene_type is null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNotNull() {
            addCriterion("scene_type is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeEqualTo(String value) {
            addCriterion("scene_type =", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotEqualTo(String value) {
            addCriterion("scene_type <>", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThan(String value) {
            addCriterion("scene_type >", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_type >=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThan(String value) {
            addCriterion("scene_type <", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThanOrEqualTo(String value) {
            addCriterion("scene_type <=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLike(String value) {
            addCriterion("scene_type like", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotLike(String value) {
            addCriterion("scene_type not like", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIn(List<String> values) {
            addCriterion("scene_type in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotIn(List<String> values) {
            addCriterion("scene_type not in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeBetween(String value1, String value2) {
            addCriterion("scene_type between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotBetween(String value1, String value2) {
            addCriterion("scene_type not between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andMsgAlterIsNull() {
            addCriterion("msg_alter is null");
            return (Criteria) this;
        }

        public Criteria andMsgAlterIsNotNull() {
            addCriterion("msg_alter is not null");
            return (Criteria) this;
        }

        public Criteria andMsgAlterEqualTo(Byte value) {
            addCriterion("msg_alter =", value, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterNotEqualTo(Byte value) {
            addCriterion("msg_alter <>", value, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterGreaterThan(Byte value) {
            addCriterion("msg_alter >", value, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterGreaterThanOrEqualTo(Byte value) {
            addCriterion("msg_alter >=", value, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterLessThan(Byte value) {
            addCriterion("msg_alter <", value, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterLessThanOrEqualTo(Byte value) {
            addCriterion("msg_alter <=", value, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterIn(List<Byte> values) {
            addCriterion("msg_alter in", values, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterNotIn(List<Byte> values) {
            addCriterion("msg_alter not in", values, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterBetween(Byte value1, Byte value2) {
            addCriterion("msg_alter between", value1, value2, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andMsgAlterNotBetween(Byte value1, Byte value2) {
            addCriterion("msg_alter not between", value1, value2, "msgAlter");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeIsNull() {
            addCriterion("last_op_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeIsNotNull() {
            addCriterion("last_op_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeEqualTo(Date value) {
            addCriterion("last_op_time =", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeNotEqualTo(Date value) {
            addCriterion("last_op_time <>", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeGreaterThan(Date value) {
            addCriterion("last_op_time >", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_op_time >=", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeLessThan(Date value) {
            addCriterion("last_op_time <", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_op_time <=", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeIn(List<Date> values) {
            addCriterion("last_op_time in", values, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeNotIn(List<Date> values) {
            addCriterion("last_op_time not in", values, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeBetween(Date value1, Date value2) {
            addCriterion("last_op_time between", value1, value2, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_op_time not between", value1, value2, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andSceneRunIsNull() {
            addCriterion("scene_run is null");
            return (Criteria) this;
        }

        public Criteria andSceneRunIsNotNull() {
            addCriterion("scene_run is not null");
            return (Criteria) this;
        }

        public Criteria andSceneRunEqualTo(Byte value) {
            addCriterion("scene_run =", value, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunNotEqualTo(Byte value) {
            addCriterion("scene_run <>", value, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunGreaterThan(Byte value) {
            addCriterion("scene_run >", value, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunGreaterThanOrEqualTo(Byte value) {
            addCriterion("scene_run >=", value, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunLessThan(Byte value) {
            addCriterion("scene_run <", value, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunLessThanOrEqualTo(Byte value) {
            addCriterion("scene_run <=", value, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunIn(List<Byte> values) {
            addCriterion("scene_run in", values, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunNotIn(List<Byte> values) {
            addCriterion("scene_run not in", values, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunBetween(Byte value1, Byte value2) {
            addCriterion("scene_run between", value1, value2, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andSceneRunNotBetween(Byte value1, Byte value2) {
            addCriterion("scene_run not between", value1, value2, "sceneRun");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(Integer value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(Integer value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(Integer value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(Integer value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(Integer value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<Integer> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<Integer> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(Integer value1, Integer value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(Integer value1, Integer value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andAlterNeedIsNull() {
            addCriterion("alter_need is null");
            return (Criteria) this;
        }

        public Criteria andAlterNeedIsNotNull() {
            addCriterion("alter_need is not null");
            return (Criteria) this;
        }

        public Criteria andAlterNeedEqualTo(Byte value) {
            addCriterion("alter_need =", value, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedNotEqualTo(Byte value) {
            addCriterion("alter_need <>", value, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedGreaterThan(Byte value) {
            addCriterion("alter_need >", value, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedGreaterThanOrEqualTo(Byte value) {
            addCriterion("alter_need >=", value, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedLessThan(Byte value) {
            addCriterion("alter_need <", value, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedLessThanOrEqualTo(Byte value) {
            addCriterion("alter_need <=", value, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedIn(List<Byte> values) {
            addCriterion("alter_need in", values, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedNotIn(List<Byte> values) {
            addCriterion("alter_need not in", values, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedBetween(Byte value1, Byte value2) {
            addCriterion("alter_need between", value1, value2, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andAlterNeedNotBetween(Byte value1, Byte value2) {
            addCriterion("alter_need not between", value1, value2, "alterNeed");
            return (Criteria) this;
        }

        public Criteria andSceneGroupIsNull() {
            addCriterion("scene_group is null");
            return (Criteria) this;
        }

        public Criteria andSceneGroupIsNotNull() {
            addCriterion("scene_group is not null");
            return (Criteria) this;
        }

        public Criteria andSceneGroupEqualTo(String value) {
            addCriterion("scene_group =", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupNotEqualTo(String value) {
            addCriterion("scene_group <>", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupGreaterThan(String value) {
            addCriterion("scene_group >", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupGreaterThanOrEqualTo(String value) {
            addCriterion("scene_group >=", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupLessThan(String value) {
            addCriterion("scene_group <", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupLessThanOrEqualTo(String value) {
            addCriterion("scene_group <=", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupLike(String value) {
            addCriterion("scene_group like", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupNotLike(String value) {
            addCriterion("scene_group not like", value, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupIn(List<String> values) {
            addCriterion("scene_group in", values, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupNotIn(List<String> values) {
            addCriterion("scene_group not in", values, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupBetween(String value1, String value2) {
            addCriterion("scene_group between", value1, value2, "sceneGroup");
            return (Criteria) this;
        }

        public Criteria andSceneGroupNotBetween(String value1, String value2) {
            addCriterion("scene_group not between", value1, value2, "sceneGroup");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_scene
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 02 10:21:07 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_scene
     *
     * @mbg.generated Fri Mar 02 10:21:07 CST 2018
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