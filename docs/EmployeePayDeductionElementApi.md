# EmployeePayDeductionElementApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](EmployeePayDeductionElementApi.md#get) | **GET** /personnel/v1/employee-pay-deduction-elements | Get Global Employee Payments and Deductions Service |


<a name="get"></a>
# **get**
> EmployeePayDeductionElementsModel get().companyId(companyId).employeeId(employeeId).country(country).payGroup(payGroup).payDeductionName(payDeductionName).periodStartName(periodStartName).paymentOrDeductionIndicator(paymentOrDeductionIndicator).modifiedDate(modifiedDate).startDate(startDate).endDate(endDate).page(page).perPage(perPage).execute();

Get Global Employee Payments and Deductions Service

Get all global employee payments and deductions.   If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-pay-deduction-elements?modifiedDate&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-pay-deduction-elements?modifiedDate&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-pay-deduction-elements?modifiedDate&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-pay-deduction-elements?modifiedDate&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeePayDeductionElementApi;
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
    String country = "country_example";
    String payGroup = "payGroup_example";
    String payDeductionName = "payDeductionName_example";
    String periodStartName = "periodStartName_example";
    String paymentOrDeductionIndicator = "paymentOrDeductionIndicator_example";
    String modifiedDate = "modifiedDate_example"; // Used to find a payment or deduction modified less than, greater than, equal to, or between passed date(s)
    String startDate = "startDate_example"; // Used to find a payment or deduction where the pay period start is less than, greater than, equal to, or between passed date(s)
    String endDate = "endDate_example"; // Used to find a payment or deduction where the pay period end is less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      EmployeePayDeductionElementsModel result = client
              .employeePayDeductionElement
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .country(country)
              .payGroup(payGroup)
              .payDeductionName(payDeductionName)
              .periodStartName(periodStartName)
              .paymentOrDeductionIndicator(paymentOrDeductionIndicator)
              .modifiedDate(modifiedDate)
              .startDate(startDate)
              .endDate(endDate)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getSystemId());
      System.out.println(result.getPayDeductionId());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getPayGroup());
      System.out.println(result.getPayDeductionName());
      System.out.println(result.getPayDeductionDescription());
      System.out.println(result.getPeriodStartId());
      System.out.println(result.getPeriodEndId());
      System.out.println(result.getPeriodStartName());
      System.out.println(result.getPeriodEndName());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getProject());
      System.out.println(result.getTask());
      System.out.println(result.getRecurring());
      System.out.println(result.getAmount());
      System.out.println(result.getNotes());
      System.out.println(result.getModifiedDate());
      System.out.println(result.getCountry());
      System.out.println(result.getPaymentOrDeductionIndicator());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayDeductionElementApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeePayDeductionElementsModel> response = client
              .employeePayDeductionElement
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .country(country)
              .payGroup(payGroup)
              .payDeductionName(payDeductionName)
              .periodStartName(periodStartName)
              .paymentOrDeductionIndicator(paymentOrDeductionIndicator)
              .modifiedDate(modifiedDate)
              .startDate(startDate)
              .endDate(endDate)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeePayDeductionElementApi#get");
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
| **country** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **payDeductionName** | **String**|  | [optional] |
| **periodStartName** | **String**|  | [optional] |
| **paymentOrDeductionIndicator** | **String**|  | [optional] |
| **modifiedDate** | **String**| Used to find a payment or deduction modified less than, greater than, equal to, or between passed date(s) | [optional] |
| **startDate** | **String**| Used to find a payment or deduction where the pay period start is less than, greater than, equal to, or between passed date(s) | [optional] |
| **endDate** | **String**| Used to find a payment or deduction where the pay period end is less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**EmployeePayDeductionElementsModel**](EmployeePayDeductionElementsModel.md)

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

