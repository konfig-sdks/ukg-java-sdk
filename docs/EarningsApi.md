# EarningsApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTimeClockData**](EarningsApi.md#addTimeClockData) | **POST** /services/payroll/v1/import-pay-items/earnings | Add UKG Pro time clock data |
| [**deleteEarning**](EarningsApi.md#deleteEarning) | **DELETE** /services/payroll/v1/import-pay-items/earnings/{refId} | Delete a earning |
| [**getConfigurationsFilteredByParameter**](EarningsApi.md#getConfigurationsFilteredByParameter) | **GET** /configuration/v1/earnings/{calculationRule}/{taxCategory}/{useDeductionOffset}/{countryCode}/{includeInShiftDiffrential}/{includeInManualCheck} | Get list of earnings configurations filtered by Parameter including pagination params |
| [**getStatusDetails**](EarningsApi.md#getStatusDetails) | **GET** /services/payroll/v1/import-pay-items/earnings/{refId} | Get status details for specified earning |
| [**listEarningsConfigurations**](EarningsApi.md#listEarningsConfigurations) | **GET** /configuration/v1/earnings | Get a list of all earnings configurations |
| [**specificConfigurationGet**](EarningsApi.md#specificConfigurationGet) | **GET** /configuration/v1/earnings/{earningCode} | Get a specific earning configuration |


<a name="addTimeClockData"></a>
# **addTimeClockData**
> EarningsAddTimeClockDataResponse addTimeClockData(xCorrelationId, usClientId, earningsAddTimeClockDataRequest).failAllOnRequest(failAllOnRequest).execute();

Add UKG Pro time clock data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    configuration.basicAuth  = "YOUR API KEY";
    Ukg client = new Ukg(configuration);
    UUID xCorrelationId = UUID.randomUUID();
    String usClientId = "usClientId_example";
    List<Earning> earnings = Arrays.asList();
    Boolean failAllOnRequest = true; // failAllOnRequest, evaluating this to true will cause the entire request to fail given any errors, otherwise valid earnings will be staged for import.
    try {
      EarningsAddTimeClockDataResponse result = client
              .earnings
              .addTimeClockData(xCorrelationId, usClientId)
              .earnings(earnings)
              .failAllOnRequest(failAllOnRequest)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccessCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#addTimeClockData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EarningsAddTimeClockDataResponse> response = client
              .earnings
              .addTimeClockData(xCorrelationId, usClientId)
              .earnings(earnings)
              .failAllOnRequest(failAllOnRequest)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#addTimeClockData");
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
| **xCorrelationId** | **UUID**|  | |
| **usClientId** | **String**|  | |
| **earningsAddTimeClockDataRequest** | [**EarningsAddTimeClockDataRequest**](EarningsAddTimeClockDataRequest.md)| Add earnings from WFM for the purpose of processing payroll. | |
| **failAllOnRequest** | **Boolean**| failAllOnRequest, evaluating this to true will cause the entire request to fail given any errors, otherwise valid earnings will be staged for import. | [optional] [default to true] |

### Return type

[**EarningsAddTimeClockDataResponse**](EarningsAddTimeClockDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **207** | Multi-Status |  -  |

<a name="deleteEarning"></a>
# **deleteEarning**
> deleteEarning(xCorrelationId, usClientId, refId).execute();

Delete a earning

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    configuration.basicAuth  = "YOUR API KEY";
    Ukg client = new Ukg(configuration);
    UUID xCorrelationId = UUID.randomUUID();
    String usClientId = "usClientId_example";
    String refId = "refId_example"; // Earning unique Identifier for earning
    try {
      client
              .earnings
              .deleteEarning(xCorrelationId, usClientId, refId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#deleteEarning");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .earnings
              .deleteEarning(xCorrelationId, usClientId, refId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#deleteEarning");
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
| **xCorrelationId** | **UUID**|  | |
| **usClientId** | **String**|  | |
| **refId** | **String**| Earning unique Identifier for earning | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted |  -  |
| **404** | Not Found |  -  |
| **405** | Method not allowed |  -  |

<a name="getConfigurationsFilteredByParameter"></a>
# **getConfigurationsFilteredByParameter**
> List&lt;EarningsDto&gt; getConfigurationsFilteredByParameter(calculationRule, taxCategory, useDeductionOffset, countryCode, includeInShiftDiffrential, includeInManualCheck).earningCode(earningCode).includeInAccruals(includeInAccruals).includeInDeferredCompensation(includeInDeferredCompensation).includeInDeferredCompensationHours(includeInDeferredCompensationHours).page(page).perPage(perPage).execute();

Get list of earnings configurations filtered by Parameter including pagination params

Get all the earning configuration filtered by the parameter(s) passed. &lt;/br&gt;If no pagination parameters specified, the default/max is applied. It is a public API that user can access once they have a valid username and password. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    String calculationRule = "calculationRule_example";
    String taxCategory = "taxCategory_example";
    String useDeductionOffset = "useDeductionOffset_example";
    String countryCode = "countryCode_example";
    String includeInShiftDiffrential = "includeInShiftDiffrential_example";
    String includeInManualCheck = "includeInManualCheck_example";
    String earningCode = "earningCode_example";
    String includeInAccruals = "includeInAccruals_example";
    Boolean includeInDeferredCompensation = true;
    Boolean includeInDeferredCompensationHours = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EarningsDto> result = client
              .earnings
              .getConfigurationsFilteredByParameter(calculationRule, taxCategory, useDeductionOffset, countryCode, includeInShiftDiffrential, includeInManualCheck)
              .earningCode(earningCode)
              .includeInAccruals(includeInAccruals)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getConfigurationsFilteredByParameter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EarningsDto>> response = client
              .earnings
              .getConfigurationsFilteredByParameter(calculationRule, taxCategory, useDeductionOffset, countryCode, includeInShiftDiffrential, includeInManualCheck)
              .earningCode(earningCode)
              .includeInAccruals(includeInAccruals)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getConfigurationsFilteredByParameter");
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
| **calculationRule** | **String**|  | |
| **taxCategory** | **String**|  | |
| **useDeductionOffset** | **String**|  | |
| **countryCode** | **String**|  | |
| **includeInShiftDiffrential** | **String**|  | |
| **includeInManualCheck** | **String**|  | |
| **earningCode** | **String**|  | [optional] |
| **includeInAccruals** | **String**|  | [optional] |
| **includeInDeferredCompensation** | **Boolean**|  | [optional] |
| **includeInDeferredCompensationHours** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EarningsDto&gt;**](EarningsDto.md)

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

<a name="getStatusDetails"></a>
# **getStatusDetails**
> EarningStatusResponse getStatusDetails(xCorrelationId, usClientId, refId).execute();

Get status details for specified earning

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    configuration.basicAuth  = "YOUR API KEY";
    Ukg client = new Ukg(configuration);
    UUID xCorrelationId = UUID.randomUUID();
    String usClientId = "usClientId_example";
    String refId = "refId_example"; // Earning unique Identifier for earning
    try {
      EarningStatusResponse result = client
              .earnings
              .getStatusDetails(xCorrelationId, usClientId, refId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRefId());
      System.out.println(result.getCompanyCode());
      System.out.println(result.getEmpNo());
      System.out.println(result.getChargeDate());
      System.out.println(result.getCode());
      System.out.println(result.getHours());
      System.out.println(result.getAmount());
      System.out.println(result.getPieceCount());
      System.out.println(result.getShiftCode());
      System.out.println(result.getLocation());
      System.out.println(result.getJob());
      System.out.println(result.getProject());
      System.out.println(result.getOrgLvl1());
      System.out.println(result.getOrgLvl2());
      System.out.println(result.getOrgLvl3());
      System.out.println(result.getOrgLvl4());
      System.out.println(result.getPayRate());
      System.out.println(result.getPieceRate());
      System.out.println(result.getRoePayDate());
      System.out.println(result.getSource());
      System.out.println(result.getIsImportedIntoPayroll());
      System.out.println(result.getAdjEarnPeriodStartDate());
      System.out.println(result.getAdjEarnPeriodEndDate());
      System.out.println(result.getCheckSequence());
      System.out.println(result.getCreatePayType());
      System.out.println(result.getForcePayCreation());
      System.out.println(result.getGrossUp());
      System.out.println(result.getGrossUpTarget());
      System.out.println(result.getGrossUpTaxCalcMethod());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getStatusDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EarningStatusResponse> response = client
              .earnings
              .getStatusDetails(xCorrelationId, usClientId, refId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getStatusDetails");
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
| **xCorrelationId** | **UUID**|  | |
| **usClientId** | **String**|  | |
| **refId** | **String**| Earning unique Identifier for earning | |

### Return type

[**EarningStatusResponse**](EarningStatusResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucess |  -  |
| **404** | Not Found |  -  |

<a name="listEarningsConfigurations"></a>
# **listEarningsConfigurations**
> List&lt;EarningsDto&gt; listEarningsConfigurations().calculationRule(calculationRule).taxCategory(taxCategory).useDeductionOffset(useDeductionOffset).countryCode(countryCode).includeInShiftDiffrential(includeInShiftDiffrential).includeInManualCheck(includeInManualCheck).earningCode(earningCode).includeInAccruals(includeInAccruals).includeInDeferredCompensation(includeInDeferredCompensation).includeInDeferredCompensationHours(includeInDeferredCompensationHours).page(page).perPage(perPage).execute();

Get a list of all earnings configurations

Get details of all earnings configuration setup at company level. &lt;/br&gt;If no pagination parameters specified, the default/max is applied. It is a public API that user can access once they have a valid username and password. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    String calculationRule = "calculationRule_example";
    String taxCategory = "taxCategory_example";
    String useDeductionOffset = "useDeductionOffset_example";
    String countryCode = "countryCode_example";
    String includeInShiftDiffrential = "includeInShiftDiffrential_example";
    String includeInManualCheck = "includeInManualCheck_example";
    String earningCode = "earningCode_example";
    String includeInAccruals = "includeInAccruals_example";
    Boolean includeInDeferredCompensation = true;
    Boolean includeInDeferredCompensationHours = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EarningsDto> result = client
              .earnings
              .listEarningsConfigurations()
              .calculationRule(calculationRule)
              .taxCategory(taxCategory)
              .useDeductionOffset(useDeductionOffset)
              .countryCode(countryCode)
              .includeInShiftDiffrential(includeInShiftDiffrential)
              .includeInManualCheck(includeInManualCheck)
              .earningCode(earningCode)
              .includeInAccruals(includeInAccruals)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#listEarningsConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EarningsDto>> response = client
              .earnings
              .listEarningsConfigurations()
              .calculationRule(calculationRule)
              .taxCategory(taxCategory)
              .useDeductionOffset(useDeductionOffset)
              .countryCode(countryCode)
              .includeInShiftDiffrential(includeInShiftDiffrential)
              .includeInManualCheck(includeInManualCheck)
              .earningCode(earningCode)
              .includeInAccruals(includeInAccruals)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#listEarningsConfigurations");
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
| **calculationRule** | **String**|  | [optional] |
| **taxCategory** | **String**|  | [optional] |
| **useDeductionOffset** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **includeInShiftDiffrential** | **String**|  | [optional] |
| **includeInManualCheck** | **String**|  | [optional] |
| **earningCode** | **String**|  | [optional] |
| **includeInAccruals** | **String**|  | [optional] |
| **includeInDeferredCompensation** | **Boolean**|  | [optional] |
| **includeInDeferredCompensationHours** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EarningsDto&gt;**](EarningsDto.md)

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

<a name="specificConfigurationGet"></a>
# **specificConfigurationGet**
> List&lt;EarningsDto&gt; specificConfigurationGet(earningCode).calculationRule(calculationRule).taxCategory(taxCategory).useDeductionOffset(useDeductionOffset).countryCode(countryCode).includeInShiftDiffrential(includeInShiftDiffrential).includeInManualCheck(includeInManualCheck).earningCode2(earningCode2).includeInAccruals(includeInAccruals).includeInDeferredCompensation(includeInDeferredCompensation).includeInDeferredCompensationHours(includeInDeferredCompensationHours).page(page).perPage(perPage).execute();

Get a specific earning configuration

Get details of the earning configuration requested. &lt;/br&gt;If no pagination parameters specified, the default/max is applied. It is a public API that user can access once they have a valid username and password. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    String earningCode = "earningCode_example";
    String calculationRule = "calculationRule_example";
    String taxCategory = "taxCategory_example";
    String useDeductionOffset = "useDeductionOffset_example";
    String countryCode = "countryCode_example";
    String includeInShiftDiffrential = "includeInShiftDiffrential_example";
    String includeInManualCheck = "includeInManualCheck_example";
    String earningCode2 = "earningCode_example";
    String includeInAccruals = "includeInAccruals_example";
    Boolean includeInDeferredCompensation = true;
    Boolean includeInDeferredCompensationHours = true;
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<EarningsDto> result = client
              .earnings
              .specificConfigurationGet(earningCode)
              .calculationRule(calculationRule)
              .taxCategory(taxCategory)
              .useDeductionOffset(useDeductionOffset)
              .countryCode(countryCode)
              .includeInShiftDiffrential(includeInShiftDiffrential)
              .includeInManualCheck(includeInManualCheck)
              .earningCode2(earningCode2)
              .includeInAccruals(includeInAccruals)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#specificConfigurationGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EarningsDto>> response = client
              .earnings
              .specificConfigurationGet(earningCode)
              .calculationRule(calculationRule)
              .taxCategory(taxCategory)
              .useDeductionOffset(useDeductionOffset)
              .countryCode(countryCode)
              .includeInShiftDiffrential(includeInShiftDiffrential)
              .includeInManualCheck(includeInManualCheck)
              .earningCode2(earningCode2)
              .includeInAccruals(includeInAccruals)
              .includeInDeferredCompensation(includeInDeferredCompensation)
              .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#specificConfigurationGet");
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
| **earningCode** | **String**|  | |
| **calculationRule** | **String**|  | [optional] |
| **taxCategory** | **String**|  | [optional] |
| **useDeductionOffset** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **includeInShiftDiffrential** | **String**|  | [optional] |
| **includeInManualCheck** | **String**|  | [optional] |
| **earningCode2** | **String**|  | [optional] |
| **includeInAccruals** | **String**|  | [optional] |
| **includeInDeferredCompensation** | **Boolean**|  | [optional] |
| **includeInDeferredCompensationHours** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;EarningsDto&gt;**](EarningsDto.md)

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

