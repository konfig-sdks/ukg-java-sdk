# CompensationDetailsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllByCompany**](CompensationDetailsApi.md#getAllByCompany) | **GET** /personnel/v1/companies/{companyId}/compensation-details | Get all compensation details by company |
| [**getAllDetails**](CompensationDetailsApi.md#getAllDetails) | **GET** /personnel/v1/compensation-details | Get all compensation details |
| [**getByCompanyAndEmployee**](CompensationDetailsApi.md#getByCompanyAndEmployee) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/compensation-details | Get all compensation details by company and employee |
| [**getByEmployee**](CompensationDetailsApi.md#getByEmployee) | **GET** /personnel/v1/compensation-details/{employeeId} | Get all compensation details by employee |


<a name="getAllByCompany"></a>
# **getAllByCompany**
> List&lt;EmpCompensationDetails&gt; getAllByCompany(companyId).companyId2(companyId2).employeeId(employeeId).primaryJobCode(primaryJobCode).jobGroupCode(jobGroupCode).jobTitle(jobTitle).payGroupCode(payGroupCode).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).salaryOrHourlyCode(salaryOrHourlyCode).primaryShiftCode(primaryShiftCode).primaryShiftGroupCode(primaryShiftGroupCode).dateInJob(dateInJob).dateLastPaid(dateLastPaid).datePaidThru(datePaidThru).isAutoAllocated(isAutoAllocated).isAutoPaid(isAutoPaid).isSeasonalWorker(isSeasonalWorker).isHighlyCompensated(isHighlyCompensated).isMultipleJob(isMultipleJob).performanceReviewRating(performanceReviewRating).performanceReviewType(performanceReviewType).page(page).perPage(perPage).execute();

Get all compensation details by company

Get all compensation details by company.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Compensation Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/compensation-details?dateInJob&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/compensation-details?dateInJob&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/compensation-details?dateInJob&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/compensation-details?dateInJob&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationDetailsApi;
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
    String companyId = "companyId_example";
    String companyId2 = "companyId_example";
    String employeeId = "employeeId_example";
    String primaryJobCode = "primaryJobCode_example";
    String jobGroupCode = "jobGroupCode_example";
    String jobTitle = "jobTitle_example";
    String payGroupCode = "payGroupCode_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String salaryOrHourlyCode = "salaryOrHourlyCode_example";
    String primaryShiftCode = "primaryShiftCode_example";
    String primaryShiftGroupCode = "primaryShiftGroupCode_example";
    String dateInJob = "dateInJob_example"; // Used to find date in job less than, greater than, equal to, or between passed date(s)
    String dateLastPaid = "dateLastPaid_example"; // Used to find date last paid less than, greater than, equal to, or between passed date(s)
    String datePaidThru = "datePaidThru_example"; // Used to find date paid through less than, greater than, equal to, or between passed date(s)
    String isAutoAllocated = "isAutoAllocated_example";
    String isAutoPaid = "isAutoPaid_example";
    String isSeasonalWorker = "isSeasonalWorker_example";
    String isHighlyCompensated = "isHighlyCompensated_example";
    String isMultipleJob = "isMultipleJob_example";
    String performanceReviewRating = "performanceReviewRating_example";
    String performanceReviewType = "performanceReviewType_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpCompensationDetails> result = client
              .compensationDetails
              .getAllByCompany(companyId)
              .companyId2(companyId2)
              .employeeId(employeeId)
              .primaryJobCode(primaryJobCode)
              .jobGroupCode(jobGroupCode)
              .jobTitle(jobTitle)
              .payGroupCode(payGroupCode)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .salaryOrHourlyCode(salaryOrHourlyCode)
              .primaryShiftCode(primaryShiftCode)
              .primaryShiftGroupCode(primaryShiftGroupCode)
              .dateInJob(dateInJob)
              .dateLastPaid(dateLastPaid)
              .datePaidThru(datePaidThru)
              .isAutoAllocated(isAutoAllocated)
              .isAutoPaid(isAutoPaid)
              .isSeasonalWorker(isSeasonalWorker)
              .isHighlyCompensated(isHighlyCompensated)
              .isMultipleJob(isMultipleJob)
              .performanceReviewRating(performanceReviewRating)
              .performanceReviewType(performanceReviewType)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getAllByCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpCompensationDetails>> response = client
              .compensationDetails
              .getAllByCompany(companyId)
              .companyId2(companyId2)
              .employeeId(employeeId)
              .primaryJobCode(primaryJobCode)
              .jobGroupCode(jobGroupCode)
              .jobTitle(jobTitle)
              .payGroupCode(payGroupCode)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .salaryOrHourlyCode(salaryOrHourlyCode)
              .primaryShiftCode(primaryShiftCode)
              .primaryShiftGroupCode(primaryShiftGroupCode)
              .dateInJob(dateInJob)
              .dateLastPaid(dateLastPaid)
              .datePaidThru(datePaidThru)
              .isAutoAllocated(isAutoAllocated)
              .isAutoPaid(isAutoPaid)
              .isSeasonalWorker(isSeasonalWorker)
              .isHighlyCompensated(isHighlyCompensated)
              .isMultipleJob(isMultipleJob)
              .performanceReviewRating(performanceReviewRating)
              .performanceReviewType(performanceReviewType)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getAllByCompany");
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
| **companyId** | **String**|  | |
| **companyId2** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **primaryJobCode** | **String**|  | [optional] |
| **jobGroupCode** | **String**|  | [optional] |
| **jobTitle** | **String**|  | [optional] |
| **payGroupCode** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **salaryOrHourlyCode** | **String**|  | [optional] |
| **primaryShiftCode** | **String**|  | [optional] |
| **primaryShiftGroupCode** | **String**|  | [optional] |
| **dateInJob** | **String**| Used to find date in job less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateLastPaid** | **String**| Used to find date last paid less than, greater than, equal to, or between passed date(s) | [optional] |
| **datePaidThru** | **String**| Used to find date paid through less than, greater than, equal to, or between passed date(s) | [optional] |
| **isAutoAllocated** | **String**|  | [optional] |
| **isAutoPaid** | **String**|  | [optional] |
| **isSeasonalWorker** | **String**|  | [optional] |
| **isHighlyCompensated** | **String**|  | [optional] |
| **isMultipleJob** | **String**|  | [optional] |
| **performanceReviewRating** | **String**|  | [optional] |
| **performanceReviewType** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpCompensationDetails&gt;**](EmpCompensationDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |
| **429** | 429 |  -  |

<a name="getAllDetails"></a>
# **getAllDetails**
> List&lt;EmpCompensationDetails&gt; getAllDetails().companyId(companyId).employeeId(employeeId).primaryJobCode(primaryJobCode).jobGroupCode(jobGroupCode).jobTitle(jobTitle).payGroupCode(payGroupCode).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).salaryOrHourlyCode(salaryOrHourlyCode).primaryShiftCode(primaryShiftCode).primaryShiftGroupCode(primaryShiftGroupCode).dateInJob(dateInJob).dateLastPaid(dateLastPaid).datePaidThru(datePaidThru).isAutoAllocated(isAutoAllocated).isAutoPaid(isAutoPaid).isSeasonalWorker(isSeasonalWorker).isHighlyCompensated(isHighlyCompensated).isMultipleJob(isMultipleJob).performanceReviewRating(performanceReviewRating).performanceReviewType(performanceReviewType).page(page).perPage(perPage).execute();

Get all compensation details

Get all compensation details.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Compensation Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /compensation-details?dateInJob&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /compensation-details?dateInJob&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /compensation-details?dateInJob&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /compensation-details?dateInJob&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationDetailsApi;
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
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    String primaryJobCode = "primaryJobCode_example";
    String jobGroupCode = "jobGroupCode_example";
    String jobTitle = "jobTitle_example";
    String payGroupCode = "payGroupCode_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String salaryOrHourlyCode = "salaryOrHourlyCode_example";
    String primaryShiftCode = "primaryShiftCode_example";
    String primaryShiftGroupCode = "primaryShiftGroupCode_example";
    String dateInJob = "dateInJob_example"; // Used to find date in job less than, greater than, equal to, or between passed date(s)
    String dateLastPaid = "dateLastPaid_example"; // Used to find date last paid less than, greater than, equal to, or between passed date(s)
    String datePaidThru = "datePaidThru_example"; // Used to find date paid through less than, greater than, equal to, or between passed date(s)
    String isAutoAllocated = "isAutoAllocated_example";
    String isAutoPaid = "isAutoPaid_example";
    String isSeasonalWorker = "isSeasonalWorker_example";
    String isHighlyCompensated = "isHighlyCompensated_example";
    String isMultipleJob = "isMultipleJob_example";
    String performanceReviewRating = "performanceReviewRating_example";
    String performanceReviewType = "performanceReviewType_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpCompensationDetails> result = client
              .compensationDetails
              .getAllDetails()
              .companyId(companyId)
              .employeeId(employeeId)
              .primaryJobCode(primaryJobCode)
              .jobGroupCode(jobGroupCode)
              .jobTitle(jobTitle)
              .payGroupCode(payGroupCode)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .salaryOrHourlyCode(salaryOrHourlyCode)
              .primaryShiftCode(primaryShiftCode)
              .primaryShiftGroupCode(primaryShiftGroupCode)
              .dateInJob(dateInJob)
              .dateLastPaid(dateLastPaid)
              .datePaidThru(datePaidThru)
              .isAutoAllocated(isAutoAllocated)
              .isAutoPaid(isAutoPaid)
              .isSeasonalWorker(isSeasonalWorker)
              .isHighlyCompensated(isHighlyCompensated)
              .isMultipleJob(isMultipleJob)
              .performanceReviewRating(performanceReviewRating)
              .performanceReviewType(performanceReviewType)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getAllDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpCompensationDetails>> response = client
              .compensationDetails
              .getAllDetails()
              .companyId(companyId)
              .employeeId(employeeId)
              .primaryJobCode(primaryJobCode)
              .jobGroupCode(jobGroupCode)
              .jobTitle(jobTitle)
              .payGroupCode(payGroupCode)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .salaryOrHourlyCode(salaryOrHourlyCode)
              .primaryShiftCode(primaryShiftCode)
              .primaryShiftGroupCode(primaryShiftGroupCode)
              .dateInJob(dateInJob)
              .dateLastPaid(dateLastPaid)
              .datePaidThru(datePaidThru)
              .isAutoAllocated(isAutoAllocated)
              .isAutoPaid(isAutoPaid)
              .isSeasonalWorker(isSeasonalWorker)
              .isHighlyCompensated(isHighlyCompensated)
              .isMultipleJob(isMultipleJob)
              .performanceReviewRating(performanceReviewRating)
              .performanceReviewType(performanceReviewType)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getAllDetails");
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
| **companyId** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **primaryJobCode** | **String**|  | [optional] |
| **jobGroupCode** | **String**|  | [optional] |
| **jobTitle** | **String**|  | [optional] |
| **payGroupCode** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **salaryOrHourlyCode** | **String**|  | [optional] |
| **primaryShiftCode** | **String**|  | [optional] |
| **primaryShiftGroupCode** | **String**|  | [optional] |
| **dateInJob** | **String**| Used to find date in job less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateLastPaid** | **String**| Used to find date last paid less than, greater than, equal to, or between passed date(s) | [optional] |
| **datePaidThru** | **String**| Used to find date paid through less than, greater than, equal to, or between passed date(s) | [optional] |
| **isAutoAllocated** | **String**|  | [optional] |
| **isAutoPaid** | **String**|  | [optional] |
| **isSeasonalWorker** | **String**|  | [optional] |
| **isHighlyCompensated** | **String**|  | [optional] |
| **isMultipleJob** | **String**|  | [optional] |
| **performanceReviewRating** | **String**|  | [optional] |
| **performanceReviewType** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpCompensationDetails&gt;**](EmpCompensationDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |
| **429** | 429 |  -  |

<a name="getByCompanyAndEmployee"></a>
# **getByCompanyAndEmployee**
> List&lt;EmpCompensationDetails&gt; getByCompanyAndEmployee(companyId, employeeId).companyId2(companyId2).employeeId2(employeeId2).primaryJobCode(primaryJobCode).jobGroupCode(jobGroupCode).jobTitle(jobTitle).payGroupCode(payGroupCode).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).salaryOrHourlyCode(salaryOrHourlyCode).primaryShiftCode(primaryShiftCode).primaryShiftGroupCode(primaryShiftGroupCode).dateInJob(dateInJob).dateLastPaid(dateLastPaid).datePaidThru(datePaidThru).isAutoAllocated(isAutoAllocated).isAutoPaid(isAutoPaid).isSeasonalWorker(isSeasonalWorker).isHighlyCompensated(isHighlyCompensated).isMultipleJob(isMultipleJob).performanceReviewRating(performanceReviewRating).performanceReviewType(performanceReviewType).page(page).perPage(perPage).execute();

