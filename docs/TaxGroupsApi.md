# TaxGroupsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllDetails**](TaxGroupsApi.md#getAllDetails) | **GET** /configuration/v1/tax-groups | Get all tax group details |


<a name="getAllDetails"></a>
# **getAllDetails**
> List&lt;TaxGroupsDetails&gt; getAllDetails().taxCalcGroupIdCode(taxCalcGroupIdCode).taxGroupIsInactive(taxGroupIsInactive).page(page).perPage(perPage).execute();

Get all tax group details

taxCalcGroupIdCode optional parameter can take in multiple IDs separated by comma. ex: [id1, id2] and taxGroupIsInactive is also optional. Permissions - UKG Pro service account must have &#39;View&#39; role for the &#39;Company Configuration Integration&#39; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaxGroupsApi;
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
    String taxCalcGroupIdCode = "taxCalcGroupIdCode_example";
    String taxGroupIsInactive = "taxGroupIsInactive_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<TaxGroupsDetails> result = client
              .taxGroups
              .getAllDetails()
              .taxCalcGroupIdCode(taxCalcGroupIdCode)
              .taxGroupIsInactive(taxGroupIsInactive)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxGroupsApi#getAllDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TaxGroupsDetails>> response = client
              .taxGroups
              .getAllDetails()
              .taxCalcGroupIdCode(taxCalcGroupIdCode)
              .taxGroupIsInactive(taxGroupIsInactive)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxGroupsApi#getAllDetails");
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
| **taxCalcGroupIdCode** | **String**|  | [optional] |
| **taxGroupIsInactive** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;TaxGroupsDetails&gt;**](TaxGroupsDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

