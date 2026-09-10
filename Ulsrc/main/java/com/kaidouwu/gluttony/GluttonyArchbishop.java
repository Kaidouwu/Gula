package com.kaidouwu.gluttony;

import org.bukkit.plugin.java.JavaPlugin;

public class GluttonyArchbishop extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Gluttony Archbishop has awakened!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Gluttony Archbishop has been sealed.");
    }
}
