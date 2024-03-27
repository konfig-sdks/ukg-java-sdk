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
import java.time.OffsetDateTime;

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
 * DependentDeductions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DependentDeductions {
  public static final String SERIALIZED_NAME_BENEFIT_AMOUNT = "benefitAmount";
  @SerializedName(SERIALIZED_NAME_BENEFIT_AMOUNT)
  private Double benefitAmount;

  public static final String SERIALIZED_NAME_BENEFIT_START_DATE = "benefitStartDate";
  @SerializedName(SERIALIZED_NAME_BENEFIT_START_DATE)
  private OffsetDateTime benefitStartDate;

  public static final String SERIALIZED_NAME_BENEFIT_STATUS = "benefitStatus";
  @SerializedName(SERIALIZED_NAME_BENEFIT_STATUS)
  private String benefitStatus;

  public static final String SERIALIZED_NAME_BENEFIT_STATUS_DATE = "benefitStatusDate";
  @SerializedName(SERIALIZED_NAME_BENEFIT_STATUS_DATE)
  private OffsetDateTime benefitStatusDate;

  public static final String SERIALIZED_NAME_BENEFIT_STOP_DATE = "benefitStopDate";
  @SerializedName(SERIALIZED_NAME_BENEFIT_STOP_DATE)
  private OffsetDateTime benefitStopDate;

  public static final String SERIALIZED_NAME_CERTIFICATE_NO = "certificateNo";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NO)
  private String certificateNo;

  public static final String SERIALIZED_NAME_COMPANY_I_D = "companyID";
  @SerializedName(SERIALIZED_NAME_COMPANY_I_D)
  private String companyID;

  public static final String SERIALIZED_NAME_CONTACT_I_D = "contactID";
  @SerializedName(SERIALIZED_NAME_CONTACT_I_D)
  private String contactID;

  public static final String SERIALIZED_NAME_CURRENT_C_O_I_D = "currentCOID";
  @SerializedName(SERIALIZED_NAME_CURRENT_C_O_I_D)
  private String currentCOID;

  public static final String SERIALIZED_NAME_DATE_TIME_CHANGED = "dateTimeChanged";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_CHANGED)
  private OffsetDateTime dateTimeChanged;

  public static final String SERIALIZED_NAME_DATE_TIME_CREATED = "dateTimeCreated";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_CREATED)
  private OffsetDateTime dateTimeCreated;

  public static final String SERIALIZED_NAME_DECLINED_BY_CARRIER_DATE = "declinedByCarrierDate";
  @SerializedName(SERIALIZED_NAME_DECLINED_BY_CARRIER_DATE)
  private OffsetDateTime declinedByCarrierDate;

  public static final String SERIALIZED_NAME_DEDUCTION_CODE = "deductionCode";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_CODE)
  private String deductionCode;

  public static final String SERIALIZED_NAME_DEDUCTION_NOTES = "deductionNotes";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_NOTES)
  private String deductionNotes;

  public static final String SERIALIZED_NAME_DEDUCTION_TYPE = "deductionType";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_TYPE)
  private String deductionType;

  public static final String SERIALIZED_NAME_DECLINED_BY_CARRIER = "declinedByCarrier";
  @SerializedName(SERIALIZED_NAME_DECLINED_BY_CARRIER)
  private String declinedByCarrier;

  public static final String SERIALIZED_NAME_DECLINED_BY_CARRIER_REASON = "declinedByCarrierReason";
  @SerializedName(SERIALIZED_NAME_DECLINED_BY_CARRIER_REASON)
  private String declinedByCarrierReason;

  public static final String SERIALIZED_NAME_DEP_B_PLAN_T_V_I_D = "depBPlanTVID";
  @SerializedName(SERIALIZED_NAME_DEP_B_PLAN_T_V_I_D)
  private Integer depBPlanTVID;

  public static final String SERIALIZED_NAME_SYSTEM_I_D = "systemID";
  @SerializedName(SERIALIZED_NAME_SYSTEM_I_D)
  private String systemID;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EOI_DATE = "eoiDate";
  @SerializedName(SERIALIZED_NAME_EOI_DATE)
  private OffsetDateTime eoiDate;

  public static final String SERIALIZED_NAME_NEED_E_O_I = "needEOI";
  @SerializedName(SERIALIZED_NAME_NEED_E_O_I)
  private Boolean needEOI;

  public static final String SERIALIZED_NAME_PRIMARY_CARE_PHYSICIAN = "primaryCarePhysician";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CARE_PHYSICIAN)
  private String primaryCarePhysician;

  public static final String SERIALIZED_NAME_PRIMARY_CARE_PHYSICIAN_ID = "primaryCarePhysicianId";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CARE_PHYSICIAN_ID)
  private String primaryCarePhysicianId;

  public static final String SERIALIZED_NAME_IS_BENEFIT_WAIVED = "isBenefitWaived";
  @SerializedName(SERIALIZED_NAME_IS_BENEFIT_WAIVED)
  private Boolean isBenefitWaived;

  public DependentDeductions() {
  }

  public DependentDeductions benefitAmount(Double benefitAmount) {
    
    
    
    
    this.benefitAmount = benefitAmount;
    return this;
  }

  public DependentDeductions benefitAmount(Integer benefitAmount) {
    
    
    
    
    this.benefitAmount = benefitAmount.doubleValue();
    return this;
  }

   /**
   * Get benefitAmount
   * @return benefitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBenefitAmount() {
    return benefitAmount;
  }


  public void setBenefitAmount(Double benefitAmount) {
    
    
    
    this.benefitAmount = benefitAmount;
  }


  public DependentDeductions benefitStartDate(OffsetDateTime benefitStartDate) {
    
    
    
    
    this.benefitStartDate = benefitStartDate;
    return this;
  }

   /**
   * Get benefitStartDate
   * @return benefitStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBenefitStartDate() {
    return benefitStartDate;
  }


  public void setBenefitStartDate(OffsetDateTime benefitStartDate) {
    
    
    
    this.benefitStartDate = benefitStartDate;
  }


  public DependentDeductions benefitStatus(String benefitStatus) {
    
    
    
    
    this.benefitStatus = benefitStatus;
    return this;
  }

   /**
   * Get benefitStatus
   * @return benefitStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBenefitStatus() {
    return benefitStatus;
  }


  public void setBenefitStatus(String benefitStatus) {
    
    
    
    this.benefitStatus = benefitStatus;
  }


  public DependentDeductions benefitStatusDate(OffsetDateTime benefitStatusDate) {
    
    
    
    
    this.benefitStatusDate = benefitStatusDate;
    return this;
  }

   /**
   * Get benefitStatusDate
   * @return benefitStatusDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBenefitStatusDate() {
    return benefitStatusDate;
  }


  public void setBenefitStatusDate(OffsetDateTime benefitStatusDate) {
    
    
    
    this.benefitStatusDate = benefitStatusDate;
  }


  public DependentDeductions benefitStopDate(OffsetDateTime benefitStopDate) {
    
    
    
    
    this.benefitStopDate = benefitStopDate;
    return this;
  }

   /**
   * Get benefitStopDate
   * @return benefitStopDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBenefitStopDate() {
    return benefitStopDate;
  }


  public void setBenefitStopDate(OffsetDateTime benefitStopDate) {
    
    
    
    this.benefitStopDate = benefitStopDate;
  }


  public DependentDeductions certificateNo(String certificateNo) {
    
    
    
    
    this.certificateNo = certificateNo;
    return this;
  }

   /**
   * Get certificateNo
   * @return certificateNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateNo() {
    return certificateNo;
  }


  public void setCertificateNo(String certificateNo) {
    
    
    
    this.certificateNo = certificateNo;
  }


  public DependentDeductions companyID(String companyID) {
    
    
    
    
    this.companyID = companyID;
    return this;
  }

   /**
   * Get companyID
   * @return companyID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyID() {
    return companyID;
  }


  public void setCompanyID(String companyID) {
    
    
    
    this.companyID = companyID;
  }


  public DependentDeductions contactID(String contactID) {
    
    
    
    
    this.contactID = contactID;
    return this;
  }

   /**
   * Get contactID
   * @return contactID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactID() {
    return contactID;
  }


  public void setContactID(String contactID) {
    
    
    
    this.contactID = contactID;
  }


  public DependentDeductions currentCOID(String currentCOID) {
    
    
    
    
    this.currentCOID = currentCOID;
    return this;
  }

   /**
   * Get currentCOID
   * @return currentCOID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentCOID() {
    return currentCOID;
  }


  public void setCurrentCOID(String currentCOID) {
    
    
    
    this.currentCOID = currentCOID;
  }


  public DependentDeductions dateTimeChanged(OffsetDateTime dateTimeChanged) {
    
    
    
    
    this.dateTimeChanged = dateTimeChanged;
    return this;
  }

   /**
   * Get dateTimeChanged
   * @return dateTimeChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateTimeChanged() {
    return dateTimeChanged;
  }


  public void setDateTimeChanged(OffsetDateTime dateTimeChanged) {
    
    
    
    this.dateTimeChanged = dateTimeChanged;
  }


  public DependentDeductions dateTimeCreated(OffsetDateTime dateTimeCreated) {
    
    
    
    
    this.dateTimeCreated = dateTimeCreated;
    return this;
  }

   /**
   * Get dateTimeCreated
   * @return dateTimeCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateTimeCreated() {
    return dateTimeCreated;
  }


  public void setDateTimeCreated(OffsetDateTime dateTimeCreated) {
    
    
    
    this.dateTimeCreated = dateTimeCreated;
  }


  public DependentDeductions declinedByCarrierDate(OffsetDateTime declinedByCarrierDate) {
    
    
    
    
    this.declinedByCarrierDate = declinedByCarrierDate;
    return this;
  }

   /**
   * Get declinedByCarrierDate
   * @return declinedByCarrierDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeclinedByCarrierDate() {
    return declinedByCarrierDate;
  }


  public void setDeclinedByCarrierDate(OffsetDateTime declinedByCarrierDate) {
    
    
    
    this.declinedByCarrierDate = declinedByCarrierDate;
  }


  public DependentDeductions deductionCode(String deductionCode) {
    
    
    
    
    this.deductionCode = deductionCode;
    return this;
  }

   /**
   * Get deductionCode
   * @return deductionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeductionCode() {
    return deductionCode;
  }


  public void setDeductionCode(String deductionCode) {
    
    
    
    this.deductionCode = deductionCode;
  }


  public DependentDeductions deductionNotes(String deductionNotes) {
    
    
    
    
    this.deductionNotes = deductionNotes;
    return this;
  }

   /**
   * Get deductionNotes
   * @return deductionNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeductionNotes() {
    return deductionNotes;
  }


  public void setDeductionNotes(String deductionNotes) {
    
    
    
    this.deductionNotes = deductionNotes;
  }


  public DependentDeductions deductionType(String deductionType) {
    
    
    
    
    this.deductionType = deductionType;
    return this;
  }

   /**
   * Get deductionType
   * @return deductionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeductionType() {
    return deductionType;
  }


  public void setDeductionType(String deductionType) {
    
    
    
    this.deductionType = deductionType;
  }


  public DependentDeductions declinedByCarrier(String declinedByCarrier) {
    
    
    
    
    this.declinedByCarrier = declinedByCarrier;
    return this;
  }

   /**
   * Get declinedByCarrier
   * @return declinedByCarrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeclinedByCarrier() {
    return declinedByCarrier;
  }


  public void setDeclinedByCarrier(String declinedByCarrier) {
    
    
    
    this.declinedByCarrier = declinedByCarrier;
  }


  public DependentDeductions declinedByCarrierReason(String declinedByCarrierReason) {
    
    
    
    
    this.declinedByCarrierReason = declinedByCarrierReason;
    return this;
  }

   /**
   * Get declinedByCarrierReason
   * @return declinedByCarrierReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeclinedByCarrierReason() {
    return declinedByCarrierReason;
  }


  public void setDeclinedByCarrierReason(String declinedByCarrierReason) {
    
    
    
    this.declinedByCarrierReason = declinedByCarrierReason;
  }


  public DependentDeductions depBPlanTVID(Integer depBPlanTVID) {
    
    
    
    
    this.depBPlanTVID = depBPlanTVID;
    return this;
  }

   /**
   * Get depBPlanTVID
   * @return depBPlanTVID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDepBPlanTVID() {
    return depBPlanTVID;
  }


  public void setDepBPlanTVID(Integer depBPlanTVID) {
    
    
    
    this.depBPlanTVID = depBPlanTVID;
  }


  public DependentDeductions systemID(String systemID) {
    
    
    
    
    this.systemID = systemID;
    return this;
  }

   /**
   * Get systemID
   * @return systemID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSystemID() {
    return systemID;
  }


  public void setSystemID(String systemID) {
    
    
    
    this.systemID = systemID;
  }


  public DependentDeductions employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public DependentDeductions eoiDate(OffsetDateTime eoiDate) {
    
    
    
    
    this.eoiDate = eoiDate;
    return this;
  }

   /**
   * Get eoiDate
   * @return eoiDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEoiDate() {
    return eoiDate;
  }


  public void setEoiDate(OffsetDateTime eoiDate) {
    
    
    
    this.eoiDate = eoiDate;
  }


  public DependentDeductions needEOI(Boolean needEOI) {
    
    
    
    
    this.needEOI = needEOI;
    return this;
  }

   /**
   * Get needEOI
   * @return needEOI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNeedEOI() {
    return needEOI;
  }


  public void setNeedEOI(Boolean needEOI) {
    
    
    
    this.needEOI = needEOI;
  }


  public DependentDeductions primaryCarePhysician(String primaryCarePhysician) {
    
    
    
    
    this.primaryCarePhysician = primaryCarePhysician;
    return this;
  }

   /**
   * Get primaryCarePhysician
   * @return primaryCarePhysician
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryCarePhysician() {
    return primaryCarePhysician;
  }


  public void setPrimaryCarePhysician(String primaryCarePhysician) {
    
    
    
    this.primaryCarePhysician = primaryCarePhysician;
  }


  public DependentDeductions primaryCarePhysicianId(String primaryCarePhysicianId) {
    
    
    
    
    this.primaryCarePhysicianId = primaryCarePhysicianId;
    return this;
  }

   /**
   * Get primaryCarePhysicianId
   * @return primaryCarePhysicianId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryCarePhysicianId() {
    return primaryCarePhysicianId;
  }


  public void setPrimaryCarePhysicianId(String primaryCarePhysicianId) {
    
    
    
    this.primaryCarePhysicianId = primaryCarePhysicianId;
  }


  public DependentDeductions isBenefitWaived(Boolean isBenefitWaived) {
    
    
    
    
    this.isBenefitWaived = isBenefitWaived;
    return this;
  }

   /**
   * Get isBenefitWaived
   * @return isBenefitWaived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBenefitWaived() {
    return isBenefitWaived;
  }


  public void setIsBenefitWaived(Boolean isBenefitWaived) {
    
    
    
    this.isBenefitWaived = isBenefitWaived;
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
   * @return the DependentDeductions instance itself
   */
  public DependentDeductions putAdditionalProperty(String key, Object value) {
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
    DependentDeductions dependentDeductions = (DependentDeductions) o;
    return Objects.equals(this.benefitAmount, dependentDeductions.benefitAmount) &&
        Objects.equals(this.benefitStartDate, dependentDeductions.benefitStartDate) &&
        Objects.equals(this.benefitStatus, dependentDeductions.benefitStatus) &&
        Objects.equals(this.benefitStatusDate, dependentDeductions.benefitStatusDate) &&
        Objects.equals(this.benefitStopDate, dependentDeductions.benefitStopDate) &&
        Objects.equals(this.certificateNo, dependentDeductions.certificateNo) &&
        Objects.equals(this.companyID, dependentDeductions.companyID) &&
        Objects.equals(this.contactID, dependentDeductions.contactID) &&
        Objects.equals(this.currentCOID, dependentDeductions.currentCOID) &&
        Objects.equals(this.dateTimeChanged, dependentDeductions.dateTimeChanged) &&
        Objects.equals(this.dateTimeCreated, dependentDeductions.dateTimeCreated) &&
        Objects.equals(this.declinedByCarrierDate, dependentDeductions.declinedByCarrierDate) &&
        Objects.equals(this.deductionCode, dependentDeductions.deductionCode) &&
        Objects.equals(this.deductionNotes, dependentDeductions.deductionNotes) &&
        Objects.equals(this.deductionType, dependentDeductions.deductionType) &&
        Objects.equals(this.declinedByCarrier, dependentDeductions.declinedByCarrier) &&
        Objects.equals(this.declinedByCarrierReason, dependentDeductions.declinedByCarrierReason) &&
        Objects.equals(this.depBPlanTVID, dependentDeductions.depBPlanTVID) &&
        Objects.equals(this.systemID, dependentDeductions.systemID) &&
        Objects.equals(this.employeeId, dependentDeductions.employeeId) &&
        Objects.equals(this.eoiDate, dependentDeductions.eoiDate) &&
        Objects.equals(this.needEOI, dependentDeductions.needEOI) &&
        Objects.equals(this.primaryCarePhysician, dependentDeductions.primaryCarePhysician) &&
        Objects.equals(this.primaryCarePhysicianId, dependentDeductions.primaryCarePhysicianId) &&
        Objects.equals(this.isBenefitWaived, dependentDeductions.isBenefitWaived)&&
        Objects.equals(this.additionalProperties, dependentDeductions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitAmount, benefitStartDate, benefitStatus, benefitStatusDate, benefitStopDate, certificateNo, companyID, contactID, currentCOID, dateTimeChanged, dateTimeCreated, declinedByCarrierDate, deductionCode, deductionNotes, deductionType, declinedByCarrier, declinedByCarrierReason, depBPlanTVID, systemID, employeeId, eoiDate, needEOI, primaryCarePhysician, primaryCarePhysicianId, isBenefitWaived, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependentDeductions {\n");
    sb.append("    benefitAmount: ").append(toIndentedString(benefitAmount)).append("\n");
    sb.append("    benefitStartDate: ").append(toIndentedString(benefitStartDate)).append("\n");
    sb.append("    benefitStatus: ").append(toIndentedString(benefitStatus)).append("\n");
    sb.append("    benefitStatusDate: ").append(toIndentedString(benefitStatusDate)).append("\n");
    sb.append("    benefitStopDate: ").append(toIndentedString(benefitStopDate)).append("\n");
    sb.append("    certificateNo: ").append(toIndentedString(certificateNo)).append("\n");
    sb.append("    companyID: ").append(toIndentedString(companyID)).append("\n");
    sb.append("    contactID: ").append(toIndentedString(contactID)).append("\n");
    sb.append("    currentCOID: ").append(toIndentedString(currentCOID)).append("\n");
    sb.append("    dateTimeChanged: ").append(toIndentedString(dateTimeChanged)).append("\n");
    sb.append("    dateTimeCreated: ").append(toIndentedString(dateTimeCreated)).append("\n");
    sb.append("    declinedByCarrierDate: ").append(toIndentedString(declinedByCarrierDate)).append("\n");
    sb.append("    deductionCode: ").append(toIndentedString(deductionCode)).append("\n");
    sb.append("    deductionNotes: ").append(toIndentedString(deductionNotes)).append("\n");
    sb.append("    deductionType: ").append(toIndentedString(deductionType)).append("\n");
    sb.append("    declinedByCarrier: ").append(toIndentedString(declinedByCarrier)).append("\n");
    sb.append("    declinedByCarrierReason: ").append(toIndentedString(declinedByCarrierReason)).append("\n");
    sb.append("    depBPlanTVID: ").append(toIndentedString(depBPlanTVID)).append("\n");
    sb.append("    systemID: ").append(toIndentedString(systemID)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    eoiDate: ").append(toIndentedString(eoiDate)).append("\n");
    sb.append("    needEOI: ").append(toIndentedString(needEOI)).append("\n");
    sb.append("    primaryCarePhysician: ").append(toIndentedString(primaryCarePhysician)).append("\n");
    sb.append("    primaryCarePhysicianId: ").append(toIndentedString(primaryCarePhysicianId)).append("\n");
    sb.append("    isBenefitWaived: ").append(toIndentedString(isBenefitWaived)).append("\n");
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
    openapiFields.add("benefitAmount");
    openapiFields.add("benefitStartDate");
    openapiFields.add("benefitStatus");
    openapiFields.add("benefitStatusDate");
    openapiFields.add("benefitStopDate");
    openapiFields.add("certificateNo");
    openapiFields.add("companyID");
    openapiFields.add("contactID");
    openapiFields.add("currentCOID");
    openapiFields.add("dateTimeChanged");
    openapiFields.add("dateTimeCreated");
    openapiFields.add("declinedByCarrierDate");
    openapiFields.add("deductionCode");
    openapiFields.add("deductionNotes");
    openapiFields.add("deductionType");
    openapiFields.add("declinedByCarrier");
    openapiFields.add("declinedByCarrierReason");
    openapiFields.add("depBPlanTVID");
    openapiFields.add("systemID");
    openapiFields.add("employeeId");
    openapiFields.add("eoiDate");
    openapiFields.add("needEOI");
    openapiFields.add("primaryCarePhysician");
    openapiFields.add("primaryCarePhysicianId");
    openapiFields.add("isBenefitWaived");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependentDeductions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DependentDeductions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependentDeductions is not found in the empty JSON string", DependentDeductions.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("benefitStatus") != null && !jsonObj.get("benefitStatus").isJsonNull()) && !jsonObj.get("benefitStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitStatus").toString()));
      }
      if ((jsonObj.get("certificateNo") != null && !jsonObj.get("certificateNo").isJsonNull()) && !jsonObj.get("certificateNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateNo").toString()));
      }
      if ((jsonObj.get("companyID") != null && !jsonObj.get("companyID").isJsonNull()) && !jsonObj.get("companyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyID").toString()));
      }
      if ((jsonObj.get("contactID") != null && !jsonObj.get("contactID").isJsonNull()) && !jsonObj.get("contactID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactID").toString()));
      }
      if ((jsonObj.get("currentCOID") != null && !jsonObj.get("currentCOID").isJsonNull()) && !jsonObj.get("currentCOID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentCOID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentCOID").toString()));
      }
      if ((jsonObj.get("deductionCode") != null && !jsonObj.get("deductionCode").isJsonNull()) && !jsonObj.get("deductionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deductionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deductionCode").toString()));
      }
      if ((jsonObj.get("deductionNotes") != null && !jsonObj.get("deductionNotes").isJsonNull()) && !jsonObj.get("deductionNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deductionNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deductionNotes").toString()));
      }
      if ((jsonObj.get("deductionType") != null && !jsonObj.get("deductionType").isJsonNull()) && !jsonObj.get("deductionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deductionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deductionType").toString()));
      }
      if ((jsonObj.get("declinedByCarrier") != null && !jsonObj.get("declinedByCarrier").isJsonNull()) && !jsonObj.get("declinedByCarrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declinedByCarrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declinedByCarrier").toString()));
      }
      if ((jsonObj.get("declinedByCarrierReason") != null && !jsonObj.get("declinedByCarrierReason").isJsonNull()) && !jsonObj.get("declinedByCarrierReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declinedByCarrierReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declinedByCarrierReason").toString()));
      }
      if ((jsonObj.get("systemID") != null && !jsonObj.get("systemID").isJsonNull()) && !jsonObj.get("systemID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemID").toString()));
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("primaryCarePhysician") != null && !jsonObj.get("primaryCarePhysician").isJsonNull()) && !jsonObj.get("primaryCarePhysician").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryCarePhysician` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryCarePhysician").toString()));
      }
      if ((jsonObj.get("primaryCarePhysicianId") != null && !jsonObj.get("primaryCarePhysicianId").isJsonNull()) && !jsonObj.get("primaryCarePhysicianId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryCarePhysicianId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryCarePhysicianId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependentDeductions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependentDeductions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependentDeductions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependentDeductions.class));

       return (TypeAdapter<T>) new TypeAdapter<DependentDeductions>() {
           @Override
           public void write(JsonWriter out, DependentDeductions value) throws IOException {
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
           public DependentDeductions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DependentDeductions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DependentDeductions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependentDeductions
  * @throws IOException if the JSON string is invalid with respect to DependentDeductions
  */
  public static DependentDeductions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependentDeductions.class);
  }

 /**
  * Convert an instance of DependentDeductions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

