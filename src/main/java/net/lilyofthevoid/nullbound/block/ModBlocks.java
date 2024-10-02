package net.lilyofthevoid.nullbound.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lilyofthevoid.nullbound.Nullbound;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.commons.lang3.ObjectUtils;

public class ModBlocks {



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Nullbound.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Nullbound.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        Nullbound.LOGGER.debug("Registering ModBlocks for " + Nullbound.MOD_ID);
    }
}
