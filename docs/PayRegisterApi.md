# PayRegisterApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](PayRegisterApi.md#get) | **GET** /payroll/v1/pay-register | Get Pay Register |


<a name="get"></a>
# **get**
> List&lt;PayRegister&gt; get().employeeId(employeeId).companyId(companyId).checkId(checkId).employeeNumber(employeeNumber).documentNumber(documentNumber).payGroup(payGroup).periodControl(periodControl).payDate(payDate).periodEndDate(periodEndDate).periodStartDate(periodStartDate).page(page).perPage(perPage).execute();

Get Pay Register

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Payroll Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayRegisterApi;
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
    String checkId = "checkId_example";
    String employeeNumber = "employeeNumber_example";
    String documentNumber = "documentNumber_example";
    String payGroup = "payGroup_example";
    String periodControl = "periodControl_example";
    OffsetDateTime payDate = OffsetDateTime.now();
    String periodEndDate = "periodEndDate_example";
    String periodStartDate = "periodStartDate_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<PayRegister> result = client
              .payRegister
              .get()
              .employeeId(employeeId)
              .companyId(companyId)
              .checkId(checkId)
              .employeeNumber(employeeNumber)
              .documentNumber(documentNumber)
              .payGroup(payGroup)
              .periodControl(periodControl)
              .payDate(payDate)
              .periodEndDate(periodEndDate)
              .periodStartDate(periodStartDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayRegisterApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayRegister>> response = client
              .payRegister
              .get()
              .employeeId(employeeId)
              .companyId(companyId)
              .checkId(checkId)
              .employeeNumber(employeeNumber)
              .documentNumber(documentNumber)
              .payGroup(payGroup)
              .periodControl(periodControl)
              .payDate(payDate)
              .periodEndDate(periodEndDate)
              .periodStartDate(periodStartDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayRegisterApi#get");
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
| **checkId** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **documentNumber** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **periodControl** | **String**|  | [optional] |
| **payDate** | **OffsetDateTime**|  | [optional] |
| **periodEndDate** | **String**|  | [optional] |
| **periodStartDate** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;PayRegister&gt;**](PayRegister.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

