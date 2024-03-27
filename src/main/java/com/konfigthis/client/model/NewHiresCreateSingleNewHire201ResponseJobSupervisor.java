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
import com.konfigthis.client.model.NewHiresCreateSingleNewHire201ResponseJobSupervisorName;
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
 * Supervisor of the job
 */
@ApiModel(description = "Supervisor of the job")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewHiresCreateSingleNewHire201ResponseJobSupervisor {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NewHiresCreateSingleNewHire201ResponseJobSupervisorName name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "externalUserId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public NewHiresCreateSingleNewHire201ResponseJobSupervisor() {
  }

  public NewHiresCreateSingleNewHire201ResponseJobSupervisor id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Id of the supervisor
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28e2f53b-2366-4aef-98f0-f8b765bb9f7aX", value = "Id of the supervisor")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisor name(NewHiresCreateSingleNewHire201ResponseJobSupervisorName name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NewHiresCreateSingleNewHire201ResponseJobSupervisorName getName() {
    return name;
  }


  public void setName(NewHiresCreateSingleNewHire201ResponseJobSupervisorName name) {
    
    
    
    this.name = name;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisor email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The email of the supervisor
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jsanto@example.com", value = "The email of the supervisor")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public NewHiresCreateSingleNewHire201ResponseJobSupervisor externalUserId(String externalUserId) {
    
    
    
    
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * The external user id of the supervisor
   * @return externalUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BF5DAEBD-9149-40BB-9AB3-C4755F98F4D0", value = "The external user id of the supervisor")

  public String getExternalUserId() {
    return externalUserId;
  }


  public void setExternalUserId(String externalUserId) {
    
    
    
    this.externalUserId = externalUserId;
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
   * @return the NewHiresCreateSingleNewHire201ResponseJobSupervisor instance itself
   */
  public NewHiresCreateSingleNewHire201ResponseJobSupervisor putAdditionalProperty(String key, Object value) {
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
    NewHiresCreateSingleNewHire201ResponseJobSupervisor newHiresCreateSingleNewHire201ResponseJobSupervisor = (NewHiresCreateSingleNewHire201ResponseJobSupervisor) o;
    return Objects.equals(this.id, newHiresCreateSingleNewHire201ResponseJobSupervisor.id) &&
        Objects.equals(this.name, newHiresCreateSingleNewHire201ResponseJobSupervisor.name) &&
        Objects.equals(this.email, newHiresCreateSingleNewHire201ResponseJobSupervisor.email) &&
        Objects.equals(this.externalUserId, newHiresCreateSingleNewHire201ResponseJobSupervisor.externalUserId)&&
        Objects.equals(this.additionalProperties, newHiresCreateSingleNewHire201ResponseJobSupervisor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, externalUserId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewHiresCreateSingleNewHire201ResponseJobSupervisor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("externalUserId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewHiresCreateSingleNewHire201ResponseJobSupervisor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewHiresCreateSingleNewHire201ResponseJobSupervisor.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewHiresCreateSingleNewHire201ResponseJobSupervisor is not found in the empty JSON string", NewHiresCreateSingleNewHire201ResponseJobSupervisor.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        NewHiresCreateSingleNewHire201ResponseJobSupervisorName.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("externalUserId") != null && !jsonObj.get("externalUserId").isJsonNull()) && !jsonObj.get("externalUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalUserId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewHiresCreateSingleNewHire201ResponseJobSupervisor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewHiresCreateSingleNewHire201ResponseJobSupervisor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewHiresCreateSingleNewHire201ResponseJobSupervisor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewHiresCreateSingleNewHire201ResponseJobSupervisor.class));

       return (TypeAdapter<T>) new TypeAdapter<NewHiresCreateSingleNewHire201ResponseJobSupervisor>() {
           @Override
           public void write(JsonWriter out, NewHiresCreateSingleNewHire201ResponseJobSupervisor value) throws IOException {
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
           public NewHiresCreateSingleNewHire201ResponseJobSupervisor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewHiresCreateSingleNewHire201ResponseJobSupervisor instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NewHiresCreateSingleNewHire201ResponseJobSupervisor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewHiresCreateSingleNewHire201ResponseJobSupervisor
  * @throws IOException if the JSON string is invalid with respect to NewHiresCreateSingleNewHire201ResponseJobSupervisor
  */
  public static NewHiresCreateSingleNewHire201ResponseJobSupervisor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewHiresCreateSingleNewHire201ResponseJobSupervisor.class);
  }

 /**
  * Convert an instance of NewHiresCreateSingleNewHire201ResponseJobSupervisor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

