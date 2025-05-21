package com.esonofander.abd.mixin.client;

import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.WallShape;
import net.minecraft.item.AxeItem;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Map;
import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    @Shadow @Final protected static Map<Block, Block> STRIPPED_BLOCKS;

    // Redundant casting was left in this code to match the vanilla codebase.
    @Overwrite
    private Optional<BlockState> getStrippedState(BlockState state) {
        if (state.getProperties().contains(Properties.NORTH_WALL_SHAPE)) {
            return Optional.ofNullable((Block)STRIPPED_BLOCKS.get(state.getBlock()))
                    .map(block -> block.getDefaultState().with(WallBlock.UP, (Boolean)state.get(WallBlock.UP))
                            .with(WallBlock.NORTH_WALL_SHAPE, (WallShape)state.get(WallBlock.NORTH_WALL_SHAPE))
                            .with(WallBlock.EAST_WALL_SHAPE, (WallShape)state.get(WallBlock.EAST_WALL_SHAPE))
                            .with(WallBlock.SOUTH_WALL_SHAPE, (WallShape)state.get(WallBlock.SOUTH_WALL_SHAPE))
                            .with(WallBlock.WEST_WALL_SHAPE, (WallShape)state.get(WallBlock.WEST_WALL_SHAPE))
                            .with(WallBlock.WATERLOGGED, (Boolean)state.get(WallBlock.WATERLOGGED)));
        }
        else if (state.getProperties().contains(Properties.SLAB_TYPE)) {
            return Optional.ofNullable((Block)STRIPPED_BLOCKS.get(state.getBlock()))
                    .map(block -> block.getDefaultState().with(SlabBlock.TYPE, (SlabType)state.get(SlabBlock.TYPE))
                            .with(SlabBlock.WATERLOGGED, (Boolean)state.get(SlabBlock.WATERLOGGED)));
        }
        else {
            return Optional.ofNullable((Block)STRIPPED_BLOCKS.get(state.getBlock()))
                    .map(block -> block.getDefaultState().with(PillarBlock.AXIS, (Direction.Axis)state.get(PillarBlock.AXIS)));
        }

    }
}
