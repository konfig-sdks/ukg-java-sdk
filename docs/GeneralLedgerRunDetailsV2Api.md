# GeneralLedgerRunDetailsV2Api

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](GeneralLedgerRunDetailsV2Api.md#get) | **GET** /payroll/v2/general-ledger | Returns a list of details for a general ledger run, filterable by runId and blockId |
| [**getByRunId**](GeneralLedgerRunDetailsV2Api.md#getByRunId) | **GET** /payroll/v2/general-ledger/{runId} | Returns a list of details for a general ledger run, filterable by runId and blockId |


<a name="get"></a>
# **get**
> List&lt;GeneralLedgerRunDetailsV2&gt; get().runId(runId).blockId(blockId).mostRecent(mostRecent).page(page).perPage(perPage).execute();

Returns a list of details for a general ledger run, filterable by runId and blockId

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneralLedgerRunDetailsV2Api;
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
    String runId = "runId_example";
    String blockId = "blockId_example";
    String mostRecent = "mostRecent_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<GeneralLedgerRunDetailsV2> result = client
              .generalLedgerRunDetailsV2
              .get()
              .runId(runId)
              .blockId(blockId)
              .mostRecent(mostRecent)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerRunDetailsV2Api#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<GeneralLedgerRunDetailsV2>> response = client
              .generalLedgerRunDetailsV2
              .get()
              .runId(runId)
              .blockId(blockId)
              .mostRecent(mostRecent)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerRunDetailsV2Api#get");
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
| **runId** | **String**|  | [optional] |
| **blockId** | **String**|  | [optional] |
| **mostRecent** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;GeneralLedgerRunDetailsV2&gt;**](GeneralLedgerRunDetailsV2.md)

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
| **500** | InternalServerError |  -  |

<a name="getByRunId"></a>
# **getByRunId**
> List&lt;GeneralLedgerRunDetailsV2&gt; getByRunId(runId).runId2(runId2).blockId(blockId).mostRecent(mostRecent).page(page).perPage(perPage).execute();

Returns a list of details for a general ledger run, filterable by runId and blockId

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneralLedgerRunDetailsV2Api;
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
    String runId = "runId_example";
    String runId2 = "runId_example";
    String blockId = "blockId_example";
    String mostRecent = "mostRecent_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<GeneralLedgerRunDetailsV2> result = client
              .generalLedgerRunDetailsV2
              .getByRunId(runId)
              .runId2(runId2)
              .blockId(blockId)
              .mostRecent(mostRecent)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerRunDetailsV2Api#getByRunId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<GeneralLedgerRunDetailsV2>> response = client
              .generalLedgerRunDetailsV2
              .getByRunId(runId)
              .runId2(runId2)
              .blockId(blockId)
              .mostRecent(mostRecent)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralLedgerRunDetailsV2Api#getByRunId");
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
| **runId** | **String**|  | |
| **runId2** | **String**|  | [optional] |
| **blockId** | **String**|  | [optional] |
| **mostRecent** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;GeneralLedgerRunDetailsV2&gt;**](GeneralLedgerRunDetailsV2.md)

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
| **500** | InternalServerError |  -  |

