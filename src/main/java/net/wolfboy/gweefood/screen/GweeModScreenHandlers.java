package net.wolfboy.gweefood.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.wolfboy.gweefood.GweeFood;


public class GweeModScreenHandlers {
    public static ScreenHandlerType<BakingTableScreenHandler> BAKING_TABLE_SCREEN_HANDLER;
    public static void registerAllScreenHandlers() {
        BAKING_TABLE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(GweeFood.MOD_ID,"baking_table"),
                        BakingTableScreenHandler::new);
    }
}

