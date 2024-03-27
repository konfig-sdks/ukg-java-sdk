# PtoPlanPatchApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**onePtoPlan**](PtoPlanPatchApi.md#onePtoPlan) | **PATCH** /personnel/v1/companies/{companyId}/employees/{employeeId}/pto-plans/{ptoPlan} | Patch one PTO Plan |


<a name="onePtoPlan"></a>
# **onePtoPlan**
> PtoPlans onePtoPlan(companyId, employeeId, ptoPlan, ptoPlans).execute();

Patch one PTO Plan

Allows the ability to update one PTO Plan for an employee. Work Flow or Approvers is not supported. Permissions - Ultipro service account must have \&quot;Edit\&quot; role for the \&quot;PTO Plan Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PtoPlanPatchApi;
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
    String employeeId = "employeeId_example"; // Employee Identifier
    String companyId = "companyId_example"; // Company Identifier
    String ptoPlan = "ptoPlan_example"; // PTO Plan Identifier
    String companyId = "companyId_example"; // Company Identifier
    String employeeId = "employeeId_example"; // Employee Identifier
    String ptoPlan = "ptoPlan_example"; // PTO Plan Identifier
    Double earned = 3.4D; // Amount of hours earned for PTO
    Double taken = 3.4D; // Amount of hours taken for PTO
    Double pendingBalance = 3.4D; // Balance of PTO hours
    String earnedThroughDate = "earnedThroughDate_example"; // Date in which PTO is earned through, format should be YYYY-MM-DD
    String reset = "reset_example"; // Date in which the PTO reset's, format should be YYYY-MM-DD
    String pendingMoveDate = "pendingMoveDate_example"; // Date to be used if pending rules are relevant, format should be YYYY-MM-DD
    try {
      PtoPlans result = client
              .ptoPlanPatch
              .onePtoPlan(employeeId, companyId, ptoPlan, companyId, employeeId, ptoPlan)
              .earned(earned)
              .taken(taken)
              .pendingBalance(pendingBalance)
              .earnedThroughDate(earnedThroughDate)
              .reset(reset)
              .pendingMoveDate(pendingMoveDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getPtoPlan());
      System.out.println(result.getEarned());
      System.out.println(result.getTaken());
      System.out.println(result.getPendingBalance());
      System.out.println(result.getEarnedThroughDate());
      System.out.println(result.getReset());
      System.out.println(result.getPendingMoveDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PtoPlanPatchApi#onePtoPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PtoPlans> response = client
              .ptoPlanPatch
              .onePtoPlan(employeeId, companyId, ptoPlan, companyId, employeeId, ptoPlan)
              .earned(earned)
              .taken(taken)
              .pendingBalance(pendingBalance)
              .earnedThroughDate(earnedThroughDate)
              .reset(reset)
              .pendingMoveDate(pendingMoveDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PtoPlanPatchApi#onePtoPlan");
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
| **companyId** | **String**| Company Identifier | |
| **employeeId** | **String**| Employee Identifier | |
| **ptoPlan** | **String**| PTO Plan Identifier | |
| **ptoPlans** | [**PtoPlans**](PtoPlans.md)| The pto-plan to be written | |

### Return type

[**PtoPlans**](PtoPlans.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests (Exceeded Rate Limit) |  -  |

