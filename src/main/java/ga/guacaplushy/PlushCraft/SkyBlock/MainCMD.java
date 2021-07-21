package ga.guacaplushy.PlushCraft.SkyBlock;

import com.iridium.iridiumskyblock.api.IridiumSkyblockAPI;
import com.iridium.iridiumskyblock.database.Island;
import com.iridium.iridiumskyblock.database.User;
import com.iridium.iridiumskyblock.managers.IslandManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class MainCMD implements CommandExecutor {
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
        User player = IridiumSkyblockAPI.getInstance().getUser(Bukkit.getPlayer(args[0]));
        Optional<Island> island = player.getIsland();
        if (island.orElse(null) == null) {
            Bukkit.dispatchCommand(Bukkit.getPlayer(args[0]),  "is create " + args[0] + " jungle");
        } else {
            new IslandManager().teleportHome(Bukkit.getPlayer(args[0]), island.get(), 0);
        }

        return true;
    }
}
