package com.multimodule.core.audit;

public interface Auditable {
    BaseTime getBaseTime();

    void setBaseTime(final BaseTime baseTime);
}
