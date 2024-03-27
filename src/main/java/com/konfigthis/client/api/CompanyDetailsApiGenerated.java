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


import com.konfigthis.client.model.CompanyDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CompanyDetailsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompanyDetailsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyDetailsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getCompanyDetailsCall(String companyId, String masterCompanyId, String companyCode, String isMasterCompany, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/configuration/v1/company-details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (companyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("companyId", companyId));
        }

        if (masterCompanyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("masterCompanyId", masterCompanyId));
        }

        if (companyCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("companyCode", companyCode));
        }

        if (isMasterCompany != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isMasterCompany", isMasterCompany));
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
    private okhttp3.Call getCompanyDetailsValidateBeforeCall(String companyId, String masterCompanyId, String companyCode, String isMasterCompany, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return getCompanyDetailsCall(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage, _callback);

    }


    private ApiResponse<List<CompanyDetails>> getCompanyDetailsWithHttpInfo(String companyId, String masterCompanyId, String companyCode, String isMasterCompany, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getCompanyDetailsValidateBeforeCall(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<CompanyDetails>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCompanyDetailsAsync(String companyId, String masterCompanyId, String companyCode, String isMasterCompany, Integer page, Integer perPage, final ApiCallback<List<CompanyDetails>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCompanyDetailsValidateBeforeCall(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<CompanyDetails>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCompanyDetailsRequestBuilder {
        private String companyId;
        private String masterCompanyId;
        private String companyCode;
        private String isMasterCompany;
        private Integer page;
        private Integer perPage;

        private GetCompanyDetailsRequestBuilder() {
        }

        /**
         * Set companyId
         * @param companyId 5 character value represents a UKG Pro CompanyID (optional)
         * @return GetCompanyDetailsRequestBuilder
         */
        public GetCompanyDetailsRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Set masterCompanyId
         * @param masterCompanyId 5 character value represents a UKG Pro Master CompanyID (optional)
         * @return GetCompanyDetailsRequestBuilder
         */
        public GetCompanyDetailsRequestBuilder masterCompanyId(String masterCompanyId) {
            this.masterCompanyId = masterCompanyId;
            return this;
        }
        
        /**
         * Set companyCode
         * @param companyCode 5 character value represents a UKG Pro Company Code (optional)
         * @return GetCompanyDetailsRequestBuilder
         */
        public GetCompanyDetailsRequestBuilder companyCode(String companyCode) {
            this.companyCode = companyCode;
            return this;
        }
        
        /**
         * Set isMasterCompany
         * @param isMasterCompany true/false values represent if this company is a UKG Pro Master Company (optional)
         * @return GetCompanyDetailsRequestBuilder
         */
        public GetCompanyDetailsRequestBuilder isMasterCompany(String isMasterCompany) {
            this.isMasterCompany = isMasterCompany;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return GetCompanyDetailsRequestBuilder
         */
        public GetCompanyDetailsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetCompanyDetailsRequestBuilder
         */
        public GetCompanyDetailsRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getCompanyDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> 429 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCompanyDetailsCall(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage, _callback);
        }


        /**
         * Execute getCompanyDetails request
         * @return List&lt;CompanyDetails&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> 429 </td><td>  -  </td></tr>
         </table>
         */
        public List<CompanyDetails> execute() throws ApiException {
            ApiResponse<List<CompanyDetails>> localVarResp = getCompanyDetailsWithHttpInfo(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCompanyDetails request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CompanyDetails&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> 429 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CompanyDetails>> executeWithHttpInfo() throws ApiException {
            return getCompanyDetailsWithHttpInfo(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage);
        }

        /**
         * Execute getCompanyDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> 429 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<CompanyDetails>> _callback) throws ApiException {
            return getCompanyDetailsAsync(companyId, masterCompanyId, companyCode, isMasterCompany, page, perPage, _callback);
        }
    }

    /**
     * Get Company Details
     * Get all master company and component company details. If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}).
     * @return GetCompanyDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> 429 </td><td>  -  </td></tr>
     </table>
     */
    public GetCompanyDetailsRequestBuilder getCompanyDetails() throws IllegalArgumentException {
        return new GetCompanyDetailsRequestBuilder();
    }
}
