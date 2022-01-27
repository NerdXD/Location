package com.nerdxd.plugin.loc;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Location Command is now acivated...");
        getCommand("loc").setExecutor(new LocationCommand());

    }


}
