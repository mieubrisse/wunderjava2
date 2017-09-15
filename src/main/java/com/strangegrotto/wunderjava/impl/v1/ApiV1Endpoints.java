package com.strangegrotto.wunderjava.impl.v1;

public enum ApiV1Endpoints {
    TASKS("tasks"),
    LISTS("lists"),
    NOTES("notes"),
    SUBTASKS("subtasks"),
    LIST_POSITIONS("list_positions"),
    TASK_POSITIONS("task_positions"),
    SUBTASK_POSITIONS("subtask_positions");

    private final String endpoint;

    ApiV1Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
