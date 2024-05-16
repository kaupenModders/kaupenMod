package poggerz.kaupenModders.kaupen_mod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import poggerz.kaupenModders.kaupen_mod.kaupenMod;

import static wiiu.mavity.mavity_lib.item.ItemRegistry.registerItem;

public class kaupenModItems {
    public static final Item KAUPEN_PICKAXE = registerItem("kaupen_mod", "kaupen_pickaxe", new PickaxeItem(kaupenModToolMaterial.KAUPEN, 2, 2f, new FabricItemSettings()));

    public static void registerKaupenModItems() {
        kaupenMod.LOGGER.info("Registering Mod Items for " + kaupenMod.MOD_ID);
    }

}
