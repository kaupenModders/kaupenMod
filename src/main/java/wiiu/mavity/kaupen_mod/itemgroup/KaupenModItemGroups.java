package wiiu.mavity.kaupen_mod.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import wiiu.mavity.kaupen_mod.KaupenMod;

public class KaupenModItemGroups {
    public static final ItemGroup ALL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KaupenMod.MOD_ID, "all"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.kaupen_mod.all"))
                    .icon(() -> new ItemStack(Items.NETHER_STAR)).entries((displayContext, entries) -> {
                        entries.add(Items.NETHER_STAR);
                    }).build());

    public static void registerKaupenModItemGroups() {
        KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its' itemgroups.");
    }

}
