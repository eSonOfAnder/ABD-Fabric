package com.esonofander.abd.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

// Added to include the AXIS property to make the WallBlock compatible with the registerStrippableBlocks() method
public class AbdWallBlock extends WallBlock {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, UP, NORTH_WALL_SHAPE, EAST_WALL_SHAPE, WEST_WALL_SHAPE, SOUTH_WALL_SHAPE, WATERLOGGED);
    }

    public AbdWallBlock(AbstractBlock.Settings settings) {
        super(settings);

    }

}
