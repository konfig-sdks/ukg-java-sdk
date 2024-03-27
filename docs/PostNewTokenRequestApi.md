# PostNewTokenRequestApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**obtainOAuthToken**](PostNewTokenRequestApi.md#obtainOAuthToken) | **POST** /signin/oauth2/t/{tenant-name}/access_token | Obtain new oAuth token |


<a name="obtainOAuthToken"></a>
# **obtainOAuthToken**
> TokenResponse obtainOAuthToken(tenantName, grantType, clientId, clientSecret, scope, postNewTokenRequestObtainOAuthTokenRequest).execute();

Obtain new oAuth token

Obtain new token to use in subsequent service requests &lt;b&gt;ONLY&lt;/b&gt; for services that use oAuth.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PostNewTokenRequestApi;
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
    String tenantName = "tenantName_example"; // Tenant Name provided to you from UltiPro
    String grantType = "grantType_example"; // You should enter \\\"client_credentials\\\" for this value
    String clientId = "clientId_example"; // This is from UltiPro Identity and provided to you
    String clientSecret = "clientSecret_example"; // This is from UltiPro Identity and provided to you
    String scope = "scope_example"; // you should enter \\\"profile\\\" for this
    try {
      TokenResponse result = client
              .postNewTokenRequest
              .obtainOAuthToken(tenantName, grantType, clientId, clientSecret, scope)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostNewTokenRequestApi#obtainOAuthToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenResponse> response = client
              .postNewTokenRequest
              .obtainOAuthToken(tenantName, grantType, clientId, clientSecret, scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PostNewTokenRequestApi#obtainOAuthToken");
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
| **tenantName** | **String**| Tenant Name provided to you from UltiPro | |
| **grantType** | **String**| You should enter \\\&quot;client_credentials\\\&quot; for this value | |
| **clientId** | **String**| This is from UltiPro Identity and provided to you | |
| **clientSecret** | **String**| This is from UltiPro Identity and provided to you | |
| **scope** | **String**| you should enter \\\&quot;profile\\\&quot; for this | |
| **postNewTokenRequestObtainOAuthTokenRequest** | [**PostNewTokenRequestObtainOAuthTokenRequest**](PostNewTokenRequestObtainOAuthTokenRequest.md)|  | |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

