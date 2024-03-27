# SingleOrganizationLevelApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](SingleOrganizationLevelApi.md#get) | **GET** /configuration/v1/org-levels/{level}/{code} | Get single org-level |
| [**updateOrgLevel**](SingleOrganizationLevelApi.md#updateOrgLevel) | **PUT** /configuration/v1/org-levels/{level}/{code} | Update one org-level |
| [**updateProperties**](SingleOrganizationLevelApi.md#updateProperties) | **PATCH** /configuration/v1/org-levels/{level}/{code} | Patch one org-level |


<a name="get"></a>
# **get**
> OrgLevels get(level, code).execute();

Get single org-level

The org-levels endpoint returns information about the UltiPro organizational level configurations. The unique identifier for an org-levels configuration, is level and code properties concatenated, therefore both values are needed. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SingleOrganizationLevelApi;
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
    String level = "level_example"; // Description of the org-level.
    String code = "code_example"; // Organization code.
    try {
      OrgLevels result = client
              .singleOrganizationLevel
              .get(level, code)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBudgetGroup());
      System.out.println(result.getCode());
      System.out.println(result.getCurrentYearBudgetFTE());
      System.out.println(result.getCurrentYearBudgetSalary());
      System.out.println(result.getGlSegment());
      System.out.println(result.getLastYearBudgetFTE());
      System.out.println(result.getLastYearBudgetSalary());
      System.out.println(result.getLevel());
      System.out.println(result.getLevelDescription());
      System.out.println(result.getReportingCategory());
      System.out.println(result.getIsActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleOrganizationLevelApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgLevels> response = client
              .singleOrganizationLevel
              .get(level, code)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleOrganizationLevelApi#get");
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
| **level** | **String**| Description of the org-level. | |
| **code** | **String**| Organization code. | |

### Return type

[**OrgLevels**](OrgLevels.md)

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

<a name="updateOrgLevel"></a>
# **updateOrgLevel**
> OrgLevels updateOrgLevel(level, code, orgLevels).execute();

Update one org-level

Allows the ability update a single organizational level configuration. Permissions - Ultipro service account must have \&quot;Edit\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SingleOrganizationLevelApi;
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
    String description = "description_example"; // Organization Level Description.
    String code = "code_example"; // Organization Code, one half of the unique identifier.
    Double level = 3.4D; // Organazation Level, one half of unique identifier. Cannot be updated.
    String level = "level_example"; // Description of the org-level.
    String code = "code_example"; // Organization code.
    String budgetGroup = "budgetGroup_example"; // Organizational budget group.
    Double currentYearBudgetFTE = 3.4D; // Current year to date budget for full time employee.
    Double currentYearBudgetSalary = 3.4D; // Current year to date budget for salary.
    String glSegment = "glSegment_example"; // General Ledger Segment. Alpha-numeric and special characters allowed.
    Double lastYearBudgetFTE = 3.4D; // Last year Budget for full time employee.
    Double lastYearBudgetSalary = 3.4D; // Last year Budget salary.
    String levelDescription = "levelDescription_example"; // Organization description. Cannot be updated.
    String reportingCategory = "reportingCategory_example"; // The reporting category code.
    Boolean isActive = true; // The organization level status.
    try {
      OrgLevels result = client
              .singleOrganizationLevel
              .updateOrgLevel(description, code, level, level, code)
              .budgetGroup(budgetGroup)
              .currentYearBudgetFTE(currentYearBudgetFTE)
              .currentYearBudgetSalary(currentYearBudgetSalary)
              .glSegment(glSegment)
              .lastYearBudgetFTE(lastYearBudgetFTE)
              .lastYearBudgetSalary(lastYearBudgetSalary)
              .levelDescription(levelDescription)
              .reportingCategory(reportingCategory)
              .isActive(isActive)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBudgetGroup());
      System.out.println(result.getCode());
      System.out.println(result.getCurrentYearBudgetFTE());
      System.out.println(result.getCurrentYearBudgetSalary());
      System.out.println(result.getGlSegment());
      System.out.println(result.getLastYearBudgetFTE());
      System.out.println(result.getLastYearBudgetSalary());
      System.out.println(result.getLevel());
      System.out.println(result.getLevelDescription());
      System.out.println(result.getReportingCategory());
      System.out.println(result.getIsActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleOrganizationLevelApi#updateOrgLevel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgLevels> response = client
              .singleOrganizationLevel
              .updateOrgLevel(description, code, level, level, code)
              .budgetGroup(budgetGroup)
              .currentYearBudgetFTE(currentYearBudgetFTE)
              .currentYearBudgetSalary(currentYearBudgetSalary)
              .glSegment(glSegment)
              .lastYearBudgetFTE(lastYearBudgetFTE)
              .lastYearBudgetSalary(lastYearBudgetSalary)
              .levelDescription(levelDescription)
              .reportingCategory(reportingCategory)
              .isActive(isActive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleOrganizationLevelApi#updateOrgLevel");
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
| **level** | **String**| Description of the org-level. | |
| **code** | **String**| Organization code. | |
| **orgLevels** | [**OrgLevels**](OrgLevels.md)| The org-level to be written. | |

### Return type

[**OrgLevels**](OrgLevels.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

<a name="updateProperties"></a>
# **updateProperties**
> OrgLevels updateProperties(level, code, orgLevels).execute();

Patch one org-level

Allows the ability update one or more properties of a single org-level configuration. Permissions - Ultipro service account must have \&quot;Edit\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SingleOrganizationLevelApi;
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
    String description = "description_example"; // Organization Level Description.
    String code = "code_example"; // Organization Code, one half of the unique identifier.
    Double level = 3.4D; // Organazation Level, one half of unique identifier. Cannot be updated.
    String level = "level_example"; // Description of the org-level.
    String code = "code_example"; // Organization code.
    String budgetGroup = "budgetGroup_example"; // Organizational budget group.
    Double currentYearBudgetFTE = 3.4D; // Current year to date budget for full time employee.
    Double currentYearBudgetSalary = 3.4D; // Current year to date budget for salary.
    String glSegment = "glSegment_example"; // General Ledger Segment. Alpha-numeric and special characters allowed.
    Double lastYearBudgetFTE = 3.4D; // Last year Budget for full time employee.
    Double lastYearBudgetSalary = 3.4D; // Last year Budget salary.
    String levelDescription = "levelDescription_example"; // Organization description. Cannot be updated.
    String reportingCategory = "reportingCategory_example"; // The reporting category code.
    Boolean isActive = true; // The organization level status.
    try {
      OrgLevels result = client
              .singleOrganizationLevel
              .updateProperties(description, code, level, level, code)
              .budgetGroup(budgetGroup)
              .currentYearBudgetFTE(currentYearBudgetFTE)
              .currentYearBudgetSalary(currentYearBudgetSalary)
              .glSegment(glSegment)
              .lastYearBudgetFTE(lastYearBudgetFTE)
              .lastYearBudgetSalary(lastYearBudgetSalary)
              .levelDescription(levelDescription)
              .reportingCategory(reportingCategory)
              .isActive(isActive)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBudgetGroup());
      System.out.println(result.getCode());
      System.out.println(result.getCurrentYearBudgetFTE());
      System.out.println(result.getCurrentYearBudgetSalary());
      System.out.println(result.getGlSegment());
      System.out.println(result.getLastYearBudgetFTE());
      System.out.println(result.getLastYearBudgetSalary());
      System.out.println(result.getLevel());
      System.out.println(result.getLevelDescription());
      System.out.println(result.getReportingCategory());
      System.out.println(result.getIsActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleOrganizationLevelApi#updateProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgLevels> response = client
              .singleOrganizationLevel
              .updateProperties(description, code, level, level, code)
              .budgetGroup(budgetGroup)
              .currentYearBudgetFTE(currentYearBudgetFTE)
              .currentYearBudgetSalary(currentYearBudgetSalary)
              .glSegment(glSegment)
              .lastYearBudgetFTE(lastYearBudgetFTE)
              .lastYearBudgetSalary(lastYearBudgetSalary)
              .levelDescription(levelDescription)
              .reportingCategory(reportingCategory)
              .isActive(isActive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SingleOrganizationLevelApi#updateProperties");
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
| **level** | **String**| Description of the org-level. | |
| **code** | **String**| Organization code. | |
| **orgLevels** | [**OrgLevels**](OrgLevels.md)| The org-level to be written. | |

### Return type

[**OrgLevels**](OrgLevels.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

