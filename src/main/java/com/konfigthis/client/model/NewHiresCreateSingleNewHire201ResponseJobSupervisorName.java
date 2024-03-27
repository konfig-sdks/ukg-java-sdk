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
import com.konfigthis.client.model.NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix;
import com.konfigthis.client.model.NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix;
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
 * Name of the supervisor
 */
@ApiModel(description = "Name of the supervisor")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewHiresCreateSingleNewHire201ResponseJobSupervisorName {
  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix prefix;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private String first;

  public static final String SERIALIZED_NAME_MIDDLE = "middle";
  @SerializedName(SERIALIZED_NAME_MIDDLE)
  private String middle;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private String last;

  public static final String SERIALIZED_NAME_FORMER_LAST = "formerLast";
  @SerializedName(SERIALIZED_NAME_FORMER_LAST)
  private String formerLast;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix suffix;

  public static final String SERIALIZED_NAME_PREFERRED_FIRST = "preferredFirst";
  @SerializedName(SERIALIZED_NAME_PREFERRED_FIRST)
  private String preferredFirst;

  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName() {
  }

  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName prefix(NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix prefix) {
    
    
    
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix getPrefix() {
    return prefix;
  }


  public void setPrefix(NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix prefix) {
    
    
    
    this.prefix = prefix;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName first(String first) {
    
    
    
    
    this.first = first;
    return this;
  }

   /**
   * First name
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Joe", value = "First name")

  public String getFirst() {
    return first;
  }


  public void setFirst(String first) {
    
    
    
    this.first = first;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName middle(String middle) {
    
    
    
    
    this.middle = middle;
    return this;
  }

   /**
   * Middle name
   * @return middle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jose", value = "Middle name")

  public String getMiddle() {
    return middle;
  }


  public void setMiddle(String middle) {
    
    
    
    this.middle = middle;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName last(String last) {
    
    
    
    
    this.last = last;
    return this;
  }

   /**
   * Last name
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Santo", value = "Last name")

  public String getLast() {
    return last;
  }


  public void setLast(String last) {
    
    
    
    this.last = last;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName formerLast(String formerLast) {
    
    
    
    
    this.formerLast = formerLast;
    return this;
  }

   /**
   * Former last name
   * @return formerLast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Former last name")

  public String getFormerLast() {
    return formerLast;
  }


  public void setFormerLast(String formerLast) {
    
    
    
    this.formerLast = formerLast;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName suffix(NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix suffix) {
    
    
    
    
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix getSuffix() {
    return suffix;
  }


  public void setSuffix(NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix suffix) {
    
    
    
    this.suffix = suffix;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName preferredFirst(String preferredFirst) {
    
    
    
    
    this.preferredFirst = preferredFirst;
    return this;
  }

   /**
   * Preferred first name
   * @return preferredFirst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Joseph", value = "Preferred first name")

  public String getPreferredFirst() {
    return preferredFirst;
  }


  public void setPreferredFirst(String preferredFirst) {
    
    
    
    this.preferredFirst = preferredFirst;
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
   * @return the NewHiresCreateSingleNewHire201ResponseJobSupervisorName instance itself
   */
  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName putAdditionalProperty(String key, Object value) {
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
    NewHiresCreateSingleNewHire201ResponseJobSupervisorName newHiresCreateSingleNewHire201ResponseJobSupervisorName = (NewHiresCreateSingleNewHire201ResponseJobSupervisorName) o;
    return Objects.equals(this.prefix, newHiresCreateSingleNewHire201ResponseJobSupervisorName.prefix) &&
        Objects.equals(this.first, newHiresCreateSingleNewHire201ResponseJobSupervisorName.first) &&
        Objects.equals(this.middle, newHiresCreateSingleNewHire201ResponseJobSupervisorName.middle) &&
        Objects.equals(this.last, newHiresCreateSingleNewHire201ResponseJobSupervisorName.last) &&
        Objects.equals(this.formerLast, newHiresCreateSingleNewHire201ResponseJobSupervisorName.formerLast) &&
        Objects.equals(this.suffix, newHiresCreateSingleNewHire201ResponseJobSupervisorName.suffix) &&
        Objects.equals(this.preferredFirst, newHiresCreateSingleNewHire201ResponseJobSupervisorName.preferredFirst)&&
        Objects.equals(this.additionalProperties, newHiresCreateSingleNewHire201ResponseJobSupervisorName.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, first, middle, last, formerLast, suffix, preferredFirst, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewHiresCreateSingleNewHire201ResponseJobSupervisorName {\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    formerLast: ").append(toIndentedString(formerLast)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    preferredFirst: ").append(toIndentedString(preferredFirst)).append("\n");
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
    openapiFields.add("prefix");
    openapiFields.add("first");
    openapiFields.add("middle");
    openapiFields.add("last");
    openapiFields.add("formerLast");
    openapiFields.add("suffix");
    openapiFields.add("preferredFirst");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewHiresCreateSingleNewHire201ResponseJobSupervisorName
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewHiresCreateSingleNewHire201ResponseJobSupervisorName.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewHiresCreateSingleNewHire201ResponseJobSupervisorName is not found in the empty JSON string", NewHiresCreateSingleNewHire201ResponseJobSupervisorName.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `prefix`
      if (jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) {
        NewHiresCreateSingleNewHire201ResponseJobSupervisorNamePrefix.validateJsonObject(jsonObj.getAsJsonObject("prefix"));
      }
      if ((jsonObj.get("first") != null && !jsonObj.get("first").isJsonNull()) && !jsonObj.get("first").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first").toString()));
      }
      if ((jsonObj.get("middle") != null && !jsonObj.get("middle").isJsonNull()) && !jsonObj.get("middle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle").toString()));
      }
      if ((jsonObj.get("last") != null && !jsonObj.get("last").isJsonNull()) && !jsonObj.get("last").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last").toString()));
      }
      if ((jsonObj.get("formerLast") != null && !jsonObj.get("formerLast").isJsonNull()) && !jsonObj.get("formerLast").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formerLast` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formerLast").toString()));
      }
      // validate the optional field `suffix`
      if (jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) {
        NewHiresCreateSingleNewHire201ResponseJobSupervisorNameSuffix.validateJsonObject(jsonObj.getAsJsonObject("suffix"));
      }
      if ((jsonObj.get("preferredFirst") != null && !jsonObj.get("preferredFirst").isJsonNull()) && !jsonObj.get("preferredFirst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredFirst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredFirst").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewHiresCreateSingleNewHire201ResponseJobSupervisorName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewHiresCreateSingleNewHire201ResponseJobSupervisorName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewHiresCreateSingleNewHire201ResponseJobSupervisorName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewHiresCreateSingleNewHire201ResponseJobSupervisorName.class));

       return (TypeAdapter<T>) new TypeAdapter<NewHiresCreateSingleNewHire201ResponseJobSupervisorName>() {
           @Override
           public void write(JsonWriter out, NewHiresCreateSingleNewHire201ResponseJobSupervisorName value) throws IOException {
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
           public NewHiresCreateSingleNewHire201ResponseJobSupervisorName read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewHiresCreateSingleNewHire201ResponseJobSupervisorName instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NewHiresCreateSingleNewHire201ResponseJobSupervisorName given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewHiresCreateSingleNewHire201ResponseJobSupervisorName
  * @throws IOException if the JSON string is invalid with respect to NewHiresCreateSingleNewHire201ResponseJobSupervisorName
  */
  public static NewHiresCreateSingleNewHire201ResponseJobSupervisorName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewHiresCreateSingleNewHire201ResponseJobSupervisorName.class);
  }

 /**
  * Convert an instance of NewHiresCreateSingleNewHire201ResponseJobSupervisorName to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

