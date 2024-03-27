# TimeApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTimeEntries**](TimeApi.md#addTimeEntries) | **POST** /hoursWorked | Add hours worked entries |
| [**getPendingTransactions**](TimeApi.md#getPendingTransactions) | **GET** /time/pending_clock_transactions | Get pending clock transactions. |
| [**getProcessedTransactions**](TimeApi.md#getProcessedTransactions) | **GET** /time/clock_transactions | Get processed clock transactions. |
| [**getWorkSummaries**](TimeApi.md#getWorkSummaries) | **GET** /time/work_summaries | Obtain work summaries. |
| [**getWorkSummaryById**](TimeApi.md#getWorkSummaryById) | **GET** /time/work_summary | Obtain a work summary. |


<a name="addTimeEntries"></a>
# **addTimeEntries**
> TimeItemList addTimeEntries(xCorrelationId, usTenantId, timeItemList).execute();

Add hours worked entries

Add multiple Time entries

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://http:";
    
    // Configure HTTP basic authorization: BasicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: OauthSecurity
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    configuration.basicAuth  = "YOUR API KEY";
    Ukg client = new Ukg(configuration);
    List<TimeItem> timeData = Arrays.asList();
    UUID xCorrelationId = UUID.randomUUID(); // This value MUST be supplied by the originator, used for tracing
    UUID usTenantId = UUID.randomUUID();
    try {
      TimeItemList result = client
              .time
              .addTimeEntries(timeData, xCorrelationId, usTenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTimeData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#addTimeEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeItemList> response = client
              .time
              .addTimeEntries(timeData, xCorrelationId, usTenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#addTimeEntries");
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
| **xCorrelationId** | **UUID**| This value MUST be supplied by the originator, used for tracing | |
| **usTenantId** | **UUID**|  | |
| **timeItemList** | [**TimeItemList**](TimeItemList.md)|  | |

### Return type

[**TimeItemList**](TimeItemList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [OauthSecurity](../README.md#OauthSecurity), [basic](../README.md#basic), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="getPendingTransactions"></a>
# **getPendingTransactions**
> ResultDtoClockTransactionDto getPendingTransactions().empName(empName).empId(empId).execute();

Get pending clock transactions.

Obtain all pending clock transactions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeApi;
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
    String empName = "empName_example"; // Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.
    Long empId = 56L; // Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.
    try {
      ResultDtoClockTransactionDto result = client
              .time
              .getPendingTransactions()
              .empName(empName)
              .empId(empId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getPendingTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoClockTransactionDto> response = client
              .time
              .getPendingTransactions()
              .empName(empName)
              .empId(empId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getPendingTransactions");
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
| **empName** | **String**| Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified. | [optional] |
| **empId** | **Long**| Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified. | [optional] |

### Return type

[**ResultDtoClockTransactionDto**](ResultDtoClockTransactionDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |

<a name="getProcessedTransactions"></a>
# **getProcessedTransactions**
> ResultDtoClockTransactionDto getProcessedTransactions(date).empName(empName).empId(empId).execute();

Get processed clock transactions.

Obtain all processed clock transactions for a given date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeApi;
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
    OffsetDateTime date = OffsetDateTime.now(); // Date of clock transaction
    String empName = "empName_example"; // Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.
    Long empId = 56L; // Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.
    try {
      ResultDtoClockTransactionDto result = client
              .time
              .getProcessedTransactions(date)
              .empName(empName)
              .empId(empId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntities());
      System.out.println(result.getIndex());
      System.out.println(result.getRequestedCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getProcessedTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultDtoClockTransactionDto> response = client
              .time
              .getProcessedTransactions(date)
              .empName(empName)
              .empId(empId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getProcessedTransactions");
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
| **date** | **OffsetDateTime**| Date of clock transaction | |
| **empName** | **String**| Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified. | [optional] |
| **empId** | **Long**| Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified. | [optional] |

### Return type

[**ResultDtoClockTransactionDto**](ResultDtoClockTransactionDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |

<a name="getWorkSummaries"></a>
# **getWorkSummaries**
> TimesheetDtoWorkSummaryDto getWorkSummaries(from, to).empName(empName).empId(empId).full(full).authStatus(authStatus).execute();

Obtain work summaries.

Obtain work summaries between the provided date range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeApi;
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
    OffsetDateTime from = OffsetDateTime.now(); // Start range for work summaries
    OffsetDateTime to = OffsetDateTime.now(); // End range for work summaries
    String empName = "empName_example"; // Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.
    Long empId = 56L; // Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified.
    Boolean full = false; // Specifies if both clock and work detail data should be loaded
    Boolean authStatus = true; // If specified will load only work summaries with Authorized status equal to true or false
    try {
      TimesheetDtoWorkSummaryDto result = client
              .time
              .getWorkSummaries(from, to)
              .empName(empName)
              .empId(empId)
              .full(full)
              .authStatus(authStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getWorkSummaries());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getWorkSummaries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetDtoWorkSummaryDto> response = client
              .time
              .getWorkSummaries(from, to)
              .empName(empName)
              .empId(empId)
              .full(full)
              .authStatus(authStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getWorkSummaries");
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
| **from** | **OffsetDateTime**| Start range for work summaries | |
| **to** | **OffsetDateTime**| End range for work summaries | |
| **empName** | **String**| Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified. | [optional] |
| **empId** | **Long**| Employee can be specified by their emp_name or emp_id.  At least one parameter must be specified. | [optional] |
| **full** | **Boolean**| Specifies if both clock and work detail data should be loaded | [optional] [default to false] |
| **authStatus** | **Boolean**| If specified will load only work summaries with Authorized status equal to true or false | [optional] |

### Return type

[**TimesheetDtoWorkSummaryDto**](TimesheetDtoWorkSummaryDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |

<a name="getWorkSummaryById"></a>
# **getWorkSummaryById**
> WorkSummaryDto getWorkSummaryById(workSummaryId).execute();

Obtain a work summary.

Obtain a work summary by the specified id.  Will load a full work summary (includes clock and work detail information).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeApi;
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
    Long workSummaryId = 56L; // Work Summary id
    try {
      WorkSummaryDto result = client
              .time
              .getWorkSummaryById(workSummaryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmpId());
      System.out.println(result.getWorkDate());
      System.out.println(result.getWrkMins());
      System.out.println(result.getAuthorized());
      System.out.println(result.getOvertime());
      System.out.println(result.getAbsent());
      System.out.println(result.getAbsentTimeCode());
      System.out.println(result.getAuthorizedMessage());
      System.out.println(result.getComments());
      System.out.println(result.getClocks());
      System.out.println(result.getWorkDetails());
      System.out.println(result.getExceptions());
      System.out.println(result.getWrksMessages());
      System.out.println(result.getReadOnly());
      System.out.println(result.getReadOnlyReason());
      System.out.println(result.getDaily());
      System.out.println(result.getFlag1());
      System.out.println(result.getFlag2());
      System.out.println(result.getFlag3());
      System.out.println(result.getFlag4());
      System.out.println(result.getFlag5());
      System.out.println(result.getUdf1());
      System.out.println(result.getUdf2());
      System.out.println(result.getUdf3());
      System.out.println(result.getUdf4());
      System.out.println(result.getUdf5());
      System.out.println(result.getUdf6());
      System.out.println(result.getUdf7());
      System.out.println(result.getUdf8());
      System.out.println(result.getUdf9());
      System.out.println(result.getUdf10());
      System.out.println(result.getPayGroup());
      System.out.println(result.getCalcGroup());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getWorkSummaryById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkSummaryDto> response = client
              .time
              .getWorkSummaryById(workSummaryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeApi#getWorkSummaryById");
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
| **workSummaryId** | **Long**| Work Summary id | |

### Return type

[**WorkSummaryDto**](WorkSummaryDto.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |

