
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.civiltothemax.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.civiltothemax.item.AmItem;
import net.mcreator.civiltothemax.CivilToTheMaxMod;

public class CivilToTheMaxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CivilToTheMaxMod.MODID);
	public static final RegistryObject<Item> SORTEDBOOKSHELF = block(CivilToTheMaxModBlocks.SORTEDBOOKSHELF, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> AM = REGISTRY.register("am", () -> new AmItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
