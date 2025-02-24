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
 * UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema() {
  }

  public UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema dataType(String dataType) {
    
    
    
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    
    
    
    this.dataType = dataType;
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
   * @return the UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema instance itself
   */
  public UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema putAdditionalProperty(String key, Object value) {
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
    UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema ultimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema = (UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema) o;
    return Objects.equals(this.name, ultimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.name) &&
        Objects.equals(this.displayName, ultimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.displayName) &&
        Objects.equals(this.dataType, ultimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.dataType)&&
        Objects.equals(this.additionalProperties, ultimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, dataType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("displayName");
    openapiFields.add("dataType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema is not found in the empty JSON string", UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema>() {
           @Override
           public void write(JsonWriter out, UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema value) throws IOException {
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
           public UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema
  * @throws IOException if the JSON string is invalid with respect to UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema
  */
  public static UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.class);
  }

 /**
  * Convert an instance of UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

