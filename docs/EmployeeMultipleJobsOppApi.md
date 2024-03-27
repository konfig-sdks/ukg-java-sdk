# EmployeeMultipleJobsOppApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDetails**](EmployeeMultipleJobsOppApi.md#listDetails) | **GET** /personnel/v1/empl-multiple-jobs | Get employee multiple jobs details |


<a name="listDetails"></a>
# **listDetails**
> List&lt;EmployeeMultipleJobs&gt; listDetails().employeeId(employeeId).companyId(companyId).jobCode(jobCode).isPrimaryJob(isPrimaryJob).jobIsInActive(jobIsInActive).page(page).perPage(perPage).execute();

Get employee multiple jobs details

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})   Correct syntax when using parameters are as follows:  &lt;ul&gt; &lt;li&gt;Get Multiple jobs for employee ID &lt;ul&gt; &lt;li&gt;Example: /personnel/v1/empl-multiple-jobs?employeeId&#x3D;{employeeId}&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;Get Multiple jobs for company ID &lt;ul&gt; &lt;li&gt;Example: /personnel/v1/empl-multiple-jobs?companyId&#x3D;{companyId}&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;Get Multiple jobs for employee ID and company Id &lt;ul&gt; &lt;li&gt;Example: /personnel/v1/empl-multiple-jobs?employeeId&#x3D;{employeeId}&amp;companyId&#x3D;{companyId}&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt;Get Multiple jobs per page &lt;ul&gt; &lt;li&gt;Example: /personnel/v1/empl-multiple-jobs?page&#x3D;1&amp;per_page&#x3D;10000&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeMultipleJobsOppApi;
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
    String employeeId = "employeeId_example";
    String companyId = "companyId_example";
    String jobCode = "jobCode_example";
    String isPrimaryJob = "isPrimaryJob_example";
    String jobIsInActive = "jobIsInActive_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmployeeMultipleJobs> result = client
              .employeeMultipleJobsOpp
              .listDetails()
              .employeeId(employeeId)
              .companyId(companyId)
              .jobCode(jobCode)
              .isPrimaryJob(isPrimaryJob)
              .jobIsInActive(jobIsInActive)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeMultipleJobsOppApi#listDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeMultipleJobs>> response = client
              .employeeMultipleJobsOpp
              .listDetails()
              .employeeId(employeeId)
              .companyId(companyId)
              .jobCode(jobCode)
              .isPrimaryJob(isPrimaryJob)
              .jobIsInActive(jobIsInActive)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeMultipleJobsOppApi#listDetails");
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
| **employeeId** | **String**|  | [optional] |
| **companyId** | **String**|  | [optional] |
| **jobCode** | **String**|  | [optional] |
| **isPrimaryJob** | **String**|  | [optional] |
| **jobIsInActive** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmployeeMultipleJobs&gt;**](EmployeeMultipleJobs.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

