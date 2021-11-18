package net.fordium.skyblockremake.CraftingTable;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class CraftingInventory {

    public static Inventory getCraftingInventory(Player p) {
        Inventory inv = Bukkit.createInventory(p, 54, "Craft Item");

        for (int i = 0; i <= 53; i++) {
            if (!getCraftingSlots().contains(i)) {
                if (i == 24) {
                    inv.setItem(24, new ItemStack(Material.BARRIER));
                }
            }
        }

        return inv;

    }

    public static ItemStack getCraftedItem() {
        ItemStack item = new ItemStack(Material.BARRIER, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;

        return item;
    }

    public static List<Integer> getCraftingSlots() {
        List<Integer> craftingSlots = new ArrayList<>();

        craftingSlots.add(10);
        craftingSlots.add(11);
        craftingSlots.add(12);

        craftingSlots.add(19);
        craftingSlots.add(20);
        craftingSlots.add(21);

        craftingSlots.add(28);
        craftingSlots.add(29);
        craftingSlots.add(30);

        return craftingSlots;
    }

}
