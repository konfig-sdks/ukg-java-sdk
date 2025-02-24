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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for V2PlatformConfigurationCustomFieldsDataApi
 */
@Disabled
public class V2PlatformConfigurationCustomFieldsDataApiTest {

    private static V2PlatformConfigurationCustomFieldsDataApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new V2PlatformConfigurationCustomFieldsDataApi(apiClient);
    }

    /**
     * Platform Configuration Fields Data v2
     *
     * This API is similar to the v1 Platform Configuration Fields className API with added support of filtering data by KeyValue. The fields and keyValues are dependent on the class in question - expected key values are listed along with the supported classes below.&lt;br /&gt;   This API uses pre-defined Views in the UKG Pro database to retrieve the data whereas the v1 version of this API uses functions to retrieve the data.&lt;br /&gt;UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service.&lt;br /&gt;&lt;b&gt;Supported classes&lt;/b&gt;:&lt;br /&gt;  1. Address (takes value of an employee Id as keyValue)&lt;br /&gt;  2. Person (takes value of an employee Id as keyValue)&lt;br /&gt;  3. Employee (takes value of an employee Id as keyValue)&lt;br /&gt;  4. PhoneNumber (takes value of an employee Id as keyValue)&lt;br /&gt;  5. Employment (takes value of an employee Id and a company code as keyValue. Accepted format for keyValue &lt;b&gt;employeeId:companyCode&lt;/b&gt;)&lt;br /&gt;  6. Location (takes value of a location code as keyValue)&lt;br /&gt;  7. Job (takes value of a job code as keyValue)&lt;br /&gt;  8. OrgLevel1 (takes value of an org code as keyValue)&lt;br /&gt;  9. OrgLevel2 (takes value of an org code as keyValue)&lt;br /&gt;  10. OrgLevel3 (takes value of an org code as keyValue)&lt;br /&gt;  11. OrgLevel4 (takes value of an org code as keyValue)&lt;br /&gt;  12. InternationalEmployee (takes value of an employee Id and a country code as keyValue. Accepted format for keyValue &lt;b&gt;employeeId:countryCode&lt;/b&gt;)&lt;br /&gt;  13. Contacts (takes value of a SystemId as keyValue)&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Classes NOT supported&lt;/b&gt;:&lt;br /&gt;  1. ComponentCompany&lt;br /&gt;  2. PersonNames (fields of this class are available in class Person)&lt;br /&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFieldsDataTest() throws ApiException {
        String className = null;
        String fields = null;
        String keyValue = null;
        Integer page = null;
        Integer perPage = null;
        List<UltimateSoftwareFoundationServicesApiUltiProPersonnelPlatformConfigurationV2ModelsPcData> response = api.getFieldsData(className)
                .fields(fields)
                .keyValue(keyValue)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
