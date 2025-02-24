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
import com.konfigthis.client.model.BackgroundChecksApplication;
import com.konfigthis.client.model.BackgroundChecksAuthor;
import com.konfigthis.client.model.BackgroundChecksPackages;
import com.konfigthis.client.model.Links;
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
 * BackgroundChecks
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BackgroundChecks {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private BackgroundChecksAuthor author;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private BackgroundChecksApplication application;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "order_number";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private BackgroundChecksPackages packages;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Links> links = null;

  public BackgroundChecks() {
  }

  public BackgroundChecks author(BackgroundChecksAuthor author) {
    
    
    
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackgroundChecksAuthor getAuthor() {
    return author;
  }


  public void setAuthor(BackgroundChecksAuthor author) {
    
    
    
    this.author = author;
  }


  public BackgroundChecks application(BackgroundChecksApplication application) {
    
    
    
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackgroundChecksApplication getApplication() {
    return application;
  }


  public void setApplication(BackgroundChecksApplication application) {
    
    
    
    this.application = application;
  }


  public BackgroundChecks status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the background check order.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The status of the background check order.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public BackgroundChecks orderNumber(String orderNumber) {
    
    
    
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Thebackground check order number. Maximum of 100 characters.
   * @return orderNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Thebackground check order number. Maximum of 100 characters.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    
    
    
    this.orderNumber = orderNumber;
  }


  public BackgroundChecks packages(BackgroundChecksPackages packages) {
    
    
    
    
    this.packages = packages;
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackgroundChecksPackages getPackages() {
    return packages;
  }


  public void setPackages(BackgroundChecksPackages packages) {
    
    
    
    this.packages = packages;
  }


  public BackgroundChecks links(List<Links> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public BackgroundChecks addLinksItem(Links linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Links> getLinks() {
    return links;
  }


  public void setLinks(List<Links> links) {
    
    
    
    this.links = links;
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
   * @return the BackgroundChecks instance itself
   */
  public BackgroundChecks putAdditionalProperty(String key, Object value) {
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
    BackgroundChecks backgroundChecks = (BackgroundChecks) o;
    return Objects.equals(this.author, backgroundChecks.author) &&
        Objects.equals(this.application, backgroundChecks.application) &&
        Objects.equals(this.status, backgroundChecks.status) &&
        Objects.equals(this.orderNumber, backgroundChecks.orderNumber) &&
        Objects.equals(this.packages, backgroundChecks.packages) &&
        Objects.equals(this.links, backgroundChecks.links)&&
        Objects.equals(this.additionalProperties, backgroundChecks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, application, status, orderNumber, packages, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundChecks {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("author");
    openapiFields.add("application");
    openapiFields.add("status");
    openapiFields.add("order_number");
    openapiFields.add("packages");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("application");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("order_number");
    openapiRequiredFields.add("packages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BackgroundChecks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BackgroundChecks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BackgroundChecks is not found in the empty JSON string", BackgroundChecks.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BackgroundChecks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `author`
      BackgroundChecksAuthor.validateJsonObject(jsonObj.getAsJsonObject("author"));
      // validate the required field `application`
      BackgroundChecksApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("order_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_number").toString()));
      }
      // validate the required field `packages`
      BackgroundChecksPackages.validateJsonObject(jsonObj.getAsJsonObject("packages"));
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Links.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BackgroundChecks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BackgroundChecks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BackgroundChecks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BackgroundChecks.class));

       return (TypeAdapter<T>) new TypeAdapter<BackgroundChecks>() {
           @Override
           public void write(JsonWriter out, BackgroundChecks value) throws IOException {
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
           public BackgroundChecks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BackgroundChecks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BackgroundChecks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BackgroundChecks
  * @throws IOException if the JSON string is invalid with respect to BackgroundChecks
  */
  public static BackgroundChecks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BackgroundChecks.class);
  }

 /**
  * Convert an instance of BackgroundChecks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

