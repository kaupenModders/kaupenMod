package wiiu.mavity.kaupen_mod;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import wiiu.mavity.kaupen_mod.config.KaupenConfig;
import wiiu.mavity.kaupen_mod.item.KaupenModItems;
import wiiu.mavity.kaupen_mod.item.itemtags.KaupenModItemTags;
import wiiu.mavity.kaupen_mod.itemgroup.KaupenModItemGroups;

import org.slf4j.*;

//TODO: KaupenSticks, KaupenOres, KaupenTools, etc...
public class KaupenMod implements ModInitializer {

	public static final String MOD_ID = "kaupen_mod";

	public static final String NAME = "kaupenMod";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {

		// Initializing classes.
		KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its main class.");
		KaupenModItems.registerKaupenModItems();
		KaupenModItemGroups.registerKaupenModItemGroups();
		KaupenModItemTags.registerKaupenModTags();

		// Config
		MidnightConfig.init(KaupenMod.MOD_ID, KaupenConfig.class);
	}
}