package com.tencent.benchmark.model;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BenchmarkExample() {
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

        public Criteria andCarNameIsNull() {
            addCriterion("car_name is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("car_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("car_name =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("car_name <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("car_name >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_name >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("car_name <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("car_name <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("car_name like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("car_name not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("car_name in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("car_name not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("car_name between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("car_name not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2IsNull() {
            addCriterion("antutu_total_score_openGL2 is null");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2IsNotNull() {
            addCriterion("antutu_total_score_openGL2 is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2EqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL2 =", value, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2NotEqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL2 <>", value, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2GreaterThan(Integer value) {
            addCriterion("antutu_total_score_openGL2 >", value, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2GreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL2 >=", value, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2LessThan(Integer value) {
            addCriterion("antutu_total_score_openGL2 <", value, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2LessThanOrEqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL2 <=", value, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2In(List<Integer> values) {
            addCriterion("antutu_total_score_openGL2 in", values, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2NotIn(List<Integer> values) {
            addCriterion("antutu_total_score_openGL2 not in", values, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2Between(Integer value1, Integer value2) {
            addCriterion("antutu_total_score_openGL2 between", value1, value2, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl2NotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_total_score_openGL2 not between", value1, value2, "antutuTotalScoreOpengl2");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3IsNull() {
            addCriterion("antutu_total_score_openGL3 is null");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3IsNotNull() {
            addCriterion("antutu_total_score_openGL3 is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3EqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL3 =", value, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3NotEqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL3 <>", value, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3GreaterThan(Integer value) {
            addCriterion("antutu_total_score_openGL3 >", value, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3GreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL3 >=", value, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3LessThan(Integer value) {
            addCriterion("antutu_total_score_openGL3 <", value, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3LessThanOrEqualTo(Integer value) {
            addCriterion("antutu_total_score_openGL3 <=", value, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3In(List<Integer> values) {
            addCriterion("antutu_total_score_openGL3 in", values, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3NotIn(List<Integer> values) {
            addCriterion("antutu_total_score_openGL3 not in", values, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3Between(Integer value1, Integer value2) {
            addCriterion("antutu_total_score_openGL3 between", value1, value2, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAntutuTotalScoreOpengl3NotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_total_score_openGL3 not between", value1, value2, "antutuTotalScoreOpengl3");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIsNull() {
            addCriterion("android_version is null");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIsNotNull() {
            addCriterion("android_version is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionEqualTo(String value) {
            addCriterion("android_version =", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotEqualTo(String value) {
            addCriterion("android_version <>", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionGreaterThan(String value) {
            addCriterion("android_version >", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionGreaterThanOrEqualTo(String value) {
            addCriterion("android_version >=", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLessThan(String value) {
            addCriterion("android_version <", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLessThanOrEqualTo(String value) {
            addCriterion("android_version <=", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLike(String value) {
            addCriterion("android_version like", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotLike(String value) {
            addCriterion("android_version not like", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIn(List<String> values) {
            addCriterion("android_version in", values, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotIn(List<String> values) {
            addCriterion("android_version not in", values, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionBetween(String value1, String value2) {
            addCriterion("android_version between", value1, value2, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotBetween(String value1, String value2) {
            addCriterion("android_version not between", value1, value2, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureIsNull() {
            addCriterion("cpu_micro_rchitecture is null");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureIsNotNull() {
            addCriterion("cpu_micro_rchitecture is not null");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureEqualTo(String value) {
            addCriterion("cpu_micro_rchitecture =", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureNotEqualTo(String value) {
            addCriterion("cpu_micro_rchitecture <>", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureGreaterThan(String value) {
            addCriterion("cpu_micro_rchitecture >", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_micro_rchitecture >=", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureLessThan(String value) {
            addCriterion("cpu_micro_rchitecture <", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureLessThanOrEqualTo(String value) {
            addCriterion("cpu_micro_rchitecture <=", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureLike(String value) {
            addCriterion("cpu_micro_rchitecture like", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureNotLike(String value) {
            addCriterion("cpu_micro_rchitecture not like", value, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureIn(List<String> values) {
            addCriterion("cpu_micro_rchitecture in", values, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureNotIn(List<String> values) {
            addCriterion("cpu_micro_rchitecture not in", values, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureBetween(String value1, String value2) {
            addCriterion("cpu_micro_rchitecture between", value1, value2, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuMicroRchitectureNotBetween(String value1, String value2) {
            addCriterion("cpu_micro_rchitecture not between", value1, value2, "cpuMicroRchitecture");
            return (Criteria) this;
        }

        public Criteria andCpuTypeIsNull() {
            addCriterion("cpu_type is null");
            return (Criteria) this;
        }

        public Criteria andCpuTypeIsNotNull() {
            addCriterion("cpu_type is not null");
            return (Criteria) this;
        }

        public Criteria andCpuTypeEqualTo(String value) {
            addCriterion("cpu_type =", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotEqualTo(String value) {
            addCriterion("cpu_type <>", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeGreaterThan(String value) {
            addCriterion("cpu_type >", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_type >=", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeLessThan(String value) {
            addCriterion("cpu_type <", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeLessThanOrEqualTo(String value) {
            addCriterion("cpu_type <=", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeLike(String value) {
            addCriterion("cpu_type like", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotLike(String value) {
            addCriterion("cpu_type not like", value, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeIn(List<String> values) {
            addCriterion("cpu_type in", values, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotIn(List<String> values) {
            addCriterion("cpu_type not in", values, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeBetween(String value1, String value2) {
            addCriterion("cpu_type between", value1, value2, "cpuType");
            return (Criteria) this;
        }

        public Criteria andCpuTypeNotBetween(String value1, String value2) {
            addCriterion("cpu_type not between", value1, value2, "cpuType");
            return (Criteria) this;
        }

        public Criteria andDmipsActualIsNull() {
            addCriterion("dmips_actual is null");
            return (Criteria) this;
        }

        public Criteria andDmipsActualIsNotNull() {
            addCriterion("dmips_actual is not null");
            return (Criteria) this;
        }

        public Criteria andDmipsActualEqualTo(Integer value) {
            addCriterion("dmips_actual =", value, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualNotEqualTo(Integer value) {
            addCriterion("dmips_actual <>", value, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualGreaterThan(Integer value) {
            addCriterion("dmips_actual >", value, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualGreaterThanOrEqualTo(Integer value) {
            addCriterion("dmips_actual >=", value, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualLessThan(Integer value) {
            addCriterion("dmips_actual <", value, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualLessThanOrEqualTo(Integer value) {
            addCriterion("dmips_actual <=", value, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualIn(List<Integer> values) {
            addCriterion("dmips_actual in", values, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualNotIn(List<Integer> values) {
            addCriterion("dmips_actual not in", values, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualBetween(Integer value1, Integer value2) {
            addCriterion("dmips_actual between", value1, value2, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsActualNotBetween(Integer value1, Integer value2) {
            addCriterion("dmips_actual not between", value1, value2, "dmipsActual");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictIsNull() {
            addCriterion("dmips_pridict is null");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictIsNotNull() {
            addCriterion("dmips_pridict is not null");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictEqualTo(Integer value) {
            addCriterion("dmips_pridict =", value, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictNotEqualTo(Integer value) {
            addCriterion("dmips_pridict <>", value, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictGreaterThan(Integer value) {
            addCriterion("dmips_pridict >", value, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictGreaterThanOrEqualTo(Integer value) {
            addCriterion("dmips_pridict >=", value, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictLessThan(Integer value) {
            addCriterion("dmips_pridict <", value, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictLessThanOrEqualTo(Integer value) {
            addCriterion("dmips_pridict <=", value, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictIn(List<Integer> values) {
            addCriterion("dmips_pridict in", values, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictNotIn(List<Integer> values) {
            addCriterion("dmips_pridict not in", values, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictBetween(Integer value1, Integer value2) {
            addCriterion("dmips_pridict between", value1, value2, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andDmipsPridictNotBetween(Integer value1, Integer value2) {
            addCriterion("dmips_pridict not between", value1, value2, "dmipsPridict");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIsNull() {
            addCriterion("cpu_frequency is null");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIsNotNull() {
            addCriterion("cpu_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyEqualTo(Integer value) {
            addCriterion("cpu_frequency =", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotEqualTo(Integer value) {
            addCriterion("cpu_frequency <>", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyGreaterThan(Integer value) {
            addCriterion("cpu_frequency >", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpu_frequency >=", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLessThan(Integer value) {
            addCriterion("cpu_frequency <", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("cpu_frequency <=", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIn(List<Integer> values) {
            addCriterion("cpu_frequency in", values, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotIn(List<Integer> values) {
            addCriterion("cpu_frequency not in", values, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("cpu_frequency between", value1, value2, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("cpu_frequency not between", value1, value2, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyIsNull() {
            addCriterion("ddr_frequency is null");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyIsNotNull() {
            addCriterion("ddr_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyEqualTo(Integer value) {
            addCriterion("ddr_frequency =", value, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyNotEqualTo(Integer value) {
            addCriterion("ddr_frequency <>", value, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyGreaterThan(Integer value) {
            addCriterion("ddr_frequency >", value, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ddr_frequency >=", value, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyLessThan(Integer value) {
            addCriterion("ddr_frequency <", value, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("ddr_frequency <=", value, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyIn(List<Integer> values) {
            addCriterion("ddr_frequency in", values, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyNotIn(List<Integer> values) {
            addCriterion("ddr_frequency not in", values, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("ddr_frequency between", value1, value2, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andDdrFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("ddr_frequency not between", value1, value2, "ddrFrequency");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNull() {
            addCriterion("memory_size is null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNotNull() {
            addCriterion("memory_size is not null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeEqualTo(Integer value) {
            addCriterion("memory_size =", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotEqualTo(Integer value) {
            addCriterion("memory_size <>", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThan(Integer value) {
            addCriterion("memory_size >", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("memory_size >=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThan(Integer value) {
            addCriterion("memory_size <", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThanOrEqualTo(Integer value) {
            addCriterion("memory_size <=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIn(List<Integer> values) {
            addCriterion("memory_size in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotIn(List<Integer> values) {
            addCriterion("memory_size not in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeBetween(Integer value1, Integer value2) {
            addCriterion("memory_size between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotBetween(Integer value1, Integer value2) {
            addCriterion("memory_size not between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andGpuTypeIsNull() {
            addCriterion("gpu_type is null");
            return (Criteria) this;
        }

        public Criteria andGpuTypeIsNotNull() {
            addCriterion("gpu_type is not null");
            return (Criteria) this;
        }

        public Criteria andGpuTypeEqualTo(String value) {
            addCriterion("gpu_type =", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeNotEqualTo(String value) {
            addCriterion("gpu_type <>", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeGreaterThan(String value) {
            addCriterion("gpu_type >", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gpu_type >=", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeLessThan(String value) {
            addCriterion("gpu_type <", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeLessThanOrEqualTo(String value) {
            addCriterion("gpu_type <=", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeLike(String value) {
            addCriterion("gpu_type like", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeNotLike(String value) {
            addCriterion("gpu_type not like", value, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeIn(List<String> values) {
            addCriterion("gpu_type in", values, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeNotIn(List<String> values) {
            addCriterion("gpu_type not in", values, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeBetween(String value1, String value2) {
            addCriterion("gpu_type between", value1, value2, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuTypeNotBetween(String value1, String value2) {
            addCriterion("gpu_type not between", value1, value2, "gpuType");
            return (Criteria) this;
        }

        public Criteria andGpuVersionIsNull() {
            addCriterion("gpu_version is null");
            return (Criteria) this;
        }

        public Criteria andGpuVersionIsNotNull() {
            addCriterion("gpu_version is not null");
            return (Criteria) this;
        }

        public Criteria andGpuVersionEqualTo(String value) {
            addCriterion("gpu_version =", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionNotEqualTo(String value) {
            addCriterion("gpu_version <>", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionGreaterThan(String value) {
            addCriterion("gpu_version >", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionGreaterThanOrEqualTo(String value) {
            addCriterion("gpu_version >=", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionLessThan(String value) {
            addCriterion("gpu_version <", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionLessThanOrEqualTo(String value) {
            addCriterion("gpu_version <=", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionLike(String value) {
            addCriterion("gpu_version like", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionNotLike(String value) {
            addCriterion("gpu_version not like", value, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionIn(List<String> values) {
            addCriterion("gpu_version in", values, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionNotIn(List<String> values) {
            addCriterion("gpu_version not in", values, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionBetween(String value1, String value2) {
            addCriterion("gpu_version between", value1, value2, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andGpuVersionNotBetween(String value1, String value2) {
            addCriterion("gpu_version not between", value1, value2, "gpuVersion");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreIsNull() {
            addCriterion("antutu_cpu_singlecore_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreIsNotNull() {
            addCriterion("antutu_cpu_singlecore_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_score =", value, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreNotEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_score <>", value, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreGreaterThan(Integer value) {
            addCriterion("antutu_cpu_singlecore_score >", value, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_score >=", value, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreLessThan(Integer value) {
            addCriterion("antutu_cpu_singlecore_score <", value, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_score <=", value, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreIn(List<Integer> values) {
            addCriterion("antutu_cpu_singlecore_score in", values, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreNotIn(List<Integer> values) {
            addCriterion("antutu_cpu_singlecore_score not in", values, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_cpu_singlecore_score between", value1, value2, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_cpu_singlecore_score not between", value1, value2, "antutuCpuSinglecoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreIsNull() {
            addCriterion("antutu_cpu_singlecore_normalcal_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreIsNotNull() {
            addCriterion("antutu_cpu_singlecore_normalcal_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_normalcal_score =", value, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreNotEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_normalcal_score <>", value, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreGreaterThan(Integer value) {
            addCriterion("antutu_cpu_singlecore_normalcal_score >", value, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_normalcal_score >=", value, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreLessThan(Integer value) {
            addCriterion("antutu_cpu_singlecore_normalcal_score <", value, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_cpu_singlecore_normalcal_score <=", value, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreIn(List<Integer> values) {
            addCriterion("antutu_cpu_singlecore_normalcal_score in", values, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreNotIn(List<Integer> values) {
            addCriterion("antutu_cpu_singlecore_normalcal_score not in", values, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_cpu_singlecore_normalcal_score between", value1, value2, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuSinglecoreNormalcalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_cpu_singlecore_normalcal_score not between", value1, value2, "antutuCpuSinglecoreNormalcalScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreIsNull() {
            addCriterion("antutu_cpu_multicore_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreIsNotNull() {
            addCriterion("antutu_cpu_multicore_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreEqualTo(Integer value) {
            addCriterion("antutu_cpu_multicore_score =", value, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreNotEqualTo(Integer value) {
            addCriterion("antutu_cpu_multicore_score <>", value, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreGreaterThan(Integer value) {
            addCriterion("antutu_cpu_multicore_score >", value, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_cpu_multicore_score >=", value, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreLessThan(Integer value) {
            addCriterion("antutu_cpu_multicore_score <", value, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_cpu_multicore_score <=", value, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreIn(List<Integer> values) {
            addCriterion("antutu_cpu_multicore_score in", values, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreNotIn(List<Integer> values) {
            addCriterion("antutu_cpu_multicore_score not in", values, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_cpu_multicore_score between", value1, value2, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuCpuMulticoreScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_cpu_multicore_score not between", value1, value2, "antutuCpuMulticoreScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreIsNull() {
            addCriterion("antutu_ram_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreIsNotNull() {
            addCriterion("antutu_ram_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreEqualTo(Integer value) {
            addCriterion("antutu_ram_score =", value, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreNotEqualTo(Integer value) {
            addCriterion("antutu_ram_score <>", value, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreGreaterThan(Integer value) {
            addCriterion("antutu_ram_score >", value, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_ram_score >=", value, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreLessThan(Integer value) {
            addCriterion("antutu_ram_score <", value, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_ram_score <=", value, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreIn(List<Integer> values) {
            addCriterion("antutu_ram_score in", values, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreNotIn(List<Integer> values) {
            addCriterion("antutu_ram_score not in", values, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_ram_score between", value1, value2, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_ram_score not between", value1, value2, "antutuRamScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreIsNull() {
            addCriterion("antutu_rom_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreIsNotNull() {
            addCriterion("antutu_rom_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreEqualTo(Integer value) {
            addCriterion("antutu_rom_score =", value, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreNotEqualTo(Integer value) {
            addCriterion("antutu_rom_score <>", value, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreGreaterThan(Integer value) {
            addCriterion("antutu_rom_score >", value, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_rom_score >=", value, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreLessThan(Integer value) {
            addCriterion("antutu_rom_score <", value, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_rom_score <=", value, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreIn(List<Integer> values) {
            addCriterion("antutu_rom_score in", values, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreNotIn(List<Integer> values) {
            addCriterion("antutu_rom_score not in", values, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_rom_score between", value1, value2, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuRomScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_rom_score not between", value1, value2, "antutuRomScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreIsNull() {
            addCriterion("antutu_data_process_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreIsNotNull() {
            addCriterion("antutu_data_process_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreEqualTo(Integer value) {
            addCriterion("antutu_data_process_score =", value, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreNotEqualTo(Integer value) {
            addCriterion("antutu_data_process_score <>", value, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreGreaterThan(Integer value) {
            addCriterion("antutu_data_process_score >", value, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_data_process_score >=", value, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreLessThan(Integer value) {
            addCriterion("antutu_data_process_score <", value, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_data_process_score <=", value, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreIn(List<Integer> values) {
            addCriterion("antutu_data_process_score in", values, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreNotIn(List<Integer> values) {
            addCriterion("antutu_data_process_score not in", values, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_data_process_score between", value1, value2, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataProcessScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_data_process_score not between", value1, value2, "antutuDataProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreIsNull() {
            addCriterion("antutu_img_process_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreIsNotNull() {
            addCriterion("antutu_img_process_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreEqualTo(Integer value) {
            addCriterion("antutu_img_process_score =", value, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreNotEqualTo(Integer value) {
            addCriterion("antutu_img_process_score <>", value, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreGreaterThan(Integer value) {
            addCriterion("antutu_img_process_score >", value, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_img_process_score >=", value, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreLessThan(Integer value) {
            addCriterion("antutu_img_process_score <", value, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_img_process_score <=", value, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreIn(List<Integer> values) {
            addCriterion("antutu_img_process_score in", values, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreNotIn(List<Integer> values) {
            addCriterion("antutu_img_process_score not in", values, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_img_process_score between", value1, value2, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuImgProcessScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_img_process_score not between", value1, value2, "antutuImgProcessScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreIsNull() {
            addCriterion("antutu_data_security_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreIsNotNull() {
            addCriterion("antutu_data_security_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreEqualTo(Integer value) {
            addCriterion("antutu_data_security_score =", value, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreNotEqualTo(Integer value) {
            addCriterion("antutu_data_security_score <>", value, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreGreaterThan(Integer value) {
            addCriterion("antutu_data_security_score >", value, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_data_security_score >=", value, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreLessThan(Integer value) {
            addCriterion("antutu_data_security_score <", value, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_data_security_score <=", value, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreIn(List<Integer> values) {
            addCriterion("antutu_data_security_score in", values, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreNotIn(List<Integer> values) {
            addCriterion("antutu_data_security_score not in", values, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_data_security_score between", value1, value2, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuDataSecurityScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_data_security_score not between", value1, value2, "antutuDataSecurityScore");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreIsNull() {
            addCriterion("antutu_h5_score is null");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreIsNotNull() {
            addCriterion("antutu_h5_score is not null");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreEqualTo(Integer value) {
            addCriterion("antutu_h5_score =", value, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreNotEqualTo(Integer value) {
            addCriterion("antutu_h5_score <>", value, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreGreaterThan(Integer value) {
            addCriterion("antutu_h5_score >", value, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("antutu_h5_score >=", value, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreLessThan(Integer value) {
            addCriterion("antutu_h5_score <", value, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("antutu_h5_score <=", value, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreIn(List<Integer> values) {
            addCriterion("antutu_h5_score in", values, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreNotIn(List<Integer> values) {
            addCriterion("antutu_h5_score not in", values, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreBetween(Integer value1, Integer value2) {
            addCriterion("antutu_h5_score between", value1, value2, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andAntutuH5ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("antutu_h5_score not between", value1, value2, "antutuH5Score");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedIsNull() {
            addCriterion("sdbench_ram_copy_speed is null");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedIsNotNull() {
            addCriterion("sdbench_ram_copy_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedEqualTo(Double value) {
            addCriterion("sdbench_ram_copy_speed =", value, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedNotEqualTo(Double value) {
            addCriterion("sdbench_ram_copy_speed <>", value, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedGreaterThan(Double value) {
            addCriterion("sdbench_ram_copy_speed >", value, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sdbench_ram_copy_speed >=", value, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedLessThan(Double value) {
            addCriterion("sdbench_ram_copy_speed <", value, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedLessThanOrEqualTo(Double value) {
            addCriterion("sdbench_ram_copy_speed <=", value, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedIn(List<Double> values) {
            addCriterion("sdbench_ram_copy_speed in", values, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedNotIn(List<Double> values) {
            addCriterion("sdbench_ram_copy_speed not in", values, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedBetween(Double value1, Double value2) {
            addCriterion("sdbench_ram_copy_speed between", value1, value2, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRamCopySpeedNotBetween(Double value1, Double value2) {
            addCriterion("sdbench_ram_copy_speed not between", value1, value2, "sdbenchRamCopySpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedIsNull() {
            addCriterion("sdbench_sdcard_read_speed is null");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedIsNotNull() {
            addCriterion("sdbench_sdcard_read_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedEqualTo(Double value) {
            addCriterion("sdbench_sdcard_read_speed =", value, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedNotEqualTo(Double value) {
            addCriterion("sdbench_sdcard_read_speed <>", value, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedGreaterThan(Double value) {
            addCriterion("sdbench_sdcard_read_speed >", value, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sdbench_sdcard_read_speed >=", value, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedLessThan(Double value) {
            addCriterion("sdbench_sdcard_read_speed <", value, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sdbench_sdcard_read_speed <=", value, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedIn(List<Double> values) {
            addCriterion("sdbench_sdcard_read_speed in", values, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedNotIn(List<Double> values) {
            addCriterion("sdbench_sdcard_read_speed not in", values, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedBetween(Double value1, Double value2) {
            addCriterion("sdbench_sdcard_read_speed between", value1, value2, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardReadSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sdbench_sdcard_read_speed not between", value1, value2, "sdbenchSdcardReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedIsNull() {
            addCriterion("sdbench_sdcard_write_speed is null");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedIsNotNull() {
            addCriterion("sdbench_sdcard_write_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedEqualTo(Double value) {
            addCriterion("sdbench_sdcard_write_speed =", value, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedNotEqualTo(Double value) {
            addCriterion("sdbench_sdcard_write_speed <>", value, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedGreaterThan(Double value) {
            addCriterion("sdbench_sdcard_write_speed >", value, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sdbench_sdcard_write_speed >=", value, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedLessThan(Double value) {
            addCriterion("sdbench_sdcard_write_speed <", value, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sdbench_sdcard_write_speed <=", value, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedIn(List<Double> values) {
            addCriterion("sdbench_sdcard_write_speed in", values, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedNotIn(List<Double> values) {
            addCriterion("sdbench_sdcard_write_speed not in", values, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedBetween(Double value1, Double value2) {
            addCriterion("sdbench_sdcard_write_speed between", value1, value2, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchSdcardWriteSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sdbench_sdcard_write_speed not between", value1, value2, "sdbenchSdcardWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedIsNull() {
            addCriterion("sdbench_rom_read_speed is null");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedIsNotNull() {
            addCriterion("sdbench_rom_read_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedEqualTo(Double value) {
            addCriterion("sdbench_rom_read_speed =", value, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedNotEqualTo(Double value) {
            addCriterion("sdbench_rom_read_speed <>", value, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedGreaterThan(Double value) {
            addCriterion("sdbench_rom_read_speed >", value, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sdbench_rom_read_speed >=", value, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedLessThan(Double value) {
            addCriterion("sdbench_rom_read_speed <", value, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sdbench_rom_read_speed <=", value, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedIn(List<Double> values) {
            addCriterion("sdbench_rom_read_speed in", values, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedNotIn(List<Double> values) {
            addCriterion("sdbench_rom_read_speed not in", values, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedBetween(Double value1, Double value2) {
            addCriterion("sdbench_rom_read_speed between", value1, value2, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomReadSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sdbench_rom_read_speed not between", value1, value2, "sdbenchRomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedIsNull() {
            addCriterion("sdbench_rom_write_speed is null");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedIsNotNull() {
            addCriterion("sdbench_rom_write_speed is not null");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedEqualTo(Double value) {
            addCriterion("sdbench_rom_write_speed =", value, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedNotEqualTo(Double value) {
            addCriterion("sdbench_rom_write_speed <>", value, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedGreaterThan(Double value) {
            addCriterion("sdbench_rom_write_speed >", value, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("sdbench_rom_write_speed >=", value, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedLessThan(Double value) {
            addCriterion("sdbench_rom_write_speed <", value, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedLessThanOrEqualTo(Double value) {
            addCriterion("sdbench_rom_write_speed <=", value, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedIn(List<Double> values) {
            addCriterion("sdbench_rom_write_speed in", values, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedNotIn(List<Double> values) {
            addCriterion("sdbench_rom_write_speed not in", values, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedBetween(Double value1, Double value2) {
            addCriterion("sdbench_rom_write_speed between", value1, value2, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andSdbenchRomWriteSpeedNotBetween(Double value1, Double value2) {
            addCriterion("sdbench_rom_write_speed not between", value1, value2, "sdbenchRomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedIsNull() {
            addCriterion("androbench_seq_read_speed is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedIsNotNull() {
            addCriterion("androbench_seq_read_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedEqualTo(Double value) {
            addCriterion("androbench_seq_read_speed =", value, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedNotEqualTo(Double value) {
            addCriterion("androbench_seq_read_speed <>", value, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedGreaterThan(Double value) {
            addCriterion("androbench_seq_read_speed >", value, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_seq_read_speed >=", value, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedLessThan(Double value) {
            addCriterion("androbench_seq_read_speed <", value, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedLessThanOrEqualTo(Double value) {
            addCriterion("androbench_seq_read_speed <=", value, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedIn(List<Double> values) {
            addCriterion("androbench_seq_read_speed in", values, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedNotIn(List<Double> values) {
            addCriterion("androbench_seq_read_speed not in", values, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedBetween(Double value1, Double value2) {
            addCriterion("androbench_seq_read_speed between", value1, value2, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqReadSpeedNotBetween(Double value1, Double value2) {
            addCriterion("androbench_seq_read_speed not between", value1, value2, "androbenchSeqReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedIsNull() {
            addCriterion("androbench_seq_write_speed is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedIsNotNull() {
            addCriterion("androbench_seq_write_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedEqualTo(Double value) {
            addCriterion("androbench_seq_write_speed =", value, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedNotEqualTo(Double value) {
            addCriterion("androbench_seq_write_speed <>", value, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedGreaterThan(Double value) {
            addCriterion("androbench_seq_write_speed >", value, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_seq_write_speed >=", value, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedLessThan(Double value) {
            addCriterion("androbench_seq_write_speed <", value, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedLessThanOrEqualTo(Double value) {
            addCriterion("androbench_seq_write_speed <=", value, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedIn(List<Double> values) {
            addCriterion("androbench_seq_write_speed in", values, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedNotIn(List<Double> values) {
            addCriterion("androbench_seq_write_speed not in", values, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedBetween(Double value1, Double value2) {
            addCriterion("androbench_seq_write_speed between", value1, value2, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSeqWriteSpeedNotBetween(Double value1, Double value2) {
            addCriterion("androbench_seq_write_speed not between", value1, value2, "androbenchSeqWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedIsNull() {
            addCriterion("androbench_random_read_speed is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedIsNotNull() {
            addCriterion("androbench_random_read_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedEqualTo(Double value) {
            addCriterion("androbench_random_read_speed =", value, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedNotEqualTo(Double value) {
            addCriterion("androbench_random_read_speed <>", value, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedGreaterThan(Double value) {
            addCriterion("androbench_random_read_speed >", value, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_random_read_speed >=", value, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedLessThan(Double value) {
            addCriterion("androbench_random_read_speed <", value, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedLessThanOrEqualTo(Double value) {
            addCriterion("androbench_random_read_speed <=", value, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedIn(List<Double> values) {
            addCriterion("androbench_random_read_speed in", values, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedNotIn(List<Double> values) {
            addCriterion("androbench_random_read_speed not in", values, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedBetween(Double value1, Double value2) {
            addCriterion("androbench_random_read_speed between", value1, value2, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomReadSpeedNotBetween(Double value1, Double value2) {
            addCriterion("androbench_random_read_speed not between", value1, value2, "androbenchRandomReadSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedIsNull() {
            addCriterion("androbench_random_write_speed is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedIsNotNull() {
            addCriterion("androbench_random_write_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedEqualTo(Double value) {
            addCriterion("androbench_random_write_speed =", value, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedNotEqualTo(Double value) {
            addCriterion("androbench_random_write_speed <>", value, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedGreaterThan(Double value) {
            addCriterion("androbench_random_write_speed >", value, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_random_write_speed >=", value, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedLessThan(Double value) {
            addCriterion("androbench_random_write_speed <", value, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedLessThanOrEqualTo(Double value) {
            addCriterion("androbench_random_write_speed <=", value, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedIn(List<Double> values) {
            addCriterion("androbench_random_write_speed in", values, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedNotIn(List<Double> values) {
            addCriterion("androbench_random_write_speed not in", values, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedBetween(Double value1, Double value2) {
            addCriterion("androbench_random_write_speed between", value1, value2, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchRandomWriteSpeedNotBetween(Double value1, Double value2) {
            addCriterion("androbench_random_write_speed not between", value1, value2, "androbenchRandomWriteSpeed");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertIsNull() {
            addCriterion("androbench_sql_insert is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertIsNotNull() {
            addCriterion("androbench_sql_insert is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertEqualTo(Double value) {
            addCriterion("androbench_sql_insert =", value, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertNotEqualTo(Double value) {
            addCriterion("androbench_sql_insert <>", value, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertGreaterThan(Double value) {
            addCriterion("androbench_sql_insert >", value, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_sql_insert >=", value, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertLessThan(Double value) {
            addCriterion("androbench_sql_insert <", value, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertLessThanOrEqualTo(Double value) {
            addCriterion("androbench_sql_insert <=", value, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertIn(List<Double> values) {
            addCriterion("androbench_sql_insert in", values, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertNotIn(List<Double> values) {
            addCriterion("androbench_sql_insert not in", values, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertBetween(Double value1, Double value2) {
            addCriterion("androbench_sql_insert between", value1, value2, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlInsertNotBetween(Double value1, Double value2) {
            addCriterion("androbench_sql_insert not between", value1, value2, "androbenchSqlInsert");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateIsNull() {
            addCriterion("androbench_sql_update is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateIsNotNull() {
            addCriterion("androbench_sql_update is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateEqualTo(Double value) {
            addCriterion("androbench_sql_update =", value, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateNotEqualTo(Double value) {
            addCriterion("androbench_sql_update <>", value, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateGreaterThan(Double value) {
            addCriterion("androbench_sql_update >", value, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_sql_update >=", value, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateLessThan(Double value) {
            addCriterion("androbench_sql_update <", value, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateLessThanOrEqualTo(Double value) {
            addCriterion("androbench_sql_update <=", value, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateIn(List<Double> values) {
            addCriterion("androbench_sql_update in", values, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateNotIn(List<Double> values) {
            addCriterion("androbench_sql_update not in", values, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateBetween(Double value1, Double value2) {
            addCriterion("androbench_sql_update between", value1, value2, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlUpdateNotBetween(Double value1, Double value2) {
            addCriterion("androbench_sql_update not between", value1, value2, "androbenchSqlUpdate");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteIsNull() {
            addCriterion("androbench_sql_delete is null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteIsNotNull() {
            addCriterion("androbench_sql_delete is not null");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteEqualTo(Double value) {
            addCriterion("androbench_sql_delete =", value, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteNotEqualTo(Double value) {
            addCriterion("androbench_sql_delete <>", value, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteGreaterThan(Double value) {
            addCriterion("androbench_sql_delete >", value, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteGreaterThanOrEqualTo(Double value) {
            addCriterion("androbench_sql_delete >=", value, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteLessThan(Double value) {
            addCriterion("androbench_sql_delete <", value, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteLessThanOrEqualTo(Double value) {
            addCriterion("androbench_sql_delete <=", value, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteIn(List<Double> values) {
            addCriterion("androbench_sql_delete in", values, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteNotIn(List<Double> values) {
            addCriterion("androbench_sql_delete not in", values, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteBetween(Double value1, Double value2) {
            addCriterion("androbench_sql_delete between", value1, value2, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andAndrobenchSqlDeleteNotBetween(Double value1, Double value2) {
            addCriterion("androbench_sql_delete not between", value1, value2, "androbenchSqlDelete");
            return (Criteria) this;
        }

        public Criteria andNetPingIsNull() {
            addCriterion("net_ping is null");
            return (Criteria) this;
        }

        public Criteria andNetPingIsNotNull() {
            addCriterion("net_ping is not null");
            return (Criteria) this;
        }

        public Criteria andNetPingEqualTo(Double value) {
            addCriterion("net_ping =", value, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingNotEqualTo(Double value) {
            addCriterion("net_ping <>", value, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingGreaterThan(Double value) {
            addCriterion("net_ping >", value, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingGreaterThanOrEqualTo(Double value) {
            addCriterion("net_ping >=", value, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingLessThan(Double value) {
            addCriterion("net_ping <", value, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingLessThanOrEqualTo(Double value) {
            addCriterion("net_ping <=", value, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingIn(List<Double> values) {
            addCriterion("net_ping in", values, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingNotIn(List<Double> values) {
            addCriterion("net_ping not in", values, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingBetween(Double value1, Double value2) {
            addCriterion("net_ping between", value1, value2, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetPingNotBetween(Double value1, Double value2) {
            addCriterion("net_ping not between", value1, value2, "netPing");
            return (Criteria) this;
        }

        public Criteria andNetSpeedIsNull() {
            addCriterion("net_speed is null");
            return (Criteria) this;
        }

        public Criteria andNetSpeedIsNotNull() {
            addCriterion("net_speed is not null");
            return (Criteria) this;
        }

        public Criteria andNetSpeedEqualTo(Double value) {
            addCriterion("net_speed =", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedNotEqualTo(Double value) {
            addCriterion("net_speed <>", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedGreaterThan(Double value) {
            addCriterion("net_speed >", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("net_speed >=", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedLessThan(Double value) {
            addCriterion("net_speed <", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedLessThanOrEqualTo(Double value) {
            addCriterion("net_speed <=", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedIn(List<Double> values) {
            addCriterion("net_speed in", values, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedNotIn(List<Double> values) {
            addCriterion("net_speed not in", values, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedBetween(Double value1, Double value2) {
            addCriterion("net_speed between", value1, value2, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedNotBetween(Double value1, Double value2) {
            addCriterion("net_speed not between", value1, value2, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andGpsNumberIsNull() {
            addCriterion("gps_number is null");
            return (Criteria) this;
        }

        public Criteria andGpsNumberIsNotNull() {
            addCriterion("gps_number is not null");
            return (Criteria) this;
        }

        public Criteria andGpsNumberEqualTo(Integer value) {
            addCriterion("gps_number =", value, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberNotEqualTo(Integer value) {
            addCriterion("gps_number <>", value, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberGreaterThan(Integer value) {
            addCriterion("gps_number >", value, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("gps_number >=", value, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberLessThan(Integer value) {
            addCriterion("gps_number <", value, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("gps_number <=", value, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberIn(List<Integer> values) {
            addCriterion("gps_number in", values, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberNotIn(List<Integer> values) {
            addCriterion("gps_number not in", values, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberBetween(Integer value1, Integer value2) {
            addCriterion("gps_number between", value1, value2, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("gps_number not between", value1, value2, "gpsNumber");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityIsNull() {
            addCriterion("gps_intensity is null");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityIsNotNull() {
            addCriterion("gps_intensity is not null");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityEqualTo(Integer value) {
            addCriterion("gps_intensity =", value, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityNotEqualTo(Integer value) {
            addCriterion("gps_intensity <>", value, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityGreaterThan(Integer value) {
            addCriterion("gps_intensity >", value, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityGreaterThanOrEqualTo(Integer value) {
            addCriterion("gps_intensity >=", value, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityLessThan(Integer value) {
            addCriterion("gps_intensity <", value, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityLessThanOrEqualTo(Integer value) {
            addCriterion("gps_intensity <=", value, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityIn(List<Integer> values) {
            addCriterion("gps_intensity in", values, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityNotIn(List<Integer> values) {
            addCriterion("gps_intensity not in", values, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityBetween(Integer value1, Integer value2) {
            addCriterion("gps_intensity between", value1, value2, "gpsIntensity");
            return (Criteria) this;
        }

        public Criteria andGpsIntensityNotBetween(Integer value1, Integer value2) {
            addCriterion("gps_intensity not between", value1, value2, "gpsIntensity");
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