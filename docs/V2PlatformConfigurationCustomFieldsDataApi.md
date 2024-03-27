# V2PlatformConfigurationCustomFieldsDataApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFieldsData**](V2PlatformConfigurationCustomFieldsDataApi.md#getFieldsData) | **GET** /personnel/v2/platform-configuration-fields/class-name/{className} | Platform Configuration Fields Data v2 |


<a name="getFieldsData"></a>
# **getFieldsData**
> List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData&gt; getFieldsData(className).fields(fields).keyValue(keyValue).page(page).perPage(perPage).execute();

Platform Configuration Fields Data v2

This API is similar to the v1 Platform Configuration Fields className API with added support of filtering data by KeyValue. The fields and keyValues are dependent on the class in question - expected key values are listed along with the supported classes below.&lt;br /&gt;   This API uses pre-defined Views in the UKG Pro database to retrieve the data whereas the v1 version of this API uses functions to retrieve the data.&lt;br /&gt;UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service.&lt;br /&gt;&lt;b&gt;Supported classes&lt;/b&gt;:&lt;br /&gt;  1. Address (takes value of an employee Id as keyValue)&lt;br /&gt;  2. Person (takes value of an employee Id as keyValue)&lt;br /&gt;  3. Employee (takes value of an employee Id as keyValue)&lt;br /&gt;  4. PhoneNumber (takes value of an employee Id as keyValue)&lt;br /&gt;  5. Employment (takes value of an employee Id and a company code as keyValue. Accepted format for keyValue &lt;b&gt;employeeId:companyCode&lt;/b&gt;)&lt;br /&gt;  6. Location (takes value of a location code as keyValue)&lt;br /&gt;  7. Job (takes value of a job code as keyValue)&lt;br /&gt;  8. OrgLevel1 (takes value of an org code as keyValue)&lt;br /&gt;  9. OrgLevel2 (takes value of an org code as keyValue)&lt;br /&gt;  10. OrgLevel3 (takes value of an org code as keyValue)&lt;br /&gt;  11. OrgLevel4 (takes value of an org code as keyValue)&lt;br /&gt;  12. InternationalEmployee (takes value of an employee Id and a country code as keyValue. Accepted format for keyValue &lt;b&gt;employeeId:countryCode&lt;/b&gt;)&lt;br /&gt;  13. Contacts (takes value of a SystemId as keyValue)&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Classes NOT supported&lt;/b&gt;:&lt;br /&gt;  1. ComponentCompany&lt;br /&gt;  2. PersonNames (fields of this class are available in class Person)&lt;br /&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V2PlatformConfigurationCustomFieldsDataApi;
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
    String className = "className_example"; // The name of a supported class, as listed above, to pull custom fields from.
    String fields = "fields_example"; // The exact name of a custom field or fields in a comma seperated list. Filters results to only fields with those names.
    String keyValue = "keyValue_example"; // keyValue to filter results by, allowing filtering by specific Ids. This value is dependent on the className, as listed in the implementation notes.
    Integer page = 56; // Offsets results. Used with page number to allow filtering results to a certain range of custom fields.
    Integer perPage = 56; // Offsets results. Used with page to allow filtering results to a certain range of custom fields.
    try {
      List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData> result = client
              .v2PlatformConfigurationCustomFieldsData
              .getFieldsData(className)
              .fields(fields)
              .keyValue(keyValue)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V2PlatformConfigurationCustomFieldsDataApi#getFieldsData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>> response = client
              .v2PlatformConfigurationCustomFieldsData
              .getFieldsData(className)
              .fields(fields)
              .keyValue(keyValue)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V2PlatformConfigurationCustomFieldsDataApi#getFieldsData");
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
| **className** | **String**| The name of a supported class, as listed above, to pull custom fields from. | |
| **fields** | **String**| The exact name of a custom field or fields in a comma seperated list. Filters results to only fields with those names. | [optional] |
| **keyValue** | **String**| keyValue to filter results by, allowing filtering by specific Ids. This value is dependent on the className, as listed in the implementation notes. | [optional] |
| **page** | **Integer**| Offsets results. Used with page number to allow filtering results to a certain range of custom fields. | [optional] |
| **perPage** | **Integer**| Offsets results. Used with page to allow filtering results to a certain range of custom fields. | [optional] |

### Return type

[**List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData&gt;**](UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData.md)

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

