package io.smcode.stats.api;

import io.smcode.stats.stats.Stats;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface StatsTrackable<I, T extends Stats<I>> {
    List<T> stats();

    Map<I, T> getStatsMap();

    Optional<T> getStatsForOwner(I owner);
}
