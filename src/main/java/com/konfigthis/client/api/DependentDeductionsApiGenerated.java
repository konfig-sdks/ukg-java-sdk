/*
 * User Profile Details
 * Configure your UKG Pro Configuration Codes through UKG Pro APIs. Status: R1 deployment
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.DependentDeductions;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DependentDeductionsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DependentDeductionsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DependentDeductionsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getCall(String companyId, String contactId, String deductionCode, String employeeId, OffsetDateTime effectiveDate, String currentCOID, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/personnel/v1/dep-deductions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (companyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("companyId", companyId));
        }

        if (contactId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("contactId", contactId));
        }

        if (deductionCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deductionCode", deductionCode));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeId", employeeId));
        }

        if (effectiveDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveDate", effectiveDate));
        }

        if (currentCOID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currentCOID", currentCOID));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_Page", perPage));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text/json",
            "application/problem+json",
            "application/xml",
            "text/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OauthSecurity" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(String companyId, String contactId, String deductionCode, String employeeId, OffsetDateTime effectiveDate, String currentCOID, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return getCall(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage, _callback);

    }


    private ApiResponse<List<DependentDeductions>> getWithHttpInfo(String companyId, String contactId, String deductionCode, String employeeId, OffsetDateTime effectiveDate, String currentCOID, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<DependentDeductions>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAsync(String companyId, String contactId, String deductionCode, String employeeId, OffsetDateTime effectiveDate, String currentCOID, Integer page, Integer perPage, final ApiCallback<List<DependentDeductions>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<DependentDeductions>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRequestBuilder {
        private String companyId;
        private String contactId;
        private String deductionCode;
        private String employeeId;
        private OffsetDateTime effectiveDate;
        private String currentCOID;
        private Integer page;
        private Integer perPage;

        private GetRequestBuilder() {
        }

        /**
         * Set companyId
         * @param companyId  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Set contactId
         * @param contactId  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        
        /**
         * Set deductionCode
         * @param deductionCode  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder deductionCode(String deductionCode) {
            this.deductionCode = deductionCode;
            return this;
        }
        
        /**
         * Set employeeId
         * @param employeeId  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set effectiveDate
         * @param effectiveDate  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder effectiveDate(OffsetDateTime effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }
        
        /**
         * Set currentCOID
         * @param currentCOID  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder currentCOID(String currentCOID) {
            this.currentCOID = currentCOID;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for get
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCall(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage, _callback);
        }


        /**
         * Execute get request
         * @return List&lt;DependentDeductions&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public List<DependentDeductions> execute() throws ApiException {
            ApiResponse<List<DependentDeductions>> localVarResp = getWithHttpInfo(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute get request with HTTP info returned
         * @return ApiResponse&lt;List&lt;DependentDeductions&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<DependentDeductions>> executeWithHttpInfo() throws ApiException {
            return getWithHttpInfo(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage);
        }

        /**
         * Execute get request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<DependentDeductions>> _callback) throws ApiException {
            return getAsync(companyId, contactId, deductionCode, employeeId, effectiveDate, currentCOID, page, perPage, _callback);
        }
    }

    /**
     * Get Dependent Deductions
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     * @return GetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetRequestBuilder get() throws IllegalArgumentException {
        return new GetRequestBuilder();
    }
}
