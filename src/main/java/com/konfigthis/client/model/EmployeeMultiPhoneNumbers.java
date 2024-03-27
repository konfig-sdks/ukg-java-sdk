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
 * EmployeeMultiPhoneNumbers
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeMultiPhoneNumbers {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_AUDIT_KEY = "auditKey";
  @SerializedName(SERIALIZED_NAME_AUDIT_KEY)
  private String auditKey;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FORMER_NAME = "formerName";
  @SerializedName(SERIALIZED_NAME_FORMER_NAME)
  private Object formerName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_CODE = "phoneCountryCode";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_CODE)
  private String phoneCountryCode;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_PREFIX = "phoneCountryPrefix";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_PREFIX)
  private Object phoneCountryPrefix;

  public static final String SERIALIZED_NAME_PHONE_TYPE_CODE = "phoneTypeCode";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE_CODE)
  private String phoneTypeCode;

  public static final String SERIALIZED_NAME_PHONE_EXTENSION = "phoneExtension";
  @SerializedName(SERIALIZED_NAME_PHONE_EXTENSION)
  private String phoneExtension;

  public static final String SERIALIZED_NAME_PHONE_IS_PRIVATE = "phoneIsPrivate";
  @SerializedName(SERIALIZED_NAME_PHONE_IS_PRIVATE)
  private Boolean phoneIsPrivate;

  public static final String SERIALIZED_NAME_SYSTEM_ID = "systemId";
  @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
  private String systemId;

  public EmployeeMultiPhoneNumbers() {
  }

  public EmployeeMultiPhoneNumbers employeeId(String employeeId) {
    
    
    
    
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


  public EmployeeMultiPhoneNumbers auditKey(String auditKey) {
    
    
    
    
    this.auditKey = auditKey;
    return this;
  }

   /**
   * Get auditKey
   * @return auditKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuditKey() {
    return auditKey;
  }


  public void setAuditKey(String auditKey) {
    
    
    
    this.auditKey = auditKey;
  }


  public EmployeeMultiPhoneNumbers firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public EmployeeMultiPhoneNumbers formerName(Object formerName) {
    
    
    
    
    this.formerName = formerName;
    return this;
  }

   /**
   * Get formerName
   * @return formerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFormerName() {
    return formerName;
  }


  public void setFormerName(Object formerName) {
    
    
    
    this.formerName = formerName;
  }


  public EmployeeMultiPhoneNumbers lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public EmployeeMultiPhoneNumbers middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public EmployeeMultiPhoneNumbers phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public EmployeeMultiPhoneNumbers phoneCountryCode(String phoneCountryCode) {
    
    
    
    
    this.phoneCountryCode = phoneCountryCode;
    return this;
  }

   /**
   * Get phoneCountryCode
   * @return phoneCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneCountryCode() {
    return phoneCountryCode;
  }


  public void setPhoneCountryCode(String phoneCountryCode) {
    
    
    
    this.phoneCountryCode = phoneCountryCode;
  }


  public EmployeeMultiPhoneNumbers phoneCountryPrefix(Object phoneCountryPrefix) {
    
    
    
    
    this.phoneCountryPrefix = phoneCountryPrefix;
    return this;
  }

   /**
   * Get phoneCountryPrefix
   * @return phoneCountryPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPhoneCountryPrefix() {
    return phoneCountryPrefix;
  }


  public void setPhoneCountryPrefix(Object phoneCountryPrefix) {
    
    
    
    this.phoneCountryPrefix = phoneCountryPrefix;
  }


  public EmployeeMultiPhoneNumbers phoneTypeCode(String phoneTypeCode) {
    
    
    
    
    this.phoneTypeCode = phoneTypeCode;
    return this;
  }

   /**
   * Get phoneTypeCode
   * @return phoneTypeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneTypeCode() {
    return phoneTypeCode;
  }


  public void setPhoneTypeCode(String phoneTypeCode) {
    
    
    
    this.phoneTypeCode = phoneTypeCode;
  }


  public EmployeeMultiPhoneNumbers phoneExtension(String phoneExtension) {
    
    
    
    
    this.phoneExtension = phoneExtension;
    return this;
  }

   /**
   * Get phoneExtension
   * @return phoneExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneExtension() {
    return phoneExtension;
  }


  public void setPhoneExtension(String phoneExtension) {
    
    
    
    this.phoneExtension = phoneExtension;
  }


  public EmployeeMultiPhoneNumbers phoneIsPrivate(Boolean phoneIsPrivate) {
    
    
    
    
    this.phoneIsPrivate = phoneIsPrivate;
    return this;
  }

   /**
   * Get phoneIsPrivate
   * @return phoneIsPrivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPhoneIsPrivate() {
    return phoneIsPrivate;
  }


  public void setPhoneIsPrivate(Boolean phoneIsPrivate) {
    
    
    
    this.phoneIsPrivate = phoneIsPrivate;
  }


  public EmployeeMultiPhoneNumbers systemId(String systemId) {
    
    
    
    
    this.systemId = systemId;
    return this;
  }

   /**
   * Get systemId
   * @return systemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSystemId() {
    return systemId;
  }


  public void setSystemId(String systemId) {
    
    
    
    this.systemId = systemId;
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
   * @return the EmployeeMultiPhoneNumbers instance itself
   */
  public EmployeeMultiPhoneNumbers putAdditionalProperty(String key, Object value) {
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
    EmployeeMultiPhoneNumbers employeeMultiPhoneNumbers = (EmployeeMultiPhoneNumbers) o;
    return Objects.equals(this.employeeId, employeeMultiPhoneNumbers.employeeId) &&
        Objects.equals(this.auditKey, employeeMultiPhoneNumbers.auditKey) &&
        Objects.equals(this.firstName, employeeMultiPhoneNumbers.firstName) &&
        Objects.equals(this.formerName, employeeMultiPhoneNumbers.formerName) &&
        Objects.equals(this.lastName, employeeMultiPhoneNumbers.lastName) &&
        Objects.equals(this.middleName, employeeMultiPhoneNumbers.middleName) &&
        Objects.equals(this.phoneNumber, employeeMultiPhoneNumbers.phoneNumber) &&
        Objects.equals(this.phoneCountryCode, employeeMultiPhoneNumbers.phoneCountryCode) &&
        Objects.equals(this.phoneCountryPrefix, employeeMultiPhoneNumbers.phoneCountryPrefix) &&
        Objects.equals(this.phoneTypeCode, employeeMultiPhoneNumbers.phoneTypeCode) &&
        Objects.equals(this.phoneExtension, employeeMultiPhoneNumbers.phoneExtension) &&
        Objects.equals(this.phoneIsPrivate, employeeMultiPhoneNumbers.phoneIsPrivate) &&
        Objects.equals(this.systemId, employeeMultiPhoneNumbers.systemId)&&
        Objects.equals(this.additionalProperties, employeeMultiPhoneNumbers.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, auditKey, firstName, formerName, lastName, middleName, phoneNumber, phoneCountryCode, phoneCountryPrefix, phoneTypeCode, phoneExtension, phoneIsPrivate, systemId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeMultiPhoneNumbers {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    auditKey: ").append(toIndentedString(auditKey)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    formerName: ").append(toIndentedString(formerName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
    sb.append("    phoneCountryPrefix: ").append(toIndentedString(phoneCountryPrefix)).append("\n");
    sb.append("    phoneTypeCode: ").append(toIndentedString(phoneTypeCode)).append("\n");
    sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
    sb.append("    phoneIsPrivate: ").append(toIndentedString(phoneIsPrivate)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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
    openapiFields.add("auditKey");
    openapiFields.add("firstName");
    openapiFields.add("formerName");
    openapiFields.add("lastName");
    openapiFields.add("middleName");
    openapiFields.add("phoneNumber");
    openapiFields.add("phoneCountryCode");
    openapiFields.add("phoneCountryPrefix");
    openapiFields.add("phoneTypeCode");
    openapiFields.add("phoneExtension");
    openapiFields.add("phoneIsPrivate");
    openapiFields.add("systemId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeMultiPhoneNumbers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeMultiPhoneNumbers.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeMultiPhoneNumbers is not found in the empty JSON string", EmployeeMultiPhoneNumbers.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("auditKey") != null && !jsonObj.get("auditKey").isJsonNull()) && !jsonObj.get("auditKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auditKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auditKey").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("phoneCountryCode") != null && !jsonObj.get("phoneCountryCode").isJsonNull()) && !jsonObj.get("phoneCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneCountryCode").toString()));
      }
      if ((jsonObj.get("phoneTypeCode") != null && !jsonObj.get("phoneTypeCode").isJsonNull()) && !jsonObj.get("phoneTypeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneTypeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneTypeCode").toString()));
      }
      if ((jsonObj.get("phoneExtension") != null && !jsonObj.get("phoneExtension").isJsonNull()) && !jsonObj.get("phoneExtension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneExtension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneExtension").toString()));
      }
      if ((jsonObj.get("systemId") != null && !jsonObj.get("systemId").isJsonNull()) && !jsonObj.get("systemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeMultiPhoneNumbers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeMultiPhoneNumbers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeMultiPhoneNumbers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeMultiPhoneNumbers.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeMultiPhoneNumbers>() {
           @Override
           public void write(JsonWriter out, EmployeeMultiPhoneNumbers value) throws IOException {
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
           public EmployeeMultiPhoneNumbers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeMultiPhoneNumbers instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeMultiPhoneNumbers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeMultiPhoneNumbers
  * @throws IOException if the JSON string is invalid with respect to EmployeeMultiPhoneNumbers
  */
  public static EmployeeMultiPhoneNumbers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeMultiPhoneNumbers.class);
  }

 /**
  * Convert an instance of EmployeeMultiPhoneNumbers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

