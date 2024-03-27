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
import com.konfigthis.client.model.PtoPlans;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetSpecificEmployeesPtoPlansApi
 */
@Disabled
public class GetSpecificEmployeesPtoPlansApiTest {

    private static GetSpecificEmployeesPtoPlansApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GetSpecificEmployeesPtoPlansApi(apiClient);
    }

    /**
     * Get a specific employees pto-plans
     *
     * Returns information about an UltiPro employees PTO Plans. Permissions - Ultipro service account must have \&quot;View\&quot; role for the \&quot;PTO Plan Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void infoTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        Double page = null;
        Double perPage = null;
        List<PtoPlans> response = api.info(companyId, employeeId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
