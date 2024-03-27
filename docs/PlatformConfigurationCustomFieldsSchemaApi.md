# PlatformConfigurationCustomFieldsSchemaApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFieldsSchema**](PlatformConfigurationCustomFieldsSchemaApi.md#getFieldsSchema) | **GET** /configuration/v1/platform-configuration/custom-fields-schema | Gets Platform Configuration standard classes custom fields schema |


<a name="getFieldsSchema"></a>
# **getFieldsSchema**
> UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema getFieldsSchema().className(className).execute();

Gets Platform Configuration standard classes custom fields schema

Gets Platform Configuration standard classes custom fields schema info from the MetaDocument table. &lt;br /&gt; UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlatformConfigurationCustomFieldsSchemaApi;
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
    String className = "className_example";
    try {
      UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema result = client
              .platformConfigurationCustomFieldsSchema
              .getFieldsSchema()
              .className(className)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getDisplayName());
      System.out.println(result.getDataType());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformConfigurationCustomFieldsSchemaApi#getFieldsSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema> response = client
              .platformConfigurationCustomFieldsSchema
              .getFieldsSchema()
              .className(className)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformConfigurationCustomFieldsSchemaApi#getFieldsSchema");
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
| **className** | **String**|  | [optional] |

### Return type

[**UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema**](UltimateSoftwareFoundationServicesApiUltiProConfigurationPlatformConfigurationModelsPcFieldSchema.md)

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

