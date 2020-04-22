package me.uquark.mineconomy;

import me.uquark.mineconomy.item.Items;
import net.fabricmc.api.ModInitializer;

public class Mineconomy implements ModInitializer {
    public static final String modid = "mineconomy";

    @Override
    public void onInitialize() {
        Items.GALLEON_ITEM.register();
        Items.SICKLE_ITEM.register();
        Items.KNUT_ITEM.register();
    }
}
