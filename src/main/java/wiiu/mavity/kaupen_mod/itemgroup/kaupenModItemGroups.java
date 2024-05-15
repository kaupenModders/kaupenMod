package wiiu.mavity.kaupen_mod.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import wiiu.mavity.kaupen_mod.items.kaupenModItems;
import wiiu.mavity.kaupen_mod.kaupenMod;

public class kaupenModItemGroups {
    public static final ItemGroup ALL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(kaupenMod.MOD_ID, "all"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.kaupen_mod.all"))
                    .icon(() -> new ItemStack(Items.NETHER_STAR)).entries((displayContext, entries) -> {
                        entries.add(Items.NETHER_STAR);
                        entries.add(kaupenModItems.KAUPEN_PICKAXE);
                    }).build());

    public static void registerKaupenModItemGroups() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its' itemgroups.");
    }

}