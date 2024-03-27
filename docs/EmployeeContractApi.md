# EmployeeContractApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](EmployeeContractApi.md#get) | **GET** /personnel/v1/employee-contract-details | Get all employment contract details |


<a name="get"></a>
# **get**
> EmployeeContract get().companyId(companyId).employeeId(employeeId).contractNumber(contractNumber).contractTypeCode(contractTypeCode).effectiveDate(effectiveDate).dateTimeCreated(dateTimeCreated).rowLastChanged(rowLastChanged).page(page).perPage(perPage).execute();

Get all employment contract details

Get all employment contract details.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-contract-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-contract-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-contract-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-contract-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeContractApi;
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
    String contractNumber = "contractNumber_example";
    String contractTypeCode = "contractTypeCode_example";
    String effectiveDate = "effectiveDate_example"; // Used to find contracts effective date less than, greater than, equal to, or between passed date(s)
    String dateTimeCreated = "dateTimeCreated_example"; // Used to find contract record created date less than, greater than, equal to, or between passed date(s)
    String rowLastChanged = "rowLastChanged_example"; // Used to find contract record changed date less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      EmployeeContract result = client
              .employeeContract
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .contractNumber(contractNumber)
              .contractTypeCode(contractTypeCode)
              .effectiveDate(effectiveDate)
              .dateTimeCreated(dateTimeCreated)
              .rowLastChanged(rowLastChanged)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getContractNumber());
      System.out.println(result.getContractTypeCode());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getDateTimeCreated());
      System.out.println(result.getRowLastChanged());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getPagesCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeContractApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeContract> response = client
              .employeeContract
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .contractNumber(contractNumber)
              .contractTypeCode(contractTypeCode)
              .effectiveDate(effectiveDate)
              .dateTimeCreated(dateTimeCreated)
              .rowLastChanged(rowLastChanged)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeContractApi#get");
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
| **contractNumber** | **String**|  | [optional] |
| **contractTypeCode** | **String**|  | [optional] |
| **effectiveDate** | **String**| Used to find contracts effective date less than, greater than, equal to, or between passed date(s) | [optional] |
| **dateTimeCreated** | **String**| Used to find contract record created date less than, greater than, equal to, or between passed date(s) | [optional] |
| **rowLastChanged** | **String**| Used to find contract record changed date less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**EmployeeContract**](EmployeeContract.md)

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