Get all compensation details by company and employee

Get all compensation details by company and employee.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Compensation Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/compensation-details?dateInJob&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/compensation-details?dateInJob&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/compensation-details?dateInJob&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/compensation-details?dateInJob&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationDetailsApi;
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
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    String companyId2 = "companyId_example";
    String employeeId2 = "employeeId_example";
    String primaryJobCode = "primaryJobCode_example";
    String jobGroupCode = "jobGroupCode_example";
    String jobTitle = "jobTitle_example";
    String payGroupCode = "payGroupCode_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String salaryOrHourlyCode = "salaryOrHourlyCode_example";
    String primaryShiftCode = "primaryShiftCode_example";
    String primaryShiftGroupCode = "primaryShiftGroupCode_example";
    String dateInJob = "dateInJob_example"; // Used to find date in job less than, greater than, equal to, or between passed date(s)
    String dateLastPaid = "dateLastPaid_example"; // Used to find date last paid less than, greater than, equal to, or between passed date(s)
    String datePaidThru = "datePaidThru_example"; // Used to find date paid through less than, greater than, equal to, or between passed date(s)
    String isAutoAllocated = "isAutoAllocated_example";
    String isAutoPaid = "isAutoPaid_example";
    String isSeasonalWorker = "isSeasonalWorker_example";
    String isHighlyCompensated = "isHighlyCompensated_example";
    String isMultipleJob = "isMultipleJob_example";
    String performanceReviewRating = "performanceReviewRating_example";
    String performanceReviewType = "performanceReviewType_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpCompensationDetails> result = client
              .compensationDetails
              .getByCompanyAndEmployee(companyId, employeeId)
              .companyId2(companyId2)
              .employeeId2(employeeId2)
              .primaryJobCode(primaryJobCode)
              .jobGroupCode(jobGroupCode)
              .jobTitle(jobTitle)
              .payGroupCode(payGroupCode)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .salaryOrHourlyCode(salaryOrHourlyCode)
              .primaryShiftCode(primaryShiftCode)
              .primaryShiftGroupCode(primaryShiftGroupCode)
              .dateInJob(dateInJob)
              .dateLastPaid(dateLastPaid)
              .datePaidThru(datePaidThru)
              .isAutoAllocated(isAutoAllocated)
              .isAutoPaid(isAutoPaid)
              .isSeasonalWorker(isSeasonalWorker)
              .isHighlyCompensated(isHighlyCompensated)
              .isMultipleJob(isMultipleJob)
              .performanceReviewRating(performanceReviewRating)
              .performanceReviewType(performanceReviewType)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getByCompanyAndEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpCompensationDetails>> response = client
              .compensationDetails
              .getByCompanyAndEmployee(companyId, employeeId)
              .companyId2(companyId2)
              .employeeId2(employeeId2)
              .primaryJobCode(primaryJobCode)
              .jobGroupCode(jobGroupCode)
              .jobTitle(jobTitle)
              .payGroupCode(payGroupCode)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .salaryOrHourlyCode(salaryOrHourlyCode)
              .primaryShiftCode(primaryShiftCode)
              .primaryShiftGroupCode(primaryShiftGroupCode)
              .dateInJob(dateInJob)
              .dateLastPaid(dateLastPaid)
              .datePaidThru(datePaidThru)
              .isAutoAllocated(isAutoAllocated)
              .isAutoPaid(isAutoPaid)
              .isSeasonalWorker(isSeasonalWorker)
              .isHighlyCompensated(isHighlyCompensated)
              .isMultipleJob(isMultipleJob)
              .performanceReviewRating(performanceReviewRating)
              .performanceReviewType(performanceReviewType)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getByCompanyAndEmployee");
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
| **companyId** | **String**|  | |
| **employeeId** | **String**|  | |
| **companyId2** | **String**|  | [optional] |
| **employeeId2** | **String**|  | [optional] |
| **primaryJobCode** | **String**|  | [optional] |
| **jobGroupCode** | **String**|  | [optional] |
| **jobTitle** | **String**|  | [optional] |
| **payGroupCode** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **salaryOrHourlyCode** | **String**|  | [optional] |
| **primaryShiftCode** | **String**|  | [optional] |
| **primaryShiftGroupCode** | **String**|  | [optional] |
| **dateInJob** | **String**| Used to find date in job less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateLastPaid** | **String**| Used to find date last paid less than, greater than, equal to, or between passed date(s) | [optional] |
| **datePaidThru** | **String**| Used to find date paid through less than, greater than, equal to, or between passed date(s) | [optional] |
| **isAutoAllocated** | **String**|  | [optional] |
| **isAutoPaid** | **String**|  | [optional] |
| **isSeasonalWorker** | **String**|  | [optional] |
| **isHighlyCompensated** | **String**|  | [optional] |
| **isMultipleJob** | **String**|  | [optional] |
| **performanceReviewRating** | **String**|  | [optional] |
| **performanceReviewType** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpCompensationDetails&gt;**](EmpCompensationDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |
| **429** | 429 |  -  |

<a name="getByEmployee"></a>
# **getByEmployee**
> EmpCompensationDetails getByEmployee(employeeId).execute();

Get all compensation details by employee

Get all compensation details by employee.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Compensation Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /compensation-details/{employeeId}?dateInJob&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /compensation-details/{employeeId}?dateInJob&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /compensation-details/{employeeId}?dateInJob&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /compensation-details/{employeeId}?dateInJob&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationDetailsApi;
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
    String employeeId = "employeeId_example";
    try {
      EmpCompensationDetails result = client
              .compensationDetails
              .getByEmployee(employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeID());
      System.out.println(result.getCompanyID());
      System.out.println(result.getAnnualSalary());
      System.out.println(result.getHourlyPayRate());
      System.out.println(result.getWeeklyPayRate());
      System.out.println(result.getPayPeriodPayRate());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOtherRate1());
      System.out.println(result.getOtherRate2());
      System.out.println(result.getOtherRate3());
      System.out.println(result.getOtherRate4());
      System.out.println(result.getPayGroupDescription());
      System.out.println(result.getPiecePayRate());
      System.out.println(result.getPrimaryJobCode());
      System.out.println(result.getJobSalaryGrade());
      System.out.println(result.getJobChangeReasonCode());
      System.out.println(result.getJobGroupCode());
      System.out.println(result.getJobTitle());
      System.out.println(result.getDateInJob());
      System.out.println(result.getDateLastPaid());
      System.out.println(result.getDateLastWorked());
      System.out.println(result.getDateOfLastSalaryReview());
      System.out.println(result.getDateOfNextSalayrReview());
      System.out.println(result.getIsAutoAllocated());
      System.out.println(result.getIsAutoPaid());
      System.out.println(result.getIsSeasonalWorker());
      System.out.println(result.getIsHighlyCompensated());
      System.out.println(result.getIsMultipleJob());
      System.out.println(result.getPayGroupCode());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayScaleCode());
      System.out.println(result.getSalaryOrHourlyCode());
      System.out.println(result.getFullTimeOrPartTimeCode());
      System.out.println(result.getScheduledFullTimeEquivalency());
      System.out.println(result.getScheduledPeriodWorkHours());
      System.out.println(result.getScheduledAnnualWorkHours());
      System.out.println(result.getWeeklyHours());
      System.out.println(result.getPrimaryShiftCode());
      System.out.println(result.getPrimaryShiftGroupCode());
      System.out.println(result.getAvgPayRateCurPer());
      System.out.println(result.getBonusTotalHrs());
      System.out.println(result.getBonusTotalOtHrs());
      System.out.println(result.getDatePaidThru());
      System.out.println(result.getEmplStatus());
      System.out.println(result.getTotalAnnSalary());
      System.out.println(result.getDistributionCenterCode());
      System.out.println(result.getNumberOfPayments());
      System.out.println(result.getPerformanceReviewRating());
      System.out.println(result.getPerformanceReviewType());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getByEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmpCompensationDetails> response = client
              .compensationDetails
              .getByEmployee(employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationDetailsApi#getByEmployee");
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
| **employeeId** | **String**|  | |

### Return type

[**EmpCompensationDetails**](EmpCompensationDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |
| **500** | InternalServerError |  -  |

