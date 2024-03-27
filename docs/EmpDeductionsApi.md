# EmpDeductionsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](EmpDeductionsApi.md#list) | **GET** /personnel/v1/emp-deductions | Get employee deductions |


<a name="list"></a>
# **list**
> List&lt;EmpDeductions&gt; list(dedCode).employeeId(employeeId).companyId(companyId).benStatus(benStatus).benefitOption(benefitOption).endDateTime(endDateTime).page(page).perPage(perPage).execute();

Get employee deductions

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Api endpoints. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})  Correct syntax when using parameters are as follows:  &lt;ul&gt;  &lt;li&gt;Get Employee deductions for companyid   &lt;ul&gt;    &lt;li&gt;Example: /personnel/v1/companies/{companyId}/emp-deductions?DedCode&#x3D;{DedCode}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;Get Employee deductions for companyid and employeeid    &lt;ul&gt;    &lt;li&gt;Example: /personnel/v1/companies/{companyId}/employees/{employeeId}/emp-deductions?DedCode&#x3D;{DedCode}}&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;Get Employee deductions per page   &lt;ul&gt;   &lt;li&gt;Example: personnel/v1/emp-deductions?DedCode&#x3D;{DedCode}&amp;page&#x3D;1&amp;per_page&#x3D;100&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmpDeductionsApi;
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
    String dedCode = "dedCode_example";
    String employeeId = "employeeId_example";
    String companyId = "companyId_example";
    String benStatus = "benStatus_example";
    String benefitOption = "benefitOption_example";
    OffsetDateTime endDateTime = OffsetDateTime.now();
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpDeductions> result = client
              .empDeductions
              .list(dedCode)
              .employeeId(employeeId)
              .companyId(companyId)
              .benStatus(benStatus)
              .benefitOption(benefitOption)
              .endDateTime(endDateTime)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpDeductionsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpDeductions>> response = client
              .empDeductions
              .list(dedCode)
              .employeeId(employeeId)
              .companyId(companyId)
              .benStatus(benStatus)
              .benefitOption(benefitOption)
              .endDateTime(endDateTime)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpDeductionsApi#list");
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
| **dedCode** | **String**|  | |
| **employeeId** | **String**|  | [optional] |
| **companyId** | **String**|  | [optional] |
| **benStatus** | **String**|  | [optional] |
| **benefitOption** | **String**|  | [optional] |
| **endDateTime** | **OffsetDateTime**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpDeductions&gt;**](EmpDeductions.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

