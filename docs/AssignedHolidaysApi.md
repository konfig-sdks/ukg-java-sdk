# AssignedHolidaysApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](AssignedHolidaysApi.md#getAll) | **GET** /simpleschedule/assigned_holidays | Obtains all assigned holidays. |


<a name="getAll"></a>
# **getAll**
> ResultDtoHolidayDto getAll(from, to).empName(empName).empId(empId).execute();

Obtains all assigned holidays.

Obtains all assigned holidays for a given employee.  Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssignedHolidaysApi;
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
    OffsetDateTime from = OffsetDateTime.now(); // Start range for holidays
    OffsetDateTime to = OffsetDateTime.now(); // End range for holidays
    String empName = "empName_example";
    Long empId = 56L;
    try {
      ResultDtoHolidayDto result = client
              .assignedHolidays
              .getAll(from, to)
              .empName(empName)
              .empId(empId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssignedHolidaysApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoHolidayDto> response = client
              .assignedHolidays
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
      System.err.println("Exception when calling AssignedHolidaysApi#getAll");
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
| **from** | **OffsetDateTime**| Start range for holidays | |
| **to** | **OffsetDateTime**| End range for holidays | |
| **empName** | **String**|  | [optional] |
| **empId** | **Long**|  | [optional] |

### Return type

[**ResultDtoHolidayDto**](ResultDtoHolidayDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

