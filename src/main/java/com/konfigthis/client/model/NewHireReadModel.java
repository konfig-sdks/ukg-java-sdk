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
import com.konfigthis.client.model.NewHireReadModelCompensation;
import com.konfigthis.client.model.NewHireReadModelContactInformation;
import com.konfigthis.client.model.NewHireReadModelJob;
import com.konfigthis.client.model.NewHireReadModelMentor;
import com.konfigthis.client.model.NewHireReadModelOnboardingOwner;
import com.konfigthis.client.model.NewHireReadModelOrganizationLevelsInner;
import com.konfigthis.client.model.NewHireReadModelProvisioning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * NewHireReadModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewHireReadModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTACT_INFORMATION = "contactInformation";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFORMATION)
  private NewHireReadModelContactInformation contactInformation;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private NewHireReadModelJob job;

  public static final String SERIALIZED_NAME_ORGANIZATION_LEVELS = "organizationLevels";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_LEVELS)
  private List<NewHireReadModelOrganizationLevelsInner> organizationLevels = null;

  public static final String SERIALIZED_NAME_COMPENSATION = "compensation";
  @SerializedName(SERIALIZED_NAME_COMPENSATION)
  private NewHireReadModelCompensation compensation;

  public static final String SERIALIZED_NAME_ONBOARDING_OWNER = "onboardingOwner";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_OWNER)
  private NewHireReadModelOnboardingOwner onboardingOwner;

  public static final String SERIALIZED_NAME_HIRE_DATE = "hireDate";
  @SerializedName(SERIALIZED_NAME_HIRE_DATE)
  private OffsetDateTime hireDate;

  public static final String SERIALIZED_NAME_ORIENTATION_DATE = "orientationDate";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_DATE)
  private OffsetDateTime orientationDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_PAST_START_DATE_REASON = "pastStartDateReason";
  @SerializedName(SERIALIZED_NAME_PAST_START_DATE_REASON)
  private String pastStartDateReason;

  public static final String SERIALIZED_NAME_MENTOR = "mentor";
  @SerializedName(SERIALIZED_NAME_MENTOR)
  private NewHireReadModelMentor mentor;

  public static final String SERIALIZED_NAME_PERSONAL_MESSAGE = "personalMessage";
  @SerializedName(SERIALIZED_NAME_PERSONAL_MESSAGE)
  private String personalMessage;

  public static final String SERIALIZED_NAME_PROVISIONING = "provisioning";
  @SerializedName(SERIALIZED_NAME_PROVISIONING)
  private NewHireReadModelProvisioning provisioning;

  public static final String SERIALIZED_NAME_ONBOARDING_STATUS = "onboardingStatus";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_STATUS)
  private String onboardingStatus;

  public static final String SERIALIZED_NAME_IDENTITY_USER_ID = "identityUserId";
  @SerializedName(SERIALIZED_NAME_IDENTITY_USER_ID)
  private String identityUserId;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "externalUserId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_SENT_TO_PROCESS_HIRE_DATE = "sentToProcessHireDate";
  @SerializedName(SERIALIZED_NAME_SENT_TO_PROCESS_HIRE_DATE)
  private OffsetDateTime sentToProcessHireDate;

  public static final String SERIALIZED_NAME_LAUNCHED_ON = "launchedOn";
  @SerializedName(SERIALIZED_NAME_LAUNCHED_ON)
  private OffsetDateTime launchedOn;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public NewHireReadModel() {
  }

  public NewHireReadModel id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the new hire
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05882bc4-7ae6-40b5-b1ee-2e56dd37bb49", value = "Unique identifier of the new hire")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public NewHireReadModel contactInformation(NewHireReadModelContactInformation contactInformation) {
    
    
    
    
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Get contactInformation
   * @return contactInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelContactInformation getContactInformation() {
    return contactInformation;
  }


  public void setContactInformation(NewHireReadModelContactInformation contactInformation) {
    
    
    
    this.contactInformation = contactInformation;
  }


  public NewHireReadModel job(NewHireReadModelJob job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelJob getJob() {
    return job;
  }


  public void setJob(NewHireReadModelJob job) {
    
    
    
    this.job = job;
  }


  public NewHireReadModel organizationLevels(List<NewHireReadModelOrganizationLevelsInner> organizationLevels) {
    
    
    
    
    this.organizationLevels = organizationLevels;
    return this;
  }

  public NewHireReadModel addOrganizationLevelsItem(NewHireReadModelOrganizationLevelsInner organizationLevelsItem) {
    if (this.organizationLevels == null) {
      this.organizationLevels = new ArrayList<>();
    }
    this.organizationLevels.add(organizationLevelsItem);
    return this;
  }

   /**
   * Get organizationLevels
   * @return organizationLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NewHireReadModelOrganizationLevelsInner> getOrganizationLevels() {
    return organizationLevels;
  }


  public void setOrganizationLevels(List<NewHireReadModelOrganizationLevelsInner> organizationLevels) {
    
    
    
    this.organizationLevels = organizationLevels;
  }


  public NewHireReadModel compensation(NewHireReadModelCompensation compensation) {
    
    
    
    
    this.compensation = compensation;
    return this;
  }

   /**
   * Get compensation
   * @return compensation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelCompensation getCompensation() {
    return compensation;
  }


  public void setCompensation(NewHireReadModelCompensation compensation) {
    
    
    
    this.compensation = compensation;
  }


  public NewHireReadModel onboardingOwner(NewHireReadModelOnboardingOwner onboardingOwner) {
    
    
    
    
    this.onboardingOwner = onboardingOwner;
    return this;
  }

   /**
   * Get onboardingOwner
   * @return onboardingOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelOnboardingOwner getOnboardingOwner() {
    return onboardingOwner;
  }


  public void setOnboardingOwner(NewHireReadModelOnboardingOwner onboardingOwner) {
    
    
    
    this.onboardingOwner = onboardingOwner;
  }


  public NewHireReadModel hireDate(OffsetDateTime hireDate) {
    
    
    
    
    this.hireDate = hireDate;
    return this;
  }

   /**
   * Hire date of the new hire
   * @return hireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-06-23T00:00Z", value = "Hire date of the new hire")

  public OffsetDateTime getHireDate() {
    return hireDate;
  }


  public void setHireDate(OffsetDateTime hireDate) {
    
    
    
    this.hireDate = hireDate;
  }


  public NewHireReadModel orientationDate(OffsetDateTime orientationDate) {
    
    
    
    
    this.orientationDate = orientationDate;
    return this;
  }

   /**
   * Orientation date of the new hire
   * @return orientationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-07-06T00:00Z", value = "Orientation date of the new hire")

  public OffsetDateTime getOrientationDate() {
    return orientationDate;
  }


  public void setOrientationDate(OffsetDateTime orientationDate) {
    
    
    
    this.orientationDate = orientationDate;
  }


  public NewHireReadModel startDate(OffsetDateTime startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the new hire
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-06-30T00:00Z", value = "Start date of the new hire")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    
    
    
    this.startDate = startDate;
  }


  public NewHireReadModel pastStartDateReason(String pastStartDateReason) {
    
    
    
    
    this.pastStartDateReason = pastStartDateReason;
    return this;
  }

   /**
   * Reason why the new hire start date is 4 or more business days in the past
   * @return pastStartDateReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "An internal audit revealed that the new hire was not initiated", value = "Reason why the new hire start date is 4 or more business days in the past")

  public String getPastStartDateReason() {
    return pastStartDateReason;
  }


  public void setPastStartDateReason(String pastStartDateReason) {
    
    
    
    this.pastStartDateReason = pastStartDateReason;
  }


  public NewHireReadModel mentor(NewHireReadModelMentor mentor) {
    
    
    
    
    this.mentor = mentor;
    return this;
  }

   /**
   * Get mentor
   * @return mentor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelMentor getMentor() {
    return mentor;
  }


  public void setMentor(NewHireReadModelMentor mentor) {
    
    
    
    this.mentor = mentor;
  }


  public NewHireReadModel personalMessage(String personalMessage) {
    
    
    
    
    this.personalMessage = personalMessage;
    return this;
  }

   /**
   * Personalized welcome message for the new hire
   * @return personalMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hugo, I was very impressed with your passion. I am looking forward to working with you and I know your expertise in this space will help our team get to the next level.", value = "Personalized welcome message for the new hire")

  public String getPersonalMessage() {
    return personalMessage;
  }


  public void setPersonalMessage(String personalMessage) {
    
    
    
    this.personalMessage = personalMessage;
  }


  public NewHireReadModel provisioning(NewHireReadModelProvisioning provisioning) {
    
    
    
    
    this.provisioning = provisioning;
    return this;
  }

   /**
   * Get provisioning
   * @return provisioning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHireReadModelProvisioning getProvisioning() {
    return provisioning;
  }


  public void setProvisioning(NewHireReadModelProvisioning provisioning) {
    
    
    
    this.provisioning = provisioning;
  }


  public NewHireReadModel onboardingStatus(String onboardingStatus) {
    
    
    
    
    this.onboardingStatus = onboardingStatus;
    return this;
  }

   /**
   * The status of the new hire in onboarding
   * @return onboardingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Launched", value = "The status of the new hire in onboarding")

  public String getOnboardingStatus() {
    return onboardingStatus;
  }


  public void setOnboardingStatus(String onboardingStatus) {
    
    
    
    this.onboardingStatus = onboardingStatus;
  }


  public NewHireReadModel identityUserId(String identityUserId) {
    
    
    
    
    this.identityUserId = identityUserId;
    return this;
  }

   /**
   * Identity user identifier of the new hire
   * @return identityUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05882bc4-7ae6-40b5-b1ee-2e56dd37bb49", value = "Identity user identifier of the new hire")

  public String getIdentityUserId() {
    return identityUserId;
  }


  public void setIdentityUserId(String identityUserId) {
    
    
    
    this.identityUserId = identityUserId;
  }


  public NewHireReadModel externalUserId(String externalUserId) {
    
    
    
    
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * External user identifier of the new hire
   * @return externalUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b7a4fd34-73c7-43d6-aaab-7b2bc20ed50f", value = "External user identifier of the new hire")

  public String getExternalUserId() {
    return externalUserId;
  }


  public void setExternalUserId(String externalUserId) {
    
    
    
    this.externalUserId = externalUserId;
  }


  public NewHireReadModel employeeNumber(String employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Employee number of the new hire
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "Employee number of the new hire")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public NewHireReadModel sentToProcessHireDate(OffsetDateTime sentToProcessHireDate) {
    
    
    
    
    this.sentToProcessHireDate = sentToProcessHireDate;
    return this;
  }

   /**
   * Date that the new hire was processed
   * @return sentToProcessHireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date that the new hire was processed")

  public OffsetDateTime getSentToProcessHireDate() {
    return sentToProcessHireDate;
  }


  public void setSentToProcessHireDate(OffsetDateTime sentToProcessHireDate) {
    
    
    
    this.sentToProcessHireDate = sentToProcessHireDate;
  }


  public NewHireReadModel launchedOn(OffsetDateTime launchedOn) {
    
    
    
    
    this.launchedOn = launchedOn;
    return this;
  }

   /**
   * Launch date of the new hire
   * @return launchedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Launch date of the new hire")

  public OffsetDateTime getLaunchedOn() {
    return launchedOn;
  }


  public void setLaunchedOn(OffsetDateTime launchedOn) {
    
    
    
    this.launchedOn = launchedOn;
  }


  public NewHireReadModel createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of the new hire
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-05-29T19:30:35.950Z", value = "Creation date of the new hire")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public NewHireReadModel updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last updated date of the new hire
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-06-07T17:44:25.378Z", value = "Last updated date of the new hire")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the NewHireReadModel instance itself
   */
  public NewHireReadModel putAdditionalProperty(String key, Object value) {
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
    NewHireReadModel newHireReadModel = (NewHireReadModel) o;
    return Objects.equals(this.id, newHireReadModel.id) &&
        Objects.equals(this.contactInformation, newHireReadModel.contactInformation) &&
        Objects.equals(this.job, newHireReadModel.job) &&
        Objects.equals(this.organizationLevels, newHireReadModel.organizationLevels) &&
        Objects.equals(this.compensation, newHireReadModel.compensation) &&
        Objects.equals(this.onboardingOwner, newHireReadModel.onboardingOwner) &&
        Objects.equals(this.hireDate, newHireReadModel.hireDate) &&
        Objects.equals(this.orientationDate, newHireReadModel.orientationDate) &&
        Objects.equals(this.startDate, newHireReadModel.startDate) &&
        Objects.equals(this.pastStartDateReason, newHireReadModel.pastStartDateReason) &&
        Objects.equals(this.mentor, newHireReadModel.mentor) &&
        Objects.equals(this.personalMessage, newHireReadModel.personalMessage) &&
        Objects.equals(this.provisioning, newHireReadModel.provisioning) &&
        Objects.equals(this.onboardingStatus, newHireReadModel.onboardingStatus) &&
        Objects.equals(this.identityUserId, newHireReadModel.identityUserId) &&
        Objects.equals(this.externalUserId, newHireReadModel.externalUserId) &&
        Objects.equals(this.employeeNumber, newHireReadModel.employeeNumber) &&
        Objects.equals(this.sentToProcessHireDate, newHireReadModel.sentToProcessHireDate) &&
        Objects.equals(this.launchedOn, newHireReadModel.launchedOn) &&
        Objects.equals(this.createdAt, newHireReadModel.createdAt) &&
        Objects.equals(this.updatedAt, newHireReadModel.updatedAt)&&
        Objects.equals(this.additionalProperties, newHireReadModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactInformation, job, organizationLevels, compensation, onboardingOwner, hireDate, orientationDate, startDate, pastStartDateReason, mentor, personalMessage, provisioning, onboardingStatus, identityUserId, externalUserId, employeeNumber, sentToProcessHireDate, launchedOn, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewHireReadModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    organizationLevels: ").append(toIndentedString(organizationLevels)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
    sb.append("    onboardingOwner: ").append(toIndentedString(onboardingOwner)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    orientationDate: ").append(toIndentedString(orientationDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    pastStartDateReason: ").append(toIndentedString(pastStartDateReason)).append("\n");
    sb.append("    mentor: ").append(toIndentedString(mentor)).append("\n");
    sb.append("    personalMessage: ").append(toIndentedString(personalMessage)).append("\n");
    sb.append("    provisioning: ").append(toIndentedString(provisioning)).append("\n");
    sb.append("    onboardingStatus: ").append(toIndentedString(onboardingStatus)).append("\n");
    sb.append("    identityUserId: ").append(toIndentedString(identityUserId)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    sentToProcessHireDate: ").append(toIndentedString(sentToProcessHireDate)).append("\n");
    sb.append("    launchedOn: ").append(toIndentedString(launchedOn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("contactInformation");
    openapiFields.add("job");
    openapiFields.add("organizationLevels");
    openapiFields.add("compensation");
    openapiFields.add("onboardingOwner");
    openapiFields.add("hireDate");
    openapiFields.add("orientationDate");
    openapiFields.add("startDate");
    openapiFields.add("pastStartDateReason");
    openapiFields.add("mentor");
    openapiFields.add("personalMessage");
    openapiFields.add("provisioning");
    openapiFields.add("onboardingStatus");
    openapiFields.add("identityUserId");
    openapiFields.add("externalUserId");
    openapiFields.add("employeeNumber");
    openapiFields.add("sentToProcessHireDate");
    openapiFields.add("launchedOn");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewHireReadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewHireReadModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewHireReadModel is not found in the empty JSON string", NewHireReadModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `contactInformation`
      if (jsonObj.get("contactInformation") != null && !jsonObj.get("contactInformation").isJsonNull()) {
        NewHireReadModelContactInformation.validateJsonObject(jsonObj.getAsJsonObject("contactInformation"));
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        NewHireReadModelJob.validateJsonObject(jsonObj.getAsJsonObject("job"));
      }
      if (jsonObj.get("organizationLevels") != null && !jsonObj.get("organizationLevels").isJsonNull()) {
        JsonArray jsonArrayorganizationLevels = jsonObj.getAsJsonArray("organizationLevels");
        if (jsonArrayorganizationLevels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("organizationLevels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `organizationLevels` to be an array in the JSON string but got `%s`", jsonObj.get("organizationLevels").toString()));
          }

          // validate the optional field `organizationLevels` (array)
          for (int i = 0; i < jsonArrayorganizationLevels.size(); i++) {
            NewHireReadModelOrganizationLevelsInner.validateJsonObject(jsonArrayorganizationLevels.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `compensation`
      if (jsonObj.get("compensation") != null && !jsonObj.get("compensation").isJsonNull()) {
        NewHireReadModelCompensation.validateJsonObject(jsonObj.getAsJsonObject("compensation"));
      }
      // validate the optional field `onboardingOwner`
      if (jsonObj.get("onboardingOwner") != null && !jsonObj.get("onboardingOwner").isJsonNull()) {
        NewHireReadModelOnboardingOwner.validateJsonObject(jsonObj.getAsJsonObject("onboardingOwner"));
      }
      if ((jsonObj.get("pastStartDateReason") != null && !jsonObj.get("pastStartDateReason").isJsonNull()) && !jsonObj.get("pastStartDateReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pastStartDateReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pastStartDateReason").toString()));
      }
      // validate the optional field `mentor`
      if (jsonObj.get("mentor") != null && !jsonObj.get("mentor").isJsonNull()) {
        NewHireReadModelMentor.validateJsonObject(jsonObj.getAsJsonObject("mentor"));
      }
      if ((jsonObj.get("personalMessage") != null && !jsonObj.get("personalMessage").isJsonNull()) && !jsonObj.get("personalMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalMessage").toString()));
      }
      // validate the optional field `provisioning`
      if (jsonObj.get("provisioning") != null && !jsonObj.get("provisioning").isJsonNull()) {
        NewHireReadModelProvisioning.validateJsonObject(jsonObj.getAsJsonObject("provisioning"));
      }
      if ((jsonObj.get("onboardingStatus") != null && !jsonObj.get("onboardingStatus").isJsonNull()) && !jsonObj.get("onboardingStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onboardingStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onboardingStatus").toString()));
      }
      if ((jsonObj.get("identityUserId") != null && !jsonObj.get("identityUserId").isJsonNull()) && !jsonObj.get("identityUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityUserId").toString()));
      }
      if ((jsonObj.get("externalUserId") != null && !jsonObj.get("externalUserId").isJsonNull()) && !jsonObj.get("externalUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalUserId").toString()));
      }
      if ((jsonObj.get("employeeNumber") != null && !jsonObj.get("employeeNumber").isJsonNull()) && !jsonObj.get("employeeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewHireReadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewHireReadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewHireReadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewHireReadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<NewHireReadModel>() {
           @Override
           public void write(JsonWriter out, NewHireReadModel value) throws IOException {
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
           public NewHireReadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewHireReadModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NewHireReadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewHireReadModel
  * @throws IOException if the JSON string is invalid with respect to NewHireReadModel
  */
  public static NewHireReadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewHireReadModel.class);
  }

 /**
  * Convert an instance of NewHireReadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

