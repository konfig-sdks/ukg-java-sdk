# CourseSubCategoryApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConfigurationUkgPro**](CourseSubCategoryApi.md#createConfigurationUkgPro) | **POST** /courseSubCategory | Create a new courseSubCategory configuration |
| [**getConfigurations**](CourseSubCategoryApi.md#getConfigurations) | **GET** /courseSubCategory | Retrieve all courseSubCategory configurations |
| [**updateConfiguration**](CourseSubCategoryApi.md#updateConfiguration) | **PUT** /courseSubCategory/{code} | Update a single courseSubCategory configuration |


<a name="createConfigurationUkgPro"></a>
# **createConfigurationUkgPro**
> createConfigurationUkgPro(codeObject).execute();

Create a new courseSubCategory configuration

&#39;Creates a new UKG Pro courseSubCategory configuration.&#39; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourseSubCategoryApi;
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
    String description = "description_example"; // Description.
    String code = "code_example"; // Code.
    try {
      client
              .courseSubCategory
              .createConfigurationUkgPro(description, code)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSubCategoryApi#createConfigurationUkgPro");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .courseSubCategory
              .createConfigurationUkgPro(description, code)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSubCategoryApi#createConfigurationUkgPro");
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
| **codeObject** | [**CodeObject**](CodeObject.md)| The courseSubCategory code to be written. | |

### Return type

null (empty response body)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The courseSubCategory provided has been created. |  -  |
| **401** | Unauthorized |  -  |

<a name="getConfigurations"></a>
# **getConfigurations**
> List&lt;CodeObject&gt; getConfigurations().execute();

Retrieve all courseSubCategory configurations

&#39;The courseSubCategory endpoint returns information about the UKG Pro courseSubCategory configurations.&#39; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourseSubCategoryApi;
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
      List<CodeObject> result = client
              .courseSubCategory
              .getConfigurations()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSubCategoryApi#getConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CodeObject>> response = client
              .courseSubCategory
              .getConfigurations()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSubCategoryApi#getConfigurations");
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

[**List&lt;CodeObject&gt;**](CodeObject.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

<a name="updateConfiguration"></a>
# **updateConfiguration**
> updateConfiguration(code).execute();

Update a single courseSubCategory configuration

&#39;Allows the ability update a single courseSubCategory configuration.&#39; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourseSubCategoryApi;
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
    String code = "code_example"; // Project code.
    try {
      client
              .courseSubCategory
              .updateConfiguration(code)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSubCategoryApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .courseSubCategory
              .updateConfiguration(code)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CourseSubCategoryApi#updateConfiguration");
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
| **code** | **String**| Project code. | |

### Return type

null (empty response body)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

