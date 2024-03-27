# BusinessRuleImportToolApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**businessRuleImportFileUpload**](BusinessRuleImportToolApi.md#businessRuleImportFileUpload) | **POST** /configuration/v1/businessruleimport-tool/fileupload | Takes an XML transaction and feeds it into the Business Rule Import Tool |
| [**getFileUploadStatus**](BusinessRuleImportToolApi.md#getFileUploadStatus) | **GET** /configuration/v1/businessruleimport-tool/filestatus/{fileId} | Retrieves the status of an Business Rule Import Tool transaction |
| [**getStagingStatus**](BusinessRuleImportToolApi.md#getStagingStatus) | **GET** /configuration/v1/businessruleimport-tool/transactionstatus/{stagingId} | Retrieves the status of an Business Rule Import Tool transaction |
| [**importsBusinessRuleStagingData**](BusinessRuleImportToolApi.md#importsBusinessRuleStagingData) | **POST** /configuration/v1/businessruleimport-tool/transaction | Takes an XML transaction and feeds it into the Business Rule Import Tool (Staging) |


<a name="businessRuleImportFileUpload"></a>
# **businessRuleImportFileUpload**
> Object businessRuleImportFileUpload(businessRuleImportRequest).execute();

Takes an XML transaction and feeds it into the Business Rule Import Tool

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessRuleImportToolApi;
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
    String transaction = "transaction_example"; // The XML Serialized transaction
    String uniqueFileName = "uniqueFileName_example"; // An optionally provided unique file name
    try {
      Object result = client
              .businessRuleImportTool
              .businessRuleImportFileUpload()
              .transaction(transaction)
              .uniqueFileName(uniqueFileName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#businessRuleImportFileUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .businessRuleImportTool
              .businessRuleImportFileUpload()
              .transaction(transaction)
              .uniqueFileName(uniqueFileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#businessRuleImportFileUpload");
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
| **businessRuleImportRequest** | [**BusinessRuleImportRequest**](BusinessRuleImportRequest.md)|  | |

### Return type

**Object**

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/problem+json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **404** | NotFound |  -  |

<a name="getFileUploadStatus"></a>
# **getFileUploadStatus**
> FileStatusModel getFileUploadStatus(fileId).execute();

Retrieves the status of an Business Rule Import Tool transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessRuleImportToolApi;
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
    String fileId = "fileId_example";
    try {
      FileStatusModel result = client
              .businessRuleImportTool
              .getFileUploadStatus(fileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFileID());
      System.out.println(result.getFileName());
      System.out.println(result.getFileNameUnique());
      System.out.println(result.getStatus());
      System.out.println(result.getFileProcessDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#getFileUploadStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileStatusModel> response = client
              .businessRuleImportTool
              .getFileUploadStatus(fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#getFileUploadStatus");
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
| **fileId** | **String**|  | |

### Return type

[**FileStatusModel**](FileStatusModel.md)

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

<a name="getStagingStatus"></a>
# **getStagingStatus**
> BusinessRuleImportFileStagingStatus getStagingStatus(stagingId).execute();

Retrieves the status of an Business Rule Import Tool transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessRuleImportToolApi;
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
    String stagingId = "stagingId_example";
    try {
      BusinessRuleImportFileStagingStatus result = client
              .businessRuleImportTool
              .getStagingStatus(stagingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStagingId());
      System.out.println(result.getFileProcessDate());
      System.out.println(result.getServiceSubmittalDate());
      System.out.println(result.getLastRepostDate());
      System.out.println(result.getStatus());
      System.out.println(result.getTransaction());
      System.out.println(result.getFileName());
      System.out.println(result.getMessages());
      System.out.println(result.getChildTransactionStatuses());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#getStagingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessRuleImportFileStagingStatus> response = client
              .businessRuleImportTool
              .getStagingStatus(stagingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#getStagingStatus");
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
| **stagingId** | **String**|  | |

### Return type

[**BusinessRuleImportFileStagingStatus**](BusinessRuleImportFileStagingStatus.md)

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

<a name="importsBusinessRuleStagingData"></a>
# **importsBusinessRuleStagingData**
> BusinessRuleImportFileStaging importsBusinessRuleStagingData(businessRuleImportRequest).execute();

Takes an XML transaction and feeds it into the Business Rule Import Tool (Staging)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessRuleImportToolApi;
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
    String transaction = "transaction_example"; // The XML Serialized transaction
    String uniqueFileName = "uniqueFileName_example"; // An optionally provided unique file name
    try {
      BusinessRuleImportFileStaging result = client
              .businessRuleImportTool
              .importsBusinessRuleStagingData()
              .transaction(transaction)
              .uniqueFileName(uniqueFileName)
              .execute();
      System.out.println(result);
      System.out.println(result.getStagingId());
      System.out.println(result.getDateTimeCreated());
      System.out.println(result.getFileName());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#importsBusinessRuleStagingData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessRuleImportFileStaging> response = client
              .businessRuleImportTool
              .importsBusinessRuleStagingData()
              .transaction(transaction)
              .uniqueFileName(uniqueFileName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessRuleImportToolApi#importsBusinessRuleStagingData");
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
| **businessRuleImportRequest** | [**BusinessRuleImportRequest**](BusinessRuleImportRequest.md)|  | |

### Return type

[**BusinessRuleImportFileStaging**](BusinessRuleImportFileStaging.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/problem+json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | NotFound |  -  |

