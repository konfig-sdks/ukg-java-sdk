# ContactApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPersonnelContactDetails**](ContactApi.md#getPersonnelContactDetails) | **GET** /personnel/v1/contacts/{contactId} | Get all details for a single person assigned to an employee as a contact |
| [**getPersonnelDetails**](ContactApi.md#getPersonnelDetails) | **GET** /personnel/v1/contacts | Get all details for a person assigned to an employee as a contact |


<a name="getPersonnelContactDetails"></a>
# **getPersonnelContactDetails**
> Contact getPersonnelContactDetails(contactId).employeeId(employeeId).isActive(isActive).relationshipCode(relationshipCode).contactId2(contactId2).countryCode(countryCode).cobraIsActive(cobraIsActive).cobraStatus(cobraStatus).isBeneficiary(isBeneficiary).isDependent(isDependent).dateOfCobraEvent(dateOfCobraEvent).statusAsOfDate(statusAsOfDate).page(page).perPage(perPage).execute();

Get all details for a single person assigned to an employee as a contact

Get all details for a single person assigned to an employee as a contact.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /contacts/{contactId}?statusAsOfDate&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /contacts/{contactId}?statusAsOfDate&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /contacts/{contactId}?statusAsOfDate&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /contacts/{contactId}?statusAsOfDate&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    // Configure OAuth2 access token for authorization: OauthSecurity
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Ukg client = new Ukg(configuration);
    String contactId = "contactId_example";
    String employeeId = "employeeId_example";
    String isActive = "isActive_example";
    String relationshipCode = "relationshipCode_example";
    String contactId2 = "contactId_example";
    String countryCode = "countryCode_example";
    String cobraIsActive = "cobraIsActive_example";
    String cobraStatus = "cobraStatus_example";
    String isBeneficiary = "isBeneficiary_example";
    String isDependent = "isDependent_example";
    String dateOfCobraEvent = "dateOfCobraEvent_example"; // Used to find date of COBRA event less than, greater than, equal to, or between passed date(s)
    String statusAsOfDate = "statusAsOfDate_example"; // Used to find contact status as of date less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      Contact result = client
              .contact
              .getPersonnelContactDetails(contactId)
              .employeeId(employeeId)
              .isActive(isActive)
              .relationshipCode(relationshipCode)
              .contactId2(contactId2)
              .countryCode(countryCode)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .isBeneficiary(isBeneficiary)
              .isDependent(isDependent)
              .dateOfCobraEvent(dateOfCobraEvent)
              .statusAsOfDate(statusAsOfDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getCity());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCounty());
      System.out.println(result.getAddressIsDifferentFromEmployee());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getState());
      System.out.println(result.getZipCode());
      System.out.println(result.getCobraExport());
      System.out.println(result.getCobraIsActive());
      System.out.println(result.getCobraReason());
      System.out.println(result.getCobraStatus());
      System.out.println(result.getCobraStatusDate());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getDateOfCOBRAEvent());
      System.out.println(result.getDateOfCOBRALetter());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getGender());
      System.out.println(result.getImportId());
      System.out.println(result.getIsBeneficiary());
      System.out.println(result.getIsDependent());
      System.out.println(result.getIsDisabled());
      System.out.println(result.getIsEmergencyContact());
      System.out.println(result.getIsSmoker());
      System.out.println(result.getIsStudent());
      System.out.println(result.getMarriageDate());
      System.out.println(result.getFirstName());
      System.out.println(result.getFormerName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getNameSuffix());
      System.out.println(result.getOccupation());
      System.out.println(result.getOtherInsurance());
      System.out.println(result.getHomePhoneCountry());
      System.out.println(result.getHomePhoneNumber());
      System.out.println(result.getOtherPhoneNumber());
      System.out.println(result.getOtherPhoneType());
      System.out.println(result.getPreferredPhoneNumber());
      System.out.println(result.getRelationshipCode());
      System.out.println(result.getRelationshipDescription());
      System.out.println(result.getSsn());
      System.out.println(result.getContactId());
      System.out.println(result.getUserDefinedField01());
      System.out.println(result.getWorkPhoneExtension());
      System.out.println(result.getWorkPhoneNumber());
      System.out.println(result.getCobraNotes());
      System.out.println(result.getNotes());
      System.out.println(result.getIsActive());
      System.out.println(result.getStatusAsOfDate());
      System.out.println(result.getDeathDate());
      System.out.println(result.getDivorceDate());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getOtherPhoneCountryCode());
      System.out.println(result.getHealthCareId());
      System.out.println(result.getNationalId());
      System.out.println(result.getNationalIdExpirationDate());
      System.out.println(result.getPersonID());
      System.out.println(result.getAddressID());
      System.out.println(result.getWorkPhoneId());
      System.out.println(result.getHomePhoneId());
      System.out.println(result.getOtherPhoneId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#getPersonnelContactDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contact> response = client
              .contact
              .getPersonnelContactDetails(contactId)
              .employeeId(employeeId)
              .isActive(isActive)
              .relationshipCode(relationshipCode)
              .contactId2(contactId2)
              .countryCode(countryCode)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .isBeneficiary(isBeneficiary)
              .isDependent(isDependent)
              .dateOfCobraEvent(dateOfCobraEvent)
              .statusAsOfDate(statusAsOfDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#getPersonnelContactDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contactId** | **String**|  | |
| **employeeId** | **String**|  | [optional] |
| **isActive** | **String**|  | [optional] |
| **relationshipCode** | **String**|  | [optional] |
| **contactId2** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **cobraIsActive** | **String**|  | [optional] |
| **cobraStatus** | **String**|  | [optional] |
| **isBeneficiary** | **String**|  | [optional] |
| **isDependent** | **String**|  | [optional] |
| **dateOfCobraEvent** | **String**| Used to find date of COBRA event less than, greater than, equal to, or between passed date(s) | [optional] |
| **statusAsOfDate** | **String**| Used to find contact status as of date less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**Contact**](Contact.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

<a name="getPersonnelDetails"></a>
# **getPersonnelDetails**
> Contact getPersonnelDetails().employeeId(employeeId).isActive(isActive).relationshipCode(relationshipCode).contactId(contactId).countryCode(countryCode).cobraIsActive(cobraIsActive).cobraStatus(cobraStatus).isBeneficiary(isBeneficiary).isDependent(isDependent).dateOfCobraEvent(dateOfCobraEvent).statusAsOfDate(statusAsOfDate).page(page).perPage(perPage).execute();

Get all details for a person assigned to an employee as a contact

Get all details for a person assigned to an employee as a contact.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /contacts?statusAsOfDate&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /contacts?statusAsOfDate&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /contacts?statusAsOfDate&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /contacts?statusAsOfDate&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    // Configure OAuth2 access token for authorization: OauthSecurity
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Ukg client = new Ukg(configuration);
    String employeeId = "employeeId_example";
    String isActive = "isActive_example";
    String relationshipCode = "relationshipCode_example";
    String contactId = "contactId_example";
    String countryCode = "countryCode_example";
    String cobraIsActive = "cobraIsActive_example";
    String cobraStatus = "cobraStatus_example";
    String isBeneficiary = "isBeneficiary_example";
    String isDependent = "isDependent_example";
    String dateOfCobraEvent = "dateOfCobraEvent_example"; // Used to find date of COBRA event less than, greater than, equal to, or between passed date(s)
    String statusAsOfDate = "statusAsOfDate_example"; // Used to find contact status as of date less than, greater than,equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      Contact result = client
              .contact
              .getPersonnelDetails()
              .employeeId(employeeId)
              .isActive(isActive)
              .relationshipCode(relationshipCode)
              .contactId(contactId)
              .countryCode(countryCode)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .isBeneficiary(isBeneficiary)
              .isDependent(isDependent)
              .dateOfCobraEvent(dateOfCobraEvent)
              .statusAsOfDate(statusAsOfDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getCity());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCounty());
      System.out.println(result.getAddressIsDifferentFromEmployee());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getState());
      System.out.println(result.getZipCode());
      System.out.println(result.getCobraExport());
      System.out.println(result.getCobraIsActive());
      System.out.println(result.getCobraReason());
      System.out.println(result.getCobraStatus());
      System.out.println(result.getCobraStatusDate());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getDateOfCOBRAEvent());
      System.out.println(result.getDateOfCOBRALetter());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getGender());
      System.out.println(result.getImportId());
      System.out.println(result.getIsBeneficiary());
      System.out.println(result.getIsDependent());
      System.out.println(result.getIsDisabled());
      System.out.println(result.getIsEmergencyContact());
      System.out.println(result.getIsSmoker());
      System.out.println(result.getIsStudent());
      System.out.println(result.getMarriageDate());
      System.out.println(result.getFirstName());
      System.out.println(result.getFormerName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getNameSuffix());
      System.out.println(result.getOccupation());
      System.out.println(result.getOtherInsurance());
      System.out.println(result.getHomePhoneCountry());
      System.out.println(result.getHomePhoneNumber());
      System.out.println(result.getOtherPhoneNumber());
      System.out.println(result.getOtherPhoneType());
      System.out.println(result.getPreferredPhoneNumber());
      System.out.println(result.getRelationshipCode());
      System.out.println(result.getRelationshipDescription());
      System.out.println(result.getSsn());
      System.out.println(result.getContactId());
      System.out.println(result.getUserDefinedField01());
      System.out.println(result.getWorkPhoneExtension());
      System.out.println(result.getWorkPhoneNumber());
      System.out.println(result.getCobraNotes());
      System.out.println(result.getNotes());
      System.out.println(result.getIsActive());
      System.out.println(result.getStatusAsOfDate());
      System.out.println(result.getDeathDate());
      System.out.println(result.getDivorceDate());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getOtherPhoneCountryCode());
      System.out.println(result.getHealthCareId());
      System.out.println(result.getNationalId());
      System.out.println(result.getNationalIdExpirationDate());
      System.out.println(result.getPersonID());
      System.out.println(result.getAddressID());
      System.out.println(result.getWorkPhoneId());
      System.out.println(result.getHomePhoneId());
      System.out.println(result.getOtherPhoneId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#getPersonnelDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contact> response = client
              .contact
              .getPersonnelDetails()
              .employeeId(employeeId)
              .isActive(isActive)
              .relationshipCode(relationshipCode)
              .contactId(contactId)
              .countryCode(countryCode)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .isBeneficiary(isBeneficiary)
              .isDependent(isDependent)
              .dateOfCobraEvent(dateOfCobraEvent)
              .statusAsOfDate(statusAsOfDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#getPersonnelDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employeeId** | **String**|  | [optional] |
| **isActive** | **String**|  | [optional] |
| **relationshipCode** | **String**|  | [optional] |
| **contactId** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **cobraIsActive** | **String**|  | [optional] |
| **cobraStatus** | **String**|  | [optional] |
| **isBeneficiary** | **String**|  | [optional] |
| **isDependent** | **String**|  | [optional] |
| **dateOfCobraEvent** | **String**| Used to find date of COBRA event less than, greater than, equal to, or between passed date(s) | [optional] |
| **statusAsOfDate** | **String**| Used to find contact status as of date less than, greater than,equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**Contact**](Contact.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

