package me.uquark.mineconomy.gui;

import me.uquark.mineconomy.item.AbstractCoinItem;
import me.uquark.quarkcore.gui.AbstractHud;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;

public class BalanceHud extends AbstractHud {
    private final MinecraftClient client = MinecraftClient.getInstance();
    private float balance;

    public void updateBalance() {
        if (client.player != null)
            if (client.player.inventory != null) {
                balance = 0;
                for (int i=0; i <= 35; i++) {
                    ItemStack itemStack = client.player.inventory.getInvStack(i);
                    if (itemStack != null && itemStack.getItem() instanceof AbstractCoinItem)
                        balance += ((AbstractCoinItem) itemStack.getItem()).value * itemStack.getCount();
                }
            }
    }

    @Override
    public void render() {
        drawString(
            client.textRenderer,
            "Balance: " + balance,
            5,
            5,
            0xFFFFFF
        );
    }
}
