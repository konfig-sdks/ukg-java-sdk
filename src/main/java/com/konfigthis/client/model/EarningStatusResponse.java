/*
 * User Profile Details
 * Configure your UKG Pro Configuration Codes through UKG Pro APIs. Status: R1 deployment
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * EarningStatusResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EarningStatusResponse {
  public static final String SERIALIZED_NAME_REF_ID = "refId";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private UUID refId;

  public static final String SERIALIZED_NAME_COMPANY_CODE = "companyCode";
  @SerializedName(SERIALIZED_NAME_COMPANY_CODE)
  private String companyCode;

  public static final String SERIALIZED_NAME_EMP_NO = "empNo";
  @SerializedName(SERIALIZED_NAME_EMP_NO)
  private String empNo;

  public static final String SERIALIZED_NAME_CHARGE_DATE = "chargeDate";
  @SerializedName(SERIALIZED_NAME_CHARGE_DATE)
  private OffsetDateTime chargeDate;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private String hours;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_PIECE_COUNT = "pieceCount";
  @SerializedName(SERIALIZED_NAME_PIECE_COUNT)
  private BigDecimal pieceCount;

  public static final String SERIALIZED_NAME_SHIFT_CODE = "shiftCode";
  @SerializedName(SERIALIZED_NAME_SHIFT_CODE)
  private String shiftCode;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private String job;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_ORG_LVL1 = "orgLvl1";
  @SerializedName(SERIALIZED_NAME_ORG_LVL1)
  private String orgLvl1;

  public static final String SERIALIZED_NAME_ORG_LVL2 = "orgLvl2";
  @SerializedName(SERIALIZED_NAME_ORG_LVL2)
  private String orgLvl2;

  public static final String SERIALIZED_NAME_ORG_LVL3 = "orgLvl3";
  @SerializedName(SERIALIZED_NAME_ORG_LVL3)
  private String orgLvl3;

  public static final String SERIALIZED_NAME_ORG_LVL4 = "orgLvl4";
  @SerializedName(SERIALIZED_NAME_ORG_LVL4)
  private String orgLvl4;

  public static final String SERIALIZED_NAME_PAY_RATE = "payRate";
  @SerializedName(SERIALIZED_NAME_PAY_RATE)
  private BigDecimal payRate;

  public static final String SERIALIZED_NAME_PIECE_RATE = "pieceRate";
  @SerializedName(SERIALIZED_NAME_PIECE_RATE)
  private BigDecimal pieceRate;

  public static final String SERIALIZED_NAME_ROE_PAY_DATE = "roePayDate";
  @SerializedName(SERIALIZED_NAME_ROE_PAY_DATE)
  private OffsetDateTime roePayDate;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_IS_IMPORTED_INTO_PAYROLL = "isImportedIntoPayroll";
  @SerializedName(SERIALIZED_NAME_IS_IMPORTED_INTO_PAYROLL)
  private Boolean isImportedIntoPayroll;

  public static final String SERIALIZED_NAME_ADJ_EARN_PERIOD_START_DATE = "AdjEarnPeriodStartDate";
  @SerializedName(SERIALIZED_NAME_ADJ_EARN_PERIOD_START_DATE)
  private OffsetDateTime adjEarnPeriodStartDate;

  public static final String SERIALIZED_NAME_ADJ_EARN_PERIOD_END_DATE = "AdjEarnPeriodEndDate";
  @SerializedName(SERIALIZED_NAME_ADJ_EARN_PERIOD_END_DATE)
  private OffsetDateTime adjEarnPeriodEndDate;

  public static final String SERIALIZED_NAME_CHECK_SEQUENCE = "CheckSequence";
  @SerializedName(SERIALIZED_NAME_CHECK_SEQUENCE)
  private Integer checkSequence;

  public static final String SERIALIZED_NAME_CREATE_PAY_TYPE = "CreatePayType";
  @SerializedName(SERIALIZED_NAME_CREATE_PAY_TYPE)
  private String createPayType;

  public static final String SERIALIZED_NAME_FORCE_PAY_CREATION = "ForcePayCreation";
  @SerializedName(SERIALIZED_NAME_FORCE_PAY_CREATION)
  private String forcePayCreation;

  public static final String SERIALIZED_NAME_GROSS_UP = "GrossUp";
  @SerializedName(SERIALIZED_NAME_GROSS_UP)
  private String grossUp;

  public static final String SERIALIZED_NAME_GROSS_UP_TARGET = "GrossUpTarget";
  @SerializedName(SERIALIZED_NAME_GROSS_UP_TARGET)
  private Integer grossUpTarget;

  public static final String SERIALIZED_NAME_GROSS_UP_TAX_CALC_METHOD = "GrossUpTaxCalcMethod";
  @SerializedName(SERIALIZED_NAME_GROSS_UP_TAX_CALC_METHOD)
  private Integer grossUpTaxCalcMethod;

  public EarningStatusResponse() {
  }

  public EarningStatusResponse refId(UUID refId) {
    
    
    
    
    this.refId = refId;
    return this;
  }

   /**
   * Get refId
   * @return refId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getRefId() {
    return refId;
  }


  public void setRefId(UUID refId) {
    
    
    
    this.refId = refId;
  }


  public EarningStatusResponse companyCode(String companyCode) {
    
    
    
    
    this.companyCode = companyCode;
    return this;
  }

   /**
   * Get companyCode
   * @return companyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyCode() {
    return companyCode;
  }


  public void setCompanyCode(String companyCode) {
    
    
    
    this.companyCode = companyCode;
  }


  public EarningStatusResponse empNo(String empNo) {
    
    
    
    
    this.empNo = empNo;
    return this;
  }

   /**
   * Get empNo
   * @return empNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmpNo() {
    return empNo;
  }


  public void setEmpNo(String empNo) {
    
    
    
    this.empNo = empNo;
  }


  public EarningStatusResponse chargeDate(OffsetDateTime chargeDate) {
    
    
    
    
    this.chargeDate = chargeDate;
    return this;
  }

   /**
   * Get chargeDate
   * @return chargeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getChargeDate() {
    return chargeDate;
  }


  public void setChargeDate(OffsetDateTime chargeDate) {
    
    
    
    this.chargeDate = chargeDate;
  }


  public EarningStatusResponse code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public EarningStatusResponse hours(String hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHours() {
    return hours;
  }


  public void setHours(String hours) {
    
    
    
    this.hours = hours;
  }


  public EarningStatusResponse amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public EarningStatusResponse pieceCount(BigDecimal pieceCount) {
    
    
    
    
    this.pieceCount = pieceCount;
    return this;
  }

   /**
   * Get pieceCount
   * @return pieceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPieceCount() {
    return pieceCount;
  }


  public void setPieceCount(BigDecimal pieceCount) {
    
    
    
    this.pieceCount = pieceCount;
  }


  public EarningStatusResponse shiftCode(String shiftCode) {
    
    
    
    
    this.shiftCode = shiftCode;
    return this;
  }

   /**
   * Get shiftCode
   * @return shiftCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShiftCode() {
    return shiftCode;
  }


  public void setShiftCode(String shiftCode) {
    
    
    
    this.shiftCode = shiftCode;
  }


  public EarningStatusResponse location(String location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    
    
    
    this.location = location;
  }


  public EarningStatusResponse job(String job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJob() {
    return job;
  }


  public void setJob(String job) {
    
    
    
    this.job = job;
  }


  public EarningStatusResponse project(String project) {
    
    
    
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    
    
    
    this.project = project;
  }


  public EarningStatusResponse orgLvl1(String orgLvl1) {
    
    
    
    
    this.orgLvl1 = orgLvl1;
    return this;
  }

   /**
   * Get orgLvl1
   * @return orgLvl1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgLvl1() {
    return orgLvl1;
  }


  public void setOrgLvl1(String orgLvl1) {
    
    
    
    this.orgLvl1 = orgLvl1;
  }


  public EarningStatusResponse orgLvl2(String orgLvl2) {
    
    
    
    
    this.orgLvl2 = orgLvl2;
    return this;
  }

   /**
   * Get orgLvl2
   * @return orgLvl2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgLvl2() {
    return orgLvl2;
  }


  public void setOrgLvl2(String orgLvl2) {
    
    
    
    this.orgLvl2 = orgLvl2;
  }


  public EarningStatusResponse orgLvl3(String orgLvl3) {
    
    
    
    
    this.orgLvl3 = orgLvl3;
    return this;
  }

   /**
   * Get orgLvl3
   * @return orgLvl3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgLvl3() {
    return orgLvl3;
  }


  public void setOrgLvl3(String orgLvl3) {
    
    
    
    this.orgLvl3 = orgLvl3;
  }


  public EarningStatusResponse orgLvl4(String orgLvl4) {
    
    
    
    
    this.orgLvl4 = orgLvl4;
    return this;
  }

   /**
   * Get orgLvl4
   * @return orgLvl4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgLvl4() {
    return orgLvl4;
  }


  public void setOrgLvl4(String orgLvl4) {
    
    
    
    this.orgLvl4 = orgLvl4;
  }


  public EarningStatusResponse payRate(BigDecimal payRate) {
    
    
    
    
    this.payRate = payRate;
    return this;
  }

   /**
   * Get payRate
   * @return payRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPayRate() {
    return payRate;
  }


  public void setPayRate(BigDecimal payRate) {
    
    
    
    this.payRate = payRate;
  }


  public EarningStatusResponse pieceRate(BigDecimal pieceRate) {
    
    
    
    
    this.pieceRate = pieceRate;
    return this;
  }

   /**
   * Get pieceRate
   * @return pieceRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPieceRate() {
    return pieceRate;
  }


  public void setPieceRate(BigDecimal pieceRate) {
    
    
    
    this.pieceRate = pieceRate;
  }


  public EarningStatusResponse roePayDate(OffsetDateTime roePayDate) {
    
    
    
    
    this.roePayDate = roePayDate;
    return this;
  }

   /**
   * Get roePayDate
   * @return roePayDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRoePayDate() {
    return roePayDate;
  }


  public void setRoePayDate(OffsetDateTime roePayDate) {
    
    
    
    this.roePayDate = roePayDate;
  }


  public EarningStatusResponse source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public EarningStatusResponse isImportedIntoPayroll(Boolean isImportedIntoPayroll) {
    
    
    
    
    this.isImportedIntoPayroll = isImportedIntoPayroll;
    return this;
  }

   /**
   * Get isImportedIntoPayroll
   * @return isImportedIntoPayroll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsImportedIntoPayroll() {
    return isImportedIntoPayroll;
  }


  public void setIsImportedIntoPayroll(Boolean isImportedIntoPayroll) {
    
    
    
    this.isImportedIntoPayroll = isImportedIntoPayroll;
  }


  public EarningStatusResponse adjEarnPeriodStartDate(OffsetDateTime adjEarnPeriodStartDate) {
    
    
    
    
    this.adjEarnPeriodStartDate = adjEarnPeriodStartDate;
    return this;
  }

   /**
   * Get adjEarnPeriodStartDate
   * @return adjEarnPeriodStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAdjEarnPeriodStartDate() {
    return adjEarnPeriodStartDate;
  }


  public void setAdjEarnPeriodStartDate(OffsetDateTime adjEarnPeriodStartDate) {
    
    
    
    this.adjEarnPeriodStartDate = adjEarnPeriodStartDate;
  }


  public EarningStatusResponse adjEarnPeriodEndDate(OffsetDateTime adjEarnPeriodEndDate) {
    
    
    
    
    this.adjEarnPeriodEndDate = adjEarnPeriodEndDate;
    return this;
  }

   /**
   * Get adjEarnPeriodEndDate
   * @return adjEarnPeriodEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAdjEarnPeriodEndDate() {
    return adjEarnPeriodEndDate;
  }


  public void setAdjEarnPeriodEndDate(OffsetDateTime adjEarnPeriodEndDate) {
    
    
    
    this.adjEarnPeriodEndDate = adjEarnPeriodEndDate;
  }


  public EarningStatusResponse checkSequence(Integer checkSequence) {
    
    
    
    
    this.checkSequence = checkSequence;
    return this;
  }

   /**
   * Get checkSequence
   * @return checkSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCheckSequence() {
    return checkSequence;
  }


  public void setCheckSequence(Integer checkSequence) {
    
    
    
    this.checkSequence = checkSequence;
  }


  public EarningStatusResponse createPayType(String createPayType) {
    
    
    
    
    this.createPayType = createPayType;
    return this;
  }

   /**
   * Get createPayType
   * @return createPayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatePayType() {
    return createPayType;
  }


  public void setCreatePayType(String createPayType) {
    
    
    
    this.createPayType = createPayType;
  }


  public EarningStatusResponse forcePayCreation(String forcePayCreation) {
    
    
    
    
    this.forcePayCreation = forcePayCreation;
    return this;
  }

   /**
   * Get forcePayCreation
   * @return forcePayCreation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getForcePayCreation() {
    return forcePayCreation;
  }


  public void setForcePayCreation(String forcePayCreation) {
    
    
    
    this.forcePayCreation = forcePayCreation;
  }


  public EarningStatusResponse grossUp(String grossUp) {
    
    
    
    
    this.grossUp = grossUp;
    return this;
  }

   /**
   * Get grossUp
   * @return grossUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrossUp() {
    return grossUp;
  }


  public void setGrossUp(String grossUp) {
    
    
    
    this.grossUp = grossUp;
  }


  public EarningStatusResponse grossUpTarget(Integer grossUpTarget) {
    
    
    
    
    this.grossUpTarget = grossUpTarget;
    return this;
  }

   /**
   * Get grossUpTarget
   * @return grossUpTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGrossUpTarget() {
    return grossUpTarget;
  }


  public void setGrossUpTarget(Integer grossUpTarget) {
    
    
    
    this.grossUpTarget = grossUpTarget;
  }


  public EarningStatusResponse grossUpTaxCalcMethod(Integer grossUpTaxCalcMethod) {
    
    
    
    
    this.grossUpTaxCalcMethod = grossUpTaxCalcMethod;
    return this;
  }

   /**
   * Get grossUpTaxCalcMethod
   * @return grossUpTaxCalcMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGrossUpTaxCalcMethod() {
    return grossUpTaxCalcMethod;
  }


  public void setGrossUpTaxCalcMethod(Integer grossUpTaxCalcMethod) {
    
    
    
    this.grossUpTaxCalcMethod = grossUpTaxCalcMethod;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EarningStatusResponse instance itself
   */
  public EarningStatusResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningStatusResponse earningStatusResponse = (EarningStatusResponse) o;
    return Objects.equals(this.refId, earningStatusResponse.refId) &&
        Objects.equals(this.companyCode, earningStatusResponse.companyCode) &&
        Objects.equals(this.empNo, earningStatusResponse.empNo) &&
        Objects.equals(this.chargeDate, earningStatusResponse.chargeDate) &&
        Objects.equals(this.code, earningStatusResponse.code) &&
        Objects.equals(this.hours, earningStatusResponse.hours) &&
        Objects.equals(this.amount, earningStatusResponse.amount) &&
        Objects.equals(this.pieceCount, earningStatusResponse.pieceCount) &&
        Objects.equals(this.shiftCode, earningStatusResponse.shiftCode) &&
        Objects.equals(this.location, earningStatusResponse.location) &&
        Objects.equals(this.job, earningStatusResponse.job) &&
        Objects.equals(this.project, earningStatusResponse.project) &&
        Objects.equals(this.orgLvl1, earningStatusResponse.orgLvl1) &&
        Objects.equals(this.orgLvl2, earningStatusResponse.orgLvl2) &&
        Objects.equals(this.orgLvl3, earningStatusResponse.orgLvl3) &&
        Objects.equals(this.orgLvl4, earningStatusResponse.orgLvl4) &&
        Objects.equals(this.payRate, earningStatusResponse.payRate) &&
        Objects.equals(this.pieceRate, earningStatusResponse.pieceRate) &&
        Objects.equals(this.roePayDate, earningStatusResponse.roePayDate) &&
        Objects.equals(this.source, earningStatusResponse.source) &&
        Objects.equals(this.isImportedIntoPayroll, earningStatusResponse.isImportedIntoPayroll) &&
        Objects.equals(this.adjEarnPeriodStartDate, earningStatusResponse.adjEarnPeriodStartDate) &&
        Objects.equals(this.adjEarnPeriodEndDate, earningStatusResponse.adjEarnPeriodEndDate) &&
        Objects.equals(this.checkSequence, earningStatusResponse.checkSequence) &&
        Objects.equals(this.createPayType, earningStatusResponse.createPayType) &&
        Objects.equals(this.forcePayCreation, earningStatusResponse.forcePayCreation) &&
        Objects.equals(this.grossUp, earningStatusResponse.grossUp) &&
        Objects.equals(this.grossUpTarget, earningStatusResponse.grossUpTarget) &&
        Objects.equals(this.grossUpTaxCalcMethod, earningStatusResponse.grossUpTaxCalcMethod)&&
        Objects.equals(this.additionalProperties, earningStatusResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, companyCode, empNo, chargeDate, code, hours, amount, pieceCount, shiftCode, location, job, project, orgLvl1, orgLvl2, orgLvl3, orgLvl4, payRate, pieceRate, roePayDate, source, isImportedIntoPayroll, adjEarnPeriodStartDate, adjEarnPeriodEndDate, checkSequence, createPayType, forcePayCreation, grossUp, grossUpTarget, grossUpTaxCalcMethod, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningStatusResponse {\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    empNo: ").append(toIndentedString(empNo)).append("\n");
    sb.append("    chargeDate: ").append(toIndentedString(chargeDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    pieceCount: ").append(toIndentedString(pieceCount)).append("\n");
    sb.append("    shiftCode: ").append(toIndentedString(shiftCode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    orgLvl1: ").append(toIndentedString(orgLvl1)).append("\n");
    sb.append("    orgLvl2: ").append(toIndentedString(orgLvl2)).append("\n");
    sb.append("    orgLvl3: ").append(toIndentedString(orgLvl3)).append("\n");
    sb.append("    orgLvl4: ").append(toIndentedString(orgLvl4)).append("\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
    sb.append("    pieceRate: ").append(toIndentedString(pieceRate)).append("\n");
    sb.append("    roePayDate: ").append(toIndentedString(roePayDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    isImportedIntoPayroll: ").append(toIndentedString(isImportedIntoPayroll)).append("\n");
    sb.append("    adjEarnPeriodStartDate: ").append(toIndentedString(adjEarnPeriodStartDate)).append("\n");
    sb.append("    adjEarnPeriodEndDate: ").append(toIndentedString(adjEarnPeriodEndDate)).append("\n");
    sb.append("    checkSequence: ").append(toIndentedString(checkSequence)).append("\n");
    sb.append("    createPayType: ").append(toIndentedString(createPayType)).append("\n");
    sb.append("    forcePayCreation: ").append(toIndentedString(forcePayCreation)).append("\n");
    sb.append("    grossUp: ").append(toIndentedString(grossUp)).append("\n");
    sb.append("    grossUpTarget: ").append(toIndentedString(grossUpTarget)).append("\n");
    sb.append("    grossUpTaxCalcMethod: ").append(toIndentedString(grossUpTaxCalcMethod)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("refId");
    openapiFields.add("companyCode");
    openapiFields.add("empNo");
    openapiFields.add("chargeDate");
    openapiFields.add("code");
    openapiFields.add("hours");
    openapiFields.add("amount");
    openapiFields.add("pieceCount");
    openapiFields.add("shiftCode");
    openapiFields.add("location");
    openapiFields.add("job");
    openapiFields.add("project");
    openapiFields.add("orgLvl1");
    openapiFields.add("orgLvl2");
    openapiFields.add("orgLvl3");
    openapiFields.add("orgLvl4");
    openapiFields.add("payRate");
    openapiFields.add("pieceRate");
    openapiFields.add("roePayDate");
    openapiFields.add("source");
    openapiFields.add("isImportedIntoPayroll");
    openapiFields.add("AdjEarnPeriodStartDate");
    openapiFields.add("AdjEarnPeriodEndDate");
    openapiFields.add("CheckSequence");
    openapiFields.add("CreatePayType");
    openapiFields.add("ForcePayCreation");
    openapiFields.add("GrossUp");
    openapiFields.add("GrossUpTarget");
    openapiFields.add("GrossUpTaxCalcMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EarningStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EarningStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EarningStatusResponse is not found in the empty JSON string", EarningStatusResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("refId") != null && !jsonObj.get("refId").isJsonNull()) && !jsonObj.get("refId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refId").toString()));
      }
      if ((jsonObj.get("companyCode") != null && !jsonObj.get("companyCode").isJsonNull()) && !jsonObj.get("companyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyCode").toString()));
      }
      if ((jsonObj.get("empNo") != null && !jsonObj.get("empNo").isJsonNull()) && !jsonObj.get("empNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `empNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("empNo").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) && !jsonObj.get("hours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("shiftCode") != null && !jsonObj.get("shiftCode").isJsonNull()) && !jsonObj.get("shiftCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shiftCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shiftCode").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) && !jsonObj.get("job").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job").toString()));
      }
      if ((jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) && !jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      if ((jsonObj.get("orgLvl1") != null && !jsonObj.get("orgLvl1").isJsonNull()) && !jsonObj.get("orgLvl1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgLvl1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgLvl1").toString()));
      }
      if ((jsonObj.get("orgLvl2") != null && !jsonObj.get("orgLvl2").isJsonNull()) && !jsonObj.get("orgLvl2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgLvl2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgLvl2").toString()));
      }
      if ((jsonObj.get("orgLvl3") != null && !jsonObj.get("orgLvl3").isJsonNull()) && !jsonObj.get("orgLvl3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgLvl3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgLvl3").toString()));
      }
      if ((jsonObj.get("orgLvl4") != null && !jsonObj.get("orgLvl4").isJsonNull()) && !jsonObj.get("orgLvl4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgLvl4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgLvl4").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("CreatePayType") != null && !jsonObj.get("CreatePayType").isJsonNull()) && !jsonObj.get("CreatePayType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreatePayType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreatePayType").toString()));
      }
      if ((jsonObj.get("ForcePayCreation") != null && !jsonObj.get("ForcePayCreation").isJsonNull()) && !jsonObj.get("ForcePayCreation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ForcePayCreation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ForcePayCreation").toString()));
      }
      if ((jsonObj.get("GrossUp") != null && !jsonObj.get("GrossUp").isJsonNull()) && !jsonObj.get("GrossUp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GrossUp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GrossUp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EarningStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EarningStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EarningStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EarningStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EarningStatusResponse>() {
           @Override
           public void write(JsonWriter out, EarningStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EarningStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EarningStatusResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EarningStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningStatusResponse
  * @throws IOException if the JSON string is invalid with respect to EarningStatusResponse
  */
  public static EarningStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningStatusResponse.class);
  }

 /**
  * Convert an instance of EarningStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

