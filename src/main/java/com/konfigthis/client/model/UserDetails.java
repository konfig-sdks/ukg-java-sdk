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
 * UserDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserDetails {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_USER_LAST_LOGON_DATE = "userLastLogonDate";
  @SerializedName(SERIALIZED_NAME_USER_LAST_LOGON_DATE)
  private OffsetDateTime userLastLogonDate;

  public static final String SERIALIZED_NAME_USER_LAST_PASSWORD_CHANGE_DATE = "userLastPasswordChangeDate";
  @SerializedName(SERIALIZED_NAME_USER_LAST_PASSWORD_CHANGE_DATE)
  private OffsetDateTime userLastPasswordChangeDate;

  public static final String SERIALIZED_NAME_USER_STATUS = "userStatus";
  @SerializedName(SERIALIZED_NAME_USER_STATUS)
  private String userStatus;

  public static final String SERIALIZED_NAME_INTEGRATION_USER_KEY = "integrationUserKey";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_USER_KEY)
  private String integrationUserKey;

  public UserDetails() {
  }

  public UserDetails employeeId(String employeeId) {
    
    
    
    
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


  public UserDetails userId(Integer userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    
    
    
    this.userId = userId;
  }


  public UserDetails userName(String userName) {
    
    
    
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    
    
    
    this.userName = userName;
  }


  public UserDetails fullName(String fullName) {
    
    
    
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    
    
    
    this.fullName = fullName;
  }


  public UserDetails userLastLogonDate(OffsetDateTime userLastLogonDate) {
    
    
    
    
    this.userLastLogonDate = userLastLogonDate;
    return this;
  }

   /**
   * Get userLastLogonDate
   * @return userLastLogonDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUserLastLogonDate() {
    return userLastLogonDate;
  }


  public void setUserLastLogonDate(OffsetDateTime userLastLogonDate) {
    
    
    
    this.userLastLogonDate = userLastLogonDate;
  }


  public UserDetails userLastPasswordChangeDate(OffsetDateTime userLastPasswordChangeDate) {
    
    
    
    
    this.userLastPasswordChangeDate = userLastPasswordChangeDate;
    return this;
  }

   /**
   * Get userLastPasswordChangeDate
   * @return userLastPasswordChangeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUserLastPasswordChangeDate() {
    return userLastPasswordChangeDate;
  }


  public void setUserLastPasswordChangeDate(OffsetDateTime userLastPasswordChangeDate) {
    
    
    
    this.userLastPasswordChangeDate = userLastPasswordChangeDate;
  }


  public UserDetails userStatus(String userStatus) {
    
    
    
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserStatus() {
    return userStatus;
  }


  public void setUserStatus(String userStatus) {
    
    
    
    this.userStatus = userStatus;
  }


  public UserDetails integrationUserKey(String integrationUserKey) {
    
    
    
    
    this.integrationUserKey = integrationUserKey;
    return this;
  }

   /**
   * Get integrationUserKey
   * @return integrationUserKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIntegrationUserKey() {
    return integrationUserKey;
  }


  public void setIntegrationUserKey(String integrationUserKey) {
    
    
    
    this.integrationUserKey = integrationUserKey;
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
   * @return the UserDetails instance itself
   */
  public UserDetails putAdditionalProperty(String key, Object value) {
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
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.employeeId, userDetails.employeeId) &&
        Objects.equals(this.userId, userDetails.userId) &&
        Objects.equals(this.userName, userDetails.userName) &&
        Objects.equals(this.fullName, userDetails.fullName) &&
        Objects.equals(this.userLastLogonDate, userDetails.userLastLogonDate) &&
        Objects.equals(this.userLastPasswordChangeDate, userDetails.userLastPasswordChangeDate) &&
        Objects.equals(this.userStatus, userDetails.userStatus) &&
        Objects.equals(this.integrationUserKey, userDetails.integrationUserKey)&&
        Objects.equals(this.additionalProperties, userDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, userId, userName, fullName, userLastLogonDate, userLastPasswordChangeDate, userStatus, integrationUserKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    userLastLogonDate: ").append(toIndentedString(userLastLogonDate)).append("\n");
    sb.append("    userLastPasswordChangeDate: ").append(toIndentedString(userLastPasswordChangeDate)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    integrationUserKey: ").append(toIndentedString(integrationUserKey)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("userName");
    openapiFields.add("fullName");
    openapiFields.add("userLastLogonDate");
    openapiFields.add("userLastPasswordChangeDate");
    openapiFields.add("userStatus");
    openapiFields.add("integrationUserKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserDetails is not found in the empty JSON string", UserDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("userName") != null && !jsonObj.get("userName").isJsonNull()) && !jsonObj.get("userName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userName").toString()));
      }
      if ((jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonNull()) && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      if ((jsonObj.get("userStatus") != null && !jsonObj.get("userStatus").isJsonNull()) && !jsonObj.get("userStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userStatus").toString()));
      }
      if ((jsonObj.get("integrationUserKey") != null && !jsonObj.get("integrationUserKey").isJsonNull()) && !jsonObj.get("integrationUserKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationUserKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationUserKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UserDetails>() {
           @Override
           public void write(JsonWriter out, UserDetails value) throws IOException {
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
           public UserDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserDetails
  * @throws IOException if the JSON string is invalid with respect to UserDetails
  */
  public static UserDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserDetails.class);
  }

 /**
  * Convert an instance of UserDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

