# PayGroupPayPeriodApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayGroupPayPeriod**](PayGroupPayPeriodApi.md#getPayGroupPayPeriod) | **GET** /payroll/v1/paygroup-payperiods | Get PayGroup PayPeriods |


<a name="getPayGroupPayPeriod"></a>
# **getPayGroupPayPeriod**
> List&lt;PayGroupPayPeriods&gt; getPayGroupPayPeriod().payDateSeq(payDateSeq).periodEndDate(periodEndDate).periodStartDate(periodStartDate).payGroup(payGroup).payDate(payDate).startPerControl(startPerControl).endPerControl(endPerControl).page(page).perPage(perPage).execute();

Get PayGroup PayPeriods

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
import com.konfigthis.client.api.PayGroupPayPeriodApi;
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
    Integer payDateSeq = 56;
    OffsetDateTime periodEndDate = OffsetDateTime.now();
    OffsetDateTime periodStartDate = OffsetDateTime.now();
    String payGroup = "payGroup_example";
    OffsetDateTime payDate = OffsetDateTime.now();
    String startPerControl = "startPerControl_example";
    String endPerControl = "endPerControl_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<PayGroupPayPeriods> result = client
              .payGroupPayPeriod
              .getPayGroupPayPeriod()
              .payDateSeq(payDateSeq)
              .periodEndDate(periodEndDate)
              .periodStartDate(periodStartDate)
              .payGroup(payGroup)
              .payDate(payDate)
              .startPerControl(startPerControl)
              .endPerControl(endPerControl)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGroupPayPeriodApi#getPayGroupPayPeriod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayGroupPayPeriods>> response = client
              .payGroupPayPeriod
              .getPayGroupPayPeriod()
              .payDateSeq(payDateSeq)
              .periodEndDate(periodEndDate)
              .periodStartDate(periodStartDate)
              .payGroup(payGroup)
              .payDate(payDate)
              .startPerControl(startPerControl)
              .endPerControl(endPerControl)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGroupPayPeriodApi#getPayGroupPayPeriod");
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
| **payDateSeq** | **Integer**|  | [optional] |
| **periodEndDate** | **OffsetDateTime**|  | [optional] |
| **periodStartDate** | **OffsetDateTime**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **payDate** | **OffsetDateTime**|  | [optional] |
| **startPerControl** | **String**|  | [optional] |
| **endPerControl** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;PayGroupPayPeriods&gt;**](PayGroupPayPeriods.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

