# KronosEmployeeStatusApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](KronosEmployeeStatusApi.md#get) | **GET** /personnel/v1/integration/kronos/employee-status | Get Employee Status |


<a name="get"></a>
# **get**
> List&lt;EmployeeStatus&gt; get().effectiveDate(effectiveDate).companyId(companyId).employeeIds(employeeIds).inactiveTermWindow(inactiveTermWindow).inactiveDisabledWindow(inactiveDisabledWindow).page(page).perPage(perPage).execute();

Get Employee Status

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KronosEmployeeStatusApi;
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
    OffsetDateTime effectiveDate = OffsetDateTime.now();
    String companyId = "companyId_example";
    String employeeIds = "employeeIds_example";
    Integer inactiveTermWindow = 56;
    Integer inactiveDisabledWindow = 56;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmployeeStatus> result = client
              .kronosEmployeeStatus
              .get()
              .effectiveDate(effectiveDate)
              .companyId(companyId)
              .employeeIds(employeeIds)
              .inactiveTermWindow(inactiveTermWindow)
              .inactiveDisabledWindow(inactiveDisabledWindow)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KronosEmployeeStatusApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeStatus>> response = client
              .kronosEmployeeStatus
              .get()
              .effectiveDate(effectiveDate)
              .companyId(companyId)
              .employeeIds(employeeIds)
              .inactiveTermWindow(inactiveTermWindow)
              .inactiveDisabledWindow(inactiveDisabledWindow)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KronosEmployeeStatusApi#get");
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
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **companyId** | **String**|  | [optional] |
| **employeeIds** | **String**|  | [optional] |
| **inactiveTermWindow** | **Integer**|  | [optional] |
| **inactiveDisabledWindow** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmployeeStatus&gt;**](EmployeeStatus.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

