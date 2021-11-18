package net.fordium.skyblockremake;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public class Utils {

    public ItemStack getBlackNull() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("");

        return item;
    }

    public ItemStack getWhiteNull() {
        ItemStack item = new ItemStack(Material.WHITE_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("");

        return item;
    }

    public static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static void setRarity(ItemStack i, RarityEnum rarityEnum) {
        ItemMeta meta = i.getItemMeta();
        PersistentDataContainer container = meta.getPersistentDataContainer();

        NamespacedKey rarity = new NamespacedKey(Main.getPlugin(), "rarity");
        NamespacedKey rarityIndex = new NamespacedKey(Main.getPlugin(), "rarityIndex");

        container.set(rarity, PersistentDataType.STRING, rarityEnum.getRarityName());
        container.set(rarityIndex, PersistentDataType.INTEGER, rarityEnum.getRarityIndex());

        addRarityLore(i);
    }

    public static String getRarityName(ItemStack itemStack) {
        ItemMeta meta = itemStack.getItemMeta();
        PersistentDataContainer container = meta.getPersistentDataContainer();
        NamespacedKey rarity = new NamespacedKey(Main.getPlugin(), "rarity");
        return container.get(rarity, PersistentDataType.STRING);
    }

    public static int getRarityIndex(ItemStack itemStack) {
        ItemMeta meta = itemStack.getItemMeta();
        PersistentDataContainer container = meta.getPersistentDataContainer();
        NamespacedKey rarityIndex = new NamespacedKey(Main.getPlugin(), "rarityIndex");
        return container.get(rarityIndex, PersistentDataType.INTEGER);
    }

    public static void addRarityLore(ItemStack itemStack) {
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = meta.getLore();
        if (lore.size() >= 1) {
            lore.add("");
        }
        lore.add(getRarityColor(itemStack) + getRarityName(itemStack));
    }

    public static ChatColor getRarityColor(ItemStack i) {
        return getRarityEnum(i).getRarityColor();
    }

    public static RarityEnum getRarityEnum(ItemStack i) {
        RarityEnum rarity;
        int rarityIndex = getRarityIndex(i);
        rarity = RarityEnum.getRarityByIndex(rarityIndex);
        return rarity;
    }


}
