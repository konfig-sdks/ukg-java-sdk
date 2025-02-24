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
import com.konfigthis.client.model.DependentDeductions;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DependentDeductionsApi
 */
@Disabled
public class DependentDeductionsApiTest {

    private static DependentDeductionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DependentDeductionsApi(apiClient);
    }

    /**
     * Get Dependent Deductions
     *
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String companyId = null;
        String contactId = null;
        String deductionCode = null;
        String employeeId = null;
        OffsetDateTime effectiveDate = null;
        String currentCOID = null;
        Integer page = null;
        Integer perPage = null;
        List<DependentDeductions> response = api.get()
                .companyId(companyId)
                .contactId(contactId)
                .deductionCode(deductionCode)
                .employeeId(employeeId)
                .effectiveDate(effectiveDate)
                .currentCOID(currentCOID)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
