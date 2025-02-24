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


import com.konfigthis.client.model.CompanyPayStatementFilter;
import com.konfigthis.client.model.CompanyPayStatementModel;
import com.konfigthis.client.model.EmployeePayStatementModel;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CompanyPayStatementApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompanyPayStatementApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyPayStatementApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getByDateRangeCall(CompanyPayStatementFilter companyPayStatementFilter, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = companyPayStatementFilter;

        // create path and map variables
        String localVarPath = "/payroll/v1/companies/pay-statements";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "text/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OauthSecurity" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByDateRangeValidateBeforeCall(CompanyPayStatementFilter companyPayStatementFilter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyPayStatementFilter' is set
        if (companyPayStatementFilter == null) {
            throw new ApiException("Missing the required parameter 'companyPayStatementFilter' when calling getByDateRange(Async)");
        }

        return getByDateRangeCall(companyPayStatementFilter, _callback);

    }


    private ApiResponse<List<EmployeePayStatementModel>> getByDateRangeWithHttpInfo(CompanyPayStatementFilter companyPayStatementFilter) throws ApiException {
        okhttp3.Call localVarCall = getByDateRangeValidateBeforeCall(companyPayStatementFilter, null);
        Type localVarReturnType = new TypeToken<List<EmployeePayStatementModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByDateRangeAsync(CompanyPayStatementFilter companyPayStatementFilter, final ApiCallback<List<EmployeePayStatementModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByDateRangeValidateBeforeCall(companyPayStatementFilter, _callback);
        Type localVarReturnType = new TypeToken<List<EmployeePayStatementModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByDateRangeRequestBuilder {
        private final OffsetDateTime startDate;
        private final OffsetDateTime endDate;
        private String companyId;
        private String payGroup;
        private Integer page;
        private Integer perPage;
        private Integer pagesCount;

        private GetByDateRangeRequestBuilder(OffsetDateTime startDate, OffsetDateTime endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        /**
         * Set companyId
         * @param companyId  (optional)
         * @return GetByDateRangeRequestBuilder
         */
        public GetByDateRangeRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Set payGroup
         * @param payGroup  (optional)
         * @return GetByDateRangeRequestBuilder
         */
        public GetByDateRangeRequestBuilder payGroup(String payGroup) {
            this.payGroup = payGroup;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return GetByDateRangeRequestBuilder
         */
        public GetByDateRangeRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetByDateRangeRequestBuilder
         */
        public GetByDateRangeRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Set pagesCount
         * @param pagesCount  (optional)
         * @return GetByDateRangeRequestBuilder
         */
        public GetByDateRangeRequestBuilder pagesCount(Integer pagesCount) {
            this.pagesCount = pagesCount;
            return this;
        }
        
        /**
         * Build call for getByDateRange
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            return getByDateRangeCall(companyPayStatementFilter, _callback);
        }

        private CompanyPayStatementFilter buildBodyParams() {
            CompanyPayStatementFilter companyPayStatementFilter = new CompanyPayStatementFilter();
            companyPayStatementFilter.companyId(this.companyId);
            companyPayStatementFilter.startDate(this.startDate);
            companyPayStatementFilter.endDate(this.endDate);
            companyPayStatementFilter.payGroup(this.payGroup);
            companyPayStatementFilter.page(this.page);
            companyPayStatementFilter.perPage(this.perPage);
            companyPayStatementFilter.pagesCount(this.pagesCount);
            return companyPayStatementFilter;
        }

        /**
         * Execute getByDateRange request
         * @return List&lt;EmployeePayStatementModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public List<EmployeePayStatementModel> execute() throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            ApiResponse<List<EmployeePayStatementModel>> localVarResp = getByDateRangeWithHttpInfo(companyPayStatementFilter);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByDateRange request with HTTP info returned
         * @return ApiResponse&lt;List&lt;EmployeePayStatementModel&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<EmployeePayStatementModel>> executeWithHttpInfo() throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            return getByDateRangeWithHttpInfo(companyPayStatementFilter);
        }

        /**
         * Execute getByDateRange request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<EmployeePayStatementModel>> _callback) throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            return getByDateRangeAsync(companyPayStatementFilter, _callback);
        }
    }

    /**
     * Get employee(s) pay statement(s) for a company or pay group for a given date range.
     * This method returns zero or more full pay statement documents for a given start date and end date. You may also pass in a PayGroup or CompanyIdentifer to further filter the list of pay summaries returned. &lt;br /&gt;If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password}).
     * @param companyPayStatementFilter  (required)
     * @return GetByDateRangeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
     </table>
     */
    public GetByDateRangeRequestBuilder getByDateRange(OffsetDateTime startDate, OffsetDateTime endDate) throws IllegalArgumentException {
        if (startDate == null) throw new IllegalArgumentException("\"startDate\" is required but got null");
        if (endDate == null) throw new IllegalArgumentException("\"endDate\" is required but got null");
        return new GetByDateRangeRequestBuilder(startDate, endDate);
    }
    private okhttp3.Call getPaySummariesCall(CompanyPayStatementFilter companyPayStatementFilter, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = companyPayStatementFilter;

        // create path and map variables
        String localVarPath = "/payroll/v1/companies/pay-statements-summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "text/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OauthSecurity" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaySummariesValidateBeforeCall(CompanyPayStatementFilter companyPayStatementFilter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyPayStatementFilter' is set
        if (companyPayStatementFilter == null) {
            throw new ApiException("Missing the required parameter 'companyPayStatementFilter' when calling getPaySummaries(Async)");
        }

        return getPaySummariesCall(companyPayStatementFilter, _callback);

    }


    private ApiResponse<List<CompanyPayStatementModel>> getPaySummariesWithHttpInfo(CompanyPayStatementFilter companyPayStatementFilter) throws ApiException {
        okhttp3.Call localVarCall = getPaySummariesValidateBeforeCall(companyPayStatementFilter, null);
        Type localVarReturnType = new TypeToken<List<CompanyPayStatementModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPaySummariesAsync(CompanyPayStatementFilter companyPayStatementFilter, final ApiCallback<List<CompanyPayStatementModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaySummariesValidateBeforeCall(companyPayStatementFilter, _callback);
        Type localVarReturnType = new TypeToken<List<CompanyPayStatementModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetPaySummariesRequestBuilder {
        private final OffsetDateTime startDate;
        private final OffsetDateTime endDate;
        private String companyId;
        private String payGroup;
        private Integer page;
        private Integer perPage;
        private Integer pagesCount;

        private GetPaySummariesRequestBuilder(OffsetDateTime startDate, OffsetDateTime endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        /**
         * Set companyId
         * @param companyId  (optional)
         * @return GetPaySummariesRequestBuilder
         */
        public GetPaySummariesRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Set payGroup
         * @param payGroup  (optional)
         * @return GetPaySummariesRequestBuilder
         */
        public GetPaySummariesRequestBuilder payGroup(String payGroup) {
            this.payGroup = payGroup;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return GetPaySummariesRequestBuilder
         */
        public GetPaySummariesRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetPaySummariesRequestBuilder
         */
        public GetPaySummariesRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Set pagesCount
         * @param pagesCount  (optional)
         * @return GetPaySummariesRequestBuilder
         */
        public GetPaySummariesRequestBuilder pagesCount(Integer pagesCount) {
            this.pagesCount = pagesCount;
            return this;
        }
        
        /**
         * Build call for getPaySummaries
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            return getPaySummariesCall(companyPayStatementFilter, _callback);
        }

        private CompanyPayStatementFilter buildBodyParams() {
            CompanyPayStatementFilter companyPayStatementFilter = new CompanyPayStatementFilter();
            companyPayStatementFilter.companyId(this.companyId);
            companyPayStatementFilter.startDate(this.startDate);
            companyPayStatementFilter.endDate(this.endDate);
            companyPayStatementFilter.payGroup(this.payGroup);
            companyPayStatementFilter.page(this.page);
            companyPayStatementFilter.perPage(this.perPage);
            companyPayStatementFilter.pagesCount(this.pagesCount);
            return companyPayStatementFilter;
        }

        /**
         * Execute getPaySummaries request
         * @return List&lt;CompanyPayStatementModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public List<CompanyPayStatementModel> execute() throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            ApiResponse<List<CompanyPayStatementModel>> localVarResp = getPaySummariesWithHttpInfo(companyPayStatementFilter);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getPaySummaries request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CompanyPayStatementModel&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CompanyPayStatementModel>> executeWithHttpInfo() throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            return getPaySummariesWithHttpInfo(companyPayStatementFilter);
        }

        /**
         * Execute getPaySummaries request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<CompanyPayStatementModel>> _callback) throws ApiException {
            CompanyPayStatementFilter companyPayStatementFilter = buildBodyParams();
            return getPaySummariesAsync(companyPayStatementFilter, _callback);
        }
    }

    /**
     * Get employee(s) pay statement(s) summary for a company or pay group for a given date range.
     * This method returns zero or more pay statement summaries for a given start date and end date. The pay summary information gives you a quick view of the total earnings, deductions and taxes. You may also pass in a PayGroup or CompanyIdentifer to further filter the list of pay summaries returned. &lt;br /&gt;If no pagination parameters specified, the default is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Pay Statements\&quot; Web Service. Headers - US-Customer-Api-Key, US-Client-id, Authorization ({username}:{password}).
     * @param companyPayStatementFilter  (required)
     * @return GetPaySummariesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> BadRequest </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> InternalServerError </td><td>  -  </td></tr>
     </table>
     */
    public GetPaySummariesRequestBuilder getPaySummaries(OffsetDateTime startDate, OffsetDateTime endDate) throws IllegalArgumentException {
        if (startDate == null) throw new IllegalArgumentException("\"startDate\" is required but got null");
        if (endDate == null) throw new IllegalArgumentException("\"endDate\" is required but got null");
        return new GetPaySummariesRequestBuilder(startDate, endDate);
    }
}
