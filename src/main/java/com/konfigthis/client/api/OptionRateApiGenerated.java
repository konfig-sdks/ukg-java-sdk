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


import java.time.OffsetDateTime;
import com.konfigthis.client.model.OptionRate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OptionRateApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OptionRateApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OptionRateApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDataCall(String deductionCode, String benefitOption, OffsetDateTime effectiveDate, String payFrequency, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/configuration/v1/option-rate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (deductionCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deductionCode", deductionCode));
        }

        if (benefitOption != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("benefitOption", benefitOption));
        }

        if (effectiveDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveDate", effectiveDate));
        }

        if (payFrequency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payFrequency", payFrequency));
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
    private okhttp3.Call getDataValidateBeforeCall(String deductionCode, String benefitOption, OffsetDateTime effectiveDate, String payFrequency, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return getDataCall(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage, _callback);

    }


    private ApiResponse<List<OptionRate>> getDataWithHttpInfo(String deductionCode, String benefitOption, OffsetDateTime effectiveDate, String payFrequency, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getDataValidateBeforeCall(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<OptionRate>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDataAsync(String deductionCode, String benefitOption, OffsetDateTime effectiveDate, String payFrequency, Integer page, Integer perPage, final ApiCallback<List<OptionRate>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDataValidateBeforeCall(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<OptionRate>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDataRequestBuilder {
        private String deductionCode;
        private String benefitOption;
        private OffsetDateTime effectiveDate;
        private String payFrequency;
        private Integer page;
        private Integer perPage;

        private GetDataRequestBuilder() {
        }

        /**
         * Set deductionCode
         * @param deductionCode  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder deductionCode(String deductionCode) {
            this.deductionCode = deductionCode;
            return this;
        }
        
        /**
         * Set benefitOption
         * @param benefitOption  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder benefitOption(String benefitOption) {
            this.benefitOption = benefitOption;
            return this;
        }
        
        /**
         * Set effectiveDate
         * @param effectiveDate  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder effectiveDate(OffsetDateTime effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }
        
        /**
         * Set payFrequency
         * @param payFrequency  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder payFrequency(String payFrequency) {
            this.payFrequency = payFrequency;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getData
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
            return getDataCall(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage, _callback);
        }


        /**
         * Execute getData request
         * @return List&lt;OptionRate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public List<OptionRate> execute() throws ApiException {
            ApiResponse<List<OptionRate>> localVarResp = getDataWithHttpInfo(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getData request with HTTP info returned
         * @return ApiResponse&lt;List&lt;OptionRate&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<OptionRate>> executeWithHttpInfo() throws ApiException {
            return getDataWithHttpInfo(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage);
        }

        /**
         * Execute getData request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<OptionRate>> _callback) throws ApiException {
            return getDataAsync(deductionCode, benefitOption, effectiveDate, payFrequency, page, perPage, _callback);
        }
    }

    /**
     * Get Option Rate Data
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \\\&quot;View\\\&quot; role for the \\\&quot;Company Configuration Integration\\\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).  Effective date parameter gets effective record as of the given date. If it&#39;s not passed, effected date is defaulted to current date.  Deduction code parameter can take in multiple deduction codes separated by coma. ex: [DEN, MED, VIS] .  Pay frequency parameter can take in multiple pay frequencies separated by coma. ex: [B, M] . 
     * @return GetDataRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetDataRequestBuilder getData() throws IllegalArgumentException {
        return new GetDataRequestBuilder();
    }
}
