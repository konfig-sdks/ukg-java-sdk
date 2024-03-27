# RolesGetApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**securityRoles**](RolesGetApi.md#securityRoles) | **GET** /configuration/v1/roles | Gets Roles from security roles table |


<a name="securityRoles"></a>
# **securityRoles**
> Roles securityRoles().rolName(rolName).page(page).perPage(perPage).execute();

Gets Roles from security roles table

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \\\&quot;View\\\&quot; role for the \\\&quot;Company Configuration Integration\\\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RolesGetApi;
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
    String rolName = "rolName_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      Roles result = client
              .rolesGet
              .securityRoles()
              .rolName(rolName)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getRolDefaultRole());
      System.out.println(result.getRolDescription());
      System.out.println(result.getRolID());
      System.out.println(result.getRolName());
      System.out.println(result.getRolDefaultRoleTerminated());
      System.out.println(result.getRolBI());
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesGetApi#securityRoles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Roles> response = client
              .rolesGet
              .securityRoles()
              .rolName(rolName)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesGetApi#securityRoles");
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
| **rolName** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**Roles**](Roles.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

