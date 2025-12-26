package com.survival.base;

import org.bukkit.plugin.java.JavaPlugin;

public class BasePlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("SurvivalBase habilitado!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("SurvivalBase desabilitado!");
    }
}
