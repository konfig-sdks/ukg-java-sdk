# UtaEmployeeApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByCoIdAndEeId**](UtaEmployeeApi.md#getByCoIdAndEeId) | **GET** /simpleschedule/{coid}/employees/{eeid} | Obtains a UTA Employee by coId and eeId. |


<a name="getByCoIdAndEeId"></a>
# **getByCoIdAndEeId**
> ResultDtoEmployeeDto getByCoIdAndEeId(coid, eeid).execute();

Obtains a UTA Employee by coId and eeId.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtaEmployeeApi;
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
    String coid = "coid_example"; // coid of employee.
    String eeid = "eeid_example"; // eeid of employee.
    try {
      ResultDtoEmployeeDto result = client
              .utaEmployee
              .getByCoIdAndEeId(coid, eeid)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtaEmployeeApi#getByCoIdAndEeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoEmployeeDto> response = client
              .utaEmployee
              .getByCoIdAndEeId(coid, eeid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtaEmployeeApi#getByCoIdAndEeId");
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
| **coid** | **String**| coid of employee. | |
| **eeid** | **String**| eeid of employee. | |

### Return type

[**ResultDtoEmployeeDto**](ResultDtoEmployeeDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation. |  -  |

