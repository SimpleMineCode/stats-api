package io.smcode.stats;

import io.smcode.stats.api.StatsTrackable;

public interface StatsCollector {
    void submitStats(StatsTrackable<?, ?> trackable);
}
