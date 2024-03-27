# EmploymentDetailsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByCompanyIdAndEmployeeId**](EmploymentDetailsApi.md#getByCompanyIdAndEmployeeId) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/employment-details | Get Employment Details |
| [**getDetails**](EmploymentDetailsApi.md#getDetails) | **GET** /personnel/v1/employment-details | Get Employment Details |
| [**listByCompany**](EmploymentDetailsApi.md#listByCompany) | **GET** /personnel/v1/companies/{companyId}/employment-details | Get Employment Details |


<a name="getByCompanyIdAndEmployeeId"></a>
# **getByCompanyIdAndEmployeeId**
> List&lt;EmpEmploymentDetails&gt; getByCompanyIdAndEmployeeId(companyId, employeeId).companyId2(companyId2).employeeId2(employeeId2).primaryJobCode(primaryJobCode).jobTitle(jobTitle).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).primaryWorkLocationCode(primaryWorkLocationCode).primaryProjectCode(primaryProjectCode).deductionGroupCode(deductionGroupCode).earningGroupCode(earningGroupCode).employeeTypeCode(employeeTypeCode).employeeStatusCode(employeeStatusCode).employeeNumber(employeeNumber).supervisorID(supervisorID).originalHireDate(originalHireDate).lastHireDate(lastHireDate).dateOfTermination(dateOfTermination).dateOfRetirement(dateOfRetirement).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).dateLastPayDatePaid(dateLastPayDatePaid).payGroup(payGroup).isHomeCompany(isHomeCompany).page(page).perPage(perPage).execute();

Get Employment Details

Get a single employment detail by company.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/employment-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/employment-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/employment-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employees/{employeeId}/employment-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentDetailsApi;
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
    String jobTitle = "jobTitle_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String primaryWorkLocationCode = "primaryWorkLocationCode_example";
    String primaryProjectCode = "primaryProjectCode_example";
    String deductionGroupCode = "deductionGroupCode_example";
    String earningGroupCode = "earningGroupCode_example";
    String employeeTypeCode = "employeeTypeCode_example";
    String employeeStatusCode = "employeeStatusCode_example";
    String employeeNumber = "employeeNumber_example";
    String supervisorID = "supervisorID_example";
    String originalHireDate = "originalHireDate_example";
    String lastHireDate = "lastHireDate_example";
    String dateOfTermination = "dateOfTermination_example";
    String dateOfRetirement = "dateOfRetirement_example";
    String dateTimeCreated = "dateTimeCreated_example";
    String dateTimeChanged = "dateTimeChanged_example";
    String dateLastPayDatePaid = "dateLastPayDatePaid_example";
    String payGroup = "payGroup_example";
    Boolean isHomeCompany = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpEmploymentDetails> result = client
              .employmentDetails
              .getByCompanyIdAndEmployeeId(companyId, employeeId)
              .companyId2(companyId2)
              .employeeId2(employeeId2)
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
              .supervisorID(supervisorID)
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
      System.err.println("Exception when calling EmploymentDetailsApi#getByCompanyIdAndEmployeeId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpEmploymentDetails>> response = client
              .employmentDetails
              .getByCompanyIdAndEmployeeId(companyId, employeeId)
              .companyId2(companyId2)
              .employeeId2(employeeId2)
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
              .supervisorID(supervisorID)
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
      System.err.println("Exception when calling EmploymentDetailsApi#getByCompanyIdAndEmployeeId");
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
| **jobTitle** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **primaryWorkLocationCode** | **String**|  | [optional] |
| **primaryProjectCode** | **String**|  | [optional] |
| **deductionGroupCode** | **String**|  | [optional] |
| **earningGroupCode** | **String**|  | [optional] |
| **employeeTypeCode** | **String**|  | [optional] |
| **employeeStatusCode** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **supervisorID** | **String**|  | [optional] |
| **originalHireDate** | **String**|  | [optional] |
| **lastHireDate** | **String**|  | [optional] |
| **dateOfTermination** | **String**|  | [optional] |
| **dateOfRetirement** | **String**|  | [optional] |
| **dateTimeCreated** | **String**|  | [optional] |
| **dateTimeChanged** | **String**|  | [optional] |
| **dateLastPayDatePaid** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **isHomeCompany** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpEmploymentDetails&gt;**](EmpEmploymentDetails.md)

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

