# KronosEmployeeProfilesApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getList**](KronosEmployeeProfilesApi.md#getList) | **GET** /personnel/v1/integration/kronos/employee-profiles | Get list of employees profile |


<a name="getList"></a>
# **getList**
> List&lt;EmployeeProfiles&gt; getList(product).companyId(companyId).employeeId(employeeId).effectiveDate(effectiveDate).changeWindow(changeWindow).includeHistoryIfChangeDetected(includeHistoryIfChangeDetected).page(page).perPage(perPage).execute();

Get list of employees profile

If no pagination parameters specified, the default/max is applied.      Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Api endpoints. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). &lt;br&gt;&lt;br&gt;/personnel/v1/integration/kronos/employee-profiles can take following optional parameter:&lt;br&gt;&lt;ul&gt;&lt;li&gt;Product: Required parameter &lt;/li&gt; &lt;li&gt;companyId: Can take in multiple IDs separated by comma. ex: {id1}, {id2}&lt;/li&gt;&lt;li&gt;employeeId: Can take in multiple IDs separated by comma. ex: {id1}, {id2}&lt;/li&gt;&lt;li&gt;includeHistoryIfChangeDetected&lt;/li&gt;&lt;li&gt;effectiveDate&lt;/li&gt;&lt;li&gt;changeWindow&lt;/li&gt;&lt;li&gt;per_Page&lt;/li&gt;&lt;li&gt;page&lt;/li&gt;&lt;br&gt;Correct syntax when using parameters are as follows:&lt;ul&gt;&lt;li&gt;Get kronos employee profiles with required product parameter&lt;ul&gt;   &lt;li&gt;Example: personnel/v1/integration/kronos/employee-profiles?product&#x3D;{productCode}&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;Get kronos employee profiles by companyId and employeeId&lt;ul&gt;&lt;li&gt;Example: personnel/v1/integration/kronos/employee-profiles?product&#x3D;{productCode}&amp;companyId&#x3D;{COID1}&amp;employeeId&#x3D;{EEID1}, {EEID2}&amp;effectiveDate&#x3D;{date}&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;Get employee profiles by includeHistoryIfChangeDetected&lt;ul&gt;&lt;li&gt;Example: personnel/v1/integration/kronos/employee-profiles?product&#x3D;{productCode}&amp;companyId&#x3D;{COID1}&amp;employeeId&#x3D;{EEID1}&amp;effectiveDate&#x3D;{date}&amp;includeHistoryIfChangeDetected&#x3D;true&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;li&gt;Get kronos employee profiles by perPage and page&lt;ul&gt;&lt;li&gt;Example: personnel/v1/integration/kronos/employee-profiles?product&#x3D;{productCode}&amp;page&#x3D;1&amp;per_Page&#x3D;{pageSize}&lt;/li&gt;&lt;/ul&gt;&lt;/ul&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KronosEmployeeProfilesApi;
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
    String product = "product_example";
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    OffsetDateTime effectiveDate = OffsetDateTime.now();
    Integer changeWindow = 56;
    Boolean includeHistoryIfChangeDetected = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmployeeProfiles> result = client
              .kronosEmployeeProfiles
              .getList(product)
              .companyId(companyId)
              .employeeId(employeeId)
              .effectiveDate(effectiveDate)
              .changeWindow(changeWindow)
              .includeHistoryIfChangeDetected(includeHistoryIfChangeDetected)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KronosEmployeeProfilesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeProfiles>> response = client
              .kronosEmployeeProfiles
              .getList(product)
              .companyId(companyId)
              .employeeId(employeeId)
              .effectiveDate(effectiveDate)
              .changeWindow(changeWindow)
              .includeHistoryIfChangeDetected(includeHistoryIfChangeDetected)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KronosEmployeeProfilesApi#getList");
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
| **product** | **String**|  | |
| **companyId** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **changeWindow** | **Integer**|  | [optional] |
| **includeHistoryIfChangeDetected** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmployeeProfiles&gt;**](EmployeeProfiles.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

