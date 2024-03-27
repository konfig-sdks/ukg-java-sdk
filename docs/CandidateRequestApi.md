# CandidateRequestApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBackgroundCheck**](CandidateRequestApi.md#addBackgroundCheck) | **POST** /{tenant-alias}/api/candidates/{candidate-id}/background-checks | Background Check Request |
| [**updateBackgroundCheck**](CandidateRequestApi.md#updateBackgroundCheck) | **PUT** /{tenant-alias}/api/candidates/{candidate-id}/background-checks/{background-check-id} | Background Check Status |


<a name="addBackgroundCheck"></a>
# **addBackgroundCheck**
> BackgroundChecks addBackgroundCheck(candidateId, tenantAlias).backgroundChecks(backgroundChecks).execute();

Background Check Request

Add Background Check to Candidate

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidateRequestApi;
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
    BackgroundChecksAuthor author = new BackgroundChecksAuthor();
    BackgroundChecksApplication application = new BackgroundChecksApplication();
    String status = "status_example"; // The status of the background check order.
    String orderNumber = "orderNumber_example"; // Thebackground check order number. Maximum of 100 characters.
    BackgroundChecksPackages packages = new BackgroundChecksPackages();
    String candidateId = "candidateId_example"; // 
    String tenantAlias = "tenantAlias_example"; // 
    List<Links> links = Arrays.asList();
    try {
      BackgroundChecks result = client
              .candidateRequest
              .addBackgroundCheck(author, application, status, orderNumber, packages, candidateId, tenantAlias)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getApplication());
      System.out.println(result.getStatus());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getPackages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidateRequestApi#addBackgroundCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BackgroundChecks> response = client
              .candidateRequest
              .addBackgroundCheck(author, application, status, orderNumber, packages, candidateId, tenantAlias)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidateRequestApi#addBackgroundCheck");
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
| **candidateId** | **String**|  | |
| **tenantAlias** | **String**|  | |
| **backgroundChecks** | [**BackgroundChecks**](BackgroundChecks.md)| New background check to be added | [optional] |

### Return type

[**BackgroundChecks**](BackgroundChecks.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response object. |  -  |

<a name="updateBackgroundCheck"></a>
# **updateBackgroundCheck**
> BackgroundChecks updateBackgroundCheck(candidateId, backgroundCheckId, tenantAlias).backgroundChecks(backgroundChecks).execute();

Background Check Status

Update Candidate Background Check

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidateRequestApi;
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
    BackgroundChecksAuthor author = new BackgroundChecksAuthor();
    BackgroundChecksApplication application = new BackgroundChecksApplication();
    String status = "status_example"; // The status of the background check order.
    String orderNumber = "orderNumber_example"; // Thebackground check order number. Maximum of 100 characters.
    BackgroundChecksPackages packages = new BackgroundChecksPackages();
    String candidateId = "candidateId_example"; // 
    String backgroundCheckId = "backgroundCheckId_example"; // 
    String tenantAlias = "tenantAlias_example"; // 
    List<Links> links = Arrays.asList();
    try {
      BackgroundChecks result = client
              .candidateRequest
              .updateBackgroundCheck(author, application, status, orderNumber, packages, candidateId, backgroundCheckId, tenantAlias)
              .links(links)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthor());
      System.out.println(result.getApplication());
      System.out.println(result.getStatus());
      System.out.println(result.getOrderNumber());
      System.out.println(result.getPackages());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidateRequestApi#updateBackgroundCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BackgroundChecks> response = client
              .candidateRequest
              .updateBackgroundCheck(author, application, status, orderNumber, packages, candidateId, backgroundCheckId, tenantAlias)
              .links(links)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidateRequestApi#updateBackgroundCheck");
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
| **candidateId** | **String**|  | |
| **backgroundCheckId** | **String**|  | |
| **tenantAlias** | **String**|  | |
| **backgroundChecks** | [**BackgroundChecks**](BackgroundChecks.md)| Background check status to be updated | [optional] |

### Return type

[**BackgroundChecks**](BackgroundChecks.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response object. |  -  |

