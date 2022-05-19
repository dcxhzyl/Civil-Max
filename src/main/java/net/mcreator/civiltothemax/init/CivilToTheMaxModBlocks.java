
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.civiltothemax.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.civiltothemax.block.SortedbookshelfBlock;
import net.mcreator.civiltothemax.CivilToTheMaxMod;

public class CivilToTheMaxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CivilToTheMaxMod.MODID);
	public static final RegistryObject<Block> SORTEDBOOKSHELF = REGISTRY.register("sortedbookshelf", () -> new SortedbookshelfBlock());
}
