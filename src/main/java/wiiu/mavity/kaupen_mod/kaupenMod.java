package wiiu.mavity.kaupen_mod;

import net.fabricmc.api.ModInitializer;

import wiiu.mavity.kaupen_mod.itemtags.kaupenModItemTags;
import wiiu.mavity.kaupen_mod.itemgroup.kaupenModItemGroups;

import org.slf4j.*;

//TODO: KaupenSticks, KaupenOres, KaupenTools, etc... & full usage of Mavity Lib.
public class kaupenMod implements ModInitializer {

	public static final String MOD_ID = "kaupen_mod";

	public static final String NAME = "kaupenMod";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {

		// Initializing classes.
		kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main class.");
		kaupenModItemGroups.registerKaupenModItemGroups();
		kaupenModItemTags.registerKaupenModTags();
	}
}