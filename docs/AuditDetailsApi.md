# AuditDetailsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getData**](AuditDetailsApi.md#getData) | **GET** /personnel/v1/audit-details | Get Audit Details Data |


<a name="getData"></a>
# **getData**
> List&lt;AuditDetails&gt; getData(startDateTime, endDateTime, tableName, fieldName).action(action).page(page).perPage(perPage).execute();

Get Audit Details Data

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \\\&quot;View\\\&quot; role for the \\\&quot;Personnel Integration\\\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) .

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuditDetailsApi;
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
    OffsetDateTime startDateTime = OffsetDateTime.now();
    OffsetDateTime endDateTime = OffsetDateTime.now();
    String tableName = "tableName_example";
    String fieldName = "fieldName_example";
    String action = "action_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<AuditDetails> result = client
              .auditDetails
              .getData(startDateTime, endDateTime, tableName, fieldName)
              .action(action)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditDetailsApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AuditDetails>> response = client
              .auditDetails
              .getData(startDateTime, endDateTime, tableName, fieldName)
              .action(action)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditDetailsApi#getData");
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
| **startDateTime** | **OffsetDateTime**|  | |
| **endDateTime** | **OffsetDateTime**|  | |
| **tableName** | **String**|  | |
| **fieldName** | **String**|  | |
| **action** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;AuditDetails&gt;**](AuditDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