<a name="getDetails"></a>
# **getDetails**
> List&lt;EmpEmploymentDetails&gt; getDetails().companyId(companyId).employeeId(employeeId).primaryJobCode(primaryJobCode).jobTitle(jobTitle).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).primaryWorkLocationCode(primaryWorkLocationCode).primaryProjectCode(primaryProjectCode).deductionGroupCode(deductionGroupCode).earningGroupCode(earningGroupCode).employeeTypeCode(employeeTypeCode).employeeStatusCode(employeeStatusCode).employeeNumber(employeeNumber).supervisorID(supervisorID).originalHireDate(originalHireDate).lastHireDate(lastHireDate).dateOfTermination(dateOfTermination).dateOfRetirement(dateOfRetirement).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).dateLastPayDatePaid(dateLastPayDatePaid).payGroup(payGroup).isHomeCompany(isHomeCompany).page(page).perPage(perPage).execute();

Get Employment Details

Get all employment record details.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employment-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employment-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employment-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employment-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentDetailsApi;
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
    String jobTitle = "jobTitle_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String primaryWorkLocationCode = "primaryWorkLocationCode_example";
    String primaryProjectCode = "primaryProjectCode_example";
    String deductionGroupCode = "deductionGroupCode_example";
    String earningGroupCode = "earningGroupCode_example";
    String employeeTypeCode = "employeeTypeCode_example";
    String employeeStatusCode = "employeeStatusCode_example";
    String employeeNumber = "employeeNumber_example";
    String supervisorID = "supervisorID_example";
    String originalHireDate = "originalHireDate_example";
    String lastHireDate = "lastHireDate_example";
    String dateOfTermination = "dateOfTermination_example";
    String dateOfRetirement = "dateOfRetirement_example";
    String dateTimeCreated = "dateTimeCreated_example";
    String dateTimeChanged = "dateTimeChanged_example";
    String dateLastPayDatePaid = "dateLastPayDatePaid_example";
    String payGroup = "payGroup_example";
    Boolean isHomeCompany = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpEmploymentDetails> result = client
              .employmentDetails
              .getDetails()
              .companyId(companyId)
              .employeeId(employeeId)
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
              .supervisorID(supervisorID)
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
      System.err.println("Exception when calling EmploymentDetailsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpEmploymentDetails>> response = client
              .employmentDetails
              .getDetails()
              .companyId(companyId)
              .employeeId(employeeId)
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
              .supervisorID(supervisorID)
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
      System.err.println("Exception when calling EmploymentDetailsApi#getDetails");
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
| **jobTitle** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **primaryWorkLocationCode** | **String**|  | [optional] |
| **primaryProjectCode** | **String**|  | [optional] |
| **deductionGroupCode** | **String**|  | [optional] |
| **earningGroupCode** | **String**|  | [optional] |
| **employeeTypeCode** | **String**|  | [optional] |
| **employeeStatusCode** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **supervisorID** | **String**|  | [optional] |
| **originalHireDate** | **String**|  | [optional] |
| **lastHireDate** | **String**|  | [optional] |
| **dateOfTermination** | **String**|  | [optional] |
| **dateOfRetirement** | **String**|  | [optional] |
| **dateTimeCreated** | **String**|  | [optional] |
| **dateTimeChanged** | **String**|  | [optional] |
| **dateLastPayDatePaid** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **isHomeCompany** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpEmploymentDetails&gt;**](EmpEmploymentDetails.md)

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

