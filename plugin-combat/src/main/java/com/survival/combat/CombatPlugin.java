package com.survival.combat;

import org.bukkit.plugin.java.JavaPlugin;

public class CombatPlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("SurvivalCombat habilitado!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("SurvivalCombat desabilitado!");
    }
}
