package com.strangegrotto.wunderjava.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.joda.time.DateTime;

@Value.Immutable
@JsonSerialize(as = ImmutableTask.class)
@JsonDeserialize(as = ImmutableTask.class)
public interface Task extends WunderlistEntity {

    @JsonProperty("assignee_id") String getAssigneeId();

    @JsonProperty("assigner_id") String getAssignerId();

    @JsonProperty("due_date") DateTime getDueDate();

    @JsonProperty("list_id") String getListId();

    @JsonProperty("starred") boolean isStarred();

    @JsonProperty("title") String getTitle();

    @JsonProperty("type") String getType();

    @JsonProperty("completed") boolean isCompleted();

    @JsonProperty("recurrenceType")
    TaskRecurrenceType getRecurrenceType();

    @JsonProperty("recurrenceCount") int getRecurrenceCount();

}
