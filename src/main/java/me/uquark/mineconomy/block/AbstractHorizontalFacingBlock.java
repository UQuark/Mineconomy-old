package me.uquark.mineconomy.block;

import me.uquark.mineconomy.Mineconomy;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractHorizontalFacingBlock extends HorizontalFacingBlock {
    public final Identifier id;
    public final BlockItem item;

    protected AbstractHorizontalFacingBlock(String name, Settings blockSettings, Item.Settings itemSettings) {
        super(blockSettings);
        id = new Identifier(Mineconomy.modid, name);
        item = new BlockItem(this, itemSettings);
    }

    public void register() {
        Registry.register(Registry.BLOCK, id, this);
        Registry.register(Registry.ITEM, id, item);
    }
}
