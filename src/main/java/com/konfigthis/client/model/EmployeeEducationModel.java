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
import java.time.OffsetDateTime;

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
 * EmployeeEducationModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeEducationModel {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_SYSTEM_ID = "systemId";
  @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
  private String systemId;

  public static final String SERIALIZED_NAME_SCHOOL = "school";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private String school;

  public static final String SERIALIZED_NAME_EDUCATION_LEVEL = "educationLevel";
  @SerializedName(SERIALIZED_NAME_EDUCATION_LEVEL)
  private String educationLevel;

  public static final String SERIALIZED_NAME_EDUCATION_MAJOR = "educationMajor";
  @SerializedName(SERIALIZED_NAME_EDUCATION_MAJOR)
  private String educationMajor;

  public static final String SERIALIZED_NAME_EDUCATION_MINOR = "educationMinor";
  @SerializedName(SERIALIZED_NAME_EDUCATION_MINOR)
  private String educationMinor;

  public static final String SERIALIZED_NAME_GPA = "gpa";
  @SerializedName(SERIALIZED_NAME_GPA)
  private String gpa;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private OffsetDateTime beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_IS_GRADUATE = "isGraduate";
  @SerializedName(SERIALIZED_NAME_IS_GRADUATE)
  private Boolean isGraduate;

  public static final String SERIALIZED_NAME_IS_HIGHEST_LEVEL = "isHighestLevel";
  @SerializedName(SERIALIZED_NAME_IS_HIGHEST_LEVEL)
  private Boolean isHighestLevel;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public EmployeeEducationModel() {
  }

  public EmployeeEducationModel employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public EmployeeEducationModel systemId(String systemId) {
    
    
    
    
    this.systemId = systemId;
    return this;
  }

   /**
   * Get systemId
   * @return systemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSystemId() {
    return systemId;
  }


  public void setSystemId(String systemId) {
    
    
    
    this.systemId = systemId;
  }


  public EmployeeEducationModel school(String school) {
    
    
    
    
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchool() {
    return school;
  }


  public void setSchool(String school) {
    
    
    
    this.school = school;
  }


  public EmployeeEducationModel educationLevel(String educationLevel) {
    
    
    
    
    this.educationLevel = educationLevel;
    return this;
  }

   /**
   * Get educationLevel
   * @return educationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEducationLevel() {
    return educationLevel;
  }


  public void setEducationLevel(String educationLevel) {
    
    
    
    this.educationLevel = educationLevel;
  }


  public EmployeeEducationModel educationMajor(String educationMajor) {
    
    
    
    
    this.educationMajor = educationMajor;
    return this;
  }

   /**
   * Get educationMajor
   * @return educationMajor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEducationMajor() {
    return educationMajor;
  }


  public void setEducationMajor(String educationMajor) {
    
    
    
    this.educationMajor = educationMajor;
  }


  public EmployeeEducationModel educationMinor(String educationMinor) {
    
    
    
    
    this.educationMinor = educationMinor;
    return this;
  }

   /**
   * Get educationMinor
   * @return educationMinor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEducationMinor() {
    return educationMinor;
  }


  public void setEducationMinor(String educationMinor) {
    
    
    
    this.educationMinor = educationMinor;
  }


  public EmployeeEducationModel gpa(String gpa) {
    
    
    
    
    this.gpa = gpa;
    return this;
  }

   /**
   * Get gpa
   * @return gpa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGpa() {
    return gpa;
  }


  public void setGpa(String gpa) {
    
    
    
    this.gpa = gpa;
  }


  public EmployeeEducationModel beginDate(OffsetDateTime beginDate) {
    
    
    
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Get beginDate
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(OffsetDateTime beginDate) {
    
    
    
    this.beginDate = beginDate;
  }


  public EmployeeEducationModel endDate(OffsetDateTime endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    
    
    
    this.endDate = endDate;
  }


  public EmployeeEducationModel isGraduate(Boolean isGraduate) {
    
    
    
    
    this.isGraduate = isGraduate;
    return this;
  }

   /**
   * Get isGraduate
   * @return isGraduate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsGraduate() {
    return isGraduate;
  }


  public void setIsGraduate(Boolean isGraduate) {
    
    
    
    this.isGraduate = isGraduate;
  }


  public EmployeeEducationModel isHighestLevel(Boolean isHighestLevel) {
    
    
    
    
    this.isHighestLevel = isHighestLevel;
    return this;
  }

   /**
   * Get isHighestLevel
   * @return isHighestLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsHighestLevel() {
    return isHighestLevel;
  }


  public void setIsHighestLevel(Boolean isHighestLevel) {
    
    
    
    this.isHighestLevel = isHighestLevel;
  }


  public EmployeeEducationModel employeeNumber(String employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Get employeeNumber
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public EmployeeEducationModel country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
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
   * @return the EmployeeEducationModel instance itself
   */
  public EmployeeEducationModel putAdditionalProperty(String key, Object value) {
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
    EmployeeEducationModel employeeEducationModel = (EmployeeEducationModel) o;
    return Objects.equals(this.employeeId, employeeEducationModel.employeeId) &&
        Objects.equals(this.systemId, employeeEducationModel.systemId) &&
        Objects.equals(this.school, employeeEducationModel.school) &&
        Objects.equals(this.educationLevel, employeeEducationModel.educationLevel) &&
        Objects.equals(this.educationMajor, employeeEducationModel.educationMajor) &&
        Objects.equals(this.educationMinor, employeeEducationModel.educationMinor) &&
        Objects.equals(this.gpa, employeeEducationModel.gpa) &&
        Objects.equals(this.beginDate, employeeEducationModel.beginDate) &&
        Objects.equals(this.endDate, employeeEducationModel.endDate) &&
        Objects.equals(this.isGraduate, employeeEducationModel.isGraduate) &&
        Objects.equals(this.isHighestLevel, employeeEducationModel.isHighestLevel) &&
        Objects.equals(this.employeeNumber, employeeEducationModel.employeeNumber) &&
        Objects.equals(this.country, employeeEducationModel.country)&&
        Objects.equals(this.additionalProperties, employeeEducationModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, systemId, school, educationLevel, educationMajor, educationMinor, gpa, beginDate, endDate, isGraduate, isHighestLevel, employeeNumber, country, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeEducationModel {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    educationMajor: ").append(toIndentedString(educationMajor)).append("\n");
    sb.append("    educationMinor: ").append(toIndentedString(educationMinor)).append("\n");
    sb.append("    gpa: ").append(toIndentedString(gpa)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isGraduate: ").append(toIndentedString(isGraduate)).append("\n");
    sb.append("    isHighestLevel: ").append(toIndentedString(isHighestLevel)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("systemId");
    openapiFields.add("school");
    openapiFields.add("educationLevel");
    openapiFields.add("educationMajor");
    openapiFields.add("educationMinor");
    openapiFields.add("gpa");
    openapiFields.add("beginDate");
    openapiFields.add("endDate");
    openapiFields.add("isGraduate");
    openapiFields.add("isHighestLevel");
    openapiFields.add("employeeNumber");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeEducationModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeEducationModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeEducationModel is not found in the empty JSON string", EmployeeEducationModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("systemId") != null && !jsonObj.get("systemId").isJsonNull()) && !jsonObj.get("systemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemId").toString()));
      }
      if ((jsonObj.get("school") != null && !jsonObj.get("school").isJsonNull()) && !jsonObj.get("school").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school").toString()));
      }
      if ((jsonObj.get("educationLevel") != null && !jsonObj.get("educationLevel").isJsonNull()) && !jsonObj.get("educationLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `educationLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("educationLevel").toString()));
      }
      if ((jsonObj.get("educationMajor") != null && !jsonObj.get("educationMajor").isJsonNull()) && !jsonObj.get("educationMajor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `educationMajor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("educationMajor").toString()));
      }
      if ((jsonObj.get("educationMinor") != null && !jsonObj.get("educationMinor").isJsonNull()) && !jsonObj.get("educationMinor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `educationMinor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("educationMinor").toString()));
      }
      if ((jsonObj.get("gpa") != null && !jsonObj.get("gpa").isJsonNull()) && !jsonObj.get("gpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpa").toString()));
      }
      if ((jsonObj.get("employeeNumber") != null && !jsonObj.get("employeeNumber").isJsonNull()) && !jsonObj.get("employeeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeNumber").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeEducationModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeEducationModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeEducationModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeEducationModel.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeEducationModel>() {
           @Override
           public void write(JsonWriter out, EmployeeEducationModel value) throws IOException {
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
           public EmployeeEducationModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeEducationModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeEducationModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeEducationModel
  * @throws IOException if the JSON string is invalid with respect to EmployeeEducationModel
  */
  public static EmployeeEducationModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeEducationModel.class);
  }

 /**
  * Convert an instance of EmployeeEducationModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

