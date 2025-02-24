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
 * AuditDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuditDetails {
  public static final String SERIALIZED_NAME_AUD_DATE_TIME = "audDateTime";
  @SerializedName(SERIALIZED_NAME_AUD_DATE_TIME)
  private OffsetDateTime audDateTime;

  public static final String SERIALIZED_NAME_AUD_KEY1_LABEL = "audKey1Label";
  @SerializedName(SERIALIZED_NAME_AUD_KEY1_LABEL)
  private String audKey1Label;

  public static final String SERIALIZED_NAME_AUD_KEY2_LABEL = "audKey2Label";
  @SerializedName(SERIALIZED_NAME_AUD_KEY2_LABEL)
  private String audKey2Label;

  public static final String SERIALIZED_NAME_AUD_KEY3_LABEL = "audKey3Label";
  @SerializedName(SERIALIZED_NAME_AUD_KEY3_LABEL)
  private String audKey3Label;

  public static final String SERIALIZED_NAME_AUD_KEY1_VALUE = "audKey1Value";
  @SerializedName(SERIALIZED_NAME_AUD_KEY1_VALUE)
  private String audKey1Value;

  public static final String SERIALIZED_NAME_AUD_KEY2_VALUE = "audKey2Value";
  @SerializedName(SERIALIZED_NAME_AUD_KEY2_VALUE)
  private String audKey2Value;

  public static final String SERIALIZED_NAME_AUD_KEY3_VALUE = "audKey3Value";
  @SerializedName(SERIALIZED_NAME_AUD_KEY3_VALUE)
  private String audKey3Value;

  public static final String SERIALIZED_NAME_AUD_TABLE_NAME = "audTableName";
  @SerializedName(SERIALIZED_NAME_AUD_TABLE_NAME)
  private String audTableName;

  public static final String SERIALIZED_NAME_AUD_FIELD_NAME = "audFieldName";
  @SerializedName(SERIALIZED_NAME_AUD_FIELD_NAME)
  private String audFieldName;

  public static final String SERIALIZED_NAME_AUD_OLD_VALUE = "audOldValue";
  @SerializedName(SERIALIZED_NAME_AUD_OLD_VALUE)
  private String audOldValue;

  public static final String SERIALIZED_NAME_AUD_NEW_VALUE = "audNewValue";
  @SerializedName(SERIALIZED_NAME_AUD_NEW_VALUE)
  private String audNewValue;

  public static final String SERIALIZED_NAME_AUD_ACTION = "audAction";
  @SerializedName(SERIALIZED_NAME_AUD_ACTION)
  private String audAction;

  public static final String SERIALIZED_NAME_AUD_SYSTEM_I_D = "audSystemID";
  @SerializedName(SERIALIZED_NAME_AUD_SYSTEM_I_D)
  private String audSystemID;

  public AuditDetails() {
  }

  public AuditDetails audDateTime(OffsetDateTime audDateTime) {
    
    
    
    
    this.audDateTime = audDateTime;
    return this;
  }

   /**
   * Get audDateTime
   * @return audDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAudDateTime() {
    return audDateTime;
  }


  public void setAudDateTime(OffsetDateTime audDateTime) {
    
    
    
    this.audDateTime = audDateTime;
  }


  public AuditDetails audKey1Label(String audKey1Label) {
    
    
    
    
    this.audKey1Label = audKey1Label;
    return this;
  }

   /**
   * Get audKey1Label
   * @return audKey1Label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudKey1Label() {
    return audKey1Label;
  }


  public void setAudKey1Label(String audKey1Label) {
    
    
    
    this.audKey1Label = audKey1Label;
  }


  public AuditDetails audKey2Label(String audKey2Label) {
    
    
    
    
    this.audKey2Label = audKey2Label;
    return this;
  }

   /**
   * Get audKey2Label
   * @return audKey2Label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudKey2Label() {
    return audKey2Label;
  }


  public void setAudKey2Label(String audKey2Label) {
    
    
    
    this.audKey2Label = audKey2Label;
  }


  public AuditDetails audKey3Label(String audKey3Label) {
    
    
    
    
    this.audKey3Label = audKey3Label;
    return this;
  }

   /**
   * Get audKey3Label
   * @return audKey3Label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudKey3Label() {
    return audKey3Label;
  }


  public void setAudKey3Label(String audKey3Label) {
    
    
    
    this.audKey3Label = audKey3Label;
  }


  public AuditDetails audKey1Value(String audKey1Value) {
    
    
    
    
    this.audKey1Value = audKey1Value;
    return this;
  }

   /**
   * Get audKey1Value
   * @return audKey1Value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudKey1Value() {
    return audKey1Value;
  }


  public void setAudKey1Value(String audKey1Value) {
    
    
    
    this.audKey1Value = audKey1Value;
  }


  public AuditDetails audKey2Value(String audKey2Value) {
    
    
    
    
    this.audKey2Value = audKey2Value;
    return this;
  }

   /**
   * Get audKey2Value
   * @return audKey2Value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudKey2Value() {
    return audKey2Value;
  }


  public void setAudKey2Value(String audKey2Value) {
    
    
    
    this.audKey2Value = audKey2Value;
  }


  public AuditDetails audKey3Value(String audKey3Value) {
    
    
    
    
    this.audKey3Value = audKey3Value;
    return this;
  }

   /**
   * Get audKey3Value
   * @return audKey3Value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudKey3Value() {
    return audKey3Value;
  }


  public void setAudKey3Value(String audKey3Value) {
    
    
    
    this.audKey3Value = audKey3Value;
  }


  public AuditDetails audTableName(String audTableName) {
    
    
    
    
    this.audTableName = audTableName;
    return this;
  }

   /**
   * Get audTableName
   * @return audTableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudTableName() {
    return audTableName;
  }


  public void setAudTableName(String audTableName) {
    
    
    
    this.audTableName = audTableName;
  }


  public AuditDetails audFieldName(String audFieldName) {
    
    
    
    
    this.audFieldName = audFieldName;
    return this;
  }

   /**
   * Get audFieldName
   * @return audFieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudFieldName() {
    return audFieldName;
  }


  public void setAudFieldName(String audFieldName) {
    
    
    
    this.audFieldName = audFieldName;
  }


  public AuditDetails audOldValue(String audOldValue) {
    
    
    
    
    this.audOldValue = audOldValue;
    return this;
  }

   /**
   * Get audOldValue
   * @return audOldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudOldValue() {
    return audOldValue;
  }


  public void setAudOldValue(String audOldValue) {
    
    
    
    this.audOldValue = audOldValue;
  }


  public AuditDetails audNewValue(String audNewValue) {
    
    
    
    
    this.audNewValue = audNewValue;
    return this;
  }

   /**
   * Get audNewValue
   * @return audNewValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudNewValue() {
    return audNewValue;
  }


  public void setAudNewValue(String audNewValue) {
    
    
    
    this.audNewValue = audNewValue;
  }


  public AuditDetails audAction(String audAction) {
    
    
    
    
    this.audAction = audAction;
    return this;
  }

   /**
   * Get audAction
   * @return audAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudAction() {
    return audAction;
  }


  public void setAudAction(String audAction) {
    
    
    
    this.audAction = audAction;
  }


  public AuditDetails audSystemID(String audSystemID) {
    
    
    
    
    this.audSystemID = audSystemID;
    return this;
  }

   /**
   * Get audSystemID
   * @return audSystemID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudSystemID() {
    return audSystemID;
  }


  public void setAudSystemID(String audSystemID) {
    
    
    
    this.audSystemID = audSystemID;
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
   * @return the AuditDetails instance itself
   */
  public AuditDetails putAdditionalProperty(String key, Object value) {
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
    AuditDetails auditDetails = (AuditDetails) o;
    return Objects.equals(this.audDateTime, auditDetails.audDateTime) &&
        Objects.equals(this.audKey1Label, auditDetails.audKey1Label) &&
        Objects.equals(this.audKey2Label, auditDetails.audKey2Label) &&
        Objects.equals(this.audKey3Label, auditDetails.audKey3Label) &&
        Objects.equals(this.audKey1Value, auditDetails.audKey1Value) &&
        Objects.equals(this.audKey2Value, auditDetails.audKey2Value) &&
        Objects.equals(this.audKey3Value, auditDetails.audKey3Value) &&
        Objects.equals(this.audTableName, auditDetails.audTableName) &&
        Objects.equals(this.audFieldName, auditDetails.audFieldName) &&
        Objects.equals(this.audOldValue, auditDetails.audOldValue) &&
        Objects.equals(this.audNewValue, auditDetails.audNewValue) &&
        Objects.equals(this.audAction, auditDetails.audAction) &&
        Objects.equals(this.audSystemID, auditDetails.audSystemID)&&
        Objects.equals(this.additionalProperties, auditDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audDateTime, audKey1Label, audKey2Label, audKey3Label, audKey1Value, audKey2Value, audKey3Value, audTableName, audFieldName, audOldValue, audNewValue, audAction, audSystemID, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDetails {\n");
    sb.append("    audDateTime: ").append(toIndentedString(audDateTime)).append("\n");
    sb.append("    audKey1Label: ").append(toIndentedString(audKey1Label)).append("\n");
    sb.append("    audKey2Label: ").append(toIndentedString(audKey2Label)).append("\n");
    sb.append("    audKey3Label: ").append(toIndentedString(audKey3Label)).append("\n");
    sb.append("    audKey1Value: ").append(toIndentedString(audKey1Value)).append("\n");
    sb.append("    audKey2Value: ").append(toIndentedString(audKey2Value)).append("\n");
    sb.append("    audKey3Value: ").append(toIndentedString(audKey3Value)).append("\n");
    sb.append("    audTableName: ").append(toIndentedString(audTableName)).append("\n");
    sb.append("    audFieldName: ").append(toIndentedString(audFieldName)).append("\n");
    sb.append("    audOldValue: ").append(toIndentedString(audOldValue)).append("\n");
    sb.append("    audNewValue: ").append(toIndentedString(audNewValue)).append("\n");
    sb.append("    audAction: ").append(toIndentedString(audAction)).append("\n");
    sb.append("    audSystemID: ").append(toIndentedString(audSystemID)).append("\n");
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
    openapiFields.add("audDateTime");
    openapiFields.add("audKey1Label");
    openapiFields.add("audKey2Label");
    openapiFields.add("audKey3Label");
    openapiFields.add("audKey1Value");
    openapiFields.add("audKey2Value");
    openapiFields.add("audKey3Value");
    openapiFields.add("audTableName");
    openapiFields.add("audFieldName");
    openapiFields.add("audOldValue");
    openapiFields.add("audNewValue");
    openapiFields.add("audAction");
    openapiFields.add("audSystemID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuditDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuditDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditDetails is not found in the empty JSON string", AuditDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("audKey1Label") != null && !jsonObj.get("audKey1Label").isJsonNull()) && !jsonObj.get("audKey1Label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audKey1Label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audKey1Label").toString()));
      }
      if ((jsonObj.get("audKey2Label") != null && !jsonObj.get("audKey2Label").isJsonNull()) && !jsonObj.get("audKey2Label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audKey2Label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audKey2Label").toString()));
      }
      if ((jsonObj.get("audKey3Label") != null && !jsonObj.get("audKey3Label").isJsonNull()) && !jsonObj.get("audKey3Label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audKey3Label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audKey3Label").toString()));
      }
      if ((jsonObj.get("audKey1Value") != null && !jsonObj.get("audKey1Value").isJsonNull()) && !jsonObj.get("audKey1Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audKey1Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audKey1Value").toString()));
      }
      if ((jsonObj.get("audKey2Value") != null && !jsonObj.get("audKey2Value").isJsonNull()) && !jsonObj.get("audKey2Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audKey2Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audKey2Value").toString()));
      }
      if ((jsonObj.get("audKey3Value") != null && !jsonObj.get("audKey3Value").isJsonNull()) && !jsonObj.get("audKey3Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audKey3Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audKey3Value").toString()));
      }
      if ((jsonObj.get("audTableName") != null && !jsonObj.get("audTableName").isJsonNull()) && !jsonObj.get("audTableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audTableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audTableName").toString()));
      }
      if ((jsonObj.get("audFieldName") != null && !jsonObj.get("audFieldName").isJsonNull()) && !jsonObj.get("audFieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audFieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audFieldName").toString()));
      }
      if ((jsonObj.get("audOldValue") != null && !jsonObj.get("audOldValue").isJsonNull()) && !jsonObj.get("audOldValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audOldValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audOldValue").toString()));
      }
      if ((jsonObj.get("audNewValue") != null && !jsonObj.get("audNewValue").isJsonNull()) && !jsonObj.get("audNewValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audNewValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audNewValue").toString()));
      }
      if ((jsonObj.get("audAction") != null && !jsonObj.get("audAction").isJsonNull()) && !jsonObj.get("audAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audAction").toString()));
      }
      if ((jsonObj.get("audSystemID") != null && !jsonObj.get("audSystemID").isJsonNull()) && !jsonObj.get("audSystemID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audSystemID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audSystemID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditDetails>() {
           @Override
           public void write(JsonWriter out, AuditDetails value) throws IOException {
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
           public AuditDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuditDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuditDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditDetails
  * @throws IOException if the JSON string is invalid with respect to AuditDetails
  */
  public static AuditDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditDetails.class);
  }

 /**
  * Convert an instance of AuditDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

