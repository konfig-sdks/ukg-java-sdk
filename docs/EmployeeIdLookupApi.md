# EmployeeIdLookupApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byCompanyIds**](EmployeeIdLookupApi.md#byCompanyIds) | **POST** /personnel/v1/employee-ids | Employee ID Lookup |


<a name="byCompanyIds"></a>
# **byCompanyIds**
> List&lt;EmployeeIdsResponse&gt; byCompanyIds(identifiers).execute();

Employee ID Lookup

Look up Employee ID/Company ID. This operation is a POST due the sensitive nature of the lookup properties not appropriate for URI. This service also supports multiple records to be looked up in the body of the request (array of Identifier objects). Permissions - Ultipro service account must have the \&quot;View\&quot; and \&quot;Add\&quot; roles for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeIdLookupApi;
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
      List<EmployeeIdsResponse> result = client
              .employeeIdLookup
              .byCompanyIds()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeIdLookupApi#byCompanyIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeIdsResponse>> response = client
              .employeeIdLookup
              .byCompanyIds()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeIdLookupApi#byCompanyIds");
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
| **identifiers** | [**List&lt;Identifiers&gt;**](Identifiers.md)|  | |

### Return type

[**List&lt;EmployeeIdsResponse&gt;**](EmployeeIdsResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/problem+json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Multi-Status |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

