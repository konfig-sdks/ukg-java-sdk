# PositionsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listFiltered**](PositionsApi.md#listFiltered) | **GET** /configuration/v1/positions | Returns list of employee position information filtered on various parameters |


<a name="listFiltered"></a>
# **listFiltered**
> List&lt;Positions&gt; listFiltered().companyId(companyId).employeeType(employeeType).statusCode(statusCode).payGroupCode(payGroupCode).positionCode(positionCode).projectCode(projectCode).shiftGroupCode(shiftGroupCode).isProrated(isProrated).isApproved(isApproved).isEligibleForBenefits(isEligibleForBenefits).page(page).perPage(perPage).execute();

Returns list of employee position information filtered on various parameters

If no pagination parameters specified, the default/max is applied.   Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Api endpoints. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).&lt;/br&gt;&lt;/br&gt;           /configuration/v1/position endpoint can take following optional parameter:   &lt;ul&gt;     &lt;li&gt;     companyId :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;     &lt;li&gt;     employeeType :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;     &lt;li&gt;     payGroupCode :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;     &lt;li&gt;     statusCode :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;     &lt;li&gt;     positionCode :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;      &lt;li&gt;     projectCode :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;       &lt;li&gt;     shiftGroupCode :- Can take in multiple IDs separated by comma. ex: [id1, id2]     &lt;/li&gt;     &lt;li&gt;     isProrated      &lt;/li&gt;     &lt;li&gt;     isApproved      &lt;/li&gt;      &lt;li&gt;     isEligibleForBenefits   &lt;/li&gt;  &lt;ul&gt;&lt;br/&gt;    Correct syntax when using parameters are as follows:    &lt;ul&gt;      &lt;li&gt;Get positions without parameter     &lt;ul&gt;      &lt;li&gt;Example: /configuration/v1/positions      &lt;/ul&gt;      &lt;/li&gt;     &lt;li&gt;Get positions by single companyid      &lt;ul&gt;      &lt;li&gt;Example: /configuration/v1/positions?companyid&#x3D;{companyid}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;   &lt;li&gt;Get positions by multiple companyid      &lt;ul&gt;      &lt;li&gt;Example: /configuration/v1/positions?companyid&#x3D;[companyid1,companyid2]&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;     &lt;li&gt;Get positions by positionsCode     &lt;ul&gt;      &lt;li&gt;Example: configuration/v1/positions?positionCode&#x3D;{positionCode}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;     &lt;li&gt;Get positions by isEligibleForBenefits      &lt;ul&gt;      &lt;li&gt;Example: configuration/v1/positions?isEligibleForBenefits&#x3D;{isEligibleForBenefit}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;     &lt;li&gt;Get positions by employeeType      &lt;ul&gt;      &lt;li&gt;Example: configuration/v1/positions?employeeType&#x3D;{employeeType}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;     &lt;li&gt;Get positions by statusCode      &lt;ul&gt;      &lt;li&gt;Example: configuration/v1/positions?statusCode&#x3D;{statusCode}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;     &lt;li&gt;Get positions by shiftGroupCode      &lt;ul&gt;      &lt;li&gt;Example: configuration/v1/positions?shiftGrouptCode&#x3D;{shiftGrouptCode}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;      &lt;li&gt;Get positions by using all parameter      &lt;ul&gt;      &lt;li&gt;Example: configuration/v1/positions?isApproved&#x3D;{isApproved}&amp;employeeType&#x3D;{employeeType}&amp;shiftGroupCode&#x3D;{shiftGroupCode}&amp;isEligibleForBenefits&#x3D;{isEligibleForBenefits}&amp;isProrated&#x3D;{isProrated}&amp;statusCode&#x3D;{statusCode}&amp;payGroupCode&#x3D;{payGroup}&amp;positionCode&#x3D;{positionCode}&amp;projectCode&#x3D;{projectCode}&amp;companyId&#x3D;{companyId}&amp;page&#x3D;{page}&amp;per_Page&#x3D;{per_Page}&lt;/li&gt;     &lt;/ul&gt;      &lt;/li&gt;      &lt;/ul&gt;   

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionsApi;
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
    String employeeType = "employeeType_example";
    String statusCode = "statusCode_example";
    String payGroupCode = "payGroupCode_example";
    String positionCode = "positionCode_example";
    String projectCode = "projectCode_example";
    String shiftGroupCode = "shiftGroupCode_example";
    Boolean isProrated = true;
    Boolean isApproved = true;
    Boolean isEligibleForBenefits = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<Positions> result = client
              .positions
              .listFiltered()
              .companyId(companyId)
              .employeeType(employeeType)
              .statusCode(statusCode)
              .payGroupCode(payGroupCode)
              .positionCode(positionCode)
              .projectCode(projectCode)
              .shiftGroupCode(shiftGroupCode)
              .isProrated(isProrated)
              .isApproved(isApproved)
              .isEligibleForBenefits(isEligibleForBenefits)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#listFiltered");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Positions>> response = client
              .positions
              .listFiltered()
              .companyId(companyId)
              .employeeType(employeeType)
              .statusCode(statusCode)
              .payGroupCode(payGroupCode)
              .positionCode(positionCode)
              .projectCode(projectCode)
              .shiftGroupCode(shiftGroupCode)
              .isProrated(isProrated)
              .isApproved(isApproved)
              .isEligibleForBenefits(isEligibleForBenefits)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#listFiltered");
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
| **employeeType** | **String**|  | [optional] |
| **statusCode** | **String**|  | [optional] |
| **payGroupCode** | **String**|  | [optional] |
| **positionCode** | **String**|  | [optional] |
| **projectCode** | **String**|  | [optional] |
| **shiftGroupCode** | **String**|  | [optional] |
| **isProrated** | **Boolean**|  | [optional] |
| **isApproved** | **Boolean**|  | [optional] |
| **isEligibleForBenefits** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;Positions&gt;**](Positions.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

