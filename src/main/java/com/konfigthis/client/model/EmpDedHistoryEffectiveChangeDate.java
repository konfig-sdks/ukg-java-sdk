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
 * EmpDedHistoryEffectiveChangeDate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmpDedHistoryEffectiveChangeDate {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_DEDUCTION_CODE = "deductionCode";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_CODE)
  private String deductionCode;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_FIELD_VALUE_DATA_TYPE = "fieldValueDataType";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE_DATA_TYPE)
  private String fieldValueDataType;

  public static final String SERIALIZED_NAME_FIELD_VALUE = "fieldValue";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE)
  private String fieldValue;

  public static final String SERIALIZED_NAME_FIELD_VALUE_DATE = "fieldValueDate";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE_DATE)
  private OffsetDateTime fieldValueDate;

  public static final String SERIALIZED_NAME_FIELD_VALUE_NUMBER = "fieldValueNumber";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE_NUMBER)
  private Double fieldValueNumber;

  public static final String SERIALIZED_NAME_CHANGE_REASON = "changeReason";
  @SerializedName(SERIALIZED_NAME_CHANGE_REASON)
  private String changeReason;

  public EmpDedHistoryEffectiveChangeDate() {
  }

  public EmpDedHistoryEffectiveChangeDate employeeId(String employeeId) {
    
    
    
    
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


  public EmpDedHistoryEffectiveChangeDate companyId(String companyId) {
    
    
    
    
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


  public EmpDedHistoryEffectiveChangeDate deductionCode(String deductionCode) {
    
    
    
    
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


  public EmpDedHistoryEffectiveChangeDate effectiveDate(OffsetDateTime effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public EmpDedHistoryEffectiveChangeDate fieldValueDataType(String fieldValueDataType) {
    
    
    
    
    this.fieldValueDataType = fieldValueDataType;
    return this;
  }

   /**
   * Get fieldValueDataType
   * @return fieldValueDataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldValueDataType() {
    return fieldValueDataType;
  }


  public void setFieldValueDataType(String fieldValueDataType) {
    
    
    
    this.fieldValueDataType = fieldValueDataType;
  }


  public EmpDedHistoryEffectiveChangeDate fieldValue(String fieldValue) {
    
    
    
    
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldValue() {
    return fieldValue;
  }


  public void setFieldValue(String fieldValue) {
    
    
    
    this.fieldValue = fieldValue;
  }


  public EmpDedHistoryEffectiveChangeDate fieldValueDate(OffsetDateTime fieldValueDate) {
    
    
    
    
    this.fieldValueDate = fieldValueDate;
    return this;
  }

   /**
   * Get fieldValueDate
   * @return fieldValueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFieldValueDate() {
    return fieldValueDate;
  }


  public void setFieldValueDate(OffsetDateTime fieldValueDate) {
    
    
    
    this.fieldValueDate = fieldValueDate;
  }


  public EmpDedHistoryEffectiveChangeDate fieldValueNumber(Double fieldValueNumber) {
    
    
    
    
    this.fieldValueNumber = fieldValueNumber;
    return this;
  }

  public EmpDedHistoryEffectiveChangeDate fieldValueNumber(Integer fieldValueNumber) {
    
    
    
    
    this.fieldValueNumber = fieldValueNumber.doubleValue();
    return this;
  }

   /**
   * Get fieldValueNumber
   * @return fieldValueNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getFieldValueNumber() {
    return fieldValueNumber;
  }


  public void setFieldValueNumber(Double fieldValueNumber) {
    
    
    
    this.fieldValueNumber = fieldValueNumber;
  }


  public EmpDedHistoryEffectiveChangeDate changeReason(String changeReason) {
    
    
    
    
    this.changeReason = changeReason;
    return this;
  }

   /**
   * Get changeReason
   * @return changeReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangeReason() {
    return changeReason;
  }


  public void setChangeReason(String changeReason) {
    
    
    
    this.changeReason = changeReason;
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
   * @return the EmpDedHistoryEffectiveChangeDate instance itself
   */
  public EmpDedHistoryEffectiveChangeDate putAdditionalProperty(String key, Object value) {
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
    EmpDedHistoryEffectiveChangeDate empDedHistoryEffectiveChangeDate = (EmpDedHistoryEffectiveChangeDate) o;
    return Objects.equals(this.employeeId, empDedHistoryEffectiveChangeDate.employeeId) &&
        Objects.equals(this.companyId, empDedHistoryEffectiveChangeDate.companyId) &&
        Objects.equals(this.deductionCode, empDedHistoryEffectiveChangeDate.deductionCode) &&
        Objects.equals(this.effectiveDate, empDedHistoryEffectiveChangeDate.effectiveDate) &&
        Objects.equals(this.fieldValueDataType, empDedHistoryEffectiveChangeDate.fieldValueDataType) &&
        Objects.equals(this.fieldValue, empDedHistoryEffectiveChangeDate.fieldValue) &&
        Objects.equals(this.fieldValueDate, empDedHistoryEffectiveChangeDate.fieldValueDate) &&
        Objects.equals(this.fieldValueNumber, empDedHistoryEffectiveChangeDate.fieldValueNumber) &&
        Objects.equals(this.changeReason, empDedHistoryEffectiveChangeDate.changeReason)&&
        Objects.equals(this.additionalProperties, empDedHistoryEffectiveChangeDate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, companyId, deductionCode, effectiveDate, fieldValueDataType, fieldValue, fieldValueDate, fieldValueNumber, changeReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmpDedHistoryEffectiveChangeDate {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    deductionCode: ").append(toIndentedString(deductionCode)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    fieldValueDataType: ").append(toIndentedString(fieldValueDataType)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldValueDate: ").append(toIndentedString(fieldValueDate)).append("\n");
    sb.append("    fieldValueNumber: ").append(toIndentedString(fieldValueNumber)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("companyId");
    openapiFields.add("deductionCode");
    openapiFields.add("effectiveDate");
    openapiFields.add("fieldValueDataType");
    openapiFields.add("fieldValue");
    openapiFields.add("fieldValueDate");
    openapiFields.add("fieldValueNumber");
    openapiFields.add("changeReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmpDedHistoryEffectiveChangeDate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmpDedHistoryEffectiveChangeDate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmpDedHistoryEffectiveChangeDate is not found in the empty JSON string", EmpDedHistoryEffectiveChangeDate.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("deductionCode") != null && !jsonObj.get("deductionCode").isJsonNull()) && !jsonObj.get("deductionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deductionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deductionCode").toString()));
      }
      if ((jsonObj.get("fieldValueDataType") != null && !jsonObj.get("fieldValueDataType").isJsonNull()) && !jsonObj.get("fieldValueDataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldValueDataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldValueDataType").toString()));
      }
      if ((jsonObj.get("fieldValue") != null && !jsonObj.get("fieldValue").isJsonNull()) && !jsonObj.get("fieldValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldValue").toString()));
      }
      if ((jsonObj.get("changeReason") != null && !jsonObj.get("changeReason").isJsonNull()) && !jsonObj.get("changeReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmpDedHistoryEffectiveChangeDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmpDedHistoryEffectiveChangeDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmpDedHistoryEffectiveChangeDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmpDedHistoryEffectiveChangeDate.class));

       return (TypeAdapter<T>) new TypeAdapter<EmpDedHistoryEffectiveChangeDate>() {
           @Override
           public void write(JsonWriter out, EmpDedHistoryEffectiveChangeDate value) throws IOException {
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
           public EmpDedHistoryEffectiveChangeDate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmpDedHistoryEffectiveChangeDate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmpDedHistoryEffectiveChangeDate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmpDedHistoryEffectiveChangeDate
  * @throws IOException if the JSON string is invalid with respect to EmpDedHistoryEffectiveChangeDate
  */
  public static EmpDedHistoryEffectiveChangeDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmpDedHistoryEffectiveChangeDate.class);
  }

 /**
  * Convert an instance of EmpDedHistoryEffectiveChangeDate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

