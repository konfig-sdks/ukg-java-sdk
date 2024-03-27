# DirectDepositApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDirectDepositDetailsByCompany**](DirectDepositApi.md#listDirectDepositDetailsByCompany) | **GET** /payroll/v1/companies/{companyId}/direct-deposit | Get list of direct deposit details for US and Canadian employees by company |
| [**listEmployeeDirectDepositDetails**](DirectDepositApi.md#listEmployeeDirectDepositDetails) | **GET** /payroll/v1/direct-deposit | Get list of direct deposit details for US and Canadian employees |


<a name="listDirectDepositDetailsByCompany"></a>
# **listDirectDepositDetailsByCompany**
> List&lt;DirectDepositModel&gt; listDirectDepositDetailsByCompany(companyId).accountIsInactive(accountIsInactive).employeeId(employeeId).companyId2(companyId2).employeeBankRoutingNumber(employeeBankRoutingNumber).countryCode(countryCode).dateTimeChanged(dateTimeChanged).page(page).perPage(perPage).execute();

Get list of direct deposit details for US and Canadian employees by company

Get list of direct deposit details for US and Canadian employees by company.   If no pagination parameters specified, the default/max is applied. Permissions - UltiPro service account must have \&quot;View\&quot; role for the \&quot;Employee Direct Deposit\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/direct-deposit?dateTimeChanged&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /companies/{companyId}/direct-deposit?dateTimeChanged&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/direct-deposit?dateTimeChanged&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /companies/{companyId}/direct-deposit?dateTimeChanged&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectDepositApi;
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
    String accountIsInactive = "accountIsInactive_example";
    String employeeId = "employeeId_example";
    String companyId2 = "companyId_example";
    String employeeBankRoutingNumber = "employeeBankRoutingNumber_example";
    String countryCode = "countryCode_example";
    String dateTimeChanged = "dateTimeChanged_example"; // Used to find direct deposit record changed date less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<DirectDepositModel> result = client
              .directDeposit
              .listDirectDepositDetailsByCompany(companyId)
              .accountIsInactive(accountIsInactive)
              .employeeId(employeeId)
              .companyId2(companyId2)
              .employeeBankRoutingNumber(employeeBankRoutingNumber)
              .countryCode(countryCode)
              .dateTimeChanged(dateTimeChanged)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectDepositApi#listDirectDepositDetailsByCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DirectDepositModel>> response = client
              .directDeposit
              .listDirectDepositDetailsByCompany(companyId)
              .accountIsInactive(accountIsInactive)
              .employeeId(employeeId)
              .companyId2(companyId2)
              .employeeBankRoutingNumber(employeeBankRoutingNumber)
              .countryCode(countryCode)
              .dateTimeChanged(dateTimeChanged)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectDepositApi#listDirectDepositDetailsByCompany");
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
| **accountIsInactive** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **companyId2** | **String**|  | [optional] |
| **employeeBankRoutingNumber** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **dateTimeChanged** | **String**| Used to find direct deposit record changed date less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;DirectDepositModel&gt;**](DirectDepositModel.md)

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

<a name="listEmployeeDirectDepositDetails"></a>
# **listEmployeeDirectDepositDetails**
> List&lt;DirectDepositModel&gt; listEmployeeDirectDepositDetails().accountIsInactive(accountIsInactive).employeeId(employeeId).companyId(companyId).employeeBankRoutingNumber(employeeBankRoutingNumber).countryCode(countryCode).dateTimeChanged(dateTimeChanged).page(page).perPage(perPage).execute();

Get list of direct deposit details for US and Canadian employees

Get list of direct deposit details for US and Canadian employees.   If no pagination parameters specified, the default/max is applied. Permissions - UltiPro service account must have \&quot;View\&quot; role for the \&quot;Employee Direct Deposit\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /direct-deposit?dateTimeChanged&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /direct-deposit?dateTimeChanged&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /direct-deposit?dateTimeChanged&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /direct-deposit?dateTimeChanged&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DirectDepositApi;
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
    String accountIsInactive = "accountIsInactive_example";
    String employeeId = "employeeId_example";
    String companyId = "companyId_example";
    String employeeBankRoutingNumber = "employeeBankRoutingNumber_example";
    String countryCode = "countryCode_example";
    String dateTimeChanged = "dateTimeChanged_example"; // Used to find direct deposit record changed date less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<DirectDepositModel> result = client
              .directDeposit
              .listEmployeeDirectDepositDetails()
              .accountIsInactive(accountIsInactive)
              .employeeId(employeeId)
              .companyId(companyId)
              .employeeBankRoutingNumber(employeeBankRoutingNumber)
              .countryCode(countryCode)
              .dateTimeChanged(dateTimeChanged)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectDepositApi#listEmployeeDirectDepositDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DirectDepositModel>> response = client
              .directDeposit
              .listEmployeeDirectDepositDetails()
              .accountIsInactive(accountIsInactive)
              .employeeId(employeeId)
              .companyId(companyId)
              .employeeBankRoutingNumber(employeeBankRoutingNumber)
              .countryCode(countryCode)
              .dateTimeChanged(dateTimeChanged)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectDepositApi#listEmployeeDirectDepositDetails");
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
| **accountIsInactive** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **companyId** | **String**|  | [optional] |
| **employeeBankRoutingNumber** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **dateTimeChanged** | **String**| Used to find direct deposit record changed date less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;DirectDepositModel&gt;**](DirectDepositModel.md)

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

