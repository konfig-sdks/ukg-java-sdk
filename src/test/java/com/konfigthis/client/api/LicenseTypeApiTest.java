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
import com.konfigthis.client.model.CodeObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LicenseTypeApi
 */
@Disabled
public class LicenseTypeApiTest {

    private static LicenseTypeApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LicenseTypeApi(apiClient);
    }

    /**
     * Create a new licenseType configuration
     *
     * &#39;Creates a new UKG Pro licenseType configuration.&#39; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConfigurationTest() throws ApiException {
        String description = null;
        String code = null;
        api.createConfiguration(description, code)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve all licenseType configurations
     *
     * &#39;The licenseType endpoint returns information about the UKG Pro licenseType configurations.&#39; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationsTest() throws ApiException {
        List<CodeObject> response = api.getConfigurations()
                .execute();
        // TODO: test validations
    }

    /**
     * Update a single licenseType configuration
     *
     * &#39;Allows the ability update a single licenseType configuration.&#39; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConfigurationTest() throws ApiException {
        String code = null;
        api.updateConfiguration(code)
                .execute();
        // TODO: test validations
    }

}
