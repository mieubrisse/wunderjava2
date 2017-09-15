package com.strangegrotto.wunderjava.api.io;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAccessTokenResponse.class)
public interface AccessTokenResponse {

    @JsonProperty("access_token") String getAccessToken();
}
