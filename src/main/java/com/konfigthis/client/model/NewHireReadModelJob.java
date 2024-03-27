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
import com.konfigthis.client.model.NewHireReadModelJobComponentCompany;
import com.konfigthis.client.model.NewHireReadModelJobEmployeeType;
import com.konfigthis.client.model.NewHireReadModelJobSupervisor;
import com.konfigthis.client.model.NewHireReadModelJobWorkLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * Job of the new hire
 */
@ApiModel(description = "Job of the new hire")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewHireReadModelJob {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Map<String, String> name = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_REQUISITION_ID = "requisitionId";
  @SerializedName(SERIALIZED_NAME_REQUISITION_ID)
  private String requisitionId;

  /**
   * Selected FLSA status for the job
   */
  @JsonAdapter(SelectedFLSAStatusEnum.Adapter.class)
 public enum SelectedFLSAStatusEnum {
    NOT_SPECIFIED_0("Not specified = 0"),
    
    EXEMPT_1("Exempt = 1"),
    
    NONEXEMPT_2("NonExempt = 2");

    private String value;

    SelectedFLSAStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectedFLSAStatusEnum fromValue(String value) {
      for (SelectedFLSAStatusEnum b : SelectedFLSAStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectedFLSAStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectedFLSAStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectedFLSAStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectedFLSAStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SELECTED_F_L_S_A_STATUS = "selectedFLSAStatus";
  @SerializedName(SERIALIZED_NAME_SELECTED_F_L_S_A_STATUS)
  private SelectedFLSAStatusEnum selectedFLSAStatus;

  public static final String SERIALIZED_NAME_COMPONENT_COMPANY = "componentCompany";
  @SerializedName(SERIALIZED_NAME_COMPONENT_COMPANY)
  private NewHireReadModelJobComponentCompany componentCompany;

  public static final String SERIALIZED_NAME_WORK_LOCATION = "workLocation";
  @SerializedName(SERIALIZED_NAME_WORK_LOCATION)
  private NewHireReadModelJobWorkLocation workLocation;

  public static final String SERIALIZED_NAME_SUPERVISOR = "supervisor";
  @SerializedName(SERIALIZED_NAME_SUPERVISOR)
  private NewHireReadModelJobSupervisor supervisor;

  public static final String SERIALIZED_NAME_EMPLOYEE_TYPE = "employeeType";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_TYPE)
  private NewHireReadModelJobEmployeeType employeeType;

  public NewHireReadModelJob() {
  }

  public NewHireReadModelJob id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the job
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96a5833e-5f4b-46b0-ac58-41dba1e4aa1b", value = "Unique identifier of the job")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public NewHireReadModelJob name(Map<String, String> name) {
    
    
    
    
    this.name = name;
    return this;
  }

  public NewHireReadModelJob putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The name of the job
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"enUS\":\"Lead Tech\",\"esES\":\"Tecnico Principal\"}", value = "The name of the job")

  public Map<String, String> getName() {
    return name;
  }


  public void setName(Map<String, String> name) {
    
    
    
    this.name = name;
  }


  public NewHireReadModelJob code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Code of the job
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DJOB", value = "Code of the job")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public NewHireReadModelJob requisitionId(String requisitionId) {
    
    
    
    
    this.requisitionId = requisitionId;
    return this;
  }

   /**
   * RequisitionId of the job
   * @return requisitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEV30335", value = "RequisitionId of the job")

  public String getRequisitionId() {
    return requisitionId;
  }


  public void setRequisitionId(String requisitionId) {
    
    
    
    this.requisitionId = requisitionId;
  }


  public NewHireReadModelJob selectedFLSAStatus(SelectedFLSAStatusEnum selectedFLSAStatus) {
    
    
    
    
    this.selectedFLSAStatus = selectedFLSAStatus;
    return this;
  }

   /**
   * Selected FLSA status for the job
   * @return selectedFLSAStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Selected FLSA status for the job")

  public SelectedFLSAStatusEnum getSelectedFLSAStatus() {
    return selectedFLSAStatus;
  }


  public void setSelectedFLSAStatus(SelectedFLSAStatusEnum selectedFLSAStatus) {
    
    
    
    this.selectedFLSAStatus = selectedFLSAStatus;
  }


  public NewHireReadModelJob componentCompany(NewHireReadModelJobComponentCompany componentCompany) {
    
    
    
    
    this.componentCompany = componentCompany;
    return this;
  }

   /**
   * Get componentCompany
   * @return componentCompany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelJobComponentCompany getComponentCompany() {
    return componentCompany;
  }


  public void setComponentCompany(NewHireReadModelJobComponentCompany componentCompany) {
    
    
    
    this.componentCompany = componentCompany;
  }


  public NewHireReadModelJob workLocation(NewHireReadModelJobWorkLocation workLocation) {
    
    
    
    
    this.workLocation = workLocation;
    return this;
  }

   /**
   * Get workLocation
   * @return workLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelJobWorkLocation getWorkLocation() {
    return workLocation;
  }


  public void setWorkLocation(NewHireReadModelJobWorkLocation workLocation) {
    
    
    
    this.workLocation = workLocation;
  }


  public NewHireReadModelJob supervisor(NewHireReadModelJobSupervisor supervisor) {
    
    
    
    
    this.supervisor = supervisor;
    return this;
  }

   /**
   * Get supervisor
   * @return supervisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelJobSupervisor getSupervisor() {
    return supervisor;
  }


  public void setSupervisor(NewHireReadModelJobSupervisor supervisor) {
    
    
    
    this.supervisor = supervisor;
  }


  public NewHireReadModelJob employeeType(NewHireReadModelJobEmployeeType employeeType) {
    
    
    
    
    this.employeeType = employeeType;
    return this;
  }

   /**
   * Get employeeType
   * @return employeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelJobEmployeeType getEmployeeType() {
    return employeeType;
  }


  public void setEmployeeType(NewHireReadModelJobEmployeeType employeeType) {
    
    
    
    this.employeeType = employeeType;
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
   * @return the NewHireReadModelJob instance itself
   */
  public NewHireReadModelJob putAdditionalProperty(String key, Object value) {
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
    NewHireReadModelJob newHireReadModelJob = (NewHireReadModelJob) o;
    return Objects.equals(this.id, newHireReadModelJob.id) &&
        Objects.equals(this.name, newHireReadModelJob.name) &&
        Objects.equals(this.code, newHireReadModelJob.code) &&
        Objects.equals(this.requisitionId, newHireReadModelJob.requisitionId) &&
        Objects.equals(this.selectedFLSAStatus, newHireReadModelJob.selectedFLSAStatus) &&
        Objects.equals(this.componentCompany, newHireReadModelJob.componentCompany) &&
        Objects.equals(this.workLocation, newHireReadModelJob.workLocation) &&
        Objects.equals(this.supervisor, newHireReadModelJob.supervisor) &&
        Objects.equals(this.employeeType, newHireReadModelJob.employeeType)&&
        Objects.equals(this.additionalProperties, newHireReadModelJob.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, requisitionId, selectedFLSAStatus, componentCompany, workLocation, supervisor, employeeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewHireReadModelJob {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    requisitionId: ").append(toIndentedString(requisitionId)).append("\n");
    sb.append("    selectedFLSAStatus: ").append(toIndentedString(selectedFLSAStatus)).append("\n");
    sb.append("    componentCompany: ").append(toIndentedString(componentCompany)).append("\n");
    sb.append("    workLocation: ").append(toIndentedString(workLocation)).append("\n");
    sb.append("    supervisor: ").append(toIndentedString(supervisor)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("requisitionId");
    openapiFields.add("selectedFLSAStatus");
    openapiFields.add("componentCompany");
    openapiFields.add("workLocation");
    openapiFields.add("supervisor");
    openapiFields.add("employeeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewHireReadModelJob
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewHireReadModelJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewHireReadModelJob is not found in the empty JSON string", NewHireReadModelJob.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("requisitionId") != null && !jsonObj.get("requisitionId").isJsonNull()) && !jsonObj.get("requisitionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requisitionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requisitionId").toString()));
      }
      if ((jsonObj.get("selectedFLSAStatus") != null && !jsonObj.get("selectedFLSAStatus").isJsonNull()) && !jsonObj.get("selectedFLSAStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedFLSAStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedFLSAStatus").toString()));
      }
      // validate the optional field `componentCompany`
      if (jsonObj.get("componentCompany") != null && !jsonObj.get("componentCompany").isJsonNull()) {
        NewHireReadModelJobComponentCompany.validateJsonObject(jsonObj.getAsJsonObject("componentCompany"));
      }
      // validate the optional field `workLocation`
      if (jsonObj.get("workLocation") != null && !jsonObj.get("workLocation").isJsonNull()) {
        NewHireReadModelJobWorkLocation.validateJsonObject(jsonObj.getAsJsonObject("workLocation"));
      }
      // validate the optional field `supervisor`
      if (jsonObj.get("supervisor") != null && !jsonObj.get("supervisor").isJsonNull()) {
        NewHireReadModelJobSupervisor.validateJsonObject(jsonObj.getAsJsonObject("supervisor"));
      }
      // validate the optional field `employeeType`
      if (jsonObj.get("employeeType") != null && !jsonObj.get("employeeType").isJsonNull()) {
        NewHireReadModelJobEmployeeType.validateJsonObject(jsonObj.getAsJsonObject("employeeType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewHireReadModelJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewHireReadModelJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewHireReadModelJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewHireReadModelJob.class));

       return (TypeAdapter<T>) new TypeAdapter<NewHireReadModelJob>() {
           @Override
           public void write(JsonWriter out, NewHireReadModelJob value) throws IOException {
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
           public NewHireReadModelJob read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewHireReadModelJob instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NewHireReadModelJob given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewHireReadModelJob
  * @throws IOException if the JSON string is invalid with respect to NewHireReadModelJob
  */
  public static NewHireReadModelJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewHireReadModelJob.class);
  }

 /**
  * Convert an instance of NewHireReadModelJob to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

