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
import com.konfigthis.client.model.EarningsHistoryBaseElements;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EarningsHistoryApi
 */
@Disabled
public class EarningsHistoryApiTest {

    private static EarningsHistoryApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EarningsHistoryApi(apiClient);
    }

    /**
     * Get Earnings History Base Elements
     *
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Payroll Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInsRateTest() throws ApiException {
        String companyID = null;
        String earningCode = null;
        String employeeID = null;
        String employeeNumber = null;
        OffsetDateTime payDate = null;
        String payGroup = null;
        String periodControl = null;
        String startPerControl = null;
        String endPerControl = null;
        Boolean includeInDeferredCompensation = null;
        Boolean includeInDeferredCompensationHours = null;
        Integer page = null;
        Integer perPage = null;
        List<EarningsHistoryBaseElements> response = api.getInsRate()
                .companyID(companyID)
                .earningCode(earningCode)
                .employeeID(employeeID)
                .employeeNumber(employeeNumber)
                .payDate(payDate)
                .payGroup(payGroup)
                .periodControl(periodControl)
                .startPerControl(startPerControl)
                .endPerControl(endPerControl)
                .includeInDeferredCompensation(includeInDeferredCompensation)
                .includeInDeferredCompensationHours(includeInDeferredCompensationHours)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
