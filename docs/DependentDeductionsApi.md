# DependentDeductionsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](DependentDeductionsApi.md#get) | **GET** /personnel/v1/dep-deductions | Get Dependent Deductions |


<a name="get"></a>
# **get**
> List&lt;DependentDeductions&gt; get().companyId(companyId).contactId(contactId).deductionCode(deductionCode).employeeId(employeeId).effectiveDate(effectiveDate).currentCOID(currentCOID).page(page).perPage(perPage).execute();

Get Dependent Deductions

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
import com.konfigthis.client.api.DependentDeductionsApi;
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
    String companyId = "companyId_example";
    String contactId = "contactId_example";
    String deductionCode = "deductionCode_example";
    String employeeId = "employeeId_example";
    OffsetDateTime effectiveDate = OffsetDateTime.now();
    String currentCOID = "currentCOID_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<DependentDeductions> result = client
              .dependentDeductions
              .get()
              .companyId(companyId)
              .contactId(contactId)
              .deductionCode(deductionCode)
              .employeeId(employeeId)
              .effectiveDate(effectiveDate)
              .currentCOID(currentCOID)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependentDeductionsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DependentDeductions>> response = client
              .dependentDeductions
              .get()
              .companyId(companyId)
              .contactId(contactId)
              .deductionCode(deductionCode)
              .employeeId(employeeId)
              .effectiveDate(effectiveDate)
              .currentCOID(currentCOID)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DependentDeductionsApi#get");
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
| **companyId** | **String**|  | [optional] |
| **contactId** | **String**|  | [optional] |
| **deductionCode** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **currentCOID** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;DependentDeductions&gt;**](DependentDeductions.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

