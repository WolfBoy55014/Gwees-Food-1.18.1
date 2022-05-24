package net.wolfboy.gweefood.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.wolfboy.gweefood.item.GweeModItems;
import net.wolfboy.gweefood.item.inventory.ImplementedInventory;
import net.wolfboy.gweefood.screen.BakingTableScreenHandler;
import org.jetbrains.annotations.Nullable;

public class BakingTableBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(17,ItemStack.EMPTY);
    public BakingTableBlockEntity(BlockPos pos, BlockState state) {
        super(GweeModBlockEntities.BAKING_TABLE, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Gwee's Baking Table");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new BakingTableScreenHandler(syncId, inv, this);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, BakingTableBlockEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(BakingTableBlockEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);
        entity.removeStack(2, 1);

        entity.setStack(17, new ItemStack(GweeModItems.DONUT_FROSTING_LEMON,
                entity.getStack(17).getCount() + 1));
    }

    private static boolean hasRecipe(BakingTableBlockEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == GweeModItems.LIME;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == GweeModItems.LEMON;
        boolean hasItemInThirdSlot = entity.getStack(2).getItem() == GweeModItems.STRAWBERRY;

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(BakingTableBlockEntity entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}