<a name="listByCompany"></a>
# **listByCompany**
> List&lt;EmpEmploymentDetails&gt; listByCompany(companyId).companyId2(companyId2).employeeId(employeeId).primaryJobCode(primaryJobCode).jobTitle(jobTitle).fullTimeOrPartTimeCode(fullTimeOrPartTimeCode).primaryWorkLocationCode(primaryWorkLocationCode).primaryProjectCode(primaryProjectCode).deductionGroupCode(deductionGroupCode).earningGroupCode(earningGroupCode).employeeTypeCode(employeeTypeCode).employeeStatusCode(employeeStatusCode).employeeNumber(employeeNumber).supervisorID(supervisorID).originalHireDate(originalHireDate).lastHireDate(lastHireDate).dateOfTermination(dateOfTermination).dateOfRetirement(dateOfRetirement).dateTimeCreated(dateTimeCreated).dateTimeChanged(dateTimeChanged).dateLastPayDatePaid(dateLastPayDatePaid).payGroup(payGroup).isHomeCompany(isHomeCompany).page(page).perPage(perPage).execute();

Get Employment Details

Get all employment record details by company.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employment-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/employment-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employment-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/employment-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentDetailsApi;
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
    String jobTitle = "jobTitle_example";
    String fullTimeOrPartTimeCode = "fullTimeOrPartTimeCode_example";
    String primaryWorkLocationCode = "primaryWorkLocationCode_example";
    String primaryProjectCode = "primaryProjectCode_example";
    String deductionGroupCode = "deductionGroupCode_example";
    String earningGroupCode = "earningGroupCode_example";
    String employeeTypeCode = "employeeTypeCode_example";
    String employeeStatusCode = "employeeStatusCode_example";
    String employeeNumber = "employeeNumber_example";
    String supervisorID = "supervisorID_example";
    String originalHireDate = "originalHireDate_example";
    String lastHireDate = "lastHireDate_example";
    String dateOfTermination = "dateOfTermination_example";
    String dateOfRetirement = "dateOfRetirement_example";
    String dateTimeCreated = "dateTimeCreated_example";
    String dateTimeChanged = "dateTimeChanged_example";
    String dateLastPayDatePaid = "dateLastPayDatePaid_example";
    String payGroup = "payGroup_example";
    Boolean isHomeCompany = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EmpEmploymentDetails> result = client
              .employmentDetails
              .listByCompany(companyId)
              .companyId2(companyId2)
              .employeeId(employeeId)
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
              .supervisorID(supervisorID)
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
      System.err.println("Exception when calling EmploymentDetailsApi#listByCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmpEmploymentDetails>> response = client
              .employmentDetails
              .listByCompany(companyId)
              .companyId2(companyId2)
              .employeeId(employeeId)
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
              .supervisorID(supervisorID)
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
      System.err.println("Exception when calling EmploymentDetailsApi#listByCompany");
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
| **jobTitle** | **String**|  | [optional] |
| **fullTimeOrPartTimeCode** | **String**|  | [optional] |
| **primaryWorkLocationCode** | **String**|  | [optional] |
| **primaryProjectCode** | **String**|  | [optional] |
| **deductionGroupCode** | **String**|  | [optional] |
| **earningGroupCode** | **String**|  | [optional] |
| **employeeTypeCode** | **String**|  | [optional] |
| **employeeStatusCode** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **supervisorID** | **String**|  | [optional] |
| **originalHireDate** | **String**|  | [optional] |
| **lastHireDate** | **String**|  | [optional] |
| **dateOfTermination** | **String**|  | [optional] |
| **dateOfRetirement** | **String**|  | [optional] |
| **dateTimeCreated** | **String**|  | [optional] |
| **dateTimeChanged** | **String**|  | [optional] |
| **dateLastPayDatePaid** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **isHomeCompany** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmpEmploymentDetails&gt;**](EmpEmploymentDetails.md)

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

