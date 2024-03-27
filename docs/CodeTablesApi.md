# CodeTablesApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCodeTables**](CodeTablesApi.md#createCodeTables) | **POST** /configuration/v1/code-tables | Post Code Tables information |
| [**getInfo**](CodeTablesApi.md#getInfo) | **GET** /configuration/v1/code-tables | Get Code Tables information |


<a name="createCodeTables"></a>
# **createCodeTables**
> Map&lt;String, Object&gt; createCodeTables(codeTablesPOST).execute();

Post Code Tables information

Creates a new UKG Pro Code table configuration, Array of objects is permitted for multi-records support. Permissions - UKG Pro service account must have \&quot;Add\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). There is a white list of code tables that we allow to be written, only these codes can be created: Allergy, Awardtype, Careerprovider, Childsupporttype, Cobrastatus, Coursecategory, Coursedeliverymet, Coursesubcategory, Disability, Educlevel, Educmajor, Emptype, Jobfamily, Licensetype, Loantype, Maritalstatus, Military, Militaryera, Otherphone, Prefix, Proficiency, Project, Property, School, Skills, Suffix, Termtype, Wellness.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CodeTablesApi;
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
    try {
      Map<String, Object> result = client
              .codeTables
              .createCodeTables()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeTablesApi#createCodeTables");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .codeTables
              .createCodeTables()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeTablesApi#createCodeTables");
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
| **codeTablesPOST** | [**List&lt;CodeTablesPOST&gt;**](CodeTablesPOST.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/problem+json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Multi-Status |  -  |

<a name="getInfo"></a>
# **getInfo**
> List&lt;CodeTablesGET&gt; getInfo().execute();

Get Code Tables information

UKG Pro codes table lookup, will contain list of all tables with HATEOAS links to make a subsequent call to get all the codes for that table. If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CodeTablesApi;
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
    try {
      List<CodeTablesGET> result = client
              .codeTables
              .getInfo()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeTablesApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CodeTablesGET>> response = client
              .codeTables
              .getInfo()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CodeTablesApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CodeTablesGET&gt;**](CodeTablesGET.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

