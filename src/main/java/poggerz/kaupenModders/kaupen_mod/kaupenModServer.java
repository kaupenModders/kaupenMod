package poggerz.kaupenModders.kaupen_mod;

import net.fabricmc.api.DedicatedServerModInitializer;

public class kaupenModServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main server class.");
    }
}