package wiiu.mavity.kaupen_mod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import wiiu.mavity.kaupen_mod.KaupenMod;

public class KaupenModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KaupenMod.MOD_ID, name), item);
    }

    // Have items here.

    public static void registerKaupenModItems() {
        KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its' items.");
    }
}
