package net.wolfboy.gweefood.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.wolfboy.gweefood.screen.slot.GweeModResultSlot;

public class BakingTableScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public BakingTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(17));
    }
    public BakingTableScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(GweeModScreenHandlers.BAKING_TABLE_SCREEN_HANDLER, syncId);
        // Checks if Inventory is the Correct size
        checkSize(inventory,17);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);

        // Output slot
        this.addSlot(new GweeModResultSlot(inventory,16,123,34));

        // Crafting Slots (16) (4x4)
        this.addSlot(new Slot(inventory, 0,11,7));
        this.addSlot(new Slot(inventory, 1,29,7));
        this.addSlot(new Slot(inventory, 2,47,7));
        this.addSlot(new Slot(inventory, 3,65,7));
        this.addSlot(new Slot(inventory, 4,11,25));
        this.addSlot(new Slot(inventory, 5,29,25));
        this.addSlot(new Slot(inventory, 6,47,25));
        this.addSlot(new Slot(inventory, 7,65,25));
        this.addSlot(new Slot(inventory, 8,11,43));
        this.addSlot(new Slot(inventory, 9,29,43));
        this.addSlot(new Slot(inventory, 10,47,43));
        this.addSlot(new Slot(inventory, 11,65,43));
        this.addSlot(new Slot(inventory, 12,11,61));
        this.addSlot(new Slot(inventory, 13,29,61));
        this.addSlot(new Slot(inventory, 14,47,61));
        this.addSlot(new Slot(inventory, 15,65,61));

        // Calls Player Inventory and Hotbar to appear in GUI
        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }


    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 144));
        }
    }
}

