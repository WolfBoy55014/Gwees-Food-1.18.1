package net.wolfboy.gweefood;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.wolfboy.gweefood.screen.BakingTableScreen;
import net.wolfboy.gweefood.screen.GweeModScreenHandlers;

public class GweeFoodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(GweeModScreenHandlers.BAKING_TABLE_SCREEN_HANDLER, BakingTableScreen::new);
    }
}
