# EmployeeJobHistoryDetailApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](EmployeeJobHistoryDetailApi.md#get) | **GET** /personnel/v1/employee-job-history-details | Get all employee job history details |
| [**getSingleRecord**](EmployeeJobHistoryDetailApi.md#getSingleRecord) | **GET** /personnel/v1/employee-job-history-details/{systemId} | Get a single job history detail record |


<a name="get"></a>
# **get**
> EmployeeJobHistoryDetail get().companyId(companyId).employeeId(employeeId).isOrgChange(isOrgChange).isJobChange(isJobChange).isRateChange(isRateChange).isPromotion(isPromotion).systemId(systemId).jobEffectiveDate(jobEffectiveDate).dateTimeCreated(dateTimeCreated).page(page).perPage(perPage).execute();

Get all employee job history details

Get all employee job history details. If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Job History Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeJobHistoryDetailApi;
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
    String isOrgChange = "isOrgChange_example";
    String isJobChange = "isJobChange_example";
    String isRateChange = "isRateChange_example";
    String isPromotion = "isPromotion_example";
    String systemId = "systemId_example";
    String jobEffectiveDate = "jobEffectiveDate_example"; // Used to find job history effective date less than, greater than, equal to, or between passed date(s)
    String dateTimeCreated = "dateTimeCreated_example"; // Used to find job history created less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      EmployeeJobHistoryDetail result = client
              .employeeJobHistoryDetail
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .isOrgChange(isOrgChange)
              .isJobChange(isJobChange)
              .isRateChange(isRateChange)
              .isPromotion(isPromotion)
              .systemId(systemId)
              .jobEffectiveDate(jobEffectiveDate)
              .dateTimeCreated(dateTimeCreated)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnnualSalary());
      System.out.println(result.getCompanyId());
      System.out.println(result.getDateTimeCreated());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getEmployeeType());
      System.out.println(result.getEmployeeStatus());
      System.out.println(result.getFlsaCategory());
      System.out.println(result.getFullTimeOrPartTime());
      System.out.println(result.getHourlyPayRate());
      System.out.println(result.getIsJobChange());
      System.out.println(result.getIsOrgchange());
      System.out.println(result.getIsOutsideGuidelines());
      System.out.println(result.getIsOutsideRange());
      System.out.println(result.getIsPromotion());
      System.out.println(result.getIsRateChange());
      System.out.println(result.getIsSystem());
      System.out.println(result.getIsTransfer());
      System.out.println(result.getJobCode());
      System.out.println(result.getJobDescription());
      System.out.println(result.getJobEffectiveDate());
      System.out.println(result.getJobGroupCode());
      System.out.println(result.getLocationCode());
      System.out.println(result.getOrgLevel1Code());
      System.out.println(result.getOrgLevel2Code());
      System.out.println(result.getOrgLevel3Code());
      System.out.println(result.getOrgLevel4Code());
      System.out.println(result.getOtherRate1());
      System.out.println(result.getOtherRate2());
      System.out.println(result.getOtherRate3());
      System.out.println(result.getOtherRate4());
      System.out.println(result.getPayGroupCode());
      System.out.println(result.getPayPeriodCode());
      System.out.println(result.getPayScaleCode());
      System.out.println(result.getPercentChange());
      System.out.println(result.getPeriodPayRate());
      System.out.println(result.getPiecePayRate());
      System.out.println(result.getPositionCode());
      System.out.println(result.getReasonCode());
      System.out.println(result.getSalaryGrade());
      System.out.println(result.getSalaryOrHourly());
      System.out.println(result.getScheduledAnnualHours());
      System.out.println(result.getScheduledFullTimeEquivalency());
      System.out.println(result.getScheduledWorkHours());
      System.out.println(result.getShiftCode());
      System.out.println(result.getShiftGroupCode());
      System.out.println(result.getStepNumber());
      System.out.println(result.getSupervisorId());
      System.out.println(result.getSupervisorNameFirst());
      System.out.println(result.getSupervisorNameLast());
      System.out.println(result.getSupervisorNameSuffix());
      System.out.println(result.getSupervisorNotInList());
      System.out.println(result.getSystemId());
      System.out.println(result.getUnionNational());
      System.out.println(result.getUsePayScales());
      System.out.println(result.getWeeklyPayRate());
      System.out.println(result.getNotes());
      System.out.println(result.getHomeCompanyId());
      System.out.println(result.getIntegrationEffectiveDate());
      System.out.println(result.getProjectCode());
      System.out.println(result.getNumberOfPayments());
      System.out.println(result.getWeeklyHours());
      System.out.println(result.getIsViewableByEmployee());
      System.out.println(result.getCreatedByUserId());
      System.out.println(result.getJobTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeJobHistoryDetailApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeJobHistoryDetail> response = client
              .employeeJobHistoryDetail
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .isOrgChange(isOrgChange)
              .isJobChange(isJobChange)
              .isRateChange(isRateChange)
              .isPromotion(isPromotion)
              .systemId(systemId)
              .jobEffectiveDate(jobEffectiveDate)
              .dateTimeCreated(dateTimeCreated)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeJobHistoryDetailApi#get");
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
| **isOrgChange** | **String**|  | [optional] |
| **isJobChange** | **String**|  | [optional] |
| **isRateChange** | **String**|  | [optional] |
| **isPromotion** | **String**|  | [optional] |
| **systemId** | **String**|  | [optional] |
| **jobEffectiveDate** | **String**| Used to find job history effective date less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeCreated** | **String**| Used to find job history created less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**EmployeeJobHistoryDetail**](EmployeeJobHistoryDetail.md)

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

