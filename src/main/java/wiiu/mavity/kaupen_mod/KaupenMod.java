package wiiu.mavity.kaupen_mod;

import net.fabricmc.api.ModInitializer;

import wiiu.mavity.kaupen_mod.itemtags.KaupenModItemTags;
import wiiu.mavity.kaupen_mod.itemgroup.KaupenModItemGroups;

import org.slf4j.*;

//TODO: KaupenSticks, KaupenOres, KaupenTools, etc... & full usage of Mavity Lib.
public class KaupenMod implements ModInitializer {

	public static final String MOD_ID = "kaupen_mod";

	public static final String NAME = "kaupenMod";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {

		// Initializing classes.
		KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its main class.");
		KaupenModItemGroups.registerKaupenModItemGroups();
		KaupenModItemTags.registerKaupenModTags();
	}
}