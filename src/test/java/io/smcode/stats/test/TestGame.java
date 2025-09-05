package io.smcode.stats.test;

import io.smcode.stats.StatsCollector;
import io.smcode.stats.api.GameTrackable;
import io.smcode.stats.stats.PlayerStats;
import org.bukkit.entity.Player;

import java.util.*;

public class TestGame implements GameTrackable {
    private final StatsCollector statsCollector;
    private final Map<UUID, PlayerStats> stats = new HashMap<>();

    public TestGame(StatsCollector statsCollector) {
        this.statsCollector = statsCollector;
    }

    public void join(Player player) {
        this.stats.put(player.getUniqueId(), PlayerStats.playerStats().build());
    }

    public void finish() {
        statsCollector.submitStats(this);
    }

    @Override
    public List<PlayerStats> stats() {
        return new ArrayList<>(this.stats.values());
    }

    @Override
    public Map<UUID, PlayerStats> getStatsMap() {
        return this.stats;
    }

    @Override
    public Optional<PlayerStats> getStatsForOwner(UUID owner) {
        return Optional.ofNullable(this.stats.get(owner));
    }
}
