# PayrollDeductionsHistoryApi

All URIs are relative to *http://http:*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](PayrollDeductionsHistoryApi.md#get) | **GET** /payroll/v1/payroll-deductions-history | Get Payroll Deductions History |


<a name="get"></a>
# **get**
> List&lt;PayrollDeductionsHistory&gt; get().employeeId(employeeId).companyId(companyId).checkId(checkId).employeeNumber(employeeNumber).deductionCode(deductionCode).deductionType(deductionType).benefitOption(benefitOption).benefitProvider(benefitProvider).payGroup(payGroup).periodControl(periodControl).payDate(payDate).is401K(is401K).is403B(is403B).is408K(is408K).is408P(is408P).is457(is457).is457B(is457B).is457F(is457F).is501C(is501C).isD125(isD125).isDeductionOffSet(isDeductionOffSet).isDeferredCompensation(isDeferredCompensation).isDependentCare(isDependentCare).isHousing(isHousing).isNonQualifiedPlan(isNonQualifiedPlan).startPerControl(startPerControl).endPerControl(endPerControl).page(page).perPage(perPage).execute();

Get Payroll Deductions History

If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Payroll Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ukg;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollDeductionsHistoryApi;
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
    String employeeId = "employeeId_example";
    String companyId = "companyId_example";
    String checkId = "checkId_example";
    String employeeNumber = "employeeNumber_example";
    String deductionCode = "deductionCode_example";
    String deductionType = "deductionType_example";
    String benefitOption = "benefitOption_example";
    String benefitProvider = "benefitProvider_example";
    String payGroup = "payGroup_example";
    String periodControl = "periodControl_example";
    OffsetDateTime payDate = OffsetDateTime.now();
    String is401K = "is401K_example";
    String is403B = "is403B_example";
    String is408K = "is408K_example";
    String is408P = "is408P_example";
    String is457 = "is457_example";
    String is457B = "is457B_example";
    String is457F = "is457F_example";
    String is501C = "is501C_example";
    String isD125 = "isD125_example";
    String isDeductionOffSet = "isDeductionOffSet_example";
    String isDeferredCompensation = "isDeferredCompensation_example";
    String isDependentCare = "isDependentCare_example";
    String isHousing = "isHousing_example";
    String isNonQualifiedPlan = "isNonQualifiedPlan_example";
    String startPerControl = "startPerControl_example";
    String endPerControl = "endPerControl_example";
    Integer page = 56;
    Integer perPage = 56;
    try {
      List<PayrollDeductionsHistory> result = client
              .payrollDeductionsHistory
              .get()
              .employeeId(employeeId)
              .companyId(companyId)
              .checkId(checkId)
              .employeeNumber(employeeNumber)
              .deductionCode(deductionCode)
              .deductionType(deductionType)
              .benefitOption(benefitOption)
              .benefitProvider(benefitProvider)
              .payGroup(payGroup)
              .periodControl(periodControl)
              .payDate(payDate)
              .is401K(is401K)
              .is403B(is403B)
              .is408K(is408K)
              .is408P(is408P)
              .is457(is457)
              .is457B(is457B)
              .is457F(is457F)
              .is501C(is501C)
              .isD125(isD125)
              .isDeductionOffSet(isDeductionOffSet)
              .isDeferredCompensation(isDeferredCompensation)
              .isDependentCare(isDependentCare)
              .isHousing(isHousing)
              .isNonQualifiedPlan(isNonQualifiedPlan)
              .startPerControl(startPerControl)
              .endPerControl(endPerControl)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollDeductionsHistoryApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayrollDeductionsHistory>> response = client
              .payrollDeductionsHistory
              .get()
              .employeeId(employeeId)
              .companyId(companyId)
              .checkId(checkId)
              .employeeNumber(employeeNumber)
              .deductionCode(deductionCode)
              .deductionType(deductionType)
              .benefitOption(benefitOption)
              .benefitProvider(benefitProvider)
              .payGroup(payGroup)
              .periodControl(periodControl)
              .payDate(payDate)
              .is401K(is401K)
              .is403B(is403B)
              .is408K(is408K)
              .is408P(is408P)
              .is457(is457)
              .is457B(is457B)
              .is457F(is457F)
              .is501C(is501C)
              .isD125(isD125)
              .isDeductionOffSet(isDeductionOffSet)
              .isDeferredCompensation(isDeferredCompensation)
              .isDependentCare(isDependentCare)
              .isHousing(isHousing)
              .isNonQualifiedPlan(isNonQualifiedPlan)
              .startPerControl(startPerControl)
              .endPerControl(endPerControl)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollDeductionsHistoryApi#get");
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
| **employeeId** | **String**|  | [optional] |
| **companyId** | **String**|  | [optional] |
| **checkId** | **String**|  | [optional] |
| **employeeNumber** | **String**|  | [optional] |
| **deductionCode** | **String**|  | [optional] |
| **deductionType** | **String**|  | [optional] |
| **benefitOption** | **String**|  | [optional] |
| **benefitProvider** | **String**|  | [optional] |
| **payGroup** | **String**|  | [optional] |
| **periodControl** | **String**|  | [optional] |
| **payDate** | **OffsetDateTime**|  | [optional] |
| **is401K** | **String**|  | [optional] |
| **is403B** | **String**|  | [optional] |
| **is408K** | **String**|  | [optional] |
| **is408P** | **String**|  | [optional] |
| **is457** | **String**|  | [optional] |
| **is457B** | **String**|  | [optional] |
| **is457F** | **String**|  | [optional] |
| **is501C** | **String**|  | [optional] |
| **isD125** | **String**|  | [optional] |
| **isDeductionOffSet** | **String**|  | [optional] |
| **isDeferredCompensation** | **String**|  | [optional] |
| **isDependentCare** | **String**|  | [optional] |
| **isHousing** | **String**|  | [optional] |
| **isNonQualifiedPlan** | **String**|  | [optional] |
| **startPerControl** | **String**|  | [optional] |
| **endPerControl** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |

### Return type

[**List&lt;PayrollDeductionsHistory&gt;**](PayrollDeductionsHistory.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/problem+json, application/xml, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

