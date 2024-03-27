# EmployeesApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](EmployeesApi.md#getAll) | **GET** /simpleschedule/employees | Obtains all employees. |


<a name="getAll"></a>
# **getAll**
> ResultDtoEmployeeDto getAll().index(index).max(max).execute();

Obtains all employees.

Obtains all employees which have been setup for scheduling.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Integer index = 56; // Index when paging is to be used.
    Integer max = 56; // Max elements per page
    try {
      ResultDtoEmployeeDto result = client
              .employees
              .getAll()
              .index(index)
              .max(max)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoEmployeeDto> response = client
              .employees
              .getAll()
              .index(index)
              .max(max)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAll");
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
| **index** | **Integer**| Index when paging is to be used. | [optional] |
| **max** | **Integer**| Max elements per page | [optional] |

### Return type

[**ResultDtoEmployeeDto**](ResultDtoEmployeeDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

