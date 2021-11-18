package net.fordium.skyblockremake.CraftingTable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class CraftingEvent implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (Objects.requireNonNull(e.getClickedBlock()).getType().equals(Material.CRAFTING_TABLE)) {
                Player p = e.getPlayer();
                p.openInventory(CraftingInventory.getCraftingInventory(p));
            }
        }
    }

}
