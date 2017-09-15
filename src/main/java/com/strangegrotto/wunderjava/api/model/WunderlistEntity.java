package com.strangegrotto.wunderjava.api.model;

import org.joda.time.DateTime;

public interface WunderlistEntity extends WunderlistObject {
    String getCreationRequestId();
    DateTime getCreationTimestamp();
    String getCreatorId();
}
