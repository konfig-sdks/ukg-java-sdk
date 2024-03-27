# PtoPlanPostApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ultiproRecord**](PtoPlanPostApi.md#ultiproRecord) | **POST** /personnel/v1/pto-plans | Create A PTO Plan |


<a name="ultiproRecord"></a>
# **ultiproRecord**
> MultiStatusResponse ultiproRecord(ptoPlansBodyInner).execute();

Create A PTO Plan

Creates a new UltiPro PTO plan record. Array of objects is permitted for multi-records support. Work Flow or Approvers is not supported. Permissions - Ultipro service account must have \&quot;Add\&quot; role for the \&quot;PTO Plan Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PtoPlanPostApi;
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
    try {
      MultiStatusResponse result = client
              .ptoPlanPost
              .ultiproRecord()
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getType());
      System.out.println(result.getDetail());
      System.out.println(result.getErrorCount());
      System.out.println(result.getMultistatus());
      System.out.println(result.getSuccessCount());
      System.out.println(result.getErrorCount());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling PtoPlanPostApi#ultiproRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MultiStatusResponse> response = client
              .ptoPlanPost
              .ultiproRecord()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PtoPlanPostApi#ultiproRecord");
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
| **ptoPlansBodyInner** | [**List&lt;PtoPlansBodyInner&gt;**](PtoPlansBodyInner.md)| The pto-plan to be written | |

### Return type

[**MultiStatusResponse**](MultiStatusResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Multi-Status |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

