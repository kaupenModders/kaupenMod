package wiiu.mavity.kaupen_mod;

import net.fabricmc.api.DedicatedServerModInitializer;

public class KaupenModServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its main server class.");
    }
}