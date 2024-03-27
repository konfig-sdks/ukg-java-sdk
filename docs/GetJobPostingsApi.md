# GetJobPostingsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**details**](GetJobPostingsApi.md#details) | **GET** /talent/recruiting/v2/third-party-job-board-integrations/{integrationId}/postings | Get job postings |


<a name="details"></a>
# **details**
> List&lt;PostingsInner&gt; details(integrationId).page(page).perPage(perPage).execute();

Get job postings

The Job Postings API returns detailed information about jobs in UltiPro Recruiting such as title, description, compensation, available locations, company, talent factors like skills, work experience, education, licenses, behaviors and motivations, the published date, and the url to the job on UltiPro&#39;s Recruiting. Consumers should iterate through the pages until no more records are returned.   The \&quot;company\&quot; property contains \&quot;name\&quot; and \&quot;doing_business_as\&quot;, if the company name needs to be publicly exposed, the \&quot;doing_business_as\&quot; name should be used. Some properties may have several translations available, the possible language codes are: en_us, en_gb, es_es, fr_ca, de_de, and pr_br. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GetJobPostingsApi;
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
    String integrationId = "integrationId_example"; // A unique integration id provided by Ultimate Software to the Partner during the integration registration process. 
    Double page = 3.4D; // Pagination page number
    Double perPage = 30D; // Pagination amount of records per page to display
    try {
      List<PostingsInner> result = client
              .getJobPostings
              .details(integrationId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GetJobPostingsApi#details");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PostingsInner>> response = client
              .getJobPostings
              .details(integrationId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GetJobPostingsApi#details");
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
| **integrationId** | **String**| A unique integration id provided by Ultimate Software to the Partner during the integration registration process.  | |
| **page** | **Double**| Pagination page number | [optional] |
| **perPage** | **Double**| Pagination amount of records per page to display | [optional] [default to 30] |

### Return type

[**List&lt;PostingsInner&gt;**](PostingsInner.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/vnd.ultimatesoftware+json, application/vnd.ultimatesoftware+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

