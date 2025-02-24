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


import com.konfigthis.client.model.UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class V2PlatformConfigurationCustomFieldsDataApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public V2PlatformConfigurationCustomFieldsDataApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public V2PlatformConfigurationCustomFieldsDataApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getFieldsDataCall(String className, String fields, String keyValue, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/personnel/v2/platform-configuration-fields/class-name/{className}"
            .replace("{" + "className" + "}", localVarApiClient.escapeString(className.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (keyValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("keyValue", keyValue));
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
    private okhttp3.Call getFieldsDataValidateBeforeCall(String className, String fields, String keyValue, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'className' is set
        if (className == null) {
            throw new ApiException("Missing the required parameter 'className' when calling getFieldsData(Async)");
        }

        return getFieldsDataCall(className, fields, keyValue, page, perPage, _callback);

    }


    private ApiResponse<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>> getFieldsDataWithHttpInfo(String className, String fields, String keyValue, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getFieldsDataValidateBeforeCall(className, fields, keyValue, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getFieldsDataAsync(String className, String fields, String keyValue, Integer page, Integer perPage, final ApiCallback<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFieldsDataValidateBeforeCall(className, fields, keyValue, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetFieldsDataRequestBuilder {
        private final String className;
        private String fields;
        private String keyValue;
        private Integer page;
        private Integer perPage;

        private GetFieldsDataRequestBuilder(String className) {
            this.className = className;
        }

        /**
         * Set fields
         * @param fields The exact name of a custom field or fields in a comma seperated list. Filters results to only fields with those names. (optional)
         * @return GetFieldsDataRequestBuilder
         */
        public GetFieldsDataRequestBuilder fields(String fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Set keyValue
         * @param keyValue keyValue to filter results by, allowing filtering by specific Ids. This value is dependent on the className, as listed in the implementation notes. (optional)
         * @return GetFieldsDataRequestBuilder
         */
        public GetFieldsDataRequestBuilder keyValue(String keyValue) {
            this.keyValue = keyValue;
            return this;
        }
        
        /**
         * Set page
         * @param page Offsets results. Used with page number to allow filtering results to a certain range of custom fields. (optional)
         * @return GetFieldsDataRequestBuilder
         */
        public GetFieldsDataRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage Offsets results. Used with page to allow filtering results to a certain range of custom fields. (optional)
         * @return GetFieldsDataRequestBuilder
         */
        public GetFieldsDataRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getFieldsData
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getFieldsDataCall(className, fields, keyValue, page, perPage, _callback);
        }


        /**
         * Execute getFieldsData request
         * @return List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
         </table>
         */
        public List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData> execute() throws ApiException {
            ApiResponse<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>> localVarResp = getFieldsDataWithHttpInfo(className, fields, keyValue, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getFieldsData request with HTTP info returned
         * @return ApiResponse&lt;List&lt;UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>> executeWithHttpInfo() throws ApiException {
            return getFieldsDataWithHttpInfo(className, fields, keyValue, page, perPage);
        }

        /**
         * Execute getFieldsData request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData>> _callback) throws ApiException {
            return getFieldsDataAsync(className, fields, keyValue, page, perPage, _callback);
        }
    }

    /**
     * Platform Configuration Fields Data v2
     * This API is similar to the v1 Platform Configuration Fields className API with added support of filtering data by KeyValue. The fields and keyValues are dependent on the class in question - expected key values are listed along with the supported classes below.&lt;br /&gt;   This API uses pre-defined Views in the UKG Pro database to retrieve the data whereas the v1 version of this API uses functions to retrieve the data.&lt;br /&gt;UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service.&lt;br /&gt;&lt;b&gt;Supported classes&lt;/b&gt;:&lt;br /&gt;  1. Address (takes value of an employee Id as keyValue)&lt;br /&gt;  2. Person (takes value of an employee Id as keyValue)&lt;br /&gt;  3. Employee (takes value of an employee Id as keyValue)&lt;br /&gt;  4. PhoneNumber (takes value of an employee Id as keyValue)&lt;br /&gt;  5. Employment (takes value of an employee Id and a company code as keyValue. Accepted format for keyValue &lt;b&gt;employeeId:companyCode&lt;/b&gt;)&lt;br /&gt;  6. Location (takes value of a location code as keyValue)&lt;br /&gt;  7. Job (takes value of a job code as keyValue)&lt;br /&gt;  8. OrgLevel1 (takes value of an org code as keyValue)&lt;br /&gt;  9. OrgLevel2 (takes value of an org code as keyValue)&lt;br /&gt;  10. OrgLevel3 (takes value of an org code as keyValue)&lt;br /&gt;  11. OrgLevel4 (takes value of an org code as keyValue)&lt;br /&gt;  12. InternationalEmployee (takes value of an employee Id and a country code as keyValue. Accepted format for keyValue &lt;b&gt;employeeId:countryCode&lt;/b&gt;)&lt;br /&gt;  13. Contacts (takes value of a SystemId as keyValue)&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Classes NOT supported&lt;/b&gt;:&lt;br /&gt;  1. ComponentCompany&lt;br /&gt;  2. PersonNames (fields of this class are available in class Person)&lt;br /&gt;
     * @param className The name of a supported class, as listed above, to pull custom fields from. (required)
     * @return GetFieldsDataRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
     </table>
     */
    public GetFieldsDataRequestBuilder getFieldsData(String className) throws IllegalArgumentException {
        if (className == null) throw new IllegalArgumentException("\"className\" is required but got null");
            

        return new GetFieldsDataRequestBuilder(className);
    }
}
