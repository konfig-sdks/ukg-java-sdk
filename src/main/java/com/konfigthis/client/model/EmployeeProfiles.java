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
 * EmployeeProfiles
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeProfiles {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROFILE_VALUE = "profileValue";
  @SerializedName(SERIALIZED_NAME_PROFILE_VALUE)
  private String profileValue;

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profileType";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  private String profileType;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  private String module;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  public static final String SERIALIZED_NAME_IS_CLEARED = "isCleared";
  @SerializedName(SERIALIZED_NAME_IS_CLEARED)
  private Boolean isCleared;

  public static final String SERIALIZED_NAME_IS_DATE_EFFECTIVE = "isDateEffective";
  @SerializedName(SERIALIZED_NAME_IS_DATE_EFFECTIVE)
  private Boolean isDateEffective;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_RECORD_ID = "recordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private Double recordId;

  public static final String SERIALIZED_NAME_CHANGE_RECORD_I_D = "changeRecordID";
  @SerializedName(SERIALIZED_NAME_CHANGE_RECORD_I_D)
  private Double changeRecordID;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_PRIMARY_EFFECTIVE_DATE = "isPrimaryEffectiveDate";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_EFFECTIVE_DATE)
  private OffsetDateTime isPrimaryEffectiveDate;

  public static final String SERIALIZED_NAME_ORIGINAL_HIRE_DATE = "originalHireDate";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_HIRE_DATE)
  private OffsetDateTime originalHireDate;

  public EmployeeProfiles() {
  }

  public EmployeeProfiles description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public EmployeeProfiles profileValue(String profileValue) {
    
    
    
    
    this.profileValue = profileValue;
    return this;
  }

   /**
   * Get profileValue
   * @return profileValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileValue() {
    return profileValue;
  }


  public void setProfileValue(String profileValue) {
    
    
    
    this.profileValue = profileValue;
  }


  public EmployeeProfiles profileType(String profileType) {
    
    
    
    
    this.profileType = profileType;
    return this;
  }

   /**
   * Get profileType
   * @return profileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileType() {
    return profileType;
  }


  public void setProfileType(String profileType) {
    
    
    
    this.profileType = profileType;
  }


  public EmployeeProfiles product(String product) {
    
    
    
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    
    
    
    this.product = product;
  }


  public EmployeeProfiles module(String module) {
    
    
    
    
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModule() {
    return module;
  }


  public void setModule(String module) {
    
    
    
    this.module = module;
  }


  public EmployeeProfiles companyId(String companyId) {
    
    
    
    
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


  public EmployeeProfiles employeeId(String employeeId) {
    
    
    
    
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


  public EmployeeProfiles lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    
    
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    
    
    this.lastModifiedDate = lastModifiedDate;
  }


  public EmployeeProfiles isCleared(Boolean isCleared) {
    
    
    
    
    this.isCleared = isCleared;
    return this;
  }

   /**
   * Get isCleared
   * @return isCleared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCleared() {
    return isCleared;
  }


  public void setIsCleared(Boolean isCleared) {
    
    
    
    this.isCleared = isCleared;
  }


  public EmployeeProfiles isDateEffective(Boolean isDateEffective) {
    
    
    
    
    this.isDateEffective = isDateEffective;
    return this;
  }

   /**
   * Get isDateEffective
   * @return isDateEffective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDateEffective() {
    return isDateEffective;
  }


  public void setIsDateEffective(Boolean isDateEffective) {
    
    
    
    this.isDateEffective = isDateEffective;
  }


  public EmployeeProfiles effectiveDate(OffsetDateTime effectiveDate) {
    
    
    
    
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


  public EmployeeProfiles recordId(Double recordId) {
    
    
    
    
    this.recordId = recordId;
    return this;
  }

  public EmployeeProfiles recordId(Integer recordId) {
    
    
    
    
    this.recordId = recordId.doubleValue();
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getRecordId() {
    return recordId;
  }


  public void setRecordId(Double recordId) {
    
    
    
    this.recordId = recordId;
  }


  public EmployeeProfiles changeRecordID(Double changeRecordID) {
    
    
    
    
    this.changeRecordID = changeRecordID;
    return this;
  }

  public EmployeeProfiles changeRecordID(Integer changeRecordID) {
    
    
    
    
    this.changeRecordID = changeRecordID.doubleValue();
    return this;
  }

   /**
   * Get changeRecordID
   * @return changeRecordID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getChangeRecordID() {
    return changeRecordID;
  }


  public void setChangeRecordID(Double changeRecordID) {
    
    
    
    this.changeRecordID = changeRecordID;
  }


  public EmployeeProfiles isPrimary(Boolean isPrimary) {
    
    
    
    
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


  public EmployeeProfiles isPrimaryEffectiveDate(OffsetDateTime isPrimaryEffectiveDate) {
    
    
    
    
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


  public EmployeeProfiles originalHireDate(OffsetDateTime originalHireDate) {
    
    
    
    
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
   * @return the EmployeeProfiles instance itself
   */
  public EmployeeProfiles putAdditionalProperty(String key, Object value) {
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
    EmployeeProfiles employeeProfiles = (EmployeeProfiles) o;
    return Objects.equals(this.description, employeeProfiles.description) &&
        Objects.equals(this.profileValue, employeeProfiles.profileValue) &&
        Objects.equals(this.profileType, employeeProfiles.profileType) &&
        Objects.equals(this.product, employeeProfiles.product) &&
        Objects.equals(this.module, employeeProfiles.module) &&
        Objects.equals(this.companyId, employeeProfiles.companyId) &&
        Objects.equals(this.employeeId, employeeProfiles.employeeId) &&
        Objects.equals(this.lastModifiedDate, employeeProfiles.lastModifiedDate) &&
        Objects.equals(this.isCleared, employeeProfiles.isCleared) &&
        Objects.equals(this.isDateEffective, employeeProfiles.isDateEffective) &&
        Objects.equals(this.effectiveDate, employeeProfiles.effectiveDate) &&
        Objects.equals(this.recordId, employeeProfiles.recordId) &&
        Objects.equals(this.changeRecordID, employeeProfiles.changeRecordID) &&
        Objects.equals(this.isPrimary, employeeProfiles.isPrimary) &&
        Objects.equals(this.isPrimaryEffectiveDate, employeeProfiles.isPrimaryEffectiveDate) &&
        Objects.equals(this.originalHireDate, employeeProfiles.originalHireDate)&&
        Objects.equals(this.additionalProperties, employeeProfiles.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, profileValue, profileType, product, module, companyId, employeeId, lastModifiedDate, isCleared, isDateEffective, effectiveDate, recordId, changeRecordID, isPrimary, isPrimaryEffectiveDate, originalHireDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeProfiles {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    profileValue: ").append(toIndentedString(profileValue)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    isCleared: ").append(toIndentedString(isCleared)).append("\n");
    sb.append("    isDateEffective: ").append(toIndentedString(isDateEffective)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    changeRecordID: ").append(toIndentedString(changeRecordID)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("profileValue");
    openapiFields.add("profileType");
    openapiFields.add("product");
    openapiFields.add("module");
    openapiFields.add("companyId");
    openapiFields.add("employeeId");
    openapiFields.add("lastModifiedDate");
    openapiFields.add("isCleared");
    openapiFields.add("isDateEffective");
    openapiFields.add("effectiveDate");
    openapiFields.add("recordId");
    openapiFields.add("changeRecordID");
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
  * @throws IOException if the JSON Object is invalid with respect to EmployeeProfiles
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeProfiles.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeProfiles is not found in the empty JSON string", EmployeeProfiles.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("profileValue") != null && !jsonObj.get("profileValue").isJsonNull()) && !jsonObj.get("profileValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileValue").toString()));
      }
      if ((jsonObj.get("profileType") != null && !jsonObj.get("profileType").isJsonNull()) && !jsonObj.get("profileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileType").toString()));
      }
      if ((jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) && !jsonObj.get("product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product").toString()));
      }
      if ((jsonObj.get("module") != null && !jsonObj.get("module").isJsonNull()) && !jsonObj.get("module").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeProfiles.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeProfiles' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeProfiles> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeProfiles.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeProfiles>() {
           @Override
           public void write(JsonWriter out, EmployeeProfiles value) throws IOException {
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
           public EmployeeProfiles read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeProfiles instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeProfiles given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeProfiles
  * @throws IOException if the JSON string is invalid with respect to EmployeeProfiles
  */
  public static EmployeeProfiles fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeProfiles.class);
  }

 /**
  * Convert an instance of EmployeeProfiles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

