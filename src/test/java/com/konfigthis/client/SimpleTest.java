package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "http://http:";
        
        // Configure HTTP basic authorization: BasicAuth
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        
        // Configure OAuth2 access token for authorization: OauthSecurity
        configuration.accessToken = "YOUR ACCESS TOKEN";
        
        // Configure HTTP basic authorization: basic
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        
        configuration.basicAuth  = "YOUR API KEY";
        Ukg client = new Ukg(configuration);
        assertNotNull(client);
    }
}
