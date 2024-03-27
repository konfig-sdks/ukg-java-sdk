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
 * ScheduleDetailDto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScheduleDetailDto {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_EMP_NAME = "empName";
  @SerializedName(SERIALIZED_NAME_EMP_NAME)
  private String empName;

  public static final String SERIALIZED_NAME_SKD_DATE = "skdDate";
  @SerializedName(SERIALIZED_NAME_SKD_DATE)
  private OffsetDateTime skdDate;

  public static final String SERIALIZED_NAME_SKD_START_TIME = "skdStartTime";
  @SerializedName(SERIALIZED_NAME_SKD_START_TIME)
  private OffsetDateTime skdStartTime;

  public static final String SERIALIZED_NAME_SKD_END_TIME = "skdEndTime";
  @SerializedName(SERIALIZED_NAME_SKD_END_TIME)
  private OffsetDateTime skdEndTime;

  public static final String SERIALIZED_NAME_WBT_NAME = "wbtName";
  @SerializedName(SERIALIZED_NAME_WBT_NAME)
  private String wbtName;

  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_TCODE_NAME = "tcodeName";
  @SerializedName(SERIALIZED_NAME_TCODE_NAME)
  private String tcodeName;

  public static final String SERIALIZED_NAME_HTYPE_NAME = "htypeName";
  @SerializedName(SERIALIZED_NAME_HTYPE_NAME)
  private String htypeName;

  public static final String SERIALIZED_NAME_ACT_NAME = "actName";
  @SerializedName(SERIALIZED_NAME_ACT_NAME)
  private String actName;

  public ScheduleDetailDto() {
  }

  public ScheduleDetailDto operation(String operation) {
    
    
    
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    
    
    
    this.operation = operation;
  }


  public ScheduleDetailDto empName(String empName) {
    
    
    
    
    this.empName = empName;
    return this;
  }

   /**
   * Get empName
   * @return empName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmpName() {
    return empName;
  }


  public void setEmpName(String empName) {
    
    
    
    this.empName = empName;
  }


  public ScheduleDetailDto skdDate(OffsetDateTime skdDate) {
    
    
    
    
    this.skdDate = skdDate;
    return this;
  }

   /**
   * Get skdDate
   * @return skdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSkdDate() {
    return skdDate;
  }


  public void setSkdDate(OffsetDateTime skdDate) {
    
    
    
    this.skdDate = skdDate;
  }


  public ScheduleDetailDto skdStartTime(OffsetDateTime skdStartTime) {
    
    
    
    
    this.skdStartTime = skdStartTime;
    return this;
  }

   /**
   * Get skdStartTime
   * @return skdStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSkdStartTime() {
    return skdStartTime;
  }


  public void setSkdStartTime(OffsetDateTime skdStartTime) {
    
    
    
    this.skdStartTime = skdStartTime;
  }


  public ScheduleDetailDto skdEndTime(OffsetDateTime skdEndTime) {
    
    
    
    
    this.skdEndTime = skdEndTime;
    return this;
  }

   /**
   * Get skdEndTime
   * @return skdEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSkdEndTime() {
    return skdEndTime;
  }


  public void setSkdEndTime(OffsetDateTime skdEndTime) {
    
    
    
    this.skdEndTime = skdEndTime;
  }


  public ScheduleDetailDto wbtName(String wbtName) {
    
    
    
    
    this.wbtName = wbtName;
    return this;
  }

   /**
   * Get wbtName
   * @return wbtName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWbtName() {
    return wbtName;
  }


  public void setWbtName(String wbtName) {
    
    
    
    this.wbtName = wbtName;
  }


  public ScheduleDetailDto jobName(String jobName) {
    
    
    
    
    this.jobName = jobName;
    return this;
  }

   /**
   * Get jobName
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    
    
    
    this.jobName = jobName;
  }


  public ScheduleDetailDto tcodeName(String tcodeName) {
    
    
    
    
    this.tcodeName = tcodeName;
    return this;
  }

   /**
   * Get tcodeName
   * @return tcodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTcodeName() {
    return tcodeName;
  }


  public void setTcodeName(String tcodeName) {
    
    
    
    this.tcodeName = tcodeName;
  }


  public ScheduleDetailDto htypeName(String htypeName) {
    
    
    
    
    this.htypeName = htypeName;
    return this;
  }

   /**
   * Get htypeName
   * @return htypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHtypeName() {
    return htypeName;
  }


  public void setHtypeName(String htypeName) {
    
    
    
    this.htypeName = htypeName;
  }


  public ScheduleDetailDto actName(String actName) {
    
    
    
    
    this.actName = actName;
    return this;
  }

   /**
   * Get actName
   * @return actName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActName() {
    return actName;
  }


  public void setActName(String actName) {
    
    
    
    this.actName = actName;
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
   * @return the ScheduleDetailDto instance itself
   */
  public ScheduleDetailDto putAdditionalProperty(String key, Object value) {
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
    ScheduleDetailDto scheduleDetailDto = (ScheduleDetailDto) o;
    return Objects.equals(this.operation, scheduleDetailDto.operation) &&
        Objects.equals(this.empName, scheduleDetailDto.empName) &&
        Objects.equals(this.skdDate, scheduleDetailDto.skdDate) &&
        Objects.equals(this.skdStartTime, scheduleDetailDto.skdStartTime) &&
        Objects.equals(this.skdEndTime, scheduleDetailDto.skdEndTime) &&
        Objects.equals(this.wbtName, scheduleDetailDto.wbtName) &&
        Objects.equals(this.jobName, scheduleDetailDto.jobName) &&
        Objects.equals(this.tcodeName, scheduleDetailDto.tcodeName) &&
        Objects.equals(this.htypeName, scheduleDetailDto.htypeName) &&
        Objects.equals(this.actName, scheduleDetailDto.actName)&&
        Objects.equals(this.additionalProperties, scheduleDetailDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, empName, skdDate, skdStartTime, skdEndTime, wbtName, jobName, tcodeName, htypeName, actName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDetailDto {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    empName: ").append(toIndentedString(empName)).append("\n");
    sb.append("    skdDate: ").append(toIndentedString(skdDate)).append("\n");
    sb.append("    skdStartTime: ").append(toIndentedString(skdStartTime)).append("\n");
    sb.append("    skdEndTime: ").append(toIndentedString(skdEndTime)).append("\n");
    sb.append("    wbtName: ").append(toIndentedString(wbtName)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    tcodeName: ").append(toIndentedString(tcodeName)).append("\n");
    sb.append("    htypeName: ").append(toIndentedString(htypeName)).append("\n");
    sb.append("    actName: ").append(toIndentedString(actName)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("empName");
    openapiFields.add("skdDate");
    openapiFields.add("skdStartTime");
    openapiFields.add("skdEndTime");
    openapiFields.add("wbtName");
    openapiFields.add("jobName");
    openapiFields.add("tcodeName");
    openapiFields.add("htypeName");
    openapiFields.add("actName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduleDetailDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScheduleDetailDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduleDetailDto is not found in the empty JSON string", ScheduleDetailDto.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("empName") != null && !jsonObj.get("empName").isJsonNull()) && !jsonObj.get("empName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `empName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("empName").toString()));
      }
      if ((jsonObj.get("wbtName") != null && !jsonObj.get("wbtName").isJsonNull()) && !jsonObj.get("wbtName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wbtName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wbtName").toString()));
      }
      if ((jsonObj.get("jobName") != null && !jsonObj.get("jobName").isJsonNull()) && !jsonObj.get("jobName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobName").toString()));
      }
      if ((jsonObj.get("tcodeName") != null && !jsonObj.get("tcodeName").isJsonNull()) && !jsonObj.get("tcodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tcodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tcodeName").toString()));
      }
      if ((jsonObj.get("htypeName") != null && !jsonObj.get("htypeName").isJsonNull()) && !jsonObj.get("htypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `htypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("htypeName").toString()));
      }
      if ((jsonObj.get("actName") != null && !jsonObj.get("actName").isJsonNull()) && !jsonObj.get("actName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduleDetailDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduleDetailDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduleDetailDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduleDetailDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduleDetailDto>() {
           @Override
           public void write(JsonWriter out, ScheduleDetailDto value) throws IOException {
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
           public ScheduleDetailDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScheduleDetailDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScheduleDetailDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduleDetailDto
  * @throws IOException if the JSON string is invalid with respect to ScheduleDetailDto
  */
  public static ScheduleDetailDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduleDetailDto.class);
  }

 /**
  * Convert an instance of ScheduleDetailDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

