package wiiu.mavity.kaupen_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wiiu.mavity.kaupen_mod.KaupenMod;

public class KaupenModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KaupenMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(KaupenMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(64)));
    }

    // Have blocks here.

    public static void registerKaupenModBlocks() {
        KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its' blocks.");
    }
}
