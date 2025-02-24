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
import java.time.OffsetDateTime;
import com.konfigthis.client.model.PayRegister;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayRegisterApi
 */
@Disabled
public class PayRegisterApiTest {

    private static PayRegisterApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PayRegisterApi(apiClient);
    }

    /**
     * Get Pay Register
     *
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Payroll Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String employeeId = null;
        String companyId = null;
        String checkId = null;
        String employeeNumber = null;
        String documentNumber = null;
        String payGroup = null;
        String periodControl = null;
        OffsetDateTime payDate = null;
        String periodEndDate = null;
        String periodStartDate = null;
        Integer page = null;
        Integer perPage = null;
        List<PayRegister> response = api.get()
                .employeeId(employeeId)
                .companyId(companyId)
                .checkId(checkId)
                .employeeNumber(employeeNumber)
                .documentNumber(documentNumber)
                .payGroup(payGroup)
                .periodControl(periodControl)
                .payDate(payDate)
                .periodEndDate(periodEndDate)
                .periodStartDate(periodStartDate)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
