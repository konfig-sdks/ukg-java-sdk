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


import com.konfigthis.client.model.AuditDetails;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuditDetailsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuditDetailsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuditDetailsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDataCall(OffsetDateTime startDateTime, OffsetDateTime endDateTime, String tableName, String fieldName, String action, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/personnel/v1/audit-details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDateTime", startDateTime));
        }

        if (endDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDateTime", endDateTime));
        }

        if (tableName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tableName", tableName));
        }

        if (fieldName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldName", fieldName));
        }

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
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
    private okhttp3.Call getDataValidateBeforeCall(OffsetDateTime startDateTime, OffsetDateTime endDateTime, String tableName, String fieldName, String action, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'startDateTime' is set
        if (startDateTime == null) {
            throw new ApiException("Missing the required parameter 'startDateTime' when calling getData(Async)");
        }

        // verify the required parameter 'endDateTime' is set
        if (endDateTime == null) {
            throw new ApiException("Missing the required parameter 'endDateTime' when calling getData(Async)");
        }

        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling getData(Async)");
        }

        // verify the required parameter 'fieldName' is set
        if (fieldName == null) {
            throw new ApiException("Missing the required parameter 'fieldName' when calling getData(Async)");
        }

        return getDataCall(startDateTime, endDateTime, tableName, fieldName, action, page, perPage, _callback);

    }


    private ApiResponse<List<AuditDetails>> getDataWithHttpInfo(OffsetDateTime startDateTime, OffsetDateTime endDateTime, String tableName, String fieldName, String action, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getDataValidateBeforeCall(startDateTime, endDateTime, tableName, fieldName, action, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<AuditDetails>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDataAsync(OffsetDateTime startDateTime, OffsetDateTime endDateTime, String tableName, String fieldName, String action, Integer page, Integer perPage, final ApiCallback<List<AuditDetails>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDataValidateBeforeCall(startDateTime, endDateTime, tableName, fieldName, action, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<AuditDetails>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDataRequestBuilder {
        private final OffsetDateTime startDateTime;
        private final OffsetDateTime endDateTime;
        private final String tableName;
        private final String fieldName;
        private String action;
        private Integer page;
        private Integer perPage;

        private GetDataRequestBuilder(OffsetDateTime startDateTime, OffsetDateTime endDateTime, String tableName, String fieldName) {
            this.startDateTime = startDateTime;
            this.endDateTime = endDateTime;
            this.tableName = tableName;
            this.fieldName = fieldName;
        }

        /**
         * Set action
         * @param action  (optional)
         * @return GetDataRequestBuilder
         */
        public GetDataRequestBuilder action(String action) {
            this.action = action;
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
            return getDataCall(startDateTime, endDateTime, tableName, fieldName, action, page, perPage, _callback);
        }


        /**
         * Execute getData request
         * @return List&lt;AuditDetails&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public List<AuditDetails> execute() throws ApiException {
            ApiResponse<List<AuditDetails>> localVarResp = getDataWithHttpInfo(startDateTime, endDateTime, tableName, fieldName, action, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getData request with HTTP info returned
         * @return ApiResponse&lt;List&lt;AuditDetails&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<AuditDetails>> executeWithHttpInfo() throws ApiException {
            return getDataWithHttpInfo(startDateTime, endDateTime, tableName, fieldName, action, page, perPage);
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
        public okhttp3.Call executeAsync(final ApiCallback<List<AuditDetails>> _callback) throws ApiException {
            return getDataAsync(startDateTime, endDateTime, tableName, fieldName, action, page, perPage, _callback);
        }
    }

    /**
     * Get Audit Details Data
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \\\&quot;View\\\&quot; role for the \\\&quot;Personnel Integration\\\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}) .
     * @param startDateTime  (required)
     * @param endDateTime  (required)
     * @param tableName  (required)
     * @param fieldName  (required)
     * @return GetDataRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetDataRequestBuilder getData(OffsetDateTime startDateTime, OffsetDateTime endDateTime, String tableName, String fieldName) throws IllegalArgumentException {
        if (startDateTime == null) throw new IllegalArgumentException("\"startDateTime\" is required but got null");
        if (endDateTime == null) throw new IllegalArgumentException("\"endDateTime\" is required but got null");
        if (tableName == null) throw new IllegalArgumentException("\"tableName\" is required but got null");
            

        if (fieldName == null) throw new IllegalArgumentException("\"fieldName\" is required but got null");
            

        return new GetDataRequestBuilder(startDateTime, endDateTime, tableName, fieldName);
    }
}
