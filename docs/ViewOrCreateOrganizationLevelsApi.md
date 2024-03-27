# ViewOrCreateOrganizationLevelsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrgLevelConfig**](ViewOrCreateOrganizationLevelsApi.md#createOrgLevelConfig) | **POST** /configuration/v1/org-levels | Create org-level configuration |
| [**getAllOrgLevels**](ViewOrCreateOrganizationLevelsApi.md#getAllOrgLevels) | **GET** /configuration/v1/org-levels | Get all org-levels |


<a name="createOrgLevelConfig"></a>
# **createOrgLevelConfig**
> MultiStatusResponse createOrgLevelConfig(orgLevelsBodyInner).execute();

Create org-level configuration

Creates a new UltiPro org-level configuration, Array of objects is permitted for multi-records support. Permissions - Ultipro service account must have \&quot;Add\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewOrCreateOrganizationLevelsApi;
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
    try {
      MultiStatusResponse result = client
              .viewOrCreateOrganizationLevels
              .createOrgLevelConfig()
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getType());
      System.out.println(result.getDetail());
      System.out.println(result.getErrorCount());
      System.out.println(result.getMultistatus());
      System.out.println(result.getSuccessCount());
      System.out.println(result.getErrorCount());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewOrCreateOrganizationLevelsApi#createOrgLevelConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MultiStatusResponse> response = client
              .viewOrCreateOrganizationLevels
              .createOrgLevelConfig()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewOrCreateOrganizationLevelsApi#createOrgLevelConfig");
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
| **orgLevelsBodyInner** | [**List&lt;OrgLevelsBodyInner&gt;**](OrgLevelsBodyInner.md)| The org-level to be written. | |

### Return type

[**MultiStatusResponse**](MultiStatusResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Multi-Status |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

<a name="getAllOrgLevels"></a>
# **getAllOrgLevels**
> List&lt;OrgLevels&gt; getAllOrgLevels().levelDescription(levelDescription).code(code).budgetGroup(budgetGroup).reportingCategory(reportingCategory).isActive(isActive).execute();

Get all org-levels

Returns information about the UltiPro org-level configurations. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ViewOrCreateOrganizationLevelsApi;
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
    String levelDescription = "levelDescription_example"; // Description of the org-level.
    String code = "code_example"; // Organization code.
    String budgetGroup = "budgetGroup_example"; // Organizational budget group.
    String reportingCategory = "reportingCategory_example"; // Reporting category.
    Boolean isActive = true; // Active status.
    try {
      List<OrgLevels> result = client
              .viewOrCreateOrganizationLevels
              .getAllOrgLevels()
              .levelDescription(levelDescription)
              .code(code)
              .budgetGroup(budgetGroup)
              .reportingCategory(reportingCategory)
              .isActive(isActive)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewOrCreateOrganizationLevelsApi#getAllOrgLevels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OrgLevels>> response = client
              .viewOrCreateOrganizationLevels
              .getAllOrgLevels()
              .levelDescription(levelDescription)
              .code(code)
              .budgetGroup(budgetGroup)
              .reportingCategory(reportingCategory)
              .isActive(isActive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ViewOrCreateOrganizationLevelsApi#getAllOrgLevels");
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
| **levelDescription** | **String**| Description of the org-level. | [optional] |
| **code** | **String**| Organization code. | [optional] |
| **budgetGroup** | **String**| Organizational budget group. | [optional] |
| **reportingCategory** | **String**| Reporting category. | [optional] |
| **isActive** | **Boolean**| Active status. | [optional] |

### Return type

[**List&lt;OrgLevels&gt;**](OrgLevels.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

