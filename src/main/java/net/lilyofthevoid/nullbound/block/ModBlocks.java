package net.lilyofthevoid.nullbound.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lilyofthevoid.nullbound.Nullbound;
import net.lilyofthevoid.nullbound.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static final Block CRYSTAL_VOID_BLOCK = registerBlock("crystal_void_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(2f).requiresTool()), ModItemGroup.NULLBOUND);

    public static final Block SEEPING_IMMATERIAL = registerBlock("seeping_immaterial",
            new OreBlock(FabricBlockSettings.of(Material.STONE).hardness(50).strength(4f).luminance(6).requiresTool(),
                    UniformIntProvider.create(1, 3)), ModItemGroup.NULLBOUND);


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
