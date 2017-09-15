package com.strangegrotto.wunderjava.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableList.class)
public interface List {

    @JsonProperty("title") String getTitle();

    @JsonProperty("owner_id") String getOwnerId();

    @JsonProperty("owner_type") String getOwnerType();

    @JsonProperty("list_type") String getListType();

    @JsonProperty("public") boolean isPublic();
}
