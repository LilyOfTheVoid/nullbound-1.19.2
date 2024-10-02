package net.lilyofthevoid.nullbound.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lilyofthevoid.nullbound.Nullbound;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VOID_DUST = registerItem("void_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.NULLBOUND)));
    public static final Item VOID_CRYSTAL = registerItem("void_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.NULLBOUND)));
    public static final Item VOID_CHUNK = registerItem("void_chunk",
            new Item(new FabricItemSettings().group(ModItemGroup.NULLBOUND)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Nullbound.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Nullbound.LOGGER.info("Registering Mod Items for " + Nullbound.MOD_ID);
    }
}
