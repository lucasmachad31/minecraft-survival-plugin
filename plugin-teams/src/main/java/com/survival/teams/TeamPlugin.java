package com.survival.teams;

import org.bukkit.plugin.java.JavaPlugin;

public class TeamPlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("SurvivalTeams habilitado!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("SurvivalTeams desabilitado!");
    }
}
