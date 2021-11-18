package net.fordium.skyblockremake.CraftingTable;

import net.fordium.skyblockremake.RarityEnum;
import net.fordium.skyblockremake.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingTableItem {
    private ItemStack createCraftingTable() {
        ItemStack item = new ItemStack(Material.CRAFTING_TABLE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(Utils.color("&fCrafting Table"));
        Utils.setRarity(item, RarityEnum.COMMON);

        return item;
    }

    public ItemStack craftingTable = createCraftingTable();
}
