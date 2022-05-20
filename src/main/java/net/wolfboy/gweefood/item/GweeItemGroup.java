package net.wolfboy.gweefood.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.wolfboy.gweefood.GweeFood;

public class GweeItemGroup {
    public static final ItemGroup BAKING = FabricItemGroupBuilder.build(new Identifier(GweeFood.MOD_ID,"baking"),
            () -> new ItemStack(GweeModItems.DONUT_FROSTING_STRAWBERRY_SPRINKLES));
}
