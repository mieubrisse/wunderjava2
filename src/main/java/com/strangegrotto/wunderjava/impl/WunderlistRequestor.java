package com.strangegrotto.wunderjava.impl;

import com.strangegrotto.wunderjava.impl.v1.ApiV1Constants;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Encapsulates all information that could change with API version
 */
public class WunderlistRequestor {

    private static final String ACCESS_TOKEN_URL = "https://www.wunderlist.com/oauth/access_token";
    private static final String DEFAULT_API_URL = "https://a.wunderlist.com/api";
    private static final int DEFAULT_API_VERSION = 1;

    private final ApiConstants apiContants;
    private final Client client;

    public WunderlistRequestor() {
        this(DEFAULT_API_URL, DEFAULT_API_VERSION);
    }

    public WunderlistRequestor(String apiUrl, int apiVersion) {
        // TODO If the API endpoints ever change, tie that to API version
        switch(apiVersion) {
            case 1:
                apiContants = new ApiV1Constants();
                break;
            default:
                throw new IllegalArgumentException("Unrecognized API version: " + apiVersion);
        }

        this.client = ClientBuilder.newClient();
    }

    public void apiRequest() {

    }

    /**
     * Exchange a temporary code for an access token allowing access to a user's account
     *
     * See <a href=https://developer.wunderlist.com/documentation/concepts/authorization>the Wunderlist auth docs</a> for more info
     */
    public String getAccessToken(String accessCode, String clientId, String clientSecret) {
        return "";
        //ImmutableAccessTokenRequest.builder().
    }

}
