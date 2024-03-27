# EarningsHistoryApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInsRate**](EarningsHistoryApi.md#getInsRate) | **GET** /payroll/v1/earnings-history-base-elements | Get Earnings History Base Elements |


<a name="getInsRate"></a>
# **getInsRate**
> List&lt;EarningsHistoryBaseElements&gt; getInsRate().companyID(companyID).earningCode(earningCode).employeeID(employeeID).employeeNumber(employeeNumber).payDate(payDate).payGroup(payGroup).periodControl(periodControl).startPerControl(startPerControl).endPerControl(endPerControl).includeInDeferredCompensation(includeInDeferredCompensation).includeInDeferredCompensationHours(includeInDeferredCompensationHours).page(page).perPage(perPage).execute();

Get Earnings History Base Elements

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
import com.konfigthis.client.api.EarningsHistoryApi;
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
    String companyID = "companyID_example";
    String earningCode = "earningCode_example";
    String employeeID = "employeeID_example";
    String employeeNumber = "employeeNumber_example";
    OffsetDateTime payDate = OffsetDateTime.now();
    String payGroup = "payGroup_example";
    String periodControl = "periodControl_example";
    String startPerControl = "startPerControl_example";
    String endPerControl = "endPerControl_example";
    Boolean includeInDeferredCompensation = true;
    Boolean includeInDeferredCompensationHours = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EarningsHistoryBaseElements> result = client
              .earningsHistory
              .getInsRate()
              .companyID(companyID)
              .earningCode(earningCode)
              .employeeID(employeeID)
              .employeeNumber(employeeNumber)
              .payDate(payDate)
              .payGroup(payGroup)
              .periodControl(periodControl)
              .startPerControl(startPerControl)
              .endPerControl(endPerControl)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsHistoryApi#getInsRate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EarningsHistoryBaseElements>> response = client
              .earningsHistory
              .getInsRate()
              .companyID(companyID)
              .earningCode(earningCode)
              .employeeID(employeeID)
              .employeeNumber(employeeNumber)
              .payDate(payDate)
              .payGroup(payGroup)
              .periodControl(periodControl)
              .startPerControl(startPerControl)
              .endPerControl(endPerControl)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsHistoryApi#getInsRate");
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
| **companyID** | **String**|  | [optional] |
| **earningCode** | **String**|  | [optional] |
| **employeeID** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **payDate** | **OffsetDateTime**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **periodControl** | **String**|  | [optional] |
| **startPerControl** | **String**|  | [optional] |
| **endPerControl** | **String**|  | [optional] |
| **includeInDeferredCompensation** | **Boolean**|  | [optional] |
| **includeInDeferredCompensationHours** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EarningsHistoryBaseElements&gt;**](EarningsHistoryBaseElements.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

