package net.wolfboy.gweefood.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wolfboy.gweefood.GweeFood;
import net.wolfboy.gweefood.block.GweeModBlocks;

public class GweeModBlockEntities {
    public static BlockEntityType<BakingTableBlockEntity> BAKING_TABLE;

    public static void registerAllBlockEntities() {
        BAKING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(GweeFood.MOD_ID, "baking_table"),
                FabricBlockEntityTypeBuilder.create(BakingTableBlockEntity::new,
                        GweeModBlocks.BAKING_TABLE).build(null));
    }
}
