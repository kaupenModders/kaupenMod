package wiiu.mavity.kaupen_mod;

import net.fabricmc.api.ClientModInitializer;

public class KaupenModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KaupenMod.LOGGER.info(KaupenMod.NAME + " has registered its main client class.");
    }
}