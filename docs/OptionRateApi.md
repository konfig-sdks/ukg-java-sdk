# OptionRateApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getData**](OptionRateApi.md#getData) | **GET** /configuration/v1/option-rate | Get Option Rate Data |


<a name="getData"></a>
# **getData**
> List&lt;OptionRate&gt; getData().deductionCode(deductionCode).benefitOption(benefitOption).effectiveDate(effectiveDate).payFrequency(payFrequency).page(page).perPage(perPage).execute();

Get Option Rate Data

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \\\&quot;View\\\&quot; role for the \\\&quot;Company Configuration Integration\\\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).  Effective date parameter gets effective record as of the given date. If it&#39;s not passed, effected date is defaulted to current date.  Deduction code parameter can take in multiple deduction codes separated by coma. ex: [DEN, MED, VIS] .  Pay frequency parameter can take in multiple pay frequencies separated by coma. ex: [B, M] . 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OptionRateApi;
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
    String deductionCode = "deductionCode_example";
    String benefitOption = "benefitOption_example";
    OffsetDateTime effectiveDate = OffsetDateTime.now();
    String payFrequency = "payFrequency_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<OptionRate> result = client
              .optionRate
              .getData()
              .deductionCode(deductionCode)
              .benefitOption(benefitOption)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionRateApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OptionRate>> response = client
              .optionRate
              .getData()
              .deductionCode(deductionCode)
              .benefitOption(benefitOption)
              .effectiveDate(effectiveDate)
              .payFrequency(payFrequency)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionRateApi#getData");
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
| **deductionCode** | **String**|  | [optional] |
| **benefitOption** | **String**|  | [optional] |
| **effectiveDate** | **OffsetDateTime**|  | [optional] |
| **payFrequency** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;OptionRate&gt;**](OptionRate.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

