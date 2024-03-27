# PersonDetailsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllDetails**](PersonDetailsApi.md#getAllDetails) | **GET** /personnel/v1/person-details | Get all person details |
| [**getSingleCompanyDetails**](PersonDetailsApi.md#getSingleCompanyDetails) | **GET** /personnel/v1/companies/{companyId}/person-details | Get all person details for a single company |
| [**getSingleDetailRecord**](PersonDetailsApi.md#getSingleDetailRecord) | **GET** /personnel/v1/person-details/{employeeId} | Get a single person detail record |
| [**getSingleRecord**](PersonDetailsApi.md#getSingleRecord) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/person-details | Get a single person detail record for a single company |


<a name="getAllDetails"></a>
# **getAllDetails**
> List&lt;EmpPersonDetails&gt; getAllDetails().companyId(companyId).employeeId(employeeId).lastName(lastName).emailAddress(emailAddress).addressState(addressState).addressCountry(addressCountry).cobraIsActive(cobraIsActive).cobraStatus(cobraStatus).dateOfCobraEvent(dateOfCobraEvent).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).nationalId(nationalId).nationalIdCountry(nationalIdCountry).page(page).perPage(perPage).execute();

Get all person details

Get all person details.  If no pagination parameters specified, the default/max is applied.   Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Person Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /person-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /person-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /person-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /person-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonDetailsApi;
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
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    String lastName = "lastName_example";
    String emailAddress = "emailAddress_example";
    String addressState = "addressState_example";
    String addressCountry = "addressCountry_example";
    String cobraIsActive = "cobraIsActive_example";
    String cobraStatus = "cobraStatus_example";
    String dateOfCobraEvent = "dateOfCobraEvent_example"; // Used to find date of COBRA event less than, greater than, equal to, or between passed date(s)
    String dateTimeCreated = "dateTimeCreated_example"; // Used to find person record created less than, greater than, equal to, or between passed date(s)
    String dateTimeChanged = "dateTimeChanged_example"; // Used to find person record changed less than, greater than, equal to, or between passed date(s)
    String nationalId = "nationalId_example";
    String nationalIdCountry = "nationalIdCountry_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpPersonDetails> result = client
              .personDetails
              .getAllDetails()
              .companyId(companyId)
              .employeeId(employeeId)
              .lastName(lastName)
              .emailAddress(emailAddress)
              .addressState(addressState)
              .addressCountry(addressCountry)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .dateOfCobraEvent(dateOfCobraEvent)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .nationalId(nationalId)
              .nationalIdCountry(nationalIdCountry)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getAllDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpPersonDetails>> response = client
              .personDetails
              .getAllDetails()
              .companyId(companyId)
              .employeeId(employeeId)
              .lastName(lastName)
              .emailAddress(emailAddress)
              .addressState(addressState)
              .addressCountry(addressCountry)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .dateOfCobraEvent(dateOfCobraEvent)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .nationalId(nationalId)
              .nationalIdCountry(nationalIdCountry)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getAllDetails");
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
| **companyId** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **emailAddress** | **String**|  | [optional] |
| **addressState** | **String**|  | [optional] |
| **addressCountry** | **String**|  | [optional] |
| **cobraIsActive** | **String**|  | [optional] |
| **cobraStatus** | **String**|  | [optional] |
| **dateOfCobraEvent** | **String**| Used to find date of COBRA event less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeCreated** | **String**| Used to find person record created less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeChanged** | **String**| Used to find person record changed less than, greater than, equal to, or between passed date(s) | [optional] |
| **nationalId** | **String**|  | [optional] |
| **nationalIdCountry** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpPersonDetails&gt;**](EmpPersonDetails.md)

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

<a name="getSingleCompanyDetails"></a>
# **getSingleCompanyDetails**
> List&lt;EmpPersonDetails&gt; getSingleCompanyDetails(companyId).companyId2(companyId2).employeeId(employeeId).lastName(lastName).emailAddress(emailAddress).addressState(addressState).addressCountry(addressCountry).cobraIsActive(cobraIsActive).cobraStatus(cobraStatus).dateOfCobraEvent(dateOfCobraEvent).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).nationalId(nationalId).nationalIdCountry(nationalIdCountry).page(page).perPage(perPage).execute();

Get all person details for a single company

