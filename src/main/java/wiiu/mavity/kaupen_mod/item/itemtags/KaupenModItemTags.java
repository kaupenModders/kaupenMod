package wiiu.mavity.kaupen_mod.item.itemtags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import wiiu.mavity.kaupen_mod.KaupenMod;

public class KaupenModItemTags {
    public static final TagKey<Item> kaupenStuff = TagKey.of(RegistryKeys.ITEM, new Identifier(KaupenMod.MOD_ID, "kaupen_stuff"));

    //LOGGER
    public static void registerKaupenModTags() {
        KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its' item tags.");
    }
}
