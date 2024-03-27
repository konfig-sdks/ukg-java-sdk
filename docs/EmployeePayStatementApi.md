# EmployeePayStatementApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByDateRange**](EmployeePayStatementApi.md#getByDateRange) | **POST** /payroll/v1/employees/pay-statements | Get employee pay statement(s) based on the passed employee identifier for a given date range. |
| [**getByPayIdentifier**](EmployeePayStatementApi.md#getByPayIdentifier) | **GET** /payroll/v1/employees/pay-statement/{PayIdentifier} | Get employee pay statement based on the given pay identifier. |
| [**getLastPayStatement**](EmployeePayStatementApi.md#getLastPayStatement) | **POST** /payroll/v1/employees/pay-statement/last | Get employee last pay statement based on the passed employee identifier. |


<a name="getByDateRange"></a>
# **getByDateRange**
> List&lt;EmployeePayStatementModel&gt; getByDateRange(employeePayStatementRangeFilter).execute();

Get employee pay statement(s) based on the passed employee identifier for a given date range.

This method returns zero or more pay statements for a specific employee identified by the passed-in employee identifier. The pay statement returned is based on the start date and the end date passed in. &lt;br /&gt;If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStatementApi;
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
    EmployeeIdentifier employeeIdentifier = new EmployeeIdentifier();
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    Integer page = 56;
    Integer perPage = 56;
    Integer pagesCount = 56;
    try {
      List<EmployeePayStatementModel> result = client
              .employeePayStatement
              .getByDateRange()
              .employeeIdentifier(employeeIdentifier)
              .startDate(startDate)
              .endDate(endDate)
              .page(page)
              .perPage(perPage)
              .pagesCount(pagesCount)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStatementApi#getByDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeePayStatementModel>> response = client
              .employeePayStatement
              .getByDateRange()
              .employeeIdentifier(employeeIdentifier)
              .startDate(startDate)
              .endDate(endDate)
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
      System.err.println("Exception when calling EmployeePayStatementApi#getByDateRange");
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
| **employeePayStatementRangeFilter** | [**EmployeePayStatementRangeFilter**](EmployeePayStatementRangeFilter.md)|  | |

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

<a name="getByPayIdentifier"></a>
# **getByPayIdentifier**
> EmployeePayStatementModel getByPayIdentifier(payIdentifier).execute();

Get employee pay statement based on the given pay identifier.

This method returns zero or one pay statements based on the given pay identifier. The pay identifier is a string value that represents a unique pay statement.&lt;br /&gt; If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStatementApi;
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
    String payIdentifier = "payIdentifier_example";
    try {
      EmployeePayStatementModel result = client
              .employeePayStatement
              .getByPayIdentifier(payIdentifier)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccruals());
      System.out.println(result.getAddressline1());
      System.out.println(result.getAddressline2());
      System.out.println(result.getCity());
      System.out.println(result.getCompanyaddresscity());
      System.out.println(result.getCompanyaddresscountry());
      System.out.println(result.getCompanyaddresscounty());
      System.out.println(result.getCompanyaddressline1());
      System.out.println(result.getCompanyaddressline2());
      System.out.println(result.getCompanyaddresspostalcode());
      System.out.println(result.getCompanyaddressstateorprovince());
      System.out.println(result.getCompanyname());
      System.out.println(result.getCompanyphone());
      System.out.println(result.getCompanyphoneext());
      System.out.println(result.getCountry());
      System.out.println(result.getDeductions());
      System.out.println(result.getDeductionscurrent());
      System.out.println(result.getDeductionsytd());
      System.out.println(result.getDocument());
      System.out.println(result.getEarnings());
      System.out.println(result.getEmployeeidentifier());
      System.out.println(result.getEmployeenumber());
      System.out.println(result.getFederaladditionalamountWithheld());
      System.out.println(result.getFederalallowancesclaimed());
      System.out.println(result.getFederalfilingstatus());
      System.out.println(result.getFederaltaxablewagescurrent());
      System.out.println(result.getFederaltaxablewagesytd());
      System.out.println(result.getFullname());
      System.out.println(result.getGrosswagescurrent());
      System.out.println(result.getGrosswagesytd());
      System.out.println(result.getJob());
      System.out.println(result.getLocation());
      System.out.println(result.getNetpay());
      System.out.println(result.getNetpaycurrent());
      System.out.println(result.getNetpayytd());
      System.out.println(result.getOrglevel1());
      System.out.println(result.getOrglevel2());
      System.out.println(result.getOrglevel3());
      System.out.println(result.getOrglevel4());
      System.out.println(result.getPaydate());
      System.out.println(result.getPayperiodfrequency());
      System.out.println(result.getPaygroup());
      System.out.println(result.getPayidentifier());
      System.out.println(result.getPayrate());
      System.out.println(result.getPeriodenddate());
      System.out.println(result.getPeriodstartdate());
      System.out.println(result.getPostalcode());
      System.out.println(result.getResidentstateallowancesclaimed());
      System.out.println(result.getResidentstatefilingstatus());
      System.out.println(result.getSsn());
      System.out.println(result.getStateorprovince());
      System.out.println(result.getTaxes());
      System.out.println(result.getTaxescurrent());
      System.out.println(result.getTaxesytd());
      System.out.println(result.getWorkstateallowancesclaimed());
      System.out.println(result.getWorkstatefilingstatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStatementApi#getByPayIdentifier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePayStatementModel> response = client
              .employeePayStatement
              .getByPayIdentifier(payIdentifier)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStatementApi#getByPayIdentifier");
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
| **payIdentifier** | **String**|  | |

### Return type

[**EmployeePayStatementModel**](EmployeePayStatementModel.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BadRequest |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

<a name="getLastPayStatement"></a>
# **getLastPayStatement**
> EmployeePayStatementModel getLastPayStatement(employeePayStatementRangeFilter).execute();

Get employee last pay statement based on the passed employee identifier.

This method allows you to retrieve an individual pay statement by providing an employee identifier. This is helpful if you are designing an application that is aware of the employees to retrieve. &lt;br /&gt;If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password})

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayStatementApi;
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
    EmployeeIdentifier employeeIdentifier = new EmployeeIdentifier();
    OffsetDateTime startDate = OffsetDateTime.now();
    OffsetDateTime endDate = OffsetDateTime.now();
    Integer page = 56;
    Integer perPage = 56;
    Integer pagesCount = 56;
    try {
      EmployeePayStatementModel result = client
              .employeePayStatement
              .getLastPayStatement()
              .employeeIdentifier(employeeIdentifier)
              .startDate(startDate)
              .endDate(endDate)
              .page(page)
              .perPage(perPage)
              .pagesCount(pagesCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccruals());
      System.out.println(result.getAddressline1());
      System.out.println(result.getAddressline2());
      System.out.println(result.getCity());
      System.out.println(result.getCompanyaddresscity());
      System.out.println(result.getCompanyaddresscountry());
      System.out.println(result.getCompanyaddresscounty());
      System.out.println(result.getCompanyaddressline1());
      System.out.println(result.getCompanyaddressline2());
      System.out.println(result.getCompanyaddresspostalcode());
      System.out.println(result.getCompanyaddressstateorprovince());
      System.out.println(result.getCompanyname());
      System.out.println(result.getCompanyphone());
      System.out.println(result.getCompanyphoneext());
      System.out.println(result.getCountry());
      System.out.println(result.getDeductions());
      System.out.println(result.getDeductionscurrent());
      System.out.println(result.getDeductionsytd());
      System.out.println(result.getDocument());
      System.out.println(result.getEarnings());
      System.out.println(result.getEmployeeidentifier());
      System.out.println(result.getEmployeenumber());
      System.out.println(result.getFederaladditionalamountWithheld());
      System.out.println(result.getFederalallowancesclaimed());
      System.out.println(result.getFederalfilingstatus());
      System.out.println(result.getFederaltaxablewagescurrent());
      System.out.println(result.getFederaltaxablewagesytd());
      System.out.println(result.getFullname());
      System.out.println(result.getGrosswagescurrent());
      System.out.println(result.getGrosswagesytd());
      System.out.println(result.getJob());
      System.out.println(result.getLocation());
      System.out.println(result.getNetpay());
      System.out.println(result.getNetpaycurrent());
      System.out.println(result.getNetpayytd());
      System.out.println(result.getOrglevel1());
      System.out.println(result.getOrglevel2());
      System.out.println(result.getOrglevel3());
      System.out.println(result.getOrglevel4());
      System.out.println(result.getPaydate());
      System.out.println(result.getPayperiodfrequency());
      System.out.println(result.getPaygroup());
      System.out.println(result.getPayidentifier());
      System.out.println(result.getPayrate());
      System.out.println(result.getPeriodenddate());
      System.out.println(result.getPeriodstartdate());
      System.out.println(result.getPostalcode());
      System.out.println(result.getResidentstateallowancesclaimed());
      System.out.println(result.getResidentstatefilingstatus());
      System.out.println(result.getSsn());
      System.out.println(result.getStateorprovince());
      System.out.println(result.getTaxes());
      System.out.println(result.getTaxescurrent());
      System.out.println(result.getTaxesytd());
      System.out.println(result.getWorkstateallowancesclaimed());
      System.out.println(result.getWorkstatefilingstatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayStatementApi#getLastPayStatement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePayStatementModel> response = client
              .employeePayStatement
              .getLastPayStatement()
              .employeeIdentifier(employeeIdentifier)
              .startDate(startDate)
              .endDate(endDate)
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
      System.err.println("Exception when calling EmployeePayStatementApi#getLastPayStatement");
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
| **employeePayStatementRangeFilter** | [**EmployeePayStatementRangeFilter**](EmployeePayStatementRangeFilter.md)|  | |

### Return type

[**EmployeePayStatementModel**](EmployeePayStatementModel.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BadRequest |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

