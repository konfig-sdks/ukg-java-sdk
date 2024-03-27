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
import com.konfigthis.client.model.Translations;
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
 * PostingsInnerDescription
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PostingsInnerDescription {
  public static final String SERIALIZED_NAME_BRIEF = "brief";
  @SerializedName(SERIALIZED_NAME_BRIEF)
  private Translations brief;

  public static final String SERIALIZED_NAME_DETAILED = "detailed";
  @SerializedName(SERIALIZED_NAME_DETAILED)
  private Translations detailed;

  public static final String SERIALIZED_NAME_FULL_HTML = "full_html";
  @SerializedName(SERIALIZED_NAME_FULL_HTML)
  private Translations fullHtml;

  public static final String SERIALIZED_NAME_EOE_TEXT = "eoe_text";
  @SerializedName(SERIALIZED_NAME_EOE_TEXT)
  private String eoeText;

  public static final String SERIALIZED_NAME_PAY_TRANSPARENCY_TEXT = "pay_transparency_text";
  @SerializedName(SERIALIZED_NAME_PAY_TRANSPARENCY_TEXT)
  private String payTransparencyText;

  public PostingsInnerDescription() {
  }

  public PostingsInnerDescription brief(Translations brief) {
    
    
    
    
    this.brief = brief;
    return this;
  }

   /**
   * Get brief
   * @return brief
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Translations getBrief() {
    return brief;
  }


  public void setBrief(Translations brief) {
    
    
    
    this.brief = brief;
  }


  public PostingsInnerDescription detailed(Translations detailed) {
    
    
    
    
    this.detailed = detailed;
    return this;
  }

   /**
   * Get detailed
   * @return detailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Translations getDetailed() {
    return detailed;
  }


  public void setDetailed(Translations detailed) {
    
    
    
    this.detailed = detailed;
  }


  public PostingsInnerDescription fullHtml(Translations fullHtml) {
    
    
    
    
    this.fullHtml = fullHtml;
    return this;
  }

   /**
   * Get fullHtml
   * @return fullHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Translations getFullHtml() {
    return fullHtml;
  }


  public void setFullHtml(Translations fullHtml) {
    
    
    
    this.fullHtml = fullHtml;
  }


  public PostingsInnerDescription eoeText(String eoeText) {
    
    
    
    
    this.eoeText = eoeText;
    return this;
  }

   /**
   * The Equal Opportunity Employer text. Not empty for US Federal Contractor companies
   * @return eoeText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Equal Opportunity Employer text. Not empty for US Federal Contractor companies")

  public String getEoeText() {
    return eoeText;
  }


  public void setEoeText(String eoeText) {
    
    
    
    this.eoeText = eoeText;
  }


  public PostingsInnerDescription payTransparencyText(String payTransparencyText) {
    
    
    
    
    this.payTransparencyText = payTransparencyText;
    return this;
  }

   /**
   * The Pay Transparency text. Not empty for US Federal Contractor companies
   * @return payTransparencyText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Pay Transparency text. Not empty for US Federal Contractor companies")

  public String getPayTransparencyText() {
    return payTransparencyText;
  }


  public void setPayTransparencyText(String payTransparencyText) {
    
    
    
    this.payTransparencyText = payTransparencyText;
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
   * @return the PostingsInnerDescription instance itself
   */
  public PostingsInnerDescription putAdditionalProperty(String key, Object value) {
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
    PostingsInnerDescription postingsInnerDescription = (PostingsInnerDescription) o;
    return Objects.equals(this.brief, postingsInnerDescription.brief) &&
        Objects.equals(this.detailed, postingsInnerDescription.detailed) &&
        Objects.equals(this.fullHtml, postingsInnerDescription.fullHtml) &&
        Objects.equals(this.eoeText, postingsInnerDescription.eoeText) &&
        Objects.equals(this.payTransparencyText, postingsInnerDescription.payTransparencyText)&&
        Objects.equals(this.additionalProperties, postingsInnerDescription.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brief, detailed, fullHtml, eoeText, payTransparencyText, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostingsInnerDescription {\n");
    sb.append("    brief: ").append(toIndentedString(brief)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
    sb.append("    fullHtml: ").append(toIndentedString(fullHtml)).append("\n");
    sb.append("    eoeText: ").append(toIndentedString(eoeText)).append("\n");
    sb.append("    payTransparencyText: ").append(toIndentedString(payTransparencyText)).append("\n");
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
    openapiFields.add("full_html");
    openapiFields.add("eoe_text");
    openapiFields.add("pay_transparency_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostingsInnerDescription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostingsInnerDescription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostingsInnerDescription is not found in the empty JSON string", PostingsInnerDescription.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `brief`
      if (jsonObj.get("brief") != null && !jsonObj.get("brief").isJsonNull()) {
        Translations.validateJsonObject(jsonObj.getAsJsonObject("brief"));
      }
      // validate the optional field `detailed`
      if (jsonObj.get("detailed") != null && !jsonObj.get("detailed").isJsonNull()) {
        Translations.validateJsonObject(jsonObj.getAsJsonObject("detailed"));
      }
      // validate the optional field `full_html`
      if (jsonObj.get("full_html") != null && !jsonObj.get("full_html").isJsonNull()) {
        Translations.validateJsonObject(jsonObj.getAsJsonObject("full_html"));
      }
      if ((jsonObj.get("eoe_text") != null && !jsonObj.get("eoe_text").isJsonNull()) && !jsonObj.get("eoe_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eoe_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eoe_text").toString()));
      }
      if ((jsonObj.get("pay_transparency_text") != null && !jsonObj.get("pay_transparency_text").isJsonNull()) && !jsonObj.get("pay_transparency_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_transparency_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_transparency_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostingsInnerDescription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostingsInnerDescription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostingsInnerDescription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostingsInnerDescription.class));

       return (TypeAdapter<T>) new TypeAdapter<PostingsInnerDescription>() {
           @Override
           public void write(JsonWriter out, PostingsInnerDescription value) throws IOException {
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
           public PostingsInnerDescription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PostingsInnerDescription instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PostingsInnerDescription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostingsInnerDescription
  * @throws IOException if the JSON string is invalid with respect to PostingsInnerDescription
  */
  public static PostingsInnerDescription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostingsInnerDescription.class);
  }

 /**
  * Convert an instance of PostingsInnerDescription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

