package com.strangegrotto.wunderjava.impl.v1;

import com.strangegrotto.wunderjava.impl.ApiConstants;

public class ApiV1Constants implements ApiConstants {


    @Override
    public String getTasksEndpoint() {
        return "tasks";
    }

    @Override
    public String getListsEndpoint() {
        return "lists";
    }

    @Override
    public String getSubtasksEndpoint() {
        return "subtasks";
    }

    @Override
    public String getNotesEndpoint() {
        return "notes";
    }

    @Override
    public String getListPositionsEndpoint() {
        return "list_positions";
    }

    @Override
    public String getTaskPositionsEndpoint() {
        return "task_positions";
    }

    @Override
    public String getSubtaskPositionsEndpoint() {
        return "subtask_positions";
    }

    @Override
    public String getDateFormat() {
        return "yyyy-mm-dd";
    }

    @Override
    public String getDateTimeFormat() {
        return "yyyy-MM-ddTHH:mm:ssZ";
    }

    @Override
    public int getMaxTitleLength() {
        return 255;
    }
}
