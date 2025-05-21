package com.esonofander.abd.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

// Added to include the AXIS property to make the SlabBlock compatible with the registerStrippableBlocks() method
public class AbdSlabBlock extends SlabBlock {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, TYPE, WATERLOGGED);
    }

    public AbdSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
    }
}
