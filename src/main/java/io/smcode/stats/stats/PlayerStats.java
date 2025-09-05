package io.smcode.stats.stats;

import io.smcode.stats.api.AbstractBuilder;

import java.util.UUID;

public interface PlayerStats extends Stats<UUID> {
    int kills();

    void incrementKills();

    int deaths();

    void incrementDeaths();

    static Builder playerStats() {
        return new PlayerStatsImpl.BuilderImpl();
    }

    interface Builder extends AbstractBuilder<PlayerStats> {
        Builder owner(UUID uuid);

        Builder kills(int kills);

        Builder deaths(int deaths);
    }
}
