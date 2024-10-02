package net.lilyofthevoid.nullbound.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lilyofthevoid.nullbound.Nullbound;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NULLBOUND = FabricItemGroupBuilder.build(new Identifier(Nullbound.MOD_ID, "nullbound"), () -> new ItemStack(ModItems.VOID_CHUNK));
}
