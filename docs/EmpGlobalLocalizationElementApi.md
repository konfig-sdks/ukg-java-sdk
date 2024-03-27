# EmpGlobalLocalizationElementApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](EmpGlobalLocalizationElementApi.md#get) | **GET** /personnel/v1/employee-global-localization-elements | Get all global employee localization fields added to UKG Pro |


<a name="get"></a>
# **get**
> EmpGlobalLocalizationElementModel get().employeeId(employeeId).companyId(companyId).created(created).effective(effective).page(page).perPage(perPage).execute();

Get all global employee localization fields added to UKG Pro

Get all global employee localization fields added to UKG Pro through platform configuration with the prefix of &#39;GBLPay&#39;.   If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-global-localization-elements?created&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-global-localization-elements?created&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-global-localization-elements?created&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between ({minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-global-localization-elements?created&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmpGlobalLocalizationElementApi;
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
    String companyId = "companyId_example";
    OffsetDateTime created = OffsetDateTime.now(); // Used to find employee localization fields created less than, greater than, equal to, or between passed date(s)
    OffsetDateTime effective = OffsetDateTime.now(); // Used to find employee localization fields effective less than, greater than, equal to, or between passed date(s)
    Integer page = 56;
    Integer perPage = 56;
    try {
      EmpGlobalLocalizationElementModel result = client
              .empGlobalLocalizationElement
              .get()
              .employeeId(employeeId)
              .companyId(companyId)
              .created(created)
              .effective(effective)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getFieldId());
      System.out.println(result.getFieldName());
      System.out.println(result.getBooleanValue());
      System.out.println(result.getNumericValue());
      System.out.println(result.getDateTimeValue());
      System.out.println(result.getStringValue());
      System.out.println(result.getCompanyId());
      System.out.println(result.getCreated());
      System.out.println(result.getEffective());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpGlobalLocalizationElementApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmpGlobalLocalizationElementModel> response = client
              .empGlobalLocalizationElement
              .get()
              .employeeId(employeeId)
              .companyId(companyId)
              .created(created)
              .effective(effective)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmpGlobalLocalizationElementApi#get");
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
| **employeeId** | **String**|  | [optional] |
| **companyId** | **String**|  | [optional] |
| **created** | **OffsetDateTime**| Used to find employee localization fields created less than, greater than, equal to, or between passed date(s) | [optional] |
| **effective** | **OffsetDateTime**| Used to find employee localization fields effective less than, greater than, equal to, or between passed date(s) | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**EmpGlobalLocalizationElementModel**](EmpGlobalLocalizationElementModel.md)

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

