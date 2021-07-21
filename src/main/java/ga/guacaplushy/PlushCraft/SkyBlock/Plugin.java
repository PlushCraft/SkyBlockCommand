package ga.guacaplushy.PlushCraft.SkyBlock;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("islandmain")).setExecutor(new MainCMD());
    }
    @Override
    public void onDisable() {

    }
}
