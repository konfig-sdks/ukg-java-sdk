# ImportToolApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatus**](ImportToolApi.md#getStatus) | **GET** /personnel/v1/import-tool/status/{stagingId} | Retrieves the status of an import tool transaction |
| [**post**](ImportToolApi.md#post) | **POST** /personnel/v1/import-tool | Takes an XML transaction and feeds it into the Import Tool |


<a name="getStatus"></a>
# **getStatus**
> UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus getStatus(stagingId).execute();

Retrieves the status of an import tool transaction

Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). UltiPro service account must have View role for the Personnel Integration Web Service. This GET call has a requirement of PersonnelResourceAuthorize(ApiOperation.Read)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportToolApi;
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
    String stagingId = "stagingId_example";
    try {
      UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus result = client
              .importTool
              .getStatus(stagingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStagingId());
      System.out.println(result.getFileProcessDate());
      System.out.println(result.getServiceSubmittalDate());
      System.out.println(result.getLastRepostDate());
      System.out.println(result.getEmployeeName());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getStatus());
      System.out.println(result.getTransaction());
      System.out.println(result.getFileName());
      System.out.println(result.getMessages());
      System.out.println(result.getChildTransactionStatuses());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportToolApi#getStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus> response = client
              .importTool
              .getStatus(stagingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportToolApi#getStatus");
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
| **stagingId** | **String**|  | |

### Return type

[**UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus**](UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStagingStatus.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |

<a name="post"></a>
# **post**
> List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging&gt; post(ultimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportRequest).execute();

Takes an XML transaction and feeds it into the Import Tool

Submits an encoded XML transaction to the Import Tool. Transaction results can be viewed on the Administration &gt; Integration Studio &gt; Import Tool &gt; Results page. Reference the Import Tool XML and Configuration Settings Guide for transaction details. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). UltiPro service account must have the View and Add roles for the Personnel Integration Web Service. This POST call has a requirement of PersonnelResourceAuthorize(ApiOperation.Create)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportToolApi;
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
    String transaction = "transaction_example"; // The XML Serialized transaction
    String uniqueFileName = "uniqueFileName_example"; // An optionally provided unique file name
    try {
      List<UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging> result = client
              .importTool
              .post()
              .transaction(transaction)
              .uniqueFileName(uniqueFileName)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportToolApi#post");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging>> response = client
              .importTool
              .post()
              .transaction(transaction)
              .uniqueFileName(uniqueFileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportToolApi#post");
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
| **ultimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportRequest** | [**UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportRequest**](UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsImportRequest.md)|  | |

### Return type

[**List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging&gt;**](UltimateSoftwareFoundationServicesApiUltiProPersonnelImportToolModelsFileStaging.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |

