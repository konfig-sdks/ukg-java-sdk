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


import com.konfigthis.client.model.UserDefinedFields;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UserDefinedFieldsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserDefinedFieldsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UserDefinedFieldsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getCall(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/personnel/v1/user-defined-fields";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (companyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("companyId", companyId));
        }

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeId", employeeId));
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
    private okhttp3.Call getValidateBeforeCall(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return getCall(companyId, employeeId, page, perPage, _callback);

    }


    private ApiResponse<List<UserDefinedFields>> getWithHttpInfo(String companyId, String employeeId, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(companyId, employeeId, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<UserDefinedFields>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAsync(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback<List<UserDefinedFields>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(companyId, employeeId, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<UserDefinedFields>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRequestBuilder {
        private String companyId;
        private String employeeId;
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
         * Set employeeId
         * @param employeeId  (optional)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder employeeId(String employeeId) {
            this.employeeId = employeeId;
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
            return getCall(companyId, employeeId, page, perPage, _callback);
        }


        /**
         * Execute get request
         * @return List&lt;UserDefinedFields&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public List<UserDefinedFields> execute() throws ApiException {
            ApiResponse<List<UserDefinedFields>> localVarResp = getWithHttpInfo(companyId, employeeId, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute get request with HTTP info returned
         * @return ApiResponse&lt;List&lt;UserDefinedFields&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<UserDefinedFields>> executeWithHttpInfo() throws ApiException {
            return getWithHttpInfo(companyId, employeeId, page, perPage);
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
        public okhttp3.Call executeAsync(final ApiCallback<List<UserDefinedFields>> _callback) throws ApiException {
            return getAsync(companyId, employeeId, page, perPage, _callback);
        }
    }

    /**
     * Get User Defined Fields
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;CompanyId parameter can take in multiple company Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;EmployeeId parameter can take in multiple employee Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 
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
    private okhttp3.Call getSingleCompanyCall(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/personnel/v1/companies/{companyId}/user-defined-fields"
            .replace("{" + "companyId" + "}", localVarApiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (employeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("employeeId", employeeId));
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
    private okhttp3.Call getSingleCompanyValidateBeforeCall(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getSingleCompany(Async)");
        }

        return getSingleCompanyCall(companyId, employeeId, page, perPage, _callback);

    }


    private ApiResponse<List<UserDefinedFields>> getSingleCompanyWithHttpInfo(String companyId, String employeeId, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getSingleCompanyValidateBeforeCall(companyId, employeeId, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<UserDefinedFields>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSingleCompanyAsync(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback<List<UserDefinedFields>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSingleCompanyValidateBeforeCall(companyId, employeeId, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<UserDefinedFields>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSingleCompanyRequestBuilder {
        private final String companyId;
        private String employeeId;
        private Integer page;
        private Integer perPage;

        private GetSingleCompanyRequestBuilder(String companyId) {
            this.companyId = companyId;
        }

        /**
         * Set employeeId
         * @param employeeId  (optional)
         * @return GetSingleCompanyRequestBuilder
         */
        public GetSingleCompanyRequestBuilder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set page
         * @param page  (optional)
         * @return GetSingleCompanyRequestBuilder
         */
        public GetSingleCompanyRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetSingleCompanyRequestBuilder
         */
        public GetSingleCompanyRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getSingleCompany
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
            return getSingleCompanyCall(companyId, employeeId, page, perPage, _callback);
        }


        /**
         * Execute getSingleCompany request
         * @return List&lt;UserDefinedFields&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public List<UserDefinedFields> execute() throws ApiException {
            ApiResponse<List<UserDefinedFields>> localVarResp = getSingleCompanyWithHttpInfo(companyId, employeeId, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSingleCompany request with HTTP info returned
         * @return ApiResponse&lt;List&lt;UserDefinedFields&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<UserDefinedFields>> executeWithHttpInfo() throws ApiException {
            return getSingleCompanyWithHttpInfo(companyId, employeeId, page, perPage);
        }

        /**
         * Execute getSingleCompany request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<UserDefinedFields>> _callback) throws ApiException {
            return getSingleCompanyAsync(companyId, employeeId, page, perPage, _callback);
        }
    }

    /**
     * Get User Defined Fields for single company
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;CompanyId parameter can take in multiple company Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;EmployeeId parameter can take in multiple employee Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 
     * @param companyId  (required)
     * @return GetSingleCompanyRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetSingleCompanyRequestBuilder getSingleCompany(String companyId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        return new GetSingleCompanyRequestBuilder(companyId);
    }
    private okhttp3.Call getSingleEmployeeCall(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/personnel/v1/companies/{companyId}/employees/{employeeId}/user-defined-fields"
            .replace("{" + "companyId" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "employeeId" + "}", localVarApiClient.escapeString(employeeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getSingleEmployeeValidateBeforeCall(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getSingleEmployee(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling getSingleEmployee(Async)");
        }

        return getSingleEmployeeCall(companyId, employeeId, page, perPage, _callback);

    }


    private ApiResponse<List<UserDefinedFields>> getSingleEmployeeWithHttpInfo(String companyId, String employeeId, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getSingleEmployeeValidateBeforeCall(companyId, employeeId, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<UserDefinedFields>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSingleEmployeeAsync(String companyId, String employeeId, Integer page, Integer perPage, final ApiCallback<List<UserDefinedFields>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSingleEmployeeValidateBeforeCall(companyId, employeeId, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<UserDefinedFields>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSingleEmployeeRequestBuilder {
        private final String companyId;
        private final String employeeId;
        private Integer page;
        private Integer perPage;

        private GetSingleEmployeeRequestBuilder(String companyId, String employeeId) {
            this.companyId = companyId;
            this.employeeId = employeeId;
        }

        /**
         * Set page
         * @param page  (optional)
         * @return GetSingleEmployeeRequestBuilder
         */
        public GetSingleEmployeeRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage  (optional)
         * @return GetSingleEmployeeRequestBuilder
         */
        public GetSingleEmployeeRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getSingleEmployee
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
            return getSingleEmployeeCall(companyId, employeeId, page, perPage, _callback);
        }


        /**
         * Execute getSingleEmployee request
         * @return List&lt;UserDefinedFields&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public List<UserDefinedFields> execute() throws ApiException {
            ApiResponse<List<UserDefinedFields>> localVarResp = getSingleEmployeeWithHttpInfo(companyId, employeeId, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSingleEmployee request with HTTP info returned
         * @return ApiResponse&lt;List&lt;UserDefinedFields&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<UserDefinedFields>> executeWithHttpInfo() throws ApiException {
            return getSingleEmployeeWithHttpInfo(companyId, employeeId, page, perPage);
        }

        /**
         * Execute getSingleEmployee request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<UserDefinedFields>> _callback) throws ApiException {
            return getSingleEmployeeAsync(companyId, employeeId, page, perPage, _callback);
        }
    }

    /**
     * Get User Defined Fields for a single employee in a single company
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) &lt;ul&gt; &lt;li&gt;CompanyId parameter can take in multiple company Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;li&gt;EmployeeId parameter can take in multiple employee Ids separated by comma. ex: [ABC, DEF]&lt;/li&gt; &lt;/ul&gt; 
     * @param companyId  (required)
     * @param employeeId  (required)
     * @return GetSingleEmployeeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetSingleEmployeeRequestBuilder getSingleEmployee(String companyId, String employeeId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        return new GetSingleEmployeeRequestBuilder(companyId, employeeId);
    }
}
