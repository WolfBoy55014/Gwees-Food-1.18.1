package net.wolfboy.gweefood;

import net.fabricmc.api.ModInitializer;
import net.wolfboy.gweefood.block.GweeModBlocks;
import net.wolfboy.gweefood.block.entity.GweeModBlockEntities;
import net.wolfboy.gweefood.item.GweeModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GweeFood implements ModInitializer {
	public static final String MOD_ID = "gweefood";
	public static final String MOD_NAME = "Gwee's Baking";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GweeModItems.registerModItems();
		GweeModBlocks.registerModBlocks();
		GweeModBlockEntities.registerAllBlockEntities();

	}
}
