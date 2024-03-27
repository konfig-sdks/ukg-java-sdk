# NewHiresApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSingleNewHire**](NewHiresApi.md#createSingleNewHire) | **POST** /tenants/{tenantIdentifier}/new-hires | Creates a single New Hire |
| [**getById**](NewHiresApi.md#getById) | **GET** /tenants/{tenantIdentifier}/new-hires/{id} | Gets a single New Hire by Id |


<a name="createSingleNewHire"></a>
# **createSingleNewHire**
> NewHiresCreateSingleNewHireResponse createSingleNewHire(tenantIdentifier, newHiresCreateSingleNewHireRequest).execute();

Creates a single New Hire

Creates a single New Hire

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NewHiresApi;
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
    String tenantIdentifier = "tenantIdentifier_example"; // Unique identifier of the tenant to interact with. Can be either the tenant alias or tenant ID.
    NewHiresCreateSingleNewHireRequestContactInformation contactInformation = new NewHiresCreateSingleNewHireRequestContactInformation();
    NewHiresCreateSingleNewHireRequestJob job = new NewHiresCreateSingleNewHireRequestJob();
    List<NewHiresCreateSingleNewHireRequestOrganizationLevelsInner> organizationLevels = Arrays.asList();
    NewHiresCreateSingleNewHireRequestCompensation compensation = new NewHiresCreateSingleNewHireRequestCompensation();
    String onboardingOwnerId = "onboardingOwnerId_example"; // External user identifier of the onboarding owner
    OffsetDateTime hireDate = OffsetDateTime.now(); // Hire date of the new hire
    OffsetDateTime orientationDate = OffsetDateTime.now(); // Orientation date of the new hire
    OffsetDateTime startDate = OffsetDateTime.now(); // Start date of the new hire
    String pastStartDateReason = "pastStartDateReason_example"; // Reason why the new hire start date is 4 or more business days in the past
    NewHiresCreateSingleNewHireRequestMentor mentor = new NewHiresCreateSingleNewHireRequestMentor();
    String personalMessage = "personalMessage_example"; // Personal message for the new hire
    try {
      NewHiresCreateSingleNewHireResponse result = client
              .newHires
              .createSingleNewHire(tenantIdentifier)
              .contactInformation(contactInformation)
              .job(job)
              .organizationLevels(organizationLevels)
              .compensation(compensation)
              .onboardingOwnerId(onboardingOwnerId)
              .hireDate(hireDate)
              .orientationDate(orientationDate)
              .startDate(startDate)
              .pastStartDateReason(pastStartDateReason)
              .mentor(mentor)
              .personalMessage(personalMessage)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getContactInformation());
      System.out.println(result.getJob());
      System.out.println(result.getOrganizationLevels());
      System.out.println(result.getCompensation());
      System.out.println(result.getOnboardingOwner());
      System.out.println(result.getHireDate());
      System.out.println(result.getOrientationDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getPastStartDateReason());
      System.out.println(result.getMentor());
      System.out.println(result.getPersonalMessage());
      System.out.println(result.getProvisioning());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getIdentityUserId());
      System.out.println(result.getExternalUserId());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getSentToProcessHireDate());
      System.out.println(result.getLaunchedOn());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling NewHiresApi#createSingleNewHire");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NewHiresCreateSingleNewHireResponse> response = client
              .newHires
              .createSingleNewHire(tenantIdentifier)
              .contactInformation(contactInformation)
              .job(job)
              .organizationLevels(organizationLevels)
              .compensation(compensation)
              .onboardingOwnerId(onboardingOwnerId)
              .hireDate(hireDate)
              .orientationDate(orientationDate)
              .startDate(startDate)
              .pastStartDateReason(pastStartDateReason)
              .mentor(mentor)
              .personalMessage(personalMessage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NewHiresApi#createSingleNewHire");
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
| **tenantIdentifier** | **String**| Unique identifier of the tenant to interact with. Can be either the tenant alias or tenant ID. | |
| **newHiresCreateSingleNewHireRequest** | [**NewHiresCreateSingleNewHireRequest**](NewHiresCreateSingleNewHireRequest.md)| New Hire object to be added | |

### Return type

[**NewHiresCreateSingleNewHireResponse**](NewHiresCreateSingleNewHireResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | New Hire created |  * Location - Location of resource <br>  |

<a name="getById"></a>
# **getById**
> NewHiresGetByIdResponse getById(tenantIdentifier, id).execute();

Gets a single New Hire by Id

Gets a single New Hire by Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NewHiresApi;
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
    String tenantIdentifier = "tenantIdentifier_example"; // Unique identifier of the tenant to interact with. Can be either the tenant alias or tenant ID.
    String id = "id_example"; // Unique identifier for the New Hire
    try {
      NewHiresGetByIdResponse result = client
              .newHires
              .getById(tenantIdentifier, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getContactInformation());
      System.out.println(result.getJob());
      System.out.println(result.getOrganizationLevels());
      System.out.println(result.getCompensation());
      System.out.println(result.getOnboardingOwner());
      System.out.println(result.getHireDate());
      System.out.println(result.getOrientationDate());
      System.out.println(result.getStartDate());
      System.out.println(result.getPastStartDateReason());
      System.out.println(result.getMentor());
      System.out.println(result.getPersonalMessage());
      System.out.println(result.getProvisioning());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getIdentityUserId());
      System.out.println(result.getExternalUserId());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getSentToProcessHireDate());
      System.out.println(result.getLaunchedOn());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling NewHiresApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NewHiresGetByIdResponse> response = client
              .newHires
              .getById(tenantIdentifier, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NewHiresApi#getById");
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
| **tenantIdentifier** | **String**| Unique identifier of the tenant to interact with. Can be either the tenant alias or tenant ID. | |
| **id** | **String**| Unique identifier for the New Hire | |

### Return type

[**NewHiresGetByIdResponse**](NewHiresGetByIdResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New Hire retrieved |  * Location - Location of resource <br>  |

