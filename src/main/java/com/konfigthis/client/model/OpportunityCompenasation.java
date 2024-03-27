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
import com.konfigthis.client.model.OpportunityCompenasationCurrency;
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
 * OpportunityCompenasation
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OpportunityCompenasation {
  public static final String SERIALIZED_NAME_IS_FULLTIME = "is_fulltime";
  @SerializedName(SERIALIZED_NAME_IS_FULLTIME)
  private Boolean isFulltime;

  public static final String SERIALIZED_NAME_IS_SALARIED = "is_salaried";
  @SerializedName(SERIALIZED_NAME_IS_SALARIED)
  private Boolean isSalaried;

  public static final String SERIALIZED_NAME_PAY_RATE = "pay_rate";
  @SerializedName(SERIALIZED_NAME_PAY_RATE)
  private Double payRate;

  public static final String SERIALIZED_NAME_SHOWN = "shown";
  @SerializedName(SERIALIZED_NAME_SHOWN)
  private String shown;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private OpportunityCompenasationCurrency currency;

  public OpportunityCompenasation() {
  }

  public OpportunityCompenasation isFulltime(Boolean isFulltime) {
    
    
    
    
    this.isFulltime = isFulltime;
    return this;
  }

   /**
   * Get isFulltime
   * @return isFulltime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsFulltime() {
    return isFulltime;
  }


  public void setIsFulltime(Boolean isFulltime) {
    
    
    
    this.isFulltime = isFulltime;
  }


  public OpportunityCompenasation isSalaried(Boolean isSalaried) {
    
    
    
    
    this.isSalaried = isSalaried;
    return this;
  }

   /**
   * Get isSalaried
   * @return isSalaried
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSalaried() {
    return isSalaried;
  }


  public void setIsSalaried(Boolean isSalaried) {
    
    
    
    this.isSalaried = isSalaried;
  }


  public OpportunityCompenasation payRate(Double payRate) {
    
    
    
    
    this.payRate = payRate;
    return this;
  }

  public OpportunityCompenasation payRate(Integer payRate) {
    
    
    
    
    this.payRate = payRate.doubleValue();
    return this;
  }

   /**
   * Get payRate
   * @return payRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPayRate() {
    return payRate;
  }


  public void setPayRate(Double payRate) {
    
    
    
    this.payRate = payRate;
  }


  public OpportunityCompenasation shown(String shown) {
    
    
    
    
    this.shown = shown;
    return this;
  }

   /**
   * Get shown
   * @return shown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShown() {
    return shown;
  }


  public void setShown(String shown) {
    
    
    
    this.shown = shown;
  }


  public OpportunityCompenasation currency(OpportunityCompenasationCurrency currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpportunityCompenasationCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(OpportunityCompenasationCurrency currency) {
    
    
    
    this.currency = currency;
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
   * @return the OpportunityCompenasation instance itself
   */
  public OpportunityCompenasation putAdditionalProperty(String key, Object value) {
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
    OpportunityCompenasation opportunityCompenasation = (OpportunityCompenasation) o;
    return Objects.equals(this.isFulltime, opportunityCompenasation.isFulltime) &&
        Objects.equals(this.isSalaried, opportunityCompenasation.isSalaried) &&
        Objects.equals(this.payRate, opportunityCompenasation.payRate) &&
        Objects.equals(this.shown, opportunityCompenasation.shown) &&
        Objects.equals(this.currency, opportunityCompenasation.currency)&&
        Objects.equals(this.additionalProperties, opportunityCompenasation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFulltime, isSalaried, payRate, shown, currency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityCompenasation {\n");
    sb.append("    isFulltime: ").append(toIndentedString(isFulltime)).append("\n");
    sb.append("    isSalaried: ").append(toIndentedString(isSalaried)).append("\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
    sb.append("    shown: ").append(toIndentedString(shown)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("is_fulltime");
    openapiFields.add("is_salaried");
    openapiFields.add("pay_rate");
    openapiFields.add("shown");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpportunityCompenasation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OpportunityCompenasation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpportunityCompenasation is not found in the empty JSON string", OpportunityCompenasation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("shown") != null && !jsonObj.get("shown").isJsonNull()) && !jsonObj.get("shown").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shown` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shown").toString()));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        OpportunityCompenasationCurrency.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpportunityCompenasation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpportunityCompenasation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpportunityCompenasation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpportunityCompenasation.class));

       return (TypeAdapter<T>) new TypeAdapter<OpportunityCompenasation>() {
           @Override
           public void write(JsonWriter out, OpportunityCompenasation value) throws IOException {
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
           public OpportunityCompenasation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OpportunityCompenasation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OpportunityCompenasation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpportunityCompenasation
  * @throws IOException if the JSON string is invalid with respect to OpportunityCompenasation
  */
  public static OpportunityCompenasation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpportunityCompenasation.class);
  }

 /**
  * Convert an instance of OpportunityCompenasation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

