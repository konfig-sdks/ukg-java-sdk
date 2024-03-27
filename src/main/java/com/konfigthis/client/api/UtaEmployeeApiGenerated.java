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


import com.konfigthis.client.model.ResultDtoEmployeeDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UtaEmployeeApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UtaEmployeeApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UtaEmployeeApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getByCoIdAndEeIdCall(String coid, String eeid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/simpleschedule/{coid}/employees/{eeid}"
            .replace("{" + "coid" + "}", localVarApiClient.escapeString(coid.toString()))
            .replace("{" + "eeid" + "}", localVarApiClient.escapeString(eeid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
    private okhttp3.Call getByCoIdAndEeIdValidateBeforeCall(String coid, String eeid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'coid' is set
        if (coid == null) {
            throw new ApiException("Missing the required parameter 'coid' when calling getByCoIdAndEeId(Async)");
        }

        // verify the required parameter 'eeid' is set
        if (eeid == null) {
            throw new ApiException("Missing the required parameter 'eeid' when calling getByCoIdAndEeId(Async)");
        }

        return getByCoIdAndEeIdCall(coid, eeid, _callback);

    }


    private ApiResponse<ResultDtoEmployeeDto> getByCoIdAndEeIdWithHttpInfo(String coid, String eeid) throws ApiException {
        okhttp3.Call localVarCall = getByCoIdAndEeIdValidateBeforeCall(coid, eeid, null);
        Type localVarReturnType = new TypeToken<ResultDtoEmployeeDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByCoIdAndEeIdAsync(String coid, String eeid, final ApiCallback<ResultDtoEmployeeDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByCoIdAndEeIdValidateBeforeCall(coid, eeid, _callback);
        Type localVarReturnType = new TypeToken<ResultDtoEmployeeDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByCoIdAndEeIdRequestBuilder {
        private final String coid;
        private final String eeid;

        private GetByCoIdAndEeIdRequestBuilder(String coid, String eeid) {
            this.coid = coid;
            this.eeid = eeid;
        }

        /**
         * Build call for getByCoIdAndEeId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByCoIdAndEeIdCall(coid, eeid, _callback);
        }


        /**
         * Execute getByCoIdAndEeId request
         * @return ResultDtoEmployeeDto
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ResultDtoEmployeeDto execute() throws ApiException {
            ApiResponse<ResultDtoEmployeeDto> localVarResp = getByCoIdAndEeIdWithHttpInfo(coid, eeid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByCoIdAndEeId request with HTTP info returned
         * @return ApiResponse&lt;ResultDtoEmployeeDto&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResultDtoEmployeeDto> executeWithHttpInfo() throws ApiException {
            return getByCoIdAndEeIdWithHttpInfo(coid, eeid);
        }

        /**
         * Execute getByCoIdAndEeId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResultDtoEmployeeDto> _callback) throws ApiException {
            return getByCoIdAndEeIdAsync(coid, eeid, _callback);
        }
    }

    /**
     * Obtains a UTA Employee by coId and eeId.
     * 
     * @param coid coid of employee. (required)
     * @param eeid eeid of employee. (required)
     * @return GetByCoIdAndEeIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public GetByCoIdAndEeIdRequestBuilder getByCoIdAndEeId(String coid, String eeid) throws IllegalArgumentException {
        if (coid == null) throw new IllegalArgumentException("\"coid\" is required but got null");
            

        if (eeid == null) throw new IllegalArgumentException("\"eeid\" is required but got null");
            

        return new GetByCoIdAndEeIdRequestBuilder(coid, eeid);
    }
}
