# OrderRequestsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backgroundCheckDetails**](OrderRequestsApi.md#backgroundCheckDetails) | **GET** /{tenant-alias}/api/background-check-order-requests | Background Check Details |


<a name="backgroundCheckDetails"></a>
# **backgroundCheckDetails**
> Output backgroundCheckDetails(token, tenantAlias).execute();

Background Check Details

Background Check Order Request with Candidate, Application, and Opportunity info

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderRequestsApi;
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
    String token = "token_example"; // A temporary Background Check Request tokena ssociated with the background check request that has been previously provided in the Background Check Request Redirect URL
    String tenantAlias = "tenantAlias_example"; // 
    try {
      Output result = client
              .orderRequests
              .backgroundCheckDetails(token, tenantAlias)
              .execute();
      System.out.println(result);
      System.out.println(result.getCandidate());
      System.out.println(result.getApplication());
      System.out.println(result.getOpportunity());
      System.out.println(result.getCreator());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRequestsApi#backgroundCheckDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Output> response = client
              .orderRequests
              .backgroundCheckDetails(token, tenantAlias)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRequestsApi#backgroundCheckDetails");
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
| **token** | **String**| A temporary Background Check Request tokena ssociated with the background check request that has been previously provided in the Background Check Request Redirect URL | |
| **tenantAlias** | **String**|  | |

### Return type

[**Output**](Output.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object. |  -  |

