package wiiu.mavity.kaupen_mod;

import net.fabricmc.api.ClientModInitializer;

public class kaupenModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        kaupenMod.LOGGER.info(kaupenMod.NAME + " has registered its main client class.");
    }
}