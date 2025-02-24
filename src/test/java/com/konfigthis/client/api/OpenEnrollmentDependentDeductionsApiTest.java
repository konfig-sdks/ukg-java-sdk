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
import com.konfigthis.client.model.OpenEnrollmentDependentDeductions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpenEnrollmentDependentDeductionsApi
 */
@Disabled
public class OpenEnrollmentDependentDeductionsApiTest {

    private static OpenEnrollmentDependentDeductionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OpenEnrollmentDependentDeductionsApi(apiClient);
    }

    /**
     * Get Open Enrollment Dependent Deductions Data
     *
     * If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Personnel Integration\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password})  &lt;ul&gt;&lt;li&gt;StartDateTime is a required parameter. &lt;/li&gt;&lt;li&gt;EndDateTime is a required parameter.&lt;/li&gt;  &lt;li&gt;SessionType is a required parameter. &lt;/li&gt;&lt;li&gt;DeductionCode is a required parameter that takes a list of deduction codes [ded1, ded2].&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataTest() throws ApiException {
        OffsetDateTime startDateTime = null;
        OffsetDateTime endDateTime = null;
        String sessionType = null;
        String deductionCode = null;
        Integer page = null;
        Integer perPage = null;
        List<OpenEnrollmentDependentDeductions> response = api.getData(startDateTime, endDateTime, sessionType, deductionCode)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
