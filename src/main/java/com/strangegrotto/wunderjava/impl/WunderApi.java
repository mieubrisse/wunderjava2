package com.strangegrotto.wunderjava.impl;

import com.strangegrotto.wunderjava.api.io.AccessTokenRequest;
import com.strangegrotto.wunderjava.api.io.AccessTokenResponse;
import com.strangegrotto.wunderjava.api.io.ImmutableAccessTokenRequest;
import com.strangegrotto.wunderjava.impl.v1.ApiV1Constants;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

/**
 * Encapsulates all information that could change with API version
 */
public class WunderApi {

    private static final String ACCESS_TOKEN_URL = "https://www.wunderlist.com/oauth/access_token";
    private static final String DEFAULT_API_URL = "https://a.wunderlist.com/api";
    private static final int DEFAULT_API_VERSION = 1;

    private final ApiConstants apiContants;
    private final Client client;

    public WunderApi() {
        this(DEFAULT_API_URL, DEFAULT_API_VERSION);
    }

    public WunderApi(String apiUrl, int apiVersion) {
        // TODO If the API endpoints ever change, tie that to API version
        switch (apiVersion) {
            case 1:
                apiContants = new ApiV1Constants();
                break;
            default:
                throw new IllegalArgumentException("Unrecognized API version: " + apiVersion);
        }

        this.client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
    }

    public void apiRequest() {

    }

    /**
     * Exchange a temporary code for an access token allowing access to a user's account
     * <p>
     * See <a href=https://developer.wunderlist.com/documentation/concepts/authorization>the Wunderlist auth docs</a> for more info
     */
    public String getAccessToken(String accessCode, String clientId, String clientSecret) {
        AccessTokenRequest request = ImmutableAccessTokenRequest.builder().accessCode(accessCode).clientId(clientId)
                .clientSecret(clientSecret).build();
        AccessTokenResponse response = client.target(ACCESS_TOKEN_URL)
                .request(MediaType.APPLICATION_JSON).post(Entity.json(request), AccessTokenResponse.class);
        return response.getAccessToken();
    }

}
