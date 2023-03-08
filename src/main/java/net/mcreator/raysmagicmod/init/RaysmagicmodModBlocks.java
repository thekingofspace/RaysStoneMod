
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysmagicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.raysmagicmod.block.UraniumOreBlock;
import net.mcreator.raysmagicmod.RaysmagicmodMod;

public class RaysmagicmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RaysmagicmodMod.MODID);
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
}
