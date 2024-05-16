package poggerz.kaupenModders.kaupen_mod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;

import poggerz.kaupenModders.kaupen_mod.block.blocktype.kaupenDiscordBlock;
import poggerz.kaupenModders.kaupen_mod.kaupenMod;

import wiiu.mavity.mavity_lib.block.BlockRegistry;

public class kaupenModBlocks {
    public static final Block kaupenDiscordBlock = BlockRegistry.registerBlock(kaupenMod.MOD_ID, "kaupen_discord_block",
            new kaupenDiscordBlock(FabricBlockSettings.create()));

    public static void registerKaupenModBlocks() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its items.");
    }
}