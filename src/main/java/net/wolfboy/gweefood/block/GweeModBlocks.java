package net.wolfboy.gweefood.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wolfboy.gweefood.GweeFood;
import net.wolfboy.gweefood.item.GweeItemGroup;

public class GweeModBlocks {

    // Blocks
    public static final Block BAKING_TABLE = registerBlock("baking_table",
            new Block(FabricBlockSettings.of(Material.CAKE).luminance(100).strength(4f)), GweeItemGroup.BAKING);

    // Utilities
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(GweeFood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(GweeFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        GweeFood.LOGGER.info("Baking Blocks for " + GweeFood.MOD_NAME);
    }
}
