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
import com.konfigthis.client.model.BusinessRuleImportMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * BusinessRuleImportFileStagingStatus
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BusinessRuleImportFileStagingStatus {
  public static final String SERIALIZED_NAME_STAGING_ID = "stagingId";
  @SerializedName(SERIALIZED_NAME_STAGING_ID)
  private UUID stagingId;

  public static final String SERIALIZED_NAME_FILE_PROCESS_DATE = "fileProcessDate";
  @SerializedName(SERIALIZED_NAME_FILE_PROCESS_DATE)
  private OffsetDateTime fileProcessDate;

  public static final String SERIALIZED_NAME_SERVICE_SUBMITTAL_DATE = "serviceSubmittalDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_SUBMITTAL_DATE)
  private OffsetDateTime serviceSubmittalDate;

  public static final String SERIALIZED_NAME_LAST_REPOST_DATE = "lastRepostDate";
  @SerializedName(SERIALIZED_NAME_LAST_REPOST_DATE)
  private OffsetDateTime lastRepostDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private String transaction;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<BusinessRuleImportMessage> messages = null;

  /**
   * Gets or Sets childTransactionStatuses
   */
  @JsonAdapter(ChildTransactionStatusesEnum.Adapter.class)
 public enum ChildTransactionStatusesEnum {
    BUSINESSRULEIMPORTFILESTAGINGSTATUS_OBJECT("BusinessRuleImportFileStagingStatus object");

    private String value;

    ChildTransactionStatusesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChildTransactionStatusesEnum fromValue(String value) {
      for (ChildTransactionStatusesEnum b : ChildTransactionStatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChildTransactionStatusesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChildTransactionStatusesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChildTransactionStatusesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChildTransactionStatusesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHILD_TRANSACTION_STATUSES = "childTransactionStatuses";
  @SerializedName(SERIALIZED_NAME_CHILD_TRANSACTION_STATUSES)
  private List<ChildTransactionStatusesEnum> childTransactionStatuses = null;

  public BusinessRuleImportFileStagingStatus() {
  }

  public BusinessRuleImportFileStagingStatus stagingId(UUID stagingId) {
    
    
    
    
    this.stagingId = stagingId;
    return this;
  }

   /**
   * Get stagingId
   * @return stagingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getStagingId() {
    return stagingId;
  }


  public void setStagingId(UUID stagingId) {
    
    
    
    this.stagingId = stagingId;
  }


  public BusinessRuleImportFileStagingStatus fileProcessDate(OffsetDateTime fileProcessDate) {
    
    
    
    
    this.fileProcessDate = fileProcessDate;
    return this;
  }

   /**
   * Get fileProcessDate
   * @return fileProcessDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getFileProcessDate() {
    return fileProcessDate;
  }


  public void setFileProcessDate(OffsetDateTime fileProcessDate) {
    
    
    
    this.fileProcessDate = fileProcessDate;
  }


  public BusinessRuleImportFileStagingStatus serviceSubmittalDate(OffsetDateTime serviceSubmittalDate) {
    
    
    
    
    this.serviceSubmittalDate = serviceSubmittalDate;
    return this;
  }

   /**
   * Get serviceSubmittalDate
   * @return serviceSubmittalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getServiceSubmittalDate() {
    return serviceSubmittalDate;
  }


  public void setServiceSubmittalDate(OffsetDateTime serviceSubmittalDate) {
    
    
    
    this.serviceSubmittalDate = serviceSubmittalDate;
  }


  public BusinessRuleImportFileStagingStatus lastRepostDate(OffsetDateTime lastRepostDate) {
    
    
    
    
    this.lastRepostDate = lastRepostDate;
    return this;
  }

   /**
   * Get lastRepostDate
   * @return lastRepostDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastRepostDate() {
    return lastRepostDate;
  }


  public void setLastRepostDate(OffsetDateTime lastRepostDate) {
    
    
    
    this.lastRepostDate = lastRepostDate;
  }


  public BusinessRuleImportFileStagingStatus status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public BusinessRuleImportFileStagingStatus transaction(String transaction) {
    
    
    
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransaction() {
    return transaction;
  }


  public void setTransaction(String transaction) {
    
    
    
    this.transaction = transaction;
  }


  public BusinessRuleImportFileStagingStatus fileName(String fileName) {
    
    
    
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    
    
    
    this.fileName = fileName;
  }


  public BusinessRuleImportFileStagingStatus messages(List<BusinessRuleImportMessage> messages) {
    
    
    
    
    this.messages = messages;
    return this;
  }

  public BusinessRuleImportFileStagingStatus addMessagesItem(BusinessRuleImportMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BusinessRuleImportMessage> getMessages() {
    return messages;
  }


  public void setMessages(List<BusinessRuleImportMessage> messages) {
    
    
    
    this.messages = messages;
  }


  public BusinessRuleImportFileStagingStatus childTransactionStatuses(List<ChildTransactionStatusesEnum> childTransactionStatuses) {
    
    
    
    
    this.childTransactionStatuses = childTransactionStatuses;
    return this;
  }

  public BusinessRuleImportFileStagingStatus addChildTransactionStatusesItem(ChildTransactionStatusesEnum childTransactionStatusesItem) {
    if (this.childTransactionStatuses == null) {
      this.childTransactionStatuses = new ArrayList<>();
    }
    this.childTransactionStatuses.add(childTransactionStatusesItem);
    return this;
  }

   /**
   * Get childTransactionStatuses
   * @return childTransactionStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChildTransactionStatusesEnum> getChildTransactionStatuses() {
    return childTransactionStatuses;
  }


  public void setChildTransactionStatuses(List<ChildTransactionStatusesEnum> childTransactionStatuses) {
    
    
    
    this.childTransactionStatuses = childTransactionStatuses;
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
   * @return the BusinessRuleImportFileStagingStatus instance itself
   */
  public BusinessRuleImportFileStagingStatus putAdditionalProperty(String key, Object value) {
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
    BusinessRuleImportFileStagingStatus businessRuleImportFileStagingStatus = (BusinessRuleImportFileStagingStatus) o;
    return Objects.equals(this.stagingId, businessRuleImportFileStagingStatus.stagingId) &&
        Objects.equals(this.fileProcessDate, businessRuleImportFileStagingStatus.fileProcessDate) &&
        Objects.equals(this.serviceSubmittalDate, businessRuleImportFileStagingStatus.serviceSubmittalDate) &&
        Objects.equals(this.lastRepostDate, businessRuleImportFileStagingStatus.lastRepostDate) &&
        Objects.equals(this.status, businessRuleImportFileStagingStatus.status) &&
        Objects.equals(this.transaction, businessRuleImportFileStagingStatus.transaction) &&
        Objects.equals(this.fileName, businessRuleImportFileStagingStatus.fileName) &&
        Objects.equals(this.messages, businessRuleImportFileStagingStatus.messages) &&
        Objects.equals(this.childTransactionStatuses, businessRuleImportFileStagingStatus.childTransactionStatuses)&&
        Objects.equals(this.additionalProperties, businessRuleImportFileStagingStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stagingId, fileProcessDate, serviceSubmittalDate, lastRepostDate, status, transaction, fileName, messages, childTransactionStatuses, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessRuleImportFileStagingStatus {\n");
    sb.append("    stagingId: ").append(toIndentedString(stagingId)).append("\n");
    sb.append("    fileProcessDate: ").append(toIndentedString(fileProcessDate)).append("\n");
    sb.append("    serviceSubmittalDate: ").append(toIndentedString(serviceSubmittalDate)).append("\n");
    sb.append("    lastRepostDate: ").append(toIndentedString(lastRepostDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    childTransactionStatuses: ").append(toIndentedString(childTransactionStatuses)).append("\n");
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
    openapiFields.add("stagingId");
    openapiFields.add("fileProcessDate");
    openapiFields.add("serviceSubmittalDate");
    openapiFields.add("lastRepostDate");
    openapiFields.add("status");
    openapiFields.add("transaction");
    openapiFields.add("fileName");
    openapiFields.add("messages");
    openapiFields.add("childTransactionStatuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessRuleImportFileStagingStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessRuleImportFileStagingStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessRuleImportFileStagingStatus is not found in the empty JSON string", BusinessRuleImportFileStagingStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("stagingId") != null && !jsonObj.get("stagingId").isJsonNull()) && !jsonObj.get("stagingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stagingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stagingId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) && !jsonObj.get("transaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction").toString()));
      }
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull()) {
        JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
        if (jsonArraymessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("messages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
          }

          // validate the optional field `messages` (array)
          for (int i = 0; i < jsonArraymessages.size(); i++) {
            BusinessRuleImportMessage.validateJsonObject(jsonArraymessages.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("childTransactionStatuses") != null && !jsonObj.get("childTransactionStatuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `childTransactionStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("childTransactionStatuses").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessRuleImportFileStagingStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessRuleImportFileStagingStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessRuleImportFileStagingStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessRuleImportFileStagingStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessRuleImportFileStagingStatus>() {
           @Override
           public void write(JsonWriter out, BusinessRuleImportFileStagingStatus value) throws IOException {
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
           public BusinessRuleImportFileStagingStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BusinessRuleImportFileStagingStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BusinessRuleImportFileStagingStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessRuleImportFileStagingStatus
  * @throws IOException if the JSON string is invalid with respect to BusinessRuleImportFileStagingStatus
  */
  public static BusinessRuleImportFileStagingStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessRuleImportFileStagingStatus.class);
  }

 /**
  * Convert an instance of BusinessRuleImportFileStagingStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

