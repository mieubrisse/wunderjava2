package com.strangegrotto.wunderjava.api.io;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAccessTokenRequest.class)
public interface AccessTokenRequest {

    @JsonProperty("client_id") String getClientId();

    @JsonProperty("client_secret") String getClientSecret();

    @JsonProperty("code") String getAccessCode();
}
