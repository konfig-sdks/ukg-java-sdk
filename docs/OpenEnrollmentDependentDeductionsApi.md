# OpenEnrollmentDependentDeductionsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getData**](OpenEnrollmentDependentDeductionsApi.md#getData) | **GET** /personnel/v1/open-enrollment-dep-deductions | Get Open Enrollment Dependent Deductions Data |


<a name="getData"></a>
# **getData**
> List&lt;OpenEnrollmentDependentDeductions&gt; getData(startDateTime, endDateTime, sessionType, deductionCode).page(page).perPage(perPage).execute();

Get Open Enrollment Dependent Deductions Data

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})  &lt;ul&gt;&lt;li&gt;StartDateTime is a required parameter. &lt;/li&gt;&lt;li&gt;EndDateTime is a required parameter.&lt;/li&gt;  &lt;li&gt;SessionType is a required parameter. &lt;/li&gt;&lt;li&gt;DeductionCode is a required parameter that takes a list of deduction codes [ded1, ded2].&lt;/li&gt;&lt;/ul&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OpenEnrollmentDependentDeductionsApi;
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
    String sessionType = "sessionType_example";
    String deductionCode = "deductionCode_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<OpenEnrollmentDependentDeductions> result = client
              .openEnrollmentDependentDeductions
              .getData(startDateTime, endDateTime, sessionType, deductionCode)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenEnrollmentDependentDeductionsApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OpenEnrollmentDependentDeductions>> response = client
              .openEnrollmentDependentDeductions
              .getData(startDateTime, endDateTime, sessionType, deductionCode)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenEnrollmentDependentDeductionsApi#getData");
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
| **sessionType** | **String**|  | |
| **deductionCode** | **String**|  | |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;OpenEnrollmentDependentDeductions&gt;**](OpenEnrollmentDependentDeductions.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

