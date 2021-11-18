package net.fordium.skyblockremake;

import org.bukkit.ChatColor;

public enum RarityEnum {
    COMMON(ChatColor.WHITE, Utils.color("&lCOMMON"), 1),
    UNCOMMON(ChatColor.GREEN, Utils.color("&lUNCOMMON"), 2),
    RARE(ChatColor.BLUE, Utils.color("&lRARE"), 3),
    EPIC(ChatColor.DARK_PURPLE, Utils.color("&lEPIC"), 4),
    LEGENDARY(ChatColor.GOLD, Utils.color("&lLEGENDARY"), 5),
    MYTHIC(ChatColor.LIGHT_PURPLE, Utils.color("&lMYTHIC"), 6),
    DIVINE(ChatColor.AQUA, Utils.color("&lDIVINE"), 7),
    SPECIAL(ChatColor.RED, Utils.color("&lSPECIAL"), 8),
    VERY_SPECIAL(ChatColor.RED, Utils.color("&lVERY SPECIAL"), 9);

    private final ChatColor color;
    private final String name;
    private final int index;

    RarityEnum(final ChatColor color, final String name, final int index) {
        this.color = color;
        this.name = name;
        this.index = index;
    }

    public ChatColor getRarityColor() {
        return color;
    }

    public String getRarityName() {
        return name;
    }

    public int getRarityIndex() {
        return index;
    }

    public static RarityEnum getRarityByIndex(int index) {
        RarityEnum rarity;
        switch (index) {
            case 2:
                rarity = RarityEnum.UNCOMMON;
                break;
            case 3:
                rarity = RarityEnum.RARE;
                break;
            case 4:
                rarity = RarityEnum.EPIC;
                break;
            case 5:
                rarity = RarityEnum.LEGENDARY;
                break;
            case 6:
                rarity = RarityEnum.MYTHIC;
                break;
            case 7:
                rarity = RarityEnum.DIVINE;
                break;
            case 8:
                rarity = RarityEnum.SPECIAL;
                break;
            case 9:
                rarity = RarityEnum.VERY_SPECIAL;
                break;
            default:
                rarity = RarityEnum.COMMON;
        }
        return rarity;
    }
}
