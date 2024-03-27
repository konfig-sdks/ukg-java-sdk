# GetSpecificEmployeesPtoPlansApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**info**](GetSpecificEmployeesPtoPlansApi.md#info) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/pto-plans | Get a specific employees pto-plans |


<a name="info"></a>
# **info**
> List&lt;PtoPlans&gt; info(companyId, employeeId).page(page).perPage(perPage).execute();

Get a specific employees pto-plans

Returns information about an UltiPro employees PTO Plans. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;PTO Plan Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GetSpecificEmployeesPtoPlansApi;
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
    Double page = 3.4D; // Pagination, which page you want to see
    Double perPage = 3.4D; // Pagination, how many records per page you want to see
    try {
      List<PtoPlans> result = client
              .getSpecificEmployeesPtoPlans
              .info(companyId, employeeId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetSpecificEmployeesPtoPlansApi#info");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PtoPlans>> response = client
              .getSpecificEmployeesPtoPlans
              .info(companyId, employeeId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetSpecificEmployeesPtoPlansApi#info");
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
| **page** | **Double**| Pagination, which page you want to see | [optional] |
| **perPage** | **Double**| Pagination, how many records per page you want to see | [optional] |

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

