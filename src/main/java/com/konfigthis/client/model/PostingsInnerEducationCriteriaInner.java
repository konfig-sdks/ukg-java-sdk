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
import com.konfigthis.client.model.PostingsInnerEducationCriteriaInnerDegree;
import com.konfigthis.client.model.PostingsInnerEducationCriteriaInnerMajor;
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
 * PostingsInnerEducationCriteriaInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PostingsInnerEducationCriteriaInner {
  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_ALLOW_RELATED = "allow_related";
  @SerializedName(SERIALIZED_NAME_ALLOW_RELATED)
  private Boolean allowRelated;

  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private PostingsInnerEducationCriteriaInnerDegree degree;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private PostingsInnerEducationCriteriaInnerMajor major;

  public PostingsInnerEducationCriteriaInner() {
  }

  public PostingsInnerEducationCriteriaInner isRequired(Boolean isRequired) {
    
    
    
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Indicates if this education is required for the job.
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if this education is required for the job.")

  public Boolean getIsRequired() {
    return isRequired;
  }


  public void setIsRequired(Boolean isRequired) {
    
    
    
    this.isRequired = isRequired;
  }


  public PostingsInnerEducationCriteriaInner allowRelated(Boolean allowRelated) {
    
    
    
    
    this.allowRelated = allowRelated;
    return this;
  }

   /**
   * Indicates if similar educations will be considered for this job.
   * @return allowRelated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if similar educations will be considered for this job.")

  public Boolean getAllowRelated() {
    return allowRelated;
  }


  public void setAllowRelated(Boolean allowRelated) {
    
    
    
    this.allowRelated = allowRelated;
  }


  public PostingsInnerEducationCriteriaInner degree(PostingsInnerEducationCriteriaInnerDegree degree) {
    
    
    
    
    this.degree = degree;
    return this;
  }

   /**
   * Get degree
   * @return degree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostingsInnerEducationCriteriaInnerDegree getDegree() {
    return degree;
  }


  public void setDegree(PostingsInnerEducationCriteriaInnerDegree degree) {
    
    
    
    this.degree = degree;
  }


  public PostingsInnerEducationCriteriaInner major(PostingsInnerEducationCriteriaInnerMajor major) {
    
    
    
    
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostingsInnerEducationCriteriaInnerMajor getMajor() {
    return major;
  }


  public void setMajor(PostingsInnerEducationCriteriaInnerMajor major) {
    
    
    
    this.major = major;
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
   * @return the PostingsInnerEducationCriteriaInner instance itself
   */
  public PostingsInnerEducationCriteriaInner putAdditionalProperty(String key, Object value) {
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
    PostingsInnerEducationCriteriaInner postingsInnerEducationCriteriaInner = (PostingsInnerEducationCriteriaInner) o;
    return Objects.equals(this.isRequired, postingsInnerEducationCriteriaInner.isRequired) &&
        Objects.equals(this.allowRelated, postingsInnerEducationCriteriaInner.allowRelated) &&
        Objects.equals(this.degree, postingsInnerEducationCriteriaInner.degree) &&
        Objects.equals(this.major, postingsInnerEducationCriteriaInner.major)&&
        Objects.equals(this.additionalProperties, postingsInnerEducationCriteriaInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRequired, allowRelated, degree, major, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostingsInnerEducationCriteriaInner {\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    allowRelated: ").append(toIndentedString(allowRelated)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
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
    openapiFields.add("is_required");
    openapiFields.add("allow_related");
    openapiFields.add("degree");
    openapiFields.add("major");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostingsInnerEducationCriteriaInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostingsInnerEducationCriteriaInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostingsInnerEducationCriteriaInner is not found in the empty JSON string", PostingsInnerEducationCriteriaInner.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `degree`
      if (jsonObj.get("degree") != null && !jsonObj.get("degree").isJsonNull()) {
        PostingsInnerEducationCriteriaInnerDegree.validateJsonObject(jsonObj.getAsJsonObject("degree"));
      }
      // validate the optional field `major`
      if (jsonObj.get("major") != null && !jsonObj.get("major").isJsonNull()) {
        PostingsInnerEducationCriteriaInnerMajor.validateJsonObject(jsonObj.getAsJsonObject("major"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostingsInnerEducationCriteriaInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostingsInnerEducationCriteriaInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostingsInnerEducationCriteriaInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostingsInnerEducationCriteriaInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PostingsInnerEducationCriteriaInner>() {
           @Override
           public void write(JsonWriter out, PostingsInnerEducationCriteriaInner value) throws IOException {
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
           public PostingsInnerEducationCriteriaInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PostingsInnerEducationCriteriaInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PostingsInnerEducationCriteriaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostingsInnerEducationCriteriaInner
  * @throws IOException if the JSON string is invalid with respect to PostingsInnerEducationCriteriaInner
  */
  public static PostingsInnerEducationCriteriaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostingsInnerEducationCriteriaInner.class);
  }

 /**
  * Convert an instance of PostingsInnerEducationCriteriaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

