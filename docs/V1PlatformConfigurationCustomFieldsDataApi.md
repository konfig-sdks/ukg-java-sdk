# V1PlatformConfigurationCustomFieldsDataApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFieldsData**](V1PlatformConfigurationCustomFieldsDataApi.md#getFieldsData) | **GET** /personnel/v1/platform-configuration-fields/class-name/{className} | Platform Configuration Fields Data v1 |


<a name="getFieldsData"></a>
# **getFieldsData**
> List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData&gt; getFieldsData(className).keyName(keyName).keyValue(keyValue).fields(fields).employmentStatus(employmentStatus).page(page).perPage(perPage).execute();

Platform Configuration Fields Data v1

Returns information about the UKG Pro Platform Configuration Custom Fields Data. Specifically, each of a classes&#39; custom fields and their respective values. The keyNames, keyValues, employment status, and fields vary and are dependent on the class in question. Classes marked &#39;(not emp specific)&#39; in the list below will not work with the employmentStatus parameter.&lt;br /&gt;UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service.&lt;br /&gt;&lt;b&gt;Supported classes&lt;/b&gt;:&lt;br /&gt;  1. Address&lt;br /&gt;  2. Person&lt;br /&gt;  3. PersonName&lt;br /&gt;  4. Employee&lt;br /&gt;  5. PhoneNumber&lt;br /&gt;  6. Employment&lt;br /&gt;  7. InternationalEmployee&lt;br /&gt;  8. ComponentCompany - (not emp specific)&lt;br /&gt;  9. Location - (not emp specific)&lt;br /&gt;  10. Job -(not emp specific)&lt;br /&gt;  11. OrgLevel1 - (not emp specific)&lt;br /&gt;  12. OrgLevel2 - (not emp specific)&lt;br /&gt;  13. OrgLevel3 - (not emp specific)&lt;br /&gt;  14. OrgLevel4 - (not emp specific).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1PlatformConfigurationCustomFieldsDataApi;
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
    String keyName = "keyName_example"; // Optional keyName to allow filtering results by the corresponding keyValue. keyNames are specific IDs that apply to the class in question.
    String keyValue = "keyValue_example"; // Optional keyValue. Allows filtering results to only include a specific keyValue(s). keyValues correspond to a supplied keyName.
    String fields = "fields_example"; // The exact name of a custom field or fields in a comma seperated list. Filters results to only fields with those names.
    String employmentStatus = "employmentStatus_example"; // Use in junction with employment specific queries to filter custom field results by an internal employment status.
    Integer page = 56; // Offsets results. Used with page number to allow filtering results to a specific range of custom fields.
    Integer perPage = 56; // Offsets results. Used with page to allow filtering results to a specific range of custom fields.
    try {
      List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData> result = client
              .v1PlatformConfigurationCustomFieldsData
              .getFieldsData(className)
              .keyName(keyName)
              .keyValue(keyValue)
              .fields(fields)
              .employmentStatus(employmentStatus)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1PlatformConfigurationCustomFieldsDataApi#getFieldsData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData>> response = client
              .v1PlatformConfigurationCustomFieldsData
              .getFieldsData(className)
              .keyName(keyName)
              .keyValue(keyValue)
              .fields(fields)
              .employmentStatus(employmentStatus)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1PlatformConfigurationCustomFieldsDataApi#getFieldsData");
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
| **keyName** | **String**| Optional keyName to allow filtering results by the corresponding keyValue. keyNames are specific IDs that apply to the class in question. | [optional] |
| **keyValue** | **String**| Optional keyValue. Allows filtering results to only include a specific keyValue(s). keyValues correspond to a supplied keyName. | [optional] |
| **fields** | **String**| The exact name of a custom field or fields in a comma seperated list. Filters results to only fields with those names. | [optional] |
| **employmentStatus** | **String**| Use in junction with employment specific queries to filter custom field results by an internal employment status. | [optional] |
| **page** | **Integer**| Offsets results. Used with page number to allow filtering results to a specific range of custom fields. | [optional] |
| **perPage** | **Integer**| Offsets results. Used with page to allow filtering results to a specific range of custom fields. | [optional] |

### Return type

[**List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData&gt;**](UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationModelsPcData.md)

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

