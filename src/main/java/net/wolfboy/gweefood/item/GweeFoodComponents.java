package net.wolfboy.gweefood.item;

import net.minecraft.item.FoodComponent;

public class GweeFoodComponents {
    public static final FoodComponent DONUT_FROSTING_STRAWBERRY = new FoodComponent.Builder().hunger(7).saturationModifier(0.3f).alwaysEdible().build();
    public static final FoodComponent DONUT_FROSTING_CHOCOLATE = new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).alwaysEdible().build();
    public static final FoodComponent DONUT_GLAZED = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).alwaysEdible().build();
    public static final FoodComponent SUGAR = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent FRUIT = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).alwaysEdible().build();
}

