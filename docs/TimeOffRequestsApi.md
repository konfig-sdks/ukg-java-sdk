# TimeOffRequestsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](TimeOffRequestsApi.md#getAll) | **GET** /simpleschedule/timeoff_requests | Obtains all time off requests. |


<a name="getAll"></a>
# **getAll**
> ResultDtoTimeOffRequestDto getAll(from, to).empName(empName).empId(empId).execute();

Obtains all time off requests.

Obtains all time off requests between the specified range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffRequestsApi;
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
    OffsetDateTime from = OffsetDateTime.now(); // Start range for requests
    OffsetDateTime to = OffsetDateTime.now(); // End range for requests
    String empName = "empName_example";
    Long empId = 56L;
    try {
      ResultDtoTimeOffRequestDto result = client
              .timeOffRequests
              .getAll(from, to)
              .empName(empName)
              .empId(empId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoTimeOffRequestDto> response = client
              .timeOffRequests
              .getAll(from, to)
              .empName(empName)
              .empId(empId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffRequestsApi#getAll");
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
| **from** | **OffsetDateTime**| Start range for requests | |
| **to** | **OffsetDateTime**| End range for requests | |
| **empName** | **String**|  | [optional] |
| **empId** | **Long**|  | [optional] |

### Return type

[**ResultDtoTimeOffRequestDto**](ResultDtoTimeOffRequestDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