<a name="getSingleRecord"></a>
# **getSingleRecord**
> EmployeeJobHistoryDetail getSingleRecord(systemId).companyId(companyId).employeeId(employeeId).isOrgChange(isOrgChange).isJobChange(isJobChange).isRateChange(isRateChange).isPromotion(isPromotion).systemId2(systemId2).jobEffectiveDate(jobEffectiveDate).dateTimeCreated(dateTimeCreated).page(page).perPage(perPage).execute();

Get a single job history detail record

Get a single job history detail record.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Job History Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeJobHistoryDetailApi;
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
    String systemId = "systemId_example";
    String companyId = "companyId_example";
    String employeeId = "employeeId_example";
    String isOrgChange = "isOrgChange_example";
    String isJobChange = "isJobChange_example";
    String isRateChange = "isRateChange_example";
    String isPromotion = "isPromotion_example";
    String systemId2 = "systemId_example";
    String jobEffectiveDate = "jobEffectiveDate_example"; // Used to find job history effective date less than, greater than, equal to, or between passed date(s)
    String dateTimeCreated = "dateTimeCreated_example"; // Used to find job history created less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      EmployeeJobHistoryDetail result = client
              .employeeJobHistoryDetail
              .getSingleRecord(systemId)
              .companyId(companyId)
              .employeeId(employeeId)
              .isOrgChange(isOrgChange)
              .isJobChange(isJobChange)
              .isRateChange(isRateChange)
              .isPromotion(isPromotion)
              .systemId2(systemId2)
              .jobEffectiveDate(jobEffectiveDate)
              .dateTimeCreated(dateTimeCreated)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnnualSalary());
      System.out.println(result.getCompanyId());
      System.out.println(result.getDateTimeCreated());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getEmployeeType());
      System.out.println(result.getEmployeeStatus());
      System.out.println(result.getFlsaCategory());
      System.out.println(result.getFullTimeOrPartTime());
      System.out.println(result.getHourlyPayRate());
      System.out.println(result.getIsJobChange());
      System.out.println(result.getIsOrgchange());
      System.out.println(result.getIsOutsideGuidelines());
      System.out.println(result.getIsOutsideRange());
      System.out.println(result.getIsPromotion());
      System.out.println(result.getIsRateChange());
      System.out.println(result.getIsSystem());
      System.out.println(result.getIsTransfer());
      System.out.println(result.getJobCode());
      System.out.println(result.getJobDescription());
      System.out.println(result.getJobEffectiveDate());
      System.out.println(result.getJobGroupCode());
      System.out.println(result.getLocationCode());
      System.out.println(result.getOrgLevel1Code());
      System.out.println(result.getOrgLevel2Code());
      System.out.println(result.getOrgLevel3Code());
      System.out.println(result.getOrgLevel4Code());
      System.out.println(result.getOtherRate1());
      System.out.println(result.getOtherRate2());
      System.out.println(result.getOtherRate3());
      System.out.println(result.getOtherRate4());
      System.out.println(result.getPayGroupCode());
      System.out.println(result.getPayPeriodCode());
      System.out.println(result.getPayScaleCode());
      System.out.println(result.getPercentChange());
      System.out.println(result.getPeriodPayRate());
      System.out.println(result.getPiecePayRate());
      System.out.println(result.getPositionCode());
      System.out.println(result.getReasonCode());
      System.out.println(result.getSalaryGrade());
      System.out.println(result.getSalaryOrHourly());
      System.out.println(result.getScheduledAnnualHours());
      System.out.println(result.getScheduledFullTimeEquivalency());
      System.out.println(result.getScheduledWorkHours());
      System.out.println(result.getShiftCode());
      System.out.println(result.getShiftGroupCode());
      System.out.println(result.getStepNumber());
      System.out.println(result.getSupervisorId());
      System.out.println(result.getSupervisorNameFirst());
      System.out.println(result.getSupervisorNameLast());
      System.out.println(result.getSupervisorNameSuffix());
      System.out.println(result.getSupervisorNotInList());
      System.out.println(result.getSystemId());
      System.out.println(result.getUnionNational());
      System.out.println(result.getUsePayScales());
      System.out.println(result.getWeeklyPayRate());
      System.out.println(result.getNotes());
      System.out.println(result.getHomeCompanyId());
      System.out.println(result.getIntegrationEffectiveDate());
      System.out.println(result.getProjectCode());
      System.out.println(result.getNumberOfPayments());
      System.out.println(result.getWeeklyHours());
      System.out.println(result.getIsViewableByEmployee());
      System.out.println(result.getCreatedByUserId());
      System.out.println(result.getJobTitle());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeJobHistoryDetailApi#getSingleRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeJobHistoryDetail> response = client
              .employeeJobHistoryDetail
              .getSingleRecord(systemId)
              .companyId(companyId)
              .employeeId(employeeId)
              .isOrgChange(isOrgChange)
              .isJobChange(isJobChange)
              .isRateChange(isRateChange)
              .isPromotion(isPromotion)
              .systemId2(systemId2)
              .jobEffectiveDate(jobEffectiveDate)
              .dateTimeCreated(dateTimeCreated)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeJobHistoryDetailApi#getSingleRecord");
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
| **systemId** | **String**|  | |
| **companyId** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **isOrgChange** | **String**|  | [optional] |
| **isJobChange** | **String**|  | [optional] |
| **isRateChange** | **String**|  | [optional] |
| **isPromotion** | **String**|  | [optional] |
| **systemId2** | **String**|  | [optional] |
| **jobEffectiveDate** | **String**| Used to find job history effective date less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeCreated** | **String**| Used to find job history created less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**EmployeeJobHistoryDetail**](EmployeeJobHistoryDetail.md)

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

