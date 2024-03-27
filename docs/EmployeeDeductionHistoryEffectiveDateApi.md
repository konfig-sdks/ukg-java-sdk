# EmployeeDeductionHistoryEffectiveDateApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByDeductionCodeAndField**](EmployeeDeductionHistoryEffectiveDateApi.md#getByDeductionCodeAndField) | **GET** /personnel/v1/deduction-history-effective-change-dates | Deductions History Effective Change Date |


<a name="getByDeductionCodeAndField"></a>
# **getByDeductionCodeAndField**
> List&lt;EmpDedHistoryEffectiveChangeDate&gt; getByDeductionCodeAndField(fieldName, deductionCode).companyId(companyId).sessionDate(sessionDate).page(page).perPage(perPage).execute();

Deductions History Effective Change Date

If no pagination parameters specified, the default/max is applied.   Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Api endpoints. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).&lt;/br&gt;   fieldName is a required parameter that takes one of the following:    &lt;ul&gt;    &lt;li&gt;changeReason&lt;/li&gt;    &lt;li&gt;benefitStartDate&lt;/li&gt;    &lt;li&gt;benefitStopDate&lt;/li&gt;    &lt;li&gt;benefitOption&lt;/li&gt;    &lt;li&gt;employeeAmount&lt;/li&gt;    &lt;li&gt;employeeBenefitAmount&lt;/li&gt;    &lt;li&gt;employeeGoalAmount&lt;/li&gt;    &lt;li&gt;eoiDesiredAmount&lt;/li&gt;    &lt;li&gt;eoiDesiredCalcRateOrPercent&lt;/li&gt;    &lt;li&gt;declinedByCarrier&lt;/li&gt;    &lt;li&gt;declinedByCarrierReason&lt;/li&gt;    &lt;li&gt;waiveReason&lt;/li&gt;    &lt;li&gt;deductionStartDate&lt;/li&gt;    &lt;li&gt;deductionStopDate&lt;/li&gt;    &lt;/ul&gt;    sessionDate is an optional parameter that defaults to today&#39;s date if null.&lt;/br&gt;   deductionCode is a required parameter that takes a list of codes [ded1,ded2].&lt;/br&gt;   CompanyId is an optional parameter that takes a list of IDs [coid1,coid2].&lt;/br&gt;       Correct syntax when using parameters are as follows:   &lt;ul&gt;     &lt;li&gt;Get deductions history change date by single deduction code     &lt;ul&gt;     &lt;li&gt;Example: /personnel/v1/deduction-history-effective-change-dates?fieldName&#x3D;{fieldName}&amp;deductionCode&#x3D;{dedCode}&lt;/li&gt;     &lt;/ul&gt;     &lt;/li&gt;  &lt;li&gt;Get deductions history change date by multiple deduction code     &lt;ul&gt;     &lt;li&gt;Example: /personnel/v1/deduction-history-effective-change-dates?fieldName&#x3D;{fieldName}&amp;deductionCode&#x3D;{dedCode1,dedCode2}&lt;/li&gt;    &lt;/ul&gt;     &lt;/li&gt;    &lt;li&gt;Get deductions history change date multiple deduction code with multiple company     &lt;ul&gt;     &lt;li&gt;Example: /personnel/v1/deduction-history-effective-change-dates?fieldName&#x3D;{fieldName}&amp;deductionCode&#x3D;{dedCode1,dedCode2}&amp;companyId&#x3D;{companyId1,companyId1}&lt;/li&gt;    &lt;/ul&gt;     &lt;/li&gt;    &lt;li&gt;Get deductions history change date by sessionDate,deduction code and company     &lt;ul&gt;     &lt;li&gt;Example: /personnel/v1/deduction-history-effective-change-dates?fieldName&#x3D;{fieldName}&amp;sessionDate&#x3D;{sessionDate}deductionCode&#x3D;{deductionCode}&amp;companyId&#x3D;{companyId}&lt;/li&gt;    &lt;/ul&gt;     &lt;/li&gt;  &lt;li&gt;Get deductions history change date per page    &lt;ul&gt;    &lt;li&gt;Example: /personnel/v1/deduction-history-effective-change-dates?fieldName&#x3D;{fieldName}&amp;page&#x3D;1&amp;per_page&#x3D;100&lt;/li&gt;     &lt;/ul&gt;    &lt;/li&gt;  &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeDeductionHistoryEffectiveDateApi;
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
    String fieldName = "fieldName_example";
    String deductionCode = "deductionCode_example";
    String companyId = "companyId_example";
    OffsetDateTime sessionDate = OffsetDateTime.now();
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpDedHistoryEffectiveChangeDate> result = client
              .employeeDeductionHistoryEffectiveDate
              .getByDeductionCodeAndField(fieldName, deductionCode)
              .companyId(companyId)
              .sessionDate(sessionDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionHistoryEffectiveDateApi#getByDeductionCodeAndField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpDedHistoryEffectiveChangeDate>> response = client
              .employeeDeductionHistoryEffectiveDate
              .getByDeductionCodeAndField(fieldName, deductionCode)
              .companyId(companyId)
              .sessionDate(sessionDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeDeductionHistoryEffectiveDateApi#getByDeductionCodeAndField");
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
| **fieldName** | **String**|  | |
| **deductionCode** | **String**|  | |
| **companyId** | **String**|  | [optional] |
| **sessionDate** | **OffsetDateTime**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpDedHistoryEffectiveChangeDate&gt;**](EmpDedHistoryEffectiveChangeDate.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

