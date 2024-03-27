# EmployeeEmploymentDetailsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](EmployeeEmploymentDetailsApi.md#getDetails) | **GET** /personnel/v1/employee-employment-details | Get Employee Employment Details |


<a name="getDetails"></a>
# **getDetails**
> List&lt;EmployeeEmploymentDetails&gt; getDetails().companyID(companyID).employeeID(employeeID).primaryJobCode(primaryJobCode).jobTitle(jobTitle).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).primaryWorkLocationCode(primaryWorkLocationCode).primaryProjectCode(primaryProjectCode).deductionGroupCode(deductionGroupCode).earningGroupCode(earningGroupCode).employeeTypeCode(employeeTypeCode).employeeStatusCode(employeeStatusCode).employeeNumber(employeeNumber).supervisorId(supervisorId).originalHireDate(originalHireDate).lastHireDate(lastHireDate).dateOfTermination(dateOfTermination).dateOfRetirement(dateOfRetirement).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).dateLastPayDatePaid(dateLastPayDatePaid).payGroup(payGroup).isHomeCompany(isHomeCompany).page(page).perPage(perPage).execute();

Get Employee Employment Details

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;Company ID parameter can take in multiple deduction codes separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Primary Job Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Primary Work Location Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Primary Project Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Deduction Group Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Earning Group Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Employee Type Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Employee Status Code parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;Pay Group parameter can take in multiple pay frequencies separated by coma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeEmploymentDetailsApi;
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
    String companyID = "companyID_example";
    String employeeID = "employeeID_example";
    String primaryJobCode = "primaryJobCode_example";
    String jobTitle = "jobTitle_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String primaryWorkLocationCode = "primaryWorkLocationCode_example";
    String primaryProjectCode = "primaryProjectCode_example";
    String deductionGroupCode = "deductionGroupCode_example";
    String earningGroupCode = "earningGroupCode_example";
    String employeeTypeCode = "employeeTypeCode_example";
    String employeeStatusCode = "employeeStatusCode_example";
    String employeeNumber = "employeeNumber_example";
    String supervisorId = "supervisorId_example";
    OffsetDateTime originalHireDate = OffsetDateTime.now();
    OffsetDateTime lastHireDate = OffsetDateTime.now();
    OffsetDateTime dateOfTermination = OffsetDateTime.now();
    OffsetDateTime dateOfRetirement = OffsetDateTime.now();
    OffsetDateTime dateTimeCreated = OffsetDateTime.now();
    OffsetDateTime dateTimeChanged = OffsetDateTime.now();
    OffsetDateTime dateLastPayDatePaid = OffsetDateTime.now();
    String payGroup = "payGroup_example";
    String isHomeCompany = "isHomeCompany_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmployeeEmploymentDetails> result = client
              .employeeEmploymentDetails
              .getDetails()
              .companyID(companyID)
              .employeeID(employeeID)
              .primaryJobCode(primaryJobCode)
              .jobTitle(jobTitle)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .primaryWorkLocationCode(primaryWorkLocationCode)
              .primaryProjectCode(primaryProjectCode)
              .deductionGroupCode(deductionGroupCode)
              .earningGroupCode(earningGroupCode)
              .employeeTypeCode(employeeTypeCode)
              .employeeStatusCode(employeeStatusCode)
              .employeeNumber(employeeNumber)
              .supervisorId(supervisorId)
              .originalHireDate(originalHireDate)
              .lastHireDate(lastHireDate)
              .dateOfTermination(dateOfTermination)
              .dateOfRetirement(dateOfRetirement)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .dateLastPayDatePaid(dateLastPayDatePaid)
              .payGroup(payGroup)
              .isHomeCompany(isHomeCompany)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEmploymentDetailsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeEmploymentDetails>> response = client
              .employeeEmploymentDetails
              .getDetails()
              .companyID(companyID)
              .employeeID(employeeID)
              .primaryJobCode(primaryJobCode)
              .jobTitle(jobTitle)
              .fullTimeOrPartTimeCode(fullTimeOrPartTimeCode)
              .primaryWorkLocationCode(primaryWorkLocationCode)
              .primaryProjectCode(primaryProjectCode)
              .deductionGroupCode(deductionGroupCode)
              .earningGroupCode(earningGroupCode)
              .employeeTypeCode(employeeTypeCode)
              .employeeStatusCode(employeeStatusCode)
              .employeeNumber(employeeNumber)
              .supervisorId(supervisorId)
              .originalHireDate(originalHireDate)
              .lastHireDate(lastHireDate)
              .dateOfTermination(dateOfTermination)
              .dateOfRetirement(dateOfRetirement)
              .dateTimeCreated(dateTimeCreated)
              .dateTimeChanged(dateTimeChanged)
              .dateLastPayDatePaid(dateLastPayDatePaid)
              .payGroup(payGroup)
              .isHomeCompany(isHomeCompany)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeEmploymentDetailsApi#getDetails");
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
| **companyID** | **String**|  | [optional] |
| **employeeID** | **String**|  | [optional] |
| **primaryJobCode** | **String**|  | [optional] |
| **jobTitle** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **primaryWorkLocationCode** | **String**|  | [optional] |
| **primaryProjectCode** | **String**|  | [optional] |
| **deductionGroupCode** | **String**|  | [optional] |
| **earningGroupCode** | **String**|  | [optional] |
| **employeeTypeCode** | **String**|  | [optional] |
| **employeeStatusCode** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **supervisorId** | **String**|  | [optional] |
| **originalHireDate** | **OffsetDateTime**|  | [optional] |
| **lastHireDate** | **OffsetDateTime**|  | [optional] |
| **dateOfTermination** | **OffsetDateTime**|  | [optional] |
| **dateOfRetirement** | **OffsetDateTime**|  | [optional] |
| **dateTimeCreated** | **OffsetDateTime**|  | [optional] |
| **dateTimeChanged** | **OffsetDateTime**|  | [optional] |
| **dateLastPayDatePaid** | **OffsetDateTime**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **isHomeCompany** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmployeeEmploymentDetails&gt;**](EmployeeEmploymentDetails.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

