package net.wolfboy.gweefood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.wolfboy.gweefood.GweeFood;
import net.minecraft.util.registry.Registry;


public class GweeModItems {
    // Registers Items
    public static void registerModItems() {
        GweeFood.LOGGER.info("Baking Items for " + GweeFood.MOD_NAME);
    }

    // Strawberry donuts
    public static final Item DONUT_FROSTING_STRAWBERRY = registerItem("donut_frosting_strawberry",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));
    public static final Item DONUT_FROSTING_STRAWBERRY_SPRINKLES = registerItem("donut_frosting_strawberry_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));
    public static final Item DONUT_FROSTING_STRAWBERRY_DRIZZLE = registerItem("donut_frosting_strawberry_drizzle",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));
    public static final Item DONUT_FROSTING_STRAWBERRY_DRIZZLE_SPRINKLES = registerItem("donut_frosting_strawberry_drizzle_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));

    // Chocolate donuts
    public static final Item DONUT_FROSTING_CHOCOLATE = registerItem("donut_frosting_chocolate",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_CHOCOLATE)));
    public static final Item DONUT_FROSTING_CHOCOLATE_SPRINKLES = registerItem("donut_frosting_chocolate_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_CHOCOLATE)));
    public static final Item DONUT_FROSTING_CHOCOLATE_DRIZZLE = registerItem("donut_frosting_chocolate_drizzle",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_CHOCOLATE)));
    public static final Item DONUT_FROSTING_CHOCOLATE_DRIZZLE_SPRINKLES = registerItem("donut_frosting_chocolate_drizzle_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_CHOCOLATE)));

    // Lemon donuts
    public static final Item DONUT_FROSTING_LEMON = registerItem("donut_frosting_lemon",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));
    public static final Item DONUT_FROSTING_LEMON_SPRINKLES = registerItem("donut_frosting_lemon_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));
    public static final Item DONUT_FROSTING_LEMON_DRIZZLE = registerItem("donut_frosting_lemon_drizzle",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));
    public static final Item DONUT_FROSTING_LEMON_DRIZZLE_SPRINKLES = registerItem("donut_frosting_lemon_drizzle_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_FROSTING_STRAWBERRY)));

    // Glazed donut
    public static final Item DONUT_GLAZED = registerItem("donut_glazed",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_GLAZED)));
    public static final Item DONUT_GLAZED_FILLED = registerItem("donut_glazed_filled",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.DONUT_GLAZED)));

    // Bottles
    public static final Item BOTTLE_FROSTING_STRAWBERRY = registerItem("bottle_frosting_strawberry",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.SUGAR)));
    public static final Item BOTTLE_FROSTING_CHOCOLATE = registerItem("bottle_frosting_chocolate",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.SUGAR)));
    public static final Item BOTTLE_FROSTING_LEMON = registerItem("bottle_frosting_lemon",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.SUGAR)));
    public static final Item BOTTLE_SPRINKLES = registerItem("bottle_sprinkles",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.SUGAR)));
    public static final Item BOTTLE_GLAZE = registerItem("bottle_glaze",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.SUGAR)));
    public static final Item BOTTLE_HONEY_FILLING = registerItem("bottle_honey_filling",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.SUGAR)));
    //Fruit
    public static final Item LEMON = registerItem("lemon",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.FRUIT)));
    public static final Item LIME = registerItem("lime",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.FRUIT)));
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.FRUIT)));
    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(GweeItemGroup.BAKING).food(GweeFoodComponents.FRUIT)));



    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GweeFood.MOD_ID, name), item);
    }

}
