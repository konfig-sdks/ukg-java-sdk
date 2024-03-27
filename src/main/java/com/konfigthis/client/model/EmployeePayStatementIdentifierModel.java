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
 * EmployeePayStatementIdentifierModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeePayStatementIdentifierModel {
  public static final String SERIALIZED_NAME_IDENTIFICATIONTYPE = "identificationtype";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATIONTYPE)
  private String identificationtype;

  public static final String SERIALIZED_NAME_COMPANYIDENTIFIER = "companyidentifier";
  @SerializedName(SERIALIZED_NAME_COMPANYIDENTIFIER)
  private String companyidentifier;

  public static final String SERIALIZED_NAME_EMPLOYEEIDENTIFIER = "employeeidentifier";
  @SerializedName(SERIALIZED_NAME_EMPLOYEEIDENTIFIER)
  private String employeeidentifier;

  public EmployeePayStatementIdentifierModel() {
  }

  public EmployeePayStatementIdentifierModel identificationtype(String identificationtype) {
    
    
    
    
    this.identificationtype = identificationtype;
    return this;
  }

   /**
   * Get identificationtype
   * @return identificationtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentificationtype() {
    return identificationtype;
  }


  public void setIdentificationtype(String identificationtype) {
    
    
    
    this.identificationtype = identificationtype;
  }


  public EmployeePayStatementIdentifierModel companyidentifier(String companyidentifier) {
    
    
    
    
    this.companyidentifier = companyidentifier;
    return this;
  }

   /**
   * Get companyidentifier
   * @return companyidentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyidentifier() {
    return companyidentifier;
  }


  public void setCompanyidentifier(String companyidentifier) {
    
    
    
    this.companyidentifier = companyidentifier;
  }


  public EmployeePayStatementIdentifierModel employeeidentifier(String employeeidentifier) {
    
    
    
    
    this.employeeidentifier = employeeidentifier;
    return this;
  }

   /**
   * Get employeeidentifier
   * @return employeeidentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeidentifier() {
    return employeeidentifier;
  }


  public void setEmployeeidentifier(String employeeidentifier) {
    
    
    
    this.employeeidentifier = employeeidentifier;
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
   * @return the EmployeePayStatementIdentifierModel instance itself
   */
  public EmployeePayStatementIdentifierModel putAdditionalProperty(String key, Object value) {
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
    EmployeePayStatementIdentifierModel employeePayStatementIdentifierModel = (EmployeePayStatementIdentifierModel) o;
    return Objects.equals(this.identificationtype, employeePayStatementIdentifierModel.identificationtype) &&
        Objects.equals(this.companyidentifier, employeePayStatementIdentifierModel.companyidentifier) &&
        Objects.equals(this.employeeidentifier, employeePayStatementIdentifierModel.employeeidentifier)&&
        Objects.equals(this.additionalProperties, employeePayStatementIdentifierModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationtype, companyidentifier, employeeidentifier, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayStatementIdentifierModel {\n");
    sb.append("    identificationtype: ").append(toIndentedString(identificationtype)).append("\n");
    sb.append("    companyidentifier: ").append(toIndentedString(companyidentifier)).append("\n");
    sb.append("    employeeidentifier: ").append(toIndentedString(employeeidentifier)).append("\n");
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
    openapiFields.add("identificationtype");
    openapiFields.add("companyidentifier");
    openapiFields.add("employeeidentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeePayStatementIdentifierModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeePayStatementIdentifierModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeePayStatementIdentifierModel is not found in the empty JSON string", EmployeePayStatementIdentifierModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("identificationtype") != null && !jsonObj.get("identificationtype").isJsonNull()) && !jsonObj.get("identificationtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identificationtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identificationtype").toString()));
      }
      if ((jsonObj.get("companyidentifier") != null && !jsonObj.get("companyidentifier").isJsonNull()) && !jsonObj.get("companyidentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyidentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyidentifier").toString()));
      }
      if ((jsonObj.get("employeeidentifier") != null && !jsonObj.get("employeeidentifier").isJsonNull()) && !jsonObj.get("employeeidentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeidentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeidentifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeePayStatementIdentifierModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeePayStatementIdentifierModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeePayStatementIdentifierModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeePayStatementIdentifierModel.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeePayStatementIdentifierModel>() {
           @Override
           public void write(JsonWriter out, EmployeePayStatementIdentifierModel value) throws IOException {
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
           public EmployeePayStatementIdentifierModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeePayStatementIdentifierModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeePayStatementIdentifierModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeePayStatementIdentifierModel
  * @throws IOException if the JSON string is invalid with respect to EmployeePayStatementIdentifierModel
  */
  public static EmployeePayStatementIdentifierModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeePayStatementIdentifierModel.class);
  }

 /**
  * Convert an instance of EmployeePayStatementIdentifierModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

