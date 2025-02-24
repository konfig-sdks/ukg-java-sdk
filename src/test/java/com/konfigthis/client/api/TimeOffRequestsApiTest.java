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
import com.konfigthis.client.model.ResultDtoTimeOffRequestDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeOffRequestsApi
 */
@Disabled
public class TimeOffRequestsApiTest {

    private static TimeOffRequestsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimeOffRequestsApi(apiClient);
    }

    /**
     * Obtains all time off requests.
     *
     * Obtains all time off requests between the specified range.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        OffsetDateTime from = null;
        OffsetDateTime to = null;
        String empName = null;
        Long empId = null;
        ResultDtoTimeOffRequestDto response = api.getAll(from, to)
                .empName(empName)
                .empId(empId)
                .execute();
        // TODO: test validations
    }

}
