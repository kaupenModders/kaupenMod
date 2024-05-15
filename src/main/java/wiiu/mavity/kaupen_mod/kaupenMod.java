package wiiu.mavity.kaupen_mod;

import net.fabricmc.api.ModInitializer;

import wiiu.mavity.kaupen_mod.items.kaupenModItems;
import wiiu.mavity.kaupen_mod.items.itemtags.kaupenModItemTags;
import wiiu.mavity.kaupen_mod.itemgroup.kaupenModItemGroups;
import wiiu.mavity.kaupen_mod.util.annotation.kaupenPog;

import org.slf4j.*;

//TODO: KaupenSticks, KaupenOres, KaupenTools, KaupenBlocks, KaupenAttire, KaupenDimensions, KaupenMobs, KaupenPlants, KaupenItems, & full usage of Mavity Lib.
//dibs on kaupenTools (epiccool)
// dibs on kaupenAttire (Mavity)
public class kaupenMod implements ModInitializer {

	public static final String MOD_ID = "kaupen_mod";

	public static final String NAME = "kaupenMod";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	@kaupenPog
	public void onInitialize() {

		// Initializing classes.
		kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main class.");
		kaupenModItemGroups.registerKaupenModItemGroups();
		kaupenModItemTags.registerKaupenModTags();
		kaupenModItems.registerKaupenModItems();
	}
}