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
import com.konfigthis.client.model.TimeCodeDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ResultDtoTimeCodeDto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ResultDtoTimeCodeDto {
  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<TimeCodeDto> entities = null;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_REQUESTED_COUNT = "requestedCount";
  @SerializedName(SERIALIZED_NAME_REQUESTED_COUNT)
  private Integer requestedCount;

  public ResultDtoTimeCodeDto() {
  }

  public ResultDtoTimeCodeDto entities(List<TimeCodeDto> entities) {
    
    
    
    
    this.entities = entities;
    return this;
  }

  public ResultDtoTimeCodeDto addEntitiesItem(TimeCodeDto entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimeCodeDto> getEntities() {
    return entities;
  }


  public void setEntities(List<TimeCodeDto> entities) {
    
    
    
    this.entities = entities;
  }


  public ResultDtoTimeCodeDto index(Integer index) {
    
    
    
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    
    
    
    this.index = index;
  }


  public ResultDtoTimeCodeDto requestedCount(Integer requestedCount) {
    
    
    
    
    this.requestedCount = requestedCount;
    return this;
  }

   /**
   * Get requestedCount
   * @return requestedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRequestedCount() {
    return requestedCount;
  }


  public void setRequestedCount(Integer requestedCount) {
    
    
    
    this.requestedCount = requestedCount;
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
   * @return the ResultDtoTimeCodeDto instance itself
   */
  public ResultDtoTimeCodeDto putAdditionalProperty(String key, Object value) {
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
    ResultDtoTimeCodeDto resultDtoTimeCodeDto = (ResultDtoTimeCodeDto) o;
    return Objects.equals(this.entities, resultDtoTimeCodeDto.entities) &&
        Objects.equals(this.index, resultDtoTimeCodeDto.index) &&
        Objects.equals(this.requestedCount, resultDtoTimeCodeDto.requestedCount)&&
        Objects.equals(this.additionalProperties, resultDtoTimeCodeDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, index, requestedCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultDtoTimeCodeDto {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    requestedCount: ").append(toIndentedString(requestedCount)).append("\n");
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
    openapiFields.add("entities");
    openapiFields.add("index");
    openapiFields.add("requestedCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResultDtoTimeCodeDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResultDtoTimeCodeDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResultDtoTimeCodeDto is not found in the empty JSON string", ResultDtoTimeCodeDto.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("entities") != null && !jsonObj.get("entities").isJsonNull()) {
        JsonArray jsonArrayentities = jsonObj.getAsJsonArray("entities");
        if (jsonArrayentities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entities` to be an array in the JSON string but got `%s`", jsonObj.get("entities").toString()));
          }

          // validate the optional field `entities` (array)
          for (int i = 0; i < jsonArrayentities.size(); i++) {
            TimeCodeDto.validateJsonObject(jsonArrayentities.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResultDtoTimeCodeDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResultDtoTimeCodeDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResultDtoTimeCodeDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResultDtoTimeCodeDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ResultDtoTimeCodeDto>() {
           @Override
           public void write(JsonWriter out, ResultDtoTimeCodeDto value) throws IOException {
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
           public ResultDtoTimeCodeDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ResultDtoTimeCodeDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ResultDtoTimeCodeDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResultDtoTimeCodeDto
  * @throws IOException if the JSON string is invalid with respect to ResultDtoTimeCodeDto
  */
  public static ResultDtoTimeCodeDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResultDtoTimeCodeDto.class);
  }

 /**
  * Convert an instance of ResultDtoTimeCodeDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

