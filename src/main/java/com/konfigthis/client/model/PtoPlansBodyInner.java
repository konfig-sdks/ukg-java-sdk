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
 * PtoPlansBodyInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PtoPlansBodyInner {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_PTO_PLAN = "ptoPlan";
  @SerializedName(SERIALIZED_NAME_PTO_PLAN)
  private String ptoPlan;

  public static final String SERIALIZED_NAME_EARNED = "earned";
  @SerializedName(SERIALIZED_NAME_EARNED)
  private Double earned;

  public static final String SERIALIZED_NAME_TAKEN = "taken";
  @SerializedName(SERIALIZED_NAME_TAKEN)
  private Double taken;

  public static final String SERIALIZED_NAME_PENDING_BALANCE = "pendingBalance";
  @SerializedName(SERIALIZED_NAME_PENDING_BALANCE)
  private Double pendingBalance;

  public static final String SERIALIZED_NAME_EARNED_THROUGH_DATE = "earnedThroughDate";
  @SerializedName(SERIALIZED_NAME_EARNED_THROUGH_DATE)
  private String earnedThroughDate;

  public static final String SERIALIZED_NAME_RESET = "reset";
  @SerializedName(SERIALIZED_NAME_RESET)
  private String reset;

  public static final String SERIALIZED_NAME_PENDING_MOVE_DATE = "pendingMoveDate";
  @SerializedName(SERIALIZED_NAME_PENDING_MOVE_DATE)
  private String pendingMoveDate;

  public PtoPlansBodyInner() {
  }

  public PtoPlansBodyInner employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Employee Identifier
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Employee Identifier")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public PtoPlansBodyInner companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Company Identifier
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Company Identifier")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public PtoPlansBodyInner ptoPlan(String ptoPlan) {
    
    
    
    
    this.ptoPlan = ptoPlan;
    return this;
  }

   /**
   * PTO Plan Identifier
   * @return ptoPlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PTO Plan Identifier")

  public String getPtoPlan() {
    return ptoPlan;
  }


  public void setPtoPlan(String ptoPlan) {
    
    
    
    this.ptoPlan = ptoPlan;
  }


  public PtoPlansBodyInner earned(Double earned) {
    
    
    
    
    this.earned = earned;
    return this;
  }

   /**
   * Amount of hours earned for PTO
   * @return earned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of hours earned for PTO")

  public Double getEarned() {
    return earned;
  }


  public void setEarned(Double earned) {
    
    
    
    this.earned = earned;
  }


  public PtoPlansBodyInner taken(Double taken) {
    
    
    
    
    this.taken = taken;
    return this;
  }

   /**
   * Amount of hours taken for PTO
   * @return taken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of hours taken for PTO")

  public Double getTaken() {
    return taken;
  }


  public void setTaken(Double taken) {
    
    
    
    this.taken = taken;
  }


  public PtoPlansBodyInner pendingBalance(Double pendingBalance) {
    
    
    
    
    this.pendingBalance = pendingBalance;
    return this;
  }

   /**
   * Balance of PTO hours
   * @return pendingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Balance of PTO hours")

  public Double getPendingBalance() {
    return pendingBalance;
  }


  public void setPendingBalance(Double pendingBalance) {
    
    
    
    this.pendingBalance = pendingBalance;
  }


  public PtoPlansBodyInner earnedThroughDate(String earnedThroughDate) {
    
    
    
    
    this.earnedThroughDate = earnedThroughDate;
    return this;
  }

   /**
   * Date in which PTO is earned through, format should be YYYY-MM-DD
   * @return earnedThroughDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date in which PTO is earned through, format should be YYYY-MM-DD")

  public String getEarnedThroughDate() {
    return earnedThroughDate;
  }


  public void setEarnedThroughDate(String earnedThroughDate) {
    
    
    
    this.earnedThroughDate = earnedThroughDate;
  }


  public PtoPlansBodyInner reset(String reset) {
    
    
    
    
    this.reset = reset;
    return this;
  }

   /**
   * Date in which the PTO reset&#39;s, format should be YYYY-MM-DD
   * @return reset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date in which the PTO reset's, format should be YYYY-MM-DD")

  public String getReset() {
    return reset;
  }


  public void setReset(String reset) {
    
    
    
    this.reset = reset;
  }


  public PtoPlansBodyInner pendingMoveDate(String pendingMoveDate) {
    
    
    
    
    this.pendingMoveDate = pendingMoveDate;
    return this;
  }

   /**
   * Date to be used if pending rules are relevant, format should be YYYY-MM-DD
   * @return pendingMoveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date to be used if pending rules are relevant, format should be YYYY-MM-DD")

  public String getPendingMoveDate() {
    return pendingMoveDate;
  }


  public void setPendingMoveDate(String pendingMoveDate) {
    
    
    
    this.pendingMoveDate = pendingMoveDate;
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
   * @return the PtoPlansBodyInner instance itself
   */
  public PtoPlansBodyInner putAdditionalProperty(String key, Object value) {
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
    PtoPlansBodyInner ptoPlansBodyInner = (PtoPlansBodyInner) o;
    return Objects.equals(this.employeeId, ptoPlansBodyInner.employeeId) &&
        Objects.equals(this.companyId, ptoPlansBodyInner.companyId) &&
        Objects.equals(this.ptoPlan, ptoPlansBodyInner.ptoPlan) &&
        Objects.equals(this.earned, ptoPlansBodyInner.earned) &&
        Objects.equals(this.taken, ptoPlansBodyInner.taken) &&
        Objects.equals(this.pendingBalance, ptoPlansBodyInner.pendingBalance) &&
        Objects.equals(this.earnedThroughDate, ptoPlansBodyInner.earnedThroughDate) &&
        Objects.equals(this.reset, ptoPlansBodyInner.reset) &&
        Objects.equals(this.pendingMoveDate, ptoPlansBodyInner.pendingMoveDate)&&
        Objects.equals(this.additionalProperties, ptoPlansBodyInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, companyId, ptoPlan, earned, taken, pendingBalance, earnedThroughDate, reset, pendingMoveDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtoPlansBodyInner {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    ptoPlan: ").append(toIndentedString(ptoPlan)).append("\n");
    sb.append("    earned: ").append(toIndentedString(earned)).append("\n");
    sb.append("    taken: ").append(toIndentedString(taken)).append("\n");
    sb.append("    pendingBalance: ").append(toIndentedString(pendingBalance)).append("\n");
    sb.append("    earnedThroughDate: ").append(toIndentedString(earnedThroughDate)).append("\n");
    sb.append("    reset: ").append(toIndentedString(reset)).append("\n");
    sb.append("    pendingMoveDate: ").append(toIndentedString(pendingMoveDate)).append("\n");
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
    openapiFields.add("companyId");
    openapiFields.add("ptoPlan");
    openapiFields.add("earned");
    openapiFields.add("taken");
    openapiFields.add("pendingBalance");
    openapiFields.add("earnedThroughDate");
    openapiFields.add("reset");
    openapiFields.add("pendingMoveDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("companyId");
    openapiRequiredFields.add("ptoPlan");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PtoPlansBodyInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PtoPlansBodyInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PtoPlansBodyInner is not found in the empty JSON string", PtoPlansBodyInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PtoPlansBodyInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (!jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if (!jsonObj.get("ptoPlan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ptoPlan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ptoPlan").toString()));
      }
      if ((jsonObj.get("earnedThroughDate") != null && !jsonObj.get("earnedThroughDate").isJsonNull()) && !jsonObj.get("earnedThroughDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `earnedThroughDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("earnedThroughDate").toString()));
      }
      if ((jsonObj.get("reset") != null && !jsonObj.get("reset").isJsonNull()) && !jsonObj.get("reset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reset").toString()));
      }
      if ((jsonObj.get("pendingMoveDate") != null && !jsonObj.get("pendingMoveDate").isJsonNull()) && !jsonObj.get("pendingMoveDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pendingMoveDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pendingMoveDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PtoPlansBodyInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PtoPlansBodyInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PtoPlansBodyInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PtoPlansBodyInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PtoPlansBodyInner>() {
           @Override
           public void write(JsonWriter out, PtoPlansBodyInner value) throws IOException {
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
           public PtoPlansBodyInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PtoPlansBodyInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PtoPlansBodyInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PtoPlansBodyInner
  * @throws IOException if the JSON string is invalid with respect to PtoPlansBodyInner
  */
  public static PtoPlansBodyInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PtoPlansBodyInner.class);
  }

 /**
  * Convert an instance of PtoPlansBodyInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

