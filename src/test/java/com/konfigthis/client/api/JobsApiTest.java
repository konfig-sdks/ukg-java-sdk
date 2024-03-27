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
import com.konfigthis.client.model.Jobs;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Disabled
public class JobsApiTest {

    private static JobsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new JobsApi(apiClient);
    }

    /**
     * Retrieve all jobs configurations
     *
     * The jobs endpoint returns information about the UltiPro jobs configurations. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllConfigurationsTest() throws ApiException {
        String countryCode = null;
        Boolean isActive = null;
        List<Jobs> response = api.getAllConfigurations()
                .countryCode(countryCode)
                .isActive(isActive)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single job configuration
     *
     * The jobs endpoint returns information about the UltiPro jobs configuration. The unique identifier for a jobs configuration is the code property. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;Company Configuration Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationTest() throws ApiException {
        String code = null;
        Jobs response = api.getConfiguration(code)
                .execute();
        // TODO: test validations
    }

}
