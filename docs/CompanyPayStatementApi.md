# CompanyPayStatementApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByDateRange**](CompanyPayStatementApi.md#getByDateRange) | **POST** /payroll/v1/companies/pay-statements | Get employee(s) pay statement(s) for a company or pay group for a given date range. |
| [**getPaySummaries**](CompanyPayStatementApi.md#getPaySummaries) | **POST** /payroll/v1/companies/pay-statements-summary | Get employee(s) pay statement(s) summary for a company or pay group for a given date range. |


<a name="getByDateRange"></a>
# **getByDateRange**
> List&lt;EmployeePayStatementModel&gt; getByDateRange(companyPayStatementFilter).execute();

Get employee(s) pay statement(s) for a company or pay group for a given date range.

This method returns zero or more full pay statement documents for a given start date and end date. You may also pass in a PayGroup or CompanyIdentifer to further filter the list of pay summaries returned. &lt;br /&gt;If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyPayStatementApi;
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
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    String companyId = "companyId_example";
    String payGroup = "payGroup_example";
    Integer page = 56;
    Integer perPage = 56;
    Integer pagesCount = 56;
    try {
      List<EmployeePayStatementModel> result = client
              .companyPayStatement
              .getByDateRange(startDate, endDate)
              .companyId(companyId)
              .payGroup(payGroup)
              .page(page)
              .perPage(perPage)
              .pagesCount(pagesCount)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyPayStatementApi#getByDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeePayStatementModel>> response = client
              .companyPayStatement
              .getByDateRange(startDate, endDate)
              .companyId(companyId)
              .payGroup(payGroup)
              .page(page)
              .perPage(perPage)
              .pagesCount(pagesCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyPayStatementApi#getByDateRange");
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
| **companyPayStatementFilter** | [**CompanyPayStatementFilter**](CompanyPayStatementFilter.md)|  | |

### Return type

[**List&lt;EmployeePayStatementModel&gt;**](EmployeePayStatementModel.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BadRequest |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

<a name="getPaySummaries"></a>
# **getPaySummaries**
> List&lt;CompanyPayStatementModel&gt; getPaySummaries(companyPayStatementFilter).execute();

Get employee(s) pay statement(s) summary for a company or pay group for a given date range.

This method returns zero or more pay statement summaries for a given start date and end date. The pay summary information gives you a quick view of the total earnings, deductions and taxes. You may also pass in a PayGroup or CompanyIdentifer to further filter the list of pay summaries returned. &lt;br /&gt;If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyPayStatementApi;
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
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    String companyId = "companyId_example";
    String payGroup = "payGroup_example";
    Integer page = 56;
    Integer perPage = 56;
    Integer pagesCount = 56;
    try {
      List<CompanyPayStatementModel> result = client
              .companyPayStatement
              .getPaySummaries(startDate, endDate)
              .companyId(companyId)
              .payGroup(payGroup)
              .page(page)
              .perPage(perPage)
              .pagesCount(pagesCount)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyPayStatementApi#getPaySummaries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CompanyPayStatementModel>> response = client
              .companyPayStatement
              .getPaySummaries(startDate, endDate)
              .companyId(companyId)
              .payGroup(payGroup)
              .page(page)
              .perPage(perPage)
              .pagesCount(pagesCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyPayStatementApi#getPaySummaries");
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
| **companyPayStatementFilter** | [**CompanyPayStatementFilter**](CompanyPayStatementFilter.md)|  | |

### Return type

[**List&lt;CompanyPayStatementModel&gt;**](CompanyPayStatementModel.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BadRequest |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

