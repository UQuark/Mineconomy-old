package me.uquark.mineconomy.item;

import net.minecraft.item.ItemGroup;

public abstract class AbstractCoinItem extends AbstractItem {
    public final float value;

    public AbstractCoinItem(String name, float value) {
        super(name, new Settings().group(ItemGroup.MISC).maxCount(64));
        this.value = value;
    }
}
