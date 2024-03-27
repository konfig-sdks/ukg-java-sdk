# NationalDocumentApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](NationalDocumentApi.md#get) | **GET** /personnel/v1/national-documents | All employee national document details |


<a name="get"></a>
# **get**
> NationalDocumentModel get().contactId(contactId).employeeId(employeeId).nationalDocumentIssuingCountryCode(nationalDocumentIssuingCountryCode).page(page).perPage(perPage).execute();

All employee national document details

All employee national document details. If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NationalDocumentApi;
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
    String contactId = "contactId_example";
    String employeeId = "employeeId_example";
    String nationalDocumentIssuingCountryCode = "nationalDocumentIssuingCountryCode_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      NationalDocumentModel result = client
              .nationalDocument
              .get()
              .contactId(contactId)
              .employeeId(employeeId)
              .nationalDocumentIssuingCountryCode(nationalDocumentIssuingCountryCode)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getNationalDocumentId());
      System.out.println(result.getContactId());
      System.out.println(result.getNationalDocumentNumber());
      System.out.println(result.getNationalDocumentDescription());
      System.out.println(result.getNationalDocumentTypeCode());
      System.out.println(result.getNationalDocumentIssuingCountryCode());
      System.out.println(result.getNationalDocumentIssuingPlace());
      System.out.println(result.getNationalDocumentIssueDate());
      System.out.println(result.getEmployeeNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling NationalDocumentApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NationalDocumentModel> response = client
              .nationalDocument
              .get()
              .contactId(contactId)
              .employeeId(employeeId)
              .nationalDocumentIssuingCountryCode(nationalDocumentIssuingCountryCode)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NationalDocumentApi#get");
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
| **contactId** | **String**|  | [optional] |
| **employeeId** | **String**|  | [optional] |
| **nationalDocumentIssuingCountryCode** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**NationalDocumentModel**](NationalDocumentModel.md)

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

