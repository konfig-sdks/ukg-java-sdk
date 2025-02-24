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
import com.konfigthis.client.model.EmployeeJobHistoryDetail;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeeJobHistoryDetailApi
 */
@Disabled
public class EmployeeJobHistoryDetailApiTest {

    private static EmployeeJobHistoryDetailApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeeJobHistoryDetailApi(apiClient);
    }

    /**
     * Get all employee job history details
     *
     * Get all employee job history details. If no pagination parameters specified, the default/max is applied. Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Job History Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        String isOrgChange = null;
        String isJobChange = null;
        String isRateChange = null;
        String isPromotion = null;
        String systemId = null;
        String jobEffectiveDate = null;
        String dateTimeCreated = null;
        Integer page = null;
        Integer perPage = null;
        EmployeeJobHistoryDetail response = api.get()
                .companyId(companyId)
                .employeeId(employeeId)
                .isOrgChange(isOrgChange)
                .isJobChange(isJobChange)
                .isRateChange(isRateChange)
                .isPromotion(isPromotion)
                .systemId(systemId)
                .jobEffectiveDate(jobEffectiveDate)
                .dateTimeCreated(dateTimeCreated)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single job history detail record
     *
     * Get a single job history detail record.  If no pagination parameters specified, the default/max is applied.  Permissions - UKG Pro service account must have \&quot;View\&quot; role for the \&quot;Employee Job History Details\&quot; Web Service. Headers - US-Customer-Api-Key, Authorization (base64 encoded {username}:{password}). Correct syntax when using date-time parameters are as follows:  &lt;ul&gt;  &lt;li&gt;less than (&#x3D;&lt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;&lt;01-01-1900&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;greater than (&#x3D;&gt;)    &lt;ul&gt;    &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;&gt;01-01-1900&lt;/li&gt;   &lt;/ul&gt;    &lt;/li&gt; &lt;li&gt;equal to (&#x3D;)    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;01-01-1900&lt;/li&gt;    &lt;/ul&gt;   &lt;/li&gt; &lt;li&gt;between (&#x3D;{minimum date,maximum date})    &lt;ul&gt;   &lt;li&gt;Example: /employee-job-history-details/systemID/[systemID]?dateTimeCreated&#x3D;{01-01-1900,01-01-1901}&lt;/li&gt;    &lt;/ul&gt;    &lt;/li&gt; &lt;/ul&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleRecordTest() throws ApiException {
        String systemId = null;
        String companyId = null;
        String employeeId = null;
        String isOrgChange = null;
        String isJobChange = null;
        String isRateChange = null;
        String isPromotion = null;
        String systemId2 = null;
        String jobEffectiveDate = null;
        String dateTimeCreated = null;
        Integer page = null;
        Integer perPage = null;
        EmployeeJobHistoryDetail response = api.getSingleRecord(systemId)
                .companyId(companyId)
                .employeeId(employeeId)
                .isOrgChange(isOrgChange)
                .isJobChange(isJobChange)
                .isRateChange(isRateChange)
                .isPromotion(isPromotion)
                .systemId2(systemId2)
                .jobEffectiveDate(jobEffectiveDate)
                .dateTimeCreated(dateTimeCreated)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
