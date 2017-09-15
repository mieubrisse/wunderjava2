package com.strangegrotto.wunderjava.impl;

public interface ApiConstants {

    String getTasksEndpoint();

    String getListsEndpoint();

    String getSubtasksEndpoint();

    String getNotesEndpoint();

    String getListPositionsEndpoint();

    String getTaskPositionsEndpoint();

    String getSubtaskPositionsEndpoint();

    String getDateFormat();

    String getDateTimeFormat();

    // Used for validating that task, list, and subtask titles aren't too long
    int getMaxTitleLength();
}
