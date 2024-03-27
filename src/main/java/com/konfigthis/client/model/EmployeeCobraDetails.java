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
 * EmployeeCobraDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeCobraDetails {
  public static final String SERIALIZED_NAME_PERSON_I_D = "personID";
  @SerializedName(SERIALIZED_NAME_PERSON_I_D)
  private String personID;

  public static final String SERIALIZED_NAME_EMPLOYEE_I_D = "employeeID";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_I_D)
  private String employeeID;

  public static final String SERIALIZED_NAME_COMPANY_I_D = "companyID";
  @SerializedName(SERIALIZED_NAME_COMPANY_I_D)
  private String companyID;

  public static final String SERIALIZED_NAME_COBRA_EXPORT = "cobraExport";
  @SerializedName(SERIALIZED_NAME_COBRA_EXPORT)
  private String cobraExport;

  public static final String SERIALIZED_NAME_COBRA_IS_ACTIVE = "cobraIsActive";
  @SerializedName(SERIALIZED_NAME_COBRA_IS_ACTIVE)
  private Boolean cobraIsActive;

  public static final String SERIALIZED_NAME_COBRA_NOTES = "cobraNotes";
  @SerializedName(SERIALIZED_NAME_COBRA_NOTES)
  private String cobraNotes;

  public static final String SERIALIZED_NAME_COBRA_REASON = "cobraReason";
  @SerializedName(SERIALIZED_NAME_COBRA_REASON)
  private String cobraReason;

  public static final String SERIALIZED_NAME_COBRA_STATUS = "cobraStatus";
  @SerializedName(SERIALIZED_NAME_COBRA_STATUS)
  private String cobraStatus;

  public static final String SERIALIZED_NAME_COBRA_STATUS_DATE = "cobraStatusDate";
  @SerializedName(SERIALIZED_NAME_COBRA_STATUS_DATE)
  private OffsetDateTime cobraStatusDate;

  public static final String SERIALIZED_NAME_DATE_OF_COBRA_EVENT = "dateOfCobraEvent";
  @SerializedName(SERIALIZED_NAME_DATE_OF_COBRA_EVENT)
  private OffsetDateTime dateOfCobraEvent;

  public static final String SERIALIZED_NAME_DATE_OF_COBRA_EXPORT = "dateOfCobraExport";
  @SerializedName(SERIALIZED_NAME_DATE_OF_COBRA_EXPORT)
  private OffsetDateTime dateOfCobraExport;

  public static final String SERIALIZED_NAME_DATE_OF_COBRA_LETTER = "dateOfCobraLetter";
  @SerializedName(SERIALIZED_NAME_DATE_OF_COBRA_LETTER)
  private OffsetDateTime dateOfCobraLetter;

  public EmployeeCobraDetails() {
  }

  public EmployeeCobraDetails personID(String personID) {
    
    
    
    
    this.personID = personID;
    return this;
  }

   /**
   * Get personID
   * @return personID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPersonID() {
    return personID;
  }


  public void setPersonID(String personID) {
    
    
    
    this.personID = personID;
  }


  public EmployeeCobraDetails employeeID(String employeeID) {
    
    
    
    
    this.employeeID = employeeID;
    return this;
  }

   /**
   * Get employeeID
   * @return employeeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeID() {
    return employeeID;
  }


  public void setEmployeeID(String employeeID) {
    
    
    
    this.employeeID = employeeID;
  }


  public EmployeeCobraDetails companyID(String companyID) {
    
    
    
    
    this.companyID = companyID;
    return this;
  }

   /**
   * Get companyID
   * @return companyID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyID() {
    return companyID;
  }


  public void setCompanyID(String companyID) {
    
    
    
    this.companyID = companyID;
  }


  public EmployeeCobraDetails cobraExport(String cobraExport) {
    
    
    
    
    this.cobraExport = cobraExport;
    return this;
  }

   /**
   * Get cobraExport
   * @return cobraExport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCobraExport() {
    return cobraExport;
  }


  public void setCobraExport(String cobraExport) {
    
    
    
    this.cobraExport = cobraExport;
  }


  public EmployeeCobraDetails cobraIsActive(Boolean cobraIsActive) {
    
    
    
    
    this.cobraIsActive = cobraIsActive;
    return this;
  }

   /**
   * Get cobraIsActive
   * @return cobraIsActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCobraIsActive() {
    return cobraIsActive;
  }


  public void setCobraIsActive(Boolean cobraIsActive) {
    
    
    
    this.cobraIsActive = cobraIsActive;
  }


  public EmployeeCobraDetails cobraNotes(String cobraNotes) {
    
    
    
    
    this.cobraNotes = cobraNotes;
    return this;
  }

   /**
   * Get cobraNotes
   * @return cobraNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCobraNotes() {
    return cobraNotes;
  }


  public void setCobraNotes(String cobraNotes) {
    
    
    
    this.cobraNotes = cobraNotes;
  }


  public EmployeeCobraDetails cobraReason(String cobraReason) {
    
    
    
    
    this.cobraReason = cobraReason;
    return this;
  }

   /**
   * Get cobraReason
   * @return cobraReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCobraReason() {
    return cobraReason;
  }


  public void setCobraReason(String cobraReason) {
    
    
    
    this.cobraReason = cobraReason;
  }


  public EmployeeCobraDetails cobraStatus(String cobraStatus) {
    
    
    
    
    this.cobraStatus = cobraStatus;
    return this;
  }

   /**
   * Get cobraStatus
   * @return cobraStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCobraStatus() {
    return cobraStatus;
  }


  public void setCobraStatus(String cobraStatus) {
    
    
    
    this.cobraStatus = cobraStatus;
  }


  public EmployeeCobraDetails cobraStatusDate(OffsetDateTime cobraStatusDate) {
    
    
    
    
    this.cobraStatusDate = cobraStatusDate;
    return this;
  }

   /**
   * Get cobraStatusDate
   * @return cobraStatusDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCobraStatusDate() {
    return cobraStatusDate;
  }


  public void setCobraStatusDate(OffsetDateTime cobraStatusDate) {
    
    
    
    this.cobraStatusDate = cobraStatusDate;
  }


  public EmployeeCobraDetails dateOfCobraEvent(OffsetDateTime dateOfCobraEvent) {
    
    
    
    
    this.dateOfCobraEvent = dateOfCobraEvent;
    return this;
  }

   /**
   * Get dateOfCobraEvent
   * @return dateOfCobraEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateOfCobraEvent() {
    return dateOfCobraEvent;
  }


  public void setDateOfCobraEvent(OffsetDateTime dateOfCobraEvent) {
    
    
    
    this.dateOfCobraEvent = dateOfCobraEvent;
  }


  public EmployeeCobraDetails dateOfCobraExport(OffsetDateTime dateOfCobraExport) {
    
    
    
    
    this.dateOfCobraExport = dateOfCobraExport;
    return this;
  }

   /**
   * Get dateOfCobraExport
   * @return dateOfCobraExport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateOfCobraExport() {
    return dateOfCobraExport;
  }


  public void setDateOfCobraExport(OffsetDateTime dateOfCobraExport) {
    
    
    
    this.dateOfCobraExport = dateOfCobraExport;
  }


  public EmployeeCobraDetails dateOfCobraLetter(OffsetDateTime dateOfCobraLetter) {
    
    
    
    
    this.dateOfCobraLetter = dateOfCobraLetter;
    return this;
  }

   /**
   * Get dateOfCobraLetter
   * @return dateOfCobraLetter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateOfCobraLetter() {
    return dateOfCobraLetter;
  }


  public void setDateOfCobraLetter(OffsetDateTime dateOfCobraLetter) {
    
    
    
    this.dateOfCobraLetter = dateOfCobraLetter;
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
   * @return the EmployeeCobraDetails instance itself
   */
  public EmployeeCobraDetails putAdditionalProperty(String key, Object value) {
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
    EmployeeCobraDetails employeeCobraDetails = (EmployeeCobraDetails) o;
    return Objects.equals(this.personID, employeeCobraDetails.personID) &&
        Objects.equals(this.employeeID, employeeCobraDetails.employeeID) &&
        Objects.equals(this.companyID, employeeCobraDetails.companyID) &&
        Objects.equals(this.cobraExport, employeeCobraDetails.cobraExport) &&
        Objects.equals(this.cobraIsActive, employeeCobraDetails.cobraIsActive) &&
        Objects.equals(this.cobraNotes, employeeCobraDetails.cobraNotes) &&
        Objects.equals(this.cobraReason, employeeCobraDetails.cobraReason) &&
        Objects.equals(this.cobraStatus, employeeCobraDetails.cobraStatus) &&
        Objects.equals(this.cobraStatusDate, employeeCobraDetails.cobraStatusDate) &&
        Objects.equals(this.dateOfCobraEvent, employeeCobraDetails.dateOfCobraEvent) &&
        Objects.equals(this.dateOfCobraExport, employeeCobraDetails.dateOfCobraExport) &&
        Objects.equals(this.dateOfCobraLetter, employeeCobraDetails.dateOfCobraLetter)&&
        Objects.equals(this.additionalProperties, employeeCobraDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personID, employeeID, companyID, cobraExport, cobraIsActive, cobraNotes, cobraReason, cobraStatus, cobraStatusDate, dateOfCobraEvent, dateOfCobraExport, dateOfCobraLetter, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCobraDetails {\n");
    sb.append("    personID: ").append(toIndentedString(personID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    companyID: ").append(toIndentedString(companyID)).append("\n");
    sb.append("    cobraExport: ").append(toIndentedString(cobraExport)).append("\n");
    sb.append("    cobraIsActive: ").append(toIndentedString(cobraIsActive)).append("\n");
    sb.append("    cobraNotes: ").append(toIndentedString(cobraNotes)).append("\n");
    sb.append("    cobraReason: ").append(toIndentedString(cobraReason)).append("\n");
    sb.append("    cobraStatus: ").append(toIndentedString(cobraStatus)).append("\n");
    sb.append("    cobraStatusDate: ").append(toIndentedString(cobraStatusDate)).append("\n");
    sb.append("    dateOfCobraEvent: ").append(toIndentedString(dateOfCobraEvent)).append("\n");
    sb.append("    dateOfCobraExport: ").append(toIndentedString(dateOfCobraExport)).append("\n");
    sb.append("    dateOfCobraLetter: ").append(toIndentedString(dateOfCobraLetter)).append("\n");
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
    openapiFields.add("personID");
    openapiFields.add("employeeID");
    openapiFields.add("companyID");
    openapiFields.add("cobraExport");
    openapiFields.add("cobraIsActive");
    openapiFields.add("cobraNotes");
    openapiFields.add("cobraReason");
    openapiFields.add("cobraStatus");
    openapiFields.add("cobraStatusDate");
    openapiFields.add("dateOfCobraEvent");
    openapiFields.add("dateOfCobraExport");
    openapiFields.add("dateOfCobraLetter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeCobraDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeCobraDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeCobraDetails is not found in the empty JSON string", EmployeeCobraDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("personID") != null && !jsonObj.get("personID").isJsonNull()) && !jsonObj.get("personID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personID").toString()));
      }
      if ((jsonObj.get("employeeID") != null && !jsonObj.get("employeeID").isJsonNull()) && !jsonObj.get("employeeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeID").toString()));
      }
      if ((jsonObj.get("companyID") != null && !jsonObj.get("companyID").isJsonNull()) && !jsonObj.get("companyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyID").toString()));
      }
      if ((jsonObj.get("cobraExport") != null && !jsonObj.get("cobraExport").isJsonNull()) && !jsonObj.get("cobraExport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cobraExport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cobraExport").toString()));
      }
      if ((jsonObj.get("cobraNotes") != null && !jsonObj.get("cobraNotes").isJsonNull()) && !jsonObj.get("cobraNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cobraNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cobraNotes").toString()));
      }
      if ((jsonObj.get("cobraReason") != null && !jsonObj.get("cobraReason").isJsonNull()) && !jsonObj.get("cobraReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cobraReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cobraReason").toString()));
      }
      if ((jsonObj.get("cobraStatus") != null && !jsonObj.get("cobraStatus").isJsonNull()) && !jsonObj.get("cobraStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cobraStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cobraStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeCobraDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeCobraDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeCobraDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeCobraDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeCobraDetails>() {
           @Override
           public void write(JsonWriter out, EmployeeCobraDetails value) throws IOException {
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
           public EmployeeCobraDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeCobraDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeCobraDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeCobraDetails
  * @throws IOException if the JSON string is invalid with respect to EmployeeCobraDetails
  */
  public static EmployeeCobraDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeCobraDetails.class);
  }

 /**
  * Convert an instance of EmployeeCobraDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

