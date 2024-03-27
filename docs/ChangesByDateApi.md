# ChangesByDateApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllEmployeeChangesSinceLastCall**](ChangesByDateApi.md#getAllEmployeeChangesSinceLastCall) | **GET** /personnel/v1/employee-changes | Changes By Date |


<a name="getAllEmployeeChangesSinceLastCall"></a>
# **getAllEmployeeChangesSinceLastCall**
> List&lt;EmployeeChangesResponse&gt; getAllEmployeeChangesSinceLastCall().startDate(startDate).endDate(endDate).page(page).perPage(perPage).execute();

Changes By Date

Gets all of the employee information since the last API call (3 hour minimum). A time span can be defined by the query parameters, but to get near real time updates on when the employee has changed, you should call this service 8 times per day and no more frequent than three hours between calls. It should also be understood that you must compare the results for an employee with the results from a previous call to see what property or properties have changed. Permissions - Ultipro service account must have \&quot;View\&quot; role for the EmployeeExport Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChangesByDateApi;
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
    OffsetDateTime startDate = OffsetDateTime.now(); // Used to lookup employee changes within time span
    OffsetDateTime endDate = OffsetDateTime.now(); // Used to lookup employee changes within time span
    Double page = 3.4D; // Pagination, which page you want to see
    Double perPage = 3.4D; // Pagination, how many records per page you want to see
    try {
      List<EmployeeChangesResponse> result = client
              .changesByDate
              .getAllEmployeeChangesSinceLastCall()
              .startDate(startDate)
              .endDate(endDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangesByDateApi#getAllEmployeeChangesSinceLastCall");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeChangesResponse>> response = client
              .changesByDate
              .getAllEmployeeChangesSinceLastCall()
              .startDate(startDate)
              .endDate(endDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangesByDateApi#getAllEmployeeChangesSinceLastCall");
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
| **startDate** | **OffsetDateTime**| Used to lookup employee changes within time span | [optional] |
| **endDate** | **OffsetDateTime**| Used to lookup employee changes within time span | [optional] |
| **page** | **Double**| Pagination, which page you want to see | [optional] |
| **perPage** | **Double**| Pagination, how many records per page you want to see | [optional] |

### Return type

[**List&lt;EmployeeChangesResponse&gt;**](EmployeeChangesResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

