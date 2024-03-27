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
import com.konfigthis.client.model.ContactInfo;
import com.konfigthis.client.model.CreatorBackgroundCheckIntegration;
import com.konfigthis.client.model.CreatorPreferredLocale;
import com.konfigthis.client.model.Hyperlinks;
import com.konfigthis.client.model.Links;
import com.konfigthis.client.model.Name;
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
 * The section that contains details of a recruiter who submitted this background check order.
 */
@ApiModel(description = "The section that contains details of a recruiter who submitted this background check order.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Creator {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PERSON_ID = "person_id";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_INTEGRATION_USER_ID = "integration_user_id";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_USER_ID)
  private String integrationUserId;

  public static final String SERIALIZED_NAME_IS_INTERNAL = "is_internal";
  @SerializedName(SERIALIZED_NAME_IS_INTERNAL)
  private Boolean isInternal;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_PREFERRED_LOCALE = "preferred_locale";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LOCALE)
  private CreatorPreferredLocale preferredLocale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private List<Name> name = null;

  public static final String SERIALIZED_NAME_CONTACT_INFO = "contact_info";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFO)
  private List<ContactInfo> contactInfo = null;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<Object> roles = null;

  public static final String SERIALIZED_NAME_HYPERLINKS = "hyperlinks";
  @SerializedName(SERIALIZED_NAME_HYPERLINKS)
  private List<Hyperlinks> hyperlinks = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Links> links = null;

  public static final String SERIALIZED_NAME_BACKGROUND_CHECK_INTEGRATION = "background_check_integration";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_CHECK_INTEGRATION)
  private CreatorBackgroundCheckIntegration backgroundCheckIntegration;

  public Creator() {
  }

  public Creator id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The id of the recruiter who created the background check order.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the recruiter who created the background check order.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Creator personId(String personId) {
    
    
    
    
    this.personId = personId;
    return this;
  }

   /**
   * The recruiter id in the core HR system.
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The recruiter id in the core HR system.")

  public String getPersonId() {
    return personId;
  }


  public void setPersonId(String personId) {
    
    
    
    this.personId = personId;
  }


  public Creator createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date of this user creation date.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of this user creation date.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Creator integrationUserId(String integrationUserId) {
    
    
    
    
    this.integrationUserId = integrationUserId;
    return this;
  }

   /**
   * The alternative user id that can be used in third-party vendors’ integrations. Returned only for users with the “recruiter”, “hiring-manager”, or “recruiting-administrator” role.
   * @return integrationUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The alternative user id that can be used in third-party vendors’ integrations. Returned only for users with the “recruiter”, “hiring-manager”, or “recruiting-administrator” role.")

  public String getIntegrationUserId() {
    return integrationUserId;
  }


  public void setIntegrationUserId(String integrationUserId) {
    
    
    
    this.integrationUserId = integrationUserId;
  }


  public Creator isInternal(Boolean isInternal) {
    
    
    
    
    this.isInternal = isInternal;
    return this;
  }

   /**
   * A flag indicating whether the recruiter is an internal employee. 
   * @return isInternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the recruiter is an internal employee. ")

  public Boolean getIsInternal() {
    return isInternal;
  }


  public void setIsInternal(Boolean isInternal) {
    
    
    
    this.isInternal = isInternal;
  }


  public Creator isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * A flag indicating whether the recruiter is an active employee. Can only be specified when is_internal is true.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the recruiter is an active employee. Can only be specified when is_internal is true.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
  }


  public Creator preferredLocale(CreatorPreferredLocale preferredLocale) {
    
    
    
    
    this.preferredLocale = preferredLocale;
    return this;
  }

   /**
   * Get preferredLocale
   * @return preferredLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatorPreferredLocale getPreferredLocale() {
    return preferredLocale;
  }


  public void setPreferredLocale(CreatorPreferredLocale preferredLocale) {
    
    
    
    this.preferredLocale = preferredLocale;
  }


  public Creator name(List<Name> name) {
    
    
    
    
    this.name = name;
    return this;
  }

  public Creator addNameItem(Name nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Name> getName() {
    return name;
  }


  public void setName(List<Name> name) {
    
    
    
    this.name = name;
  }


  public Creator contactInfo(List<ContactInfo> contactInfo) {
    
    
    
    
    this.contactInfo = contactInfo;
    return this;
  }

  public Creator addContactInfoItem(ContactInfo contactInfoItem) {
    if (this.contactInfo == null) {
      this.contactInfo = new ArrayList<>();
    }
    this.contactInfo.add(contactInfoItem);
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ContactInfo> getContactInfo() {
    return contactInfo;
  }


  public void setContactInfo(List<ContactInfo> contactInfo) {
    
    
    
    this.contactInfo = contactInfo;
  }


  public Creator roles(List<Object> roles) {
    
    
    
    
    this.roles = roles;
    return this;
  }

  public Creator addRolesItem(Object rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * 
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getRoles() {
    return roles;
  }


  public void setRoles(List<Object> roles) {
    
    
    
    this.roles = roles;
  }


  public Creator hyperlinks(List<Hyperlinks> hyperlinks) {
    
    
    
    
    this.hyperlinks = hyperlinks;
    return this;
  }

  public Creator addHyperlinksItem(Hyperlinks hyperlinksItem) {
    if (this.hyperlinks == null) {
      this.hyperlinks = new ArrayList<>();
    }
    this.hyperlinks.add(hyperlinksItem);
    return this;
  }

   /**
   * Get hyperlinks
   * @return hyperlinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Hyperlinks> getHyperlinks() {
    return hyperlinks;
  }


  public void setHyperlinks(List<Hyperlinks> hyperlinks) {
    
    
    
    this.hyperlinks = hyperlinks;
  }


  public Creator updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public Creator links(List<Links> links) {
    
    
    
    
    this.links = links;
    return this;
  }

  public Creator addLinksItem(Links linksItem) {
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


  public Creator backgroundCheckIntegration(CreatorBackgroundCheckIntegration backgroundCheckIntegration) {
    
    
    
    
    this.backgroundCheckIntegration = backgroundCheckIntegration;
    return this;
  }

   /**
   * Get backgroundCheckIntegration
   * @return backgroundCheckIntegration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatorBackgroundCheckIntegration getBackgroundCheckIntegration() {
    return backgroundCheckIntegration;
  }


  public void setBackgroundCheckIntegration(CreatorBackgroundCheckIntegration backgroundCheckIntegration) {
    
    
    
    this.backgroundCheckIntegration = backgroundCheckIntegration;
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
   * @return the Creator instance itself
   */
  public Creator putAdditionalProperty(String key, Object value) {
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
    Creator creator = (Creator) o;
    return Objects.equals(this.id, creator.id) &&
        Objects.equals(this.personId, creator.personId) &&
        Objects.equals(this.createdAt, creator.createdAt) &&
        Objects.equals(this.integrationUserId, creator.integrationUserId) &&
        Objects.equals(this.isInternal, creator.isInternal) &&
        Objects.equals(this.isActive, creator.isActive) &&
        Objects.equals(this.preferredLocale, creator.preferredLocale) &&
        Objects.equals(this.name, creator.name) &&
        Objects.equals(this.contactInfo, creator.contactInfo) &&
        Objects.equals(this.roles, creator.roles) &&
        Objects.equals(this.hyperlinks, creator.hyperlinks) &&
        Objects.equals(this.updatedAt, creator.updatedAt) &&
        Objects.equals(this.links, creator.links) &&
        Objects.equals(this.backgroundCheckIntegration, creator.backgroundCheckIntegration)&&
        Objects.equals(this.additionalProperties, creator.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personId, createdAt, integrationUserId, isInternal, isActive, preferredLocale, name, contactInfo, roles, hyperlinks, updatedAt, links, backgroundCheckIntegration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creator {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    integrationUserId: ").append(toIndentedString(integrationUserId)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    preferredLocale: ").append(toIndentedString(preferredLocale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    hyperlinks: ").append(toIndentedString(hyperlinks)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    backgroundCheckIntegration: ").append(toIndentedString(backgroundCheckIntegration)).append("\n");
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
    openapiFields.add("person_id");
    openapiFields.add("created_at");
    openapiFields.add("integration_user_id");
    openapiFields.add("is_internal");
    openapiFields.add("is_active");
    openapiFields.add("preferred_locale");
    openapiFields.add("name");
    openapiFields.add("contact_info");
    openapiFields.add("roles");
    openapiFields.add("hyperlinks");
    openapiFields.add("updated_at");
    openapiFields.add("links");
    openapiFields.add("background_check_integration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Creator
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Creator.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Creator is not found in the empty JSON string", Creator.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("person_id") != null && !jsonObj.get("person_id").isJsonNull()) && !jsonObj.get("person_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `person_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("person_id").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("integration_user_id") != null && !jsonObj.get("integration_user_id").isJsonNull()) && !jsonObj.get("integration_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integration_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integration_user_id").toString()));
      }
      // validate the optional field `preferred_locale`
      if (jsonObj.get("preferred_locale") != null && !jsonObj.get("preferred_locale").isJsonNull()) {
        CreatorPreferredLocale.validateJsonObject(jsonObj.getAsJsonObject("preferred_locale"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        JsonArray jsonArrayname = jsonObj.getAsJsonArray("name");
        if (jsonArrayname != null) {
          // ensure the json data is an array
          if (!jsonObj.get("name").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be an array in the JSON string but got `%s`", jsonObj.get("name").toString()));
          }

          // validate the optional field `name` (array)
          for (int i = 0; i < jsonArrayname.size(); i++) {
            Name.validateJsonObject(jsonArrayname.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("contact_info") != null && !jsonObj.get("contact_info").isJsonNull()) {
        JsonArray jsonArraycontactInfo = jsonObj.getAsJsonArray("contact_info");
        if (jsonArraycontactInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contact_info").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contact_info` to be an array in the JSON string but got `%s`", jsonObj.get("contact_info").toString()));
          }

          // validate the optional field `contact_info` (array)
          for (int i = 0; i < jsonArraycontactInfo.size(); i++) {
            ContactInfo.validateJsonObject(jsonArraycontactInfo.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if (jsonObj.get("hyperlinks") != null && !jsonObj.get("hyperlinks").isJsonNull()) {
        JsonArray jsonArrayhyperlinks = jsonObj.getAsJsonArray("hyperlinks");
        if (jsonArrayhyperlinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hyperlinks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hyperlinks` to be an array in the JSON string but got `%s`", jsonObj.get("hyperlinks").toString()));
          }

          // validate the optional field `hyperlinks` (array)
          for (int i = 0; i < jsonArrayhyperlinks.size(); i++) {
            Hyperlinks.validateJsonObject(jsonArrayhyperlinks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
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
      // validate the optional field `background_check_integration`
      if (jsonObj.get("background_check_integration") != null && !jsonObj.get("background_check_integration").isJsonNull()) {
        CreatorBackgroundCheckIntegration.validateJsonObject(jsonObj.getAsJsonObject("background_check_integration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Creator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Creator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Creator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Creator.class));

       return (TypeAdapter<T>) new TypeAdapter<Creator>() {
           @Override
           public void write(JsonWriter out, Creator value) throws IOException {
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
           public Creator read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Creator instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Creator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Creator
  * @throws IOException if the JSON string is invalid with respect to Creator
  */
  public static Creator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Creator.class);
  }

 /**
  * Convert an instance of Creator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

