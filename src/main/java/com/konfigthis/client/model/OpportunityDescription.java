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
import com.konfigthis.client.model.OpportunityDescriptionBrief;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * OpportunityDescription
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OpportunityDescription {
  public static final String SERIALIZED_NAME_BRIEF = "brief";
  @SerializedName(SERIALIZED_NAME_BRIEF)
  private OpportunityDescriptionBrief brief;

  public static final String SERIALIZED_NAME_DETAILED = "detailed";
  @SerializedName(SERIALIZED_NAME_DETAILED)
  private OpportunityDescriptionBrief detailed;

  public static final String SERIALIZED_NAME_EOE_TEXT = "eoe_text";
  @SerializedName(SERIALIZED_NAME_EOE_TEXT)
  private Object eoeText = null;

  public static final String SERIALIZED_NAME_PAY_TRABSPARENCT_TEXT = "pay_trabsparenct_text";
  @SerializedName(SERIALIZED_NAME_PAY_TRABSPARENCT_TEXT)
  private Object payTrabsparenctText = null;

  public OpportunityDescription() {
  }

  public OpportunityDescription brief(OpportunityDescriptionBrief brief) {
    
    
    
    
    this.brief = brief;
    return this;
  }

   /**
   * Get brief
   * @return brief
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpportunityDescriptionBrief getBrief() {
    return brief;
  }


  public void setBrief(OpportunityDescriptionBrief brief) {
    
    
    
    this.brief = brief;
  }


  public OpportunityDescription detailed(OpportunityDescriptionBrief detailed) {
    
    
    
    
    this.detailed = detailed;
    return this;
  }

   /**
   * Get detailed
   * @return detailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpportunityDescriptionBrief getDetailed() {
    return detailed;
  }


  public void setDetailed(OpportunityDescriptionBrief detailed) {
    
    
    
    this.detailed = detailed;
  }


  public OpportunityDescription eoeText(Object eoeText) {
    
    
    
    
    this.eoeText = eoeText;
    return this;
  }

   /**
   * Get eoeText
   * @return eoeText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEoeText() {
    return eoeText;
  }


  public void setEoeText(Object eoeText) {
    
    
    
    this.eoeText = eoeText;
  }


  public OpportunityDescription payTrabsparenctText(Object payTrabsparenctText) {
    
    
    
    
    this.payTrabsparenctText = payTrabsparenctText;
    return this;
  }

   /**
   * Get payTrabsparenctText
   * @return payTrabsparenctText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPayTrabsparenctText() {
    return payTrabsparenctText;
  }


  public void setPayTrabsparenctText(Object payTrabsparenctText) {
    
    
    
    this.payTrabsparenctText = payTrabsparenctText;
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
   * @return the OpportunityDescription instance itself
   */
  public OpportunityDescription putAdditionalProperty(String key, Object value) {
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
    OpportunityDescription opportunityDescription = (OpportunityDescription) o;
    return Objects.equals(this.brief, opportunityDescription.brief) &&
        Objects.equals(this.detailed, opportunityDescription.detailed) &&
        Objects.equals(this.eoeText, opportunityDescription.eoeText) &&
        Objects.equals(this.payTrabsparenctText, opportunityDescription.payTrabsparenctText)&&
        Objects.equals(this.additionalProperties, opportunityDescription.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brief, detailed, eoeText, payTrabsparenctText, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityDescription {\n");
    sb.append("    brief: ").append(toIndentedString(brief)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
    sb.append("    eoeText: ").append(toIndentedString(eoeText)).append("\n");
    sb.append("    payTrabsparenctText: ").append(toIndentedString(payTrabsparenctText)).append("\n");
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
    openapiFields.add("brief");
    openapiFields.add("detailed");
    openapiFields.add("eoe_text");
    openapiFields.add("pay_trabsparenct_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpportunityDescription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OpportunityDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpportunityDescription is not found in the empty JSON string", OpportunityDescription.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `brief`
      if (jsonObj.get("brief") != null && !jsonObj.get("brief").isJsonNull()) {
        OpportunityDescriptionBrief.validateJsonObject(jsonObj.getAsJsonObject("brief"));
      }
      // validate the optional field `detailed`
      if (jsonObj.get("detailed") != null && !jsonObj.get("detailed").isJsonNull()) {
        OpportunityDescriptionBrief.validateJsonObject(jsonObj.getAsJsonObject("detailed"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpportunityDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpportunityDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpportunityDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpportunityDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<OpportunityDescription>() {
           @Override
           public void write(JsonWriter out, OpportunityDescription value) throws IOException {
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
           public OpportunityDescription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OpportunityDescription instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OpportunityDescription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpportunityDescription
  * @throws IOException if the JSON string is invalid with respect to OpportunityDescription
  */
  public static OpportunityDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpportunityDescription.class);
  }

 /**
  * Convert an instance of OpportunityDescription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