Get all person details for a single company.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Person Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/person-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/person-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/person-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/person-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonDetailsApi;
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
    String companyId = "companyId_example";
    String companyId2 = "companyId_example";
    String employeeId = "employeeId_example";
    String lastName = "lastName_example";
    String emailAddress = "emailAddress_example";
    String addressState = "addressState_example";
    String addressCountry = "addressCountry_example";
    String cobraIsActive = "cobraIsActive_example";
    String cobraStatus = "cobraStatus_example";
    String dateOfCobraEvent = "dateOfCobraEvent_example"; // Used to find date of COBRA event less than, greater than, equal to, or between passed date(s)
    String dateTimeCreated = "dateTimeCreated_example"; // Used to find person record created less than, greater than, equal to, or between passed date(s)
    String dateTimeChanged = "dateTimeChanged_example"; // Used to find person record changed less than, greater than, equal to, or between passed date(s)
    String nationalId = "nationalId_example";
    String nationalIdCountry = "nationalIdCountry_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpPersonDetails> result = client
              .personDetails
              .getSingleCompanyDetails(companyId)
              .companyId2(companyId2)
              .employeeId(employeeId)
              .lastName(lastName)
              .emailAddress(emailAddress)
              .addressState(addressState)
              .addressCountry(addressCountry)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .dateOfCobraEvent(dateOfCobraEvent)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .nationalId(nationalId)
              .nationalIdCountry(nationalIdCountry)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getSingleCompanyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpPersonDetails>> response = client
              .personDetails
              .getSingleCompanyDetails(companyId)
              .companyId2(companyId2)
              .employeeId(employeeId)
              .lastName(lastName)
              .emailAddress(emailAddress)
              .addressState(addressState)
              .addressCountry(addressCountry)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .dateOfCobraEvent(dateOfCobraEvent)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .nationalId(nationalId)
              .nationalIdCountry(nationalIdCountry)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getSingleCompanyDetails");
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
| **companyId** | **String**|  | |
| **companyId2** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **emailAddress** | **String**|  | [optional] |
| **addressState** | **String**|  | [optional] |
| **addressCountry** | **String**|  | [optional] |
| **cobraIsActive** | **String**|  | [optional] |
| **cobraStatus** | **String**|  | [optional] |
| **dateOfCobraEvent** | **String**| Used to find date of COBRA event less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeCreated** | **String**| Used to find person record created less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeChanged** | **String**| Used to find person record changed less than, greater than, equal to, or between passed date(s) | [optional] |
| **nationalId** | **String**|  | [optional] |
| **nationalIdCountry** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpPersonDetails&gt;**](EmpPersonDetails.md)

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

<a name="getSingleDetailRecord"></a>
# **getSingleDetailRecord**
> EmpPersonDetails getSingleDetailRecord(employeeId).execute();

Get a single person detail record

Get a single person detail record.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Person Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /person-details/{employeeId}?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /person-details/{employeeId}?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /person-details/{employeeId}?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /person-details/{employeeId}?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonDetailsApi;
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
    try {
      EmpPersonDetails result = client
              .personDetails
              .getSingleDetailRecord(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdditionalName1());
      System.out.println(result.getAdditionalName2());
      System.out.println(result.getAddressId());
      System.out.println(result.getAddressIsOnTaxBoundary());
      System.out.println(result.getAddressLatitude());
      System.out.println(result.getCobraExport());
      System.out.println(result.getCobraIsActive());
      System.out.println(result.getCobraReason());
      System.out.println(result.getCobraStatus());
      System.out.println(result.getCobraStatusDate());
      System.out.println(result.getCommunityBroadcastSmsCode());
      System.out.println(result.getConsentElectronicW2());
      System.out.println(result.getConsentElectronicw2pr());
      System.out.println(result.getDateDeceased());
      System.out.println(result.getDateOfCobraEvent());
      System.out.println(result.getDateOfCobraExport());
      System.out.println(result.getDateOfCobraLetter());
      System.out.println(result.getDateOfI9Expiration());
      System.out.println(result.getDatetimeChanged());
      System.out.println(result.getDatetimeCreated());
      System.out.println(result.getDisabilityType());
      System.out.println(result.getEthnicDescription());
      System.out.println(result.getFormerName());
      System.out.println(result.getHealthBloodType());
      System.out.println(result.getHealthEyes());
      System.out.println(result.getHealthHair());
      System.out.println(result.getHealthHeightFeet());
      System.out.println(result.getHealthHeightInches());
      System.out.println(result.getHealthLastDonateDate());
      System.out.println(result.getHealthWeight());
      System.out.println(result.getI9AlienNumber());
      System.out.println(result.getI9DocA());
      System.out.println(result.getI9DocB());
      System.out.println(result.getI9DocC());
      System.out.println(result.getI9Verified());
      System.out.println(result.getI9VisaType());
      System.out.println(result.getI9WorkAuth());
      System.out.println(result.getIsDisabled());
      System.out.println(result.getIsMultiPayGroup());
      System.out.println(result.getIsSmoker());
      System.out.println(result.getMilitaryService());
      System.out.println(result.getMilitaryBranchServed());
      System.out.println(result.getMilitaryEra());
      System.out.println(result.getMilitaryIsDisabledVet());
      System.out.println(result.getMilitaryIsOthEligVet());
      System.out.println(result.getMilitaryIsOthEligVetBasis());
      System.out.println(result.getMilitaryIsActiveWartimeVet());
      System.out.println(result.getNameFormer());
      System.out.println(result.getPreviousSSN());
      System.out.println(result.getOriginCountry());
      System.out.println(result.getOriginLocation());
      System.out.println(result.getW2IsDeceased());
      System.out.println(result.getCobraNotes());
      System.out.println(result.getAddressSms());
      System.out.println(result.getMilitarySeparationDate());
      System.out.println(result.getHomePhoneIsPrivate());
      System.out.println(result.getSmsApprovals());
      System.out.println(result.getSmsPayNotification());
      System.out.println(result.getI9VisaExpirationDate());
      System.out.println(result.getMilitaryIsMedalVet());
      System.out.println(result.getLastNameNotSameAsSSCard());
      System.out.println(result.getChkCashingInstCode());
      System.out.println(result.getNationality1());
      System.out.println(result.getNationality2());
      System.out.println(result.getNationality3());
      System.out.println(result.getPersonId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getUserName());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getLastName());
      System.out.println(result.getPreferredName());
      System.out.println(result.getNamePrefixCode());
      System.out.println(result.getNameSufixCode());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getEmailAddressAlternate());
      System.out.println(result.getHomePhone());
      System.out.println(result.getHomePhoneCountry());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressCity());
      System.out.println(result.getAddressState());
      System.out.println(result.getAddressZipCode());
      System.out.println(result.getAddressCountry());
      System.out.println(result.getAddressCounty());
      System.out.println(result.getNationalId());
      System.out.println(result.getNationalIdCountry());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getGender());
      System.out.println(result.getEthnicIDCode());
      System.out.println(result.getMaritalStatusCode());
      System.out.println(result.getSsn());
      System.out.println(result.getSsnIsSuppressed());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getSingleDetailRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmpPersonDetails> response = client
              .personDetails
              .getSingleDetailRecord(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getSingleDetailRecord");
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
| **employeeId** | **String**|  | |

### Return type

[**EmpPersonDetails**](EmpPersonDetails.md)

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

<a name="getSingleRecord"></a>
# **getSingleRecord**
> List&lt;EmpPersonDetails&gt; getSingleRecord(companyId, employeeId).companyId2(companyId2).employeeId2(employeeId2).lastName(lastName).emailAddress(emailAddress).addressState(addressState).addressCountry(addressCountry).cobraIsActive(cobraIsActive).cobraStatus(cobraStatus).dateOfCobraEvent(dateOfCobraEvent).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).nationalId(nationalId).nationalIdCountry(nationalIdCountry).page(page).perPage(perPage).execute();

