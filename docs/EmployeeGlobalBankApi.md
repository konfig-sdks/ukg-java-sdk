# EmployeeGlobalBankApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](EmployeeGlobalBankApi.md#get) | **GET** /personnel/v1/employee-global-banks | Get all direct deposit details for global employees |


<a name="get"></a>
# **get**
> EmployeeGlobalBanksModel get().companyId(companyId).employeeId(employeeId).employeeCountry(employeeCountry).payGroup(payGroup).dateModified(dateModified).page(page).perPage(perPage).execute();

Get all direct deposit details for global employees

Get all direct deposit details for global employees.   If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Global Employee Direct Deposit\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-global-banks?dateModified&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-global-banks?dateModified&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-global-banks?dateModified&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-global-banks?dateModified&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeGlobalBankApi;
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
    String employeeCountry = "employeeCountry_example";
    String payGroup = "payGroup_example";
    String dateModified = "dateModified_example"; // Used to find global employee's direct deposit modified date less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      EmployeeGlobalBanksModel result = client
              .employeeGlobalBank
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .employeeCountry(employeeCountry)
              .payGroup(payGroup)
              .dateModified(dateModified)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getBankId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getEmployeeNumber());
      System.out.println(result.getPayGroup());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getFundingMethod());
      System.out.println(result.getFundingMethodDescription());
      System.out.println(result.getAddressLine1());
      System.out.println(result.getAddressLine2());
      System.out.println(result.getAddressLine3());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getPostalCode());
      System.out.println(result.getCountry());
      System.out.println(result.getBankName());
      System.out.println(result.getBankBranch());
      System.out.println(result.getBankCountryCode());
      System.out.println(result.getBeneficiaryName());
      System.out.println(result.getBankAccountType());
      System.out.println(result.getBankAccountTypeDescription());
      System.out.println(result.getBankAccountNumber());
      System.out.println(result.getIban());
      System.out.println(result.getSwiftCode());
      System.out.println(result.getBankRequirement1());
      System.out.println(result.getBankRequirement2());
      System.out.println(result.getBankRequirement3());
      System.out.println(result.getDateModified());
      System.out.println(result.getBankRequestCode1());
      System.out.println(result.getBankRequestLabel1());
      System.out.println(result.getBankRequestCode2());
      System.out.println(result.getBankRequestLabel2());
      System.out.println(result.getBankRequestCode3());
      System.out.println(result.getBankRequestLabel3());
      System.out.println(result.getEmployeeCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeGlobalBankApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeGlobalBanksModel> response = client
              .employeeGlobalBank
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .employeeCountry(employeeCountry)
              .payGroup(payGroup)
              .dateModified(dateModified)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeGlobalBankApi#get");
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
| **employeeCountry** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **dateModified** | **String**| Used to find global employee&#39;s direct deposit modified date less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**EmployeeGlobalBanksModel**](EmployeeGlobalBanksModel.md)

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

