# OtherPhoneTypesApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConfigurationUkgPro**](OtherPhoneTypesApi.md#createConfigurationUkgPro) | **POST** /otherPhoneTypes | Create a new otherPhoneTypes configuration |
| [**getConfigurations**](OtherPhoneTypesApi.md#getConfigurations) | **GET** /otherPhoneTypes | Retrieve all otherPhoneTypes configurations |
| [**updateConfiguration**](OtherPhoneTypesApi.md#updateConfiguration) | **PUT** /otherPhoneTypes/{code} | Update a single otherPhoneTypes configuration |


<a name="createConfigurationUkgPro"></a>
# **createConfigurationUkgPro**
> createConfigurationUkgPro(codeObject).execute();

Create a new otherPhoneTypes configuration

&#39;Creates a new UKG Pro otherPhoneTypes configuration.&#39; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtherPhoneTypesApi;
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
              .otherPhoneTypes
              .createConfigurationUkgPro(description, code)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtherPhoneTypesApi#createConfigurationUkgPro");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .otherPhoneTypes
              .createConfigurationUkgPro(description, code)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtherPhoneTypesApi#createConfigurationUkgPro");
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
| **codeObject** | [**CodeObject**](CodeObject.md)| The otherPhoneTypes code to be written. | |

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
| **200** | The otherPhoneTypes provided has been created. |  -  |
| **401** | Unauthorized |  -  |

<a name="getConfigurations"></a>
# **getConfigurations**
> List&lt;CodeObject&gt; getConfigurations().execute();

Retrieve all otherPhoneTypes configurations

&#39;The otherPhoneTypes endpoint returns information about the UKG Pro otherPhoneTypes configurations.&#39; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtherPhoneTypesApi;
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
              .otherPhoneTypes
              .getConfigurations()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OtherPhoneTypesApi#getConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CodeObject>> response = client
              .otherPhoneTypes
              .getConfigurations()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OtherPhoneTypesApi#getConfigurations");
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

Update a single otherPhoneTypes configuration

&#39;Allows the ability update a single otherPhoneTypes configuration.&#39; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtherPhoneTypesApi;
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
              .otherPhoneTypes
              .updateConfiguration(code)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtherPhoneTypesApi#updateConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .otherPhoneTypes
              .updateConfiguration(code)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtherPhoneTypesApi#updateConfiguration");
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

