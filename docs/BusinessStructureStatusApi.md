# BusinessStructureStatusApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEmployeesChangeBusinessStructure**](BusinessStructureStatusApi.md#listEmployeesChangeBusinessStructure) | **GET** /personnel/v1/integration/kronos/business-structure-status | Gets a list of Employees for which there is a change in business structure |


<a name="listEmployeesChangeBusinessStructure"></a>
# **listEmployeesChangeBusinessStructure**
> List&lt;String&gt; listEmployeesChangeBusinessStructure(modifiedAfterDateTime, companyId).effectiveDate(effectiveDate).employeeId(employeeId).page(page).perPage(perPage).execute();

Gets a list of Employees for which there is a change in business structure

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) . 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessStructureStatusApi;
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
    OffsetDateTime modifiedAfterDateTime = OffsetDateTime.now();
    String companyId = "companyId_example";
    OffsetDateTime effectiveDate = OffsetDateTime.now();
    String employeeId = "employeeId_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<String> result = client
              .businessStructureStatus
              .listEmployeesChangeBusinessStructure(modifiedAfterDateTime, companyId)
              .effectiveDate(effectiveDate)
              .employeeId(employeeId)
              .page(page)
              .perPage(perPage)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessStructureStatusApi#listEmployeesChangeBusinessStructure");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<String>> response = client
              .businessStructureStatus
              .listEmployeesChangeBusinessStructure(modifiedAfterDateTime, companyId)
              .effectiveDate(effectiveDate)
              .employeeId(employeeId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessStructureStatusApi#listEmployeesChangeBusinessStructure");
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
| **modifiedAfterDateTime** | **OffsetDateTime**|  | |
| **companyId** | **String**|  | |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

