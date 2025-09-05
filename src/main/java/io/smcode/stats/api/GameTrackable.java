package io.smcode.stats.api;

import io.smcode.stats.stats.PlayerStats;

import java.util.UUID;

public interface GameTrackable extends StatsTrackable<UUID, PlayerStats> {
}
