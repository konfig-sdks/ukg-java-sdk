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
 * EmployeeStatus
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeStatus {
  public static final String SERIALIZED_NAME_AS_OF_DATE = "asOfDate";
  @SerializedName(SERIALIZED_NAME_AS_OF_DATE)
  private OffsetDateTime asOfDate;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_TRIGGER_TERMINATION = "triggerTermination";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TERMINATION)
  private Boolean triggerTermination;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_START_DATE = "statusStartDate";
  @SerializedName(SERIALIZED_NAME_STATUS_START_DATE)
  private OffsetDateTime statusStartDate;

  public static final String SERIALIZED_NAME_STATUS_REASON = "statusReason";
  @SerializedName(SERIALIZED_NAME_STATUS_REASON)
  private String statusReason;

  public static final String SERIALIZED_NAME_STATUS_REASON_DESC = "statusReasonDesc";
  @SerializedName(SERIALIZED_NAME_STATUS_REASON_DESC)
  private String statusReasonDesc;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_PRIMARY_EFFECTIVE_DATE = "isPrimaryEffectiveDate";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_EFFECTIVE_DATE)
  private OffsetDateTime isPrimaryEffectiveDate;

  public static final String SERIALIZED_NAME_ORIGINAL_HIRE_DATE = "originalHireDate";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_HIRE_DATE)
  private OffsetDateTime originalHireDate;

  public EmployeeStatus() {
  }

  public EmployeeStatus asOfDate(OffsetDateTime asOfDate) {
    
    
    
    
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Get asOfDate
   * @return asOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAsOfDate() {
    return asOfDate;
  }


  public void setAsOfDate(OffsetDateTime asOfDate) {
    
    
    
    this.asOfDate = asOfDate;
  }


  public EmployeeStatus employeeId(String employeeId) {
    
    
    
    
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


  public EmployeeStatus companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public EmployeeStatus triggerTermination(Boolean triggerTermination) {
    
    
    
    
    this.triggerTermination = triggerTermination;
    return this;
  }

   /**
   * Get triggerTermination
   * @return triggerTermination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTriggerTermination() {
    return triggerTermination;
  }


  public void setTriggerTermination(Boolean triggerTermination) {
    
    
    
    this.triggerTermination = triggerTermination;
  }


  public EmployeeStatus status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public EmployeeStatus statusStartDate(OffsetDateTime statusStartDate) {
    
    
    
    
    this.statusStartDate = statusStartDate;
    return this;
  }

   /**
   * Get statusStartDate
   * @return statusStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStatusStartDate() {
    return statusStartDate;
  }


  public void setStatusStartDate(OffsetDateTime statusStartDate) {
    
    
    
    this.statusStartDate = statusStartDate;
  }


  public EmployeeStatus statusReason(String statusReason) {
    
    
    
    
    this.statusReason = statusReason;
    return this;
  }

   /**
   * Get statusReason
   * @return statusReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusReason() {
    return statusReason;
  }


  public void setStatusReason(String statusReason) {
    
    
    
    this.statusReason = statusReason;
  }


  public EmployeeStatus statusReasonDesc(String statusReasonDesc) {
    
    
    
    
    this.statusReasonDesc = statusReasonDesc;
    return this;
  }

   /**
   * Get statusReasonDesc
   * @return statusReasonDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusReasonDesc() {
    return statusReasonDesc;
  }


  public void setStatusReasonDesc(String statusReasonDesc) {
    
    
    
    this.statusReasonDesc = statusReasonDesc;
  }


  public EmployeeStatus isPrimary(Boolean isPrimary) {
    
    
    
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    
    
    
    this.isPrimary = isPrimary;
  }


  public EmployeeStatus isPrimaryEffectiveDate(OffsetDateTime isPrimaryEffectiveDate) {
    
    
    
    
    this.isPrimaryEffectiveDate = isPrimaryEffectiveDate;
    return this;
  }

   /**
   * Get isPrimaryEffectiveDate
   * @return isPrimaryEffectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getIsPrimaryEffectiveDate() {
    return isPrimaryEffectiveDate;
  }


  public void setIsPrimaryEffectiveDate(OffsetDateTime isPrimaryEffectiveDate) {
    
    
    
    this.isPrimaryEffectiveDate = isPrimaryEffectiveDate;
  }


  public EmployeeStatus originalHireDate(OffsetDateTime originalHireDate) {
    
    
    
    
    this.originalHireDate = originalHireDate;
    return this;
  }

   /**
   * Get originalHireDate
   * @return originalHireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getOriginalHireDate() {
    return originalHireDate;
  }


  public void setOriginalHireDate(OffsetDateTime originalHireDate) {
    
    
    
    this.originalHireDate = originalHireDate;
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
   * @return the EmployeeStatus instance itself
   */
  public EmployeeStatus putAdditionalProperty(String key, Object value) {
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
    EmployeeStatus employeeStatus = (EmployeeStatus) o;
    return Objects.equals(this.asOfDate, employeeStatus.asOfDate) &&
        Objects.equals(this.employeeId, employeeStatus.employeeId) &&
        Objects.equals(this.companyId, employeeStatus.companyId) &&
        Objects.equals(this.triggerTermination, employeeStatus.triggerTermination) &&
        Objects.equals(this.status, employeeStatus.status) &&
        Objects.equals(this.statusStartDate, employeeStatus.statusStartDate) &&
        Objects.equals(this.statusReason, employeeStatus.statusReason) &&
        Objects.equals(this.statusReasonDesc, employeeStatus.statusReasonDesc) &&
        Objects.equals(this.isPrimary, employeeStatus.isPrimary) &&
        Objects.equals(this.isPrimaryEffectiveDate, employeeStatus.isPrimaryEffectiveDate) &&
        Objects.equals(this.originalHireDate, employeeStatus.originalHireDate)&&
        Objects.equals(this.additionalProperties, employeeStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, employeeId, companyId, triggerTermination, status, statusStartDate, statusReason, statusReasonDesc, isPrimary, isPrimaryEffectiveDate, originalHireDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeStatus {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    triggerTermination: ").append(toIndentedString(triggerTermination)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusStartDate: ").append(toIndentedString(statusStartDate)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusReasonDesc: ").append(toIndentedString(statusReasonDesc)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    isPrimaryEffectiveDate: ").append(toIndentedString(isPrimaryEffectiveDate)).append("\n");
    sb.append("    originalHireDate: ").append(toIndentedString(originalHireDate)).append("\n");
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
    openapiFields.add("asOfDate");
    openapiFields.add("employeeId");
    openapiFields.add("companyId");
    openapiFields.add("triggerTermination");
    openapiFields.add("status");
    openapiFields.add("statusStartDate");
    openapiFields.add("statusReason");
    openapiFields.add("statusReasonDesc");
    openapiFields.add("isPrimary");
    openapiFields.add("isPrimaryEffectiveDate");
    openapiFields.add("originalHireDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeStatus is not found in the empty JSON string", EmployeeStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("statusReason") != null && !jsonObj.get("statusReason").isJsonNull()) && !jsonObj.get("statusReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReason").toString()));
      }
      if ((jsonObj.get("statusReasonDesc") != null && !jsonObj.get("statusReasonDesc").isJsonNull()) && !jsonObj.get("statusReasonDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusReasonDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReasonDesc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeStatus>() {
           @Override
           public void write(JsonWriter out, EmployeeStatus value) throws IOException {
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
           public EmployeeStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeStatus
  * @throws IOException if the JSON string is invalid with respect to EmployeeStatus
  */
  public static EmployeeStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeStatus.class);
  }

 /**
  * Convert an instance of EmployeeStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

