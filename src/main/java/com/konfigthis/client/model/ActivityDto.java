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
 * ActivityDto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ActivityDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ACT_NAME = "actName";
  @SerializedName(SERIALIZED_NAME_ACT_NAME)
  private String actName;

  public static final String SERIALIZED_NAME_ACT_DESC = "actDesc";
  @SerializedName(SERIALIZED_NAME_ACT_DESC)
  private String actDesc;

  public ActivityDto() {
  }

  public ActivityDto id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public ActivityDto actName(String actName) {
    
    
    
    
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


  public ActivityDto actDesc(String actDesc) {
    
    
    
    
    this.actDesc = actDesc;
    return this;
  }

   /**
   * Get actDesc
   * @return actDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActDesc() {
    return actDesc;
  }


  public void setActDesc(String actDesc) {
    
    
    
    this.actDesc = actDesc;
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
   * @return the ActivityDto instance itself
   */
  public ActivityDto putAdditionalProperty(String key, Object value) {
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
    ActivityDto activityDto = (ActivityDto) o;
    return Objects.equals(this.id, activityDto.id) &&
        Objects.equals(this.actName, activityDto.actName) &&
        Objects.equals(this.actDesc, activityDto.actDesc)&&
        Objects.equals(this.additionalProperties, activityDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actName, actDesc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actName: ").append(toIndentedString(actName)).append("\n");
    sb.append("    actDesc: ").append(toIndentedString(actDesc)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("actName");
    openapiFields.add("actDesc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ActivityDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityDto is not found in the empty JSON string", ActivityDto.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("actName") != null && !jsonObj.get("actName").isJsonNull()) && !jsonObj.get("actName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actName").toString()));
      }
      if ((jsonObj.get("actDesc") != null && !jsonObj.get("actDesc").isJsonNull()) && !jsonObj.get("actDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actDesc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityDto>() {
           @Override
           public void write(JsonWriter out, ActivityDto value) throws IOException {
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
           public ActivityDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ActivityDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ActivityDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityDto
  * @throws IOException if the JSON string is invalid with respect to ActivityDto
  */
  public static ActivityDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityDto.class);
  }

 /**
  * Convert an instance of ActivityDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

