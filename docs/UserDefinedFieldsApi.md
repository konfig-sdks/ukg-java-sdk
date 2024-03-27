# UserDefinedFieldsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](UserDefinedFieldsApi.md#get) | **GET** /personnel/v1/user-defined-fields | Get User Defined Fields |
| [**getSingleCompany**](UserDefinedFieldsApi.md#getSingleCompany) | **GET** /personnel/v1/companies/{companyId}/user-defined-fields | Get User Defined Fields for single company |
| [**getSingleEmployee**](UserDefinedFieldsApi.md#getSingleEmployee) | **GET** /personnel/v1/companies/{companyId}/employees/{employeeId}/user-defined-fields | Get User Defined Fields for a single employee in a single company |


<a name="get"></a>
# **get**
> List&lt;UserDefinedFields&gt; get().companyId(companyId).employeeId(employeeId).page(page).perPage(perPage).execute();

Get User Defined Fields

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;CompanyId parameter can take in multiple company Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;EmployeeId parameter can take in multiple employee Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserDefinedFieldsApi;
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
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<UserDefinedFields> result = client
              .userDefinedFields
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDefinedFieldsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserDefinedFields>> response = client
              .userDefinedFields
              .get()
              .companyId(companyId)
              .employeeId(employeeId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDefinedFieldsApi#get");
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
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;UserDefinedFields&gt;**](UserDefinedFields.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSingleCompany"></a>
# **getSingleCompany**
> List&lt;UserDefinedFields&gt; getSingleCompany(companyId).employeeId(employeeId).page(page).perPage(perPage).execute();

Get User Defined Fields for single company

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;CompanyId parameter can take in multiple company Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;EmployeeId parameter can take in multiple employee Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserDefinedFieldsApi;
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
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<UserDefinedFields> result = client
              .userDefinedFields
              .getSingleCompany(companyId)
              .employeeId(employeeId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDefinedFieldsApi#getSingleCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserDefinedFields>> response = client
              .userDefinedFields
              .getSingleCompany(companyId)
              .employeeId(employeeId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDefinedFieldsApi#getSingleCompany");
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
| **employeeId** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;UserDefinedFields&gt;**](UserDefinedFields.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSingleEmployee"></a>
# **getSingleEmployee**
> List&lt;UserDefinedFields&gt; getSingleEmployee(companyId, employeeId).page(page).perPage(perPage).execute();

Get User Defined Fields for a single employee in a single company

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;CompanyId parameter can take in multiple company Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;EmployeeId parameter can take in multiple employee Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserDefinedFieldsApi;
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
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<UserDefinedFields> result = client
              .userDefinedFields
              .getSingleEmployee(companyId, employeeId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDefinedFieldsApi#getSingleEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserDefinedFields>> response = client
              .userDefinedFields
              .getSingleEmployee(companyId, employeeId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDefinedFieldsApi#getSingleEmployee");
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
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;UserDefinedFields&gt;**](UserDefinedFields.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

