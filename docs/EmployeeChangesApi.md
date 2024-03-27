# EmployeeChangesApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](EmployeeChangesApi.md#get) | **GET** /personnel/v1/employee-changes/{employeeId} | Changes By Employee ID |


<a name="get"></a>
# **get**
> List&lt;EmployeeChangesResponse&gt; get(employeeId).execute();

Changes By Employee ID

Gets all of the employee information since the last API call (minimum 3 hours), for a specific employeeId. The data is windowed in 3 hour increments. To get near real time updates on when the employee has changed, you should call this service 8 times per day and no more frequent than three hours between calls. It should also be understood that you must compare the results for an employee with the results from a previous call to see what property or properties have changed. The Permissions - Ultipro service account must have \&quot;View\&quot; role for the EmployeeExport Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeChangesApi;
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
      List<EmployeeChangesResponse> result = client
              .employeeChanges
              .get(employeeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeChangesApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeChangesResponse>> response = client
              .employeeChanges
              .get(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeChangesApi#get");
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

