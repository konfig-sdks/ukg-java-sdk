# GetSpecificPtoPlanApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**info**](GetSpecificPtoPlanApi.md#info) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/pto-plans/{ptoPlan} | Get a specific pto-plan |


<a name="info"></a>
# **info**
> List&lt;PtoPlans&gt; info(companyId, employeeId, ptoPlan).execute();

Get a specific pto-plan

Returns information about an UltiPro employees PTO Plans. Work flow or Approvers is not supported. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;PTO Plan Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GetSpecificPtoPlanApi;
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
    String companyId = "companyId_example"; // Company Identifier
    String employeeId = "employeeId_example"; // Employee Identifier
    String ptoPlan = "ptoPlan_example"; // PTO Plan Identifier
    try {
      List<PtoPlans> result = client
              .getSpecificPtoPlan
              .info(companyId, employeeId, ptoPlan)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetSpecificPtoPlanApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PtoPlans>> response = client
              .getSpecificPtoPlan
              .info(companyId, employeeId, ptoPlan)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetSpecificPtoPlanApi#info");
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
| **companyId** | **String**| Company Identifier | |
| **employeeId** | **String**| Employee Identifier | |
| **ptoPlan** | **String**| PTO Plan Identifier | |

### Return type

[**List&lt;PtoPlans&gt;**](PtoPlans.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

