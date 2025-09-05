package io.smcode.stats.stats;

import org.checkerframework.common.value.qual.IntRange;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class PlayerStatsImpl implements PlayerStats {
    private final UUID owner;
    private int kills;
    private int deaths;

    PlayerStatsImpl(UUID owner, @IntRange(from = 0) int kills, @IntRange(from = 0) int deaths) {
        this.owner = requireNonNull(owner);
        this.kills = kills;
        this.deaths = deaths;
    }

    @Override
    public int kills() {
        return this.kills;
    }

    @Override
    public void incrementKills() {
        this.kills += 1;
    }

    @Override
    public int deaths() {
        return this.deaths;
    }

    @Override
    public void incrementDeaths() {
        this.deaths += 1;
    }

    @Override
    public UUID owner() {
        return this.owner;
    }

    static final class BuilderImpl implements Builder {
        private UUID owner;
        private int kills;
        private int deaths;

        BuilderImpl() {}

        @Override
        public Builder owner(UUID uuid) {
            this.owner = uuid;
            return this;
        }

        @Override
        public Builder kills(int kills) {
            this.kills = kills;
            return this;
        }

        @Override
        public Builder deaths(int deaths) {
            this.deaths = deaths;
            return this;
        }

        @Override
        public @NotNull PlayerStats build() {
            return new PlayerStatsImpl(owner, kills, deaths);
        }
    }
}
