package io.github.lucaargolo.seasonsterraformerscompat;

import io.github.lucaargolo.seasons.FabricSeasons;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.Version;

public class FabricSeasonsTerraformersCompat implements ModInitializer {

    private static final String MOD_ID = "seasonsterraformerscompat";
    private static final String TRAVERSE_ID = "traverse";
    private static final String TERRESTRIA_ID = "terrestria";

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
            Version version = modContainer.getMetadata().getVersion();
            String mod = version.getFriendlyString();
            if(FabricLoader.getInstance().isModLoaded(TRAVERSE_ID)) {
                FabricSeasons.LOGGER.info("[" + FabricSeasons.MOD_NAME + "] Successfully loaded " + MOD_ID + " " + mod + " for " + TRAVERSE_ID);
            }
            if(FabricLoader.getInstance().isModLoaded(TERRESTRIA_ID)) {
                FabricSeasons.LOGGER.info("[" + FabricSeasons.MOD_NAME + "] Successfully loaded " + MOD_ID + " " + mod + " for " + TERRESTRIA_ID);
            }
        });

    }


}