Get a single person detail record for a single company

Get a single person detail record for a single company.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Person Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/person-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/person-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/person-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/person-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonDetailsApi;
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
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    String companyId2 = "companyId_example";
    String employeeId2 = "employeeId_example";
    String lastName = "lastName_example";
    String emailAddress = "emailAddress_example";
    String addressState = "addressState_example";
    String addressCountry = "addressCountry_example";
    String cobraIsActive = "cobraIsActive_example";
    String cobraStatus = "cobraStatus_example";
    String dateOfCobraEvent = "dateOfCobraEvent_example"; // Used to find date of COBRA event less than, greater than, equal to, or between passed date(s)
    String dateTimeCreated = "dateTimeCreated_example"; // Used to find person record created less than, greater than, equal to, or between passed date(s)
    String dateTimeChanged = "dateTimeChanged_example"; // Used to find person record changed less than, greater than, equal to, or between passed date(s)
    String nationalId = "nationalId_example";
    String nationalIdCountry = "nationalIdCountry_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpPersonDetails> result = client
              .personDetails
              .getSingleRecord(companyId, employeeId)
              .companyId2(companyId2)
              .employeeId2(employeeId2)
              .lastName(lastName)
              .emailAddress(emailAddress)
              .addressState(addressState)
              .addressCountry(addressCountry)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .dateOfCobraEvent(dateOfCobraEvent)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .nationalId(nationalId)
              .nationalIdCountry(nationalIdCountry)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getSingleRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpPersonDetails>> response = client
              .personDetails
              .getSingleRecord(companyId, employeeId)
              .companyId2(companyId2)
              .employeeId2(employeeId2)
              .lastName(lastName)
              .emailAddress(emailAddress)
              .addressState(addressState)
              .addressCountry(addressCountry)
              .cobraIsActive(cobraIsActive)
              .cobraStatus(cobraStatus)
              .dateOfCobraEvent(dateOfCobraEvent)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .nationalId(nationalId)
              .nationalIdCountry(nationalIdCountry)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDetailsApi#getSingleRecord");
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
| **companyId** | **String**|  | |
| **employeeId** | **String**|  | |
| **companyId2** | **String**|  | [optional] |
| **employeeId2** | **String**|  | [optional] |
| **lastName** | **String**|  | [optional] |
| **emailAddress** | **String**|  | [optional] |
| **addressState** | **String**|  | [optional] |
| **addressCountry** | **String**|  | [optional] |
| **cobraIsActive** | **String**|  | [optional] |
| **cobraStatus** | **String**|  | [optional] |
| **dateOfCobraEvent** | **String**| Used to find date of COBRA event less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeCreated** | **String**| Used to find person record created less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeChanged** | **String**| Used to find person record changed less than, greater than, equal to, or between passed date(s) | [optional] |
| **nationalId** | **String**|  | [optional] |
| **nationalIdCountry** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpPersonDetails&gt;**](EmpPersonDetails.md)

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

