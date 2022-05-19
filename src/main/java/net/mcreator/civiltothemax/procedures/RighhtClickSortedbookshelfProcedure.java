package net.mcreator.civiltothemax.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RighhtClickSortedbookshelfProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
	}
}
