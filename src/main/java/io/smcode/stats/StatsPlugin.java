package io.smcode.stats;

import io.smcode.stats.stats.PlayerStats;
import org.bukkit.plugin.java.JavaPlugin;

public class StatsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        PlayerStats.playerStats().build().increaseDeaths();
    }
}
