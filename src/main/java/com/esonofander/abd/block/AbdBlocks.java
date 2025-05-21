package com.esonofander.abd.block;

import com.esonofander.abd.Abd;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class AbdBlocks {
    private static Block register (String name, Function<AbstractBlock.Settings, Block> blockFactory,AbstractBlock.Settings settings) {

        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Abd.MOD_ID, name));
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Abd.MOD_ID, name));
        BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
        Registry.register(Registries.ITEM, itemKey, blockItem);

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(AbdBlocks.ACACIA_WOOD_WALL,AbdBlocks.STRIPPED_ACACIA_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.ACACIA_LOG_SLAB,AbdBlocks.STRIPPED_ACACIA_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.OAK_WOOD_WALL,AbdBlocks.STRIPPED_OAK_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.OAK_LOG_SLAB,AbdBlocks.STRIPPED_OAK_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.SPRUCE_WOOD_WALL,AbdBlocks.STRIPPED_SPRUCE_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.SPRUCE_LOG_SLAB,AbdBlocks.STRIPPED_SPRUCE_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.BIRCH_WOOD_WALL,AbdBlocks.STRIPPED_BIRCH_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.BIRCH_LOG_SLAB,AbdBlocks.STRIPPED_BIRCH_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.JUNGLE_WOOD_WALL,AbdBlocks.STRIPPED_JUNGLE_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.JUNGLE_LOG_SLAB,AbdBlocks.STRIPPED_JUNGLE_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.DARK_OAK_WOOD_WALL,AbdBlocks.STRIPPED_DARK_OAK_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.DARK_OAK_LOG_SLAB,AbdBlocks.STRIPPED_DARK_OAK_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.MANGROVE_WOOD_WALL,AbdBlocks.STRIPPED_MANGROVE_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.MANGROVE_LOG_SLAB,AbdBlocks.STRIPPED_MANGROVE_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.CHERRY_WOOD_WALL,AbdBlocks.STRIPPED_CHERRY_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.CHERRY_LOG_SLAB,AbdBlocks.STRIPPED_CHERRY_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.PALE_OAK_WOOD_WALL,AbdBlocks.STRIPPED_PALE_OAK_WOOD_WALL);
        StrippableBlockRegistry.register(AbdBlocks.PALE_OAK_LOG_SLAB,AbdBlocks.STRIPPED_PALE_OAK_LOG_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.BAMBOO_BLOCK_WALL,AbdBlocks.STRIPPED_BAMBOO_BLOCK_WALL);
        StrippableBlockRegistry.register(AbdBlocks.BAMBOO_BLOCK_SLAB,AbdBlocks.STRIPPED_BAMBOO_BLOCK_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.CRIMSON_HYPHAE_WALL,AbdBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);
        StrippableBlockRegistry.register(AbdBlocks.CRIMSON_STEM_SLAB,AbdBlocks.STRIPPED_CRIMSON_STEM_SLAB);
        StrippableBlockRegistry.register(AbdBlocks.WARPED_HYPHAE_WALL,AbdBlocks.STRIPPED_WARPED_HYPHAE_WALL);
        StrippableBlockRegistry.register(AbdBlocks.WARPED_STEM_SLAB,AbdBlocks.STRIPPED_WARPED_STEM_SLAB);
    }

    public static void initialize() {
        setupItemGroups();
        registerStrippableBlocks();
    }

    public static void setupItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.add(AbdBlocks.OAK_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_OAK_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.OAK_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_OAK_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.SPRUCE_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_SPRUCE_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.SPRUCE_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_SPRUCE_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.BIRCH_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_BIRCH_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BIRCH_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_BIRCH_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.JUNGLE_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_JUNGLE_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.JUNGLE_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_JUNGLE_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.ACACIA_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_ACACIA_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.ACACIA_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_ACACIA_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.DARK_OAK_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_DARK_OAK_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.DARK_OAK_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_DARK_OAK_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.MANGROVE_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_MANGROVE_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.MANGROVE_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_MANGROVE_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.CHERRY_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_CHERRY_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.CHERRY_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_CHERRY_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.PALE_OAK_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_PALE_OAK_LOG_SLAB.asItem());
                    itemGroup.add(AbdBlocks.PALE_OAK_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_PALE_OAK_WOOD_WALL.asItem());
                    itemGroup.add(AbdBlocks.BAMBOO_BLOCK_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BAMBOO_BLOCK_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_BAMBOO_BLOCK_WALL.asItem());
                    itemGroup.add(AbdBlocks.CRIMSON_STEM_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_CRIMSON_STEM_SLAB.asItem());
                    itemGroup.add(AbdBlocks.CRIMSON_HYPHAE_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.asItem());
                    itemGroup.add(AbdBlocks.WARPED_STEM_SLAB.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_WARPED_STEM_SLAB.asItem());
                    itemGroup.add(AbdBlocks.WARPED_HYPHAE_WALL.asItem());
                    itemGroup.add(AbdBlocks.STRIPPED_WARPED_HYPHAE_WALL.asItem());
                    itemGroup.add(AbdBlocks.STONE_WALL.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_STONE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_STONE_WALL.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_GRANITE_WALL.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_DIORITE_WALL.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_ANDESITE_WALL.asItem());
                    itemGroup.add(AbdBlocks.CALCITE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.CALCITE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.CALCITE_WALL.asItem());
                    itemGroup.add(AbdBlocks.DEEPSLATE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.DEEPSLATE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.DEEPSLATE_WALL.asItem());
                    itemGroup.add(AbdBlocks.DRIPSTONE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.DRIPSTONE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.DRIPSTONE_WALL.asItem());
                    itemGroup.add(AbdBlocks.BRICK_FENCE.asItem());
                    itemGroup.add(AbdBlocks.BRICK_FENCE_GATE.asItem());
                    itemGroup.add(AbdBlocks.PACKED_MUD_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.PACKED_MUD_SLAB.asItem());
                    itemGroup.add(AbdBlocks.PACKED_MUD_WALL.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_SANDSTONE_WALL.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_RED_SANDSTONE_WALL.asItem());
                    itemGroup.add(AbdBlocks.PRISMARINE_BRICK_WALL.asItem());
                    itemGroup.add(AbdBlocks.DARK_PRISMARINE_WALL.asItem());
                    itemGroup.add(AbdBlocks.OBSIDIAN_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.OBSIDIAN_SLAB.asItem());
                    itemGroup.add(AbdBlocks.OBSIDIAN_WALL.asItem());
                    itemGroup.add(AbdBlocks.CRYING_OBSIDIAN_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.CRYING_OBSIDIAN_SLAB.asItem());
                    itemGroup.add(AbdBlocks.CRYING_OBSIDIAN_WALL.asItem());
                    itemGroup.add(AbdBlocks.NETHER_BRICK_WALL.asItem());
                    itemGroup.add(AbdBlocks.BASALT_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BASALT_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BASALT_WALL.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_BASALT_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_BASALT_SLAB.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_BASALT_WALL.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_BASALT_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_BASALT_SLAB.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_BASALT_WALL.asItem());
                    itemGroup.add(AbdBlocks.END_STONE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.END_STONE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.END_STONE_WALL.asItem());
                    itemGroup.add(AbdBlocks.PURPUR_WALL.asItem());
                    itemGroup.add(AbdBlocks.QUARTZ_WALL.asItem());
                    itemGroup.add(AbdBlocks.QUARTZ_BRICK_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.QUARTZ_BRICK_SLAB.asItem());
                    itemGroup.add(AbdBlocks.QUARTZ_BRICK_WALL.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_QUARTZ_WALL.asItem());
                    itemGroup.add(AbdBlocks.NETHER_BRICK_FENCE_GATE.asItem());
                    itemGroup.add(AbdBlocks.TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.WHITE_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.WHITE_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.WHITE_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_GRAY_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.GRAY_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.GRAY_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.GRAY_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.BLACK_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BLACK_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BLACK_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.BROWN_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BROWN_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BROWN_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.RED_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.RED_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.RED_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.ORANGE_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.ORANGE_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.ORANGE_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.YELLOW_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.YELLOW_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.YELLOW_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.LIME_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.LIME_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.LIME_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.GREEN_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.GREEN_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.GREEN_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.CYAN_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.CYAN_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.CYAN_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_BLUE_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.BLUE_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BLUE_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BLUE_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.PURPLE_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.PURPLE_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.PURPLE_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.MAGENTA_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.MAGENTA_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.PINK_TERRACOTTA_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.PINK_TERRACOTTA_SLAB.asItem());
                    itemGroup.add(AbdBlocks.PINK_TERRACOTTA_WALL.asItem());
                    itemGroup.add(AbdBlocks.WHITE_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.WHITE_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.WHITE_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_GRAY_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_GRAY_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_GRAY_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.GRAY_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.GRAY_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.GRAY_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.BLACK_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BLACK_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BLACK_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.BROWN_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BROWN_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BROWN_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.RED_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.RED_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.RED_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.ORANGE_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.ORANGE_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.ORANGE_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.YELLOW_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.YELLOW_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.YELLOW_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.LIME_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.LIME_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.LIME_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.GREEN_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.GREEN_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.GREEN_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.CYAN_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.CYAN_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.CYAN_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_BLUE_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.LIGHT_BLUE_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.BLUE_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.BLUE_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.BLUE_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.PURPLE_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.PURPLE_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.PURPLE_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.MAGENTA_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.MAGENTA_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.MAGENTA_CONCRETE_WALL.asItem());
                    itemGroup.add(AbdBlocks.PINK_CONCRETE_STAIRS.asItem());
                    itemGroup.add(AbdBlocks.PINK_CONCRETE_SLAB.asItem());
                    itemGroup.add(AbdBlocks.PINK_CONCRETE_WALL.asItem());
                });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE)
                .register((itemGroup) -> {
                    itemGroup.add(AbdBlocks.POLISHED_GRANITE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_GRANITE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_DIORITE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_DIORITE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_ANDESITE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_DEEPSLATE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_SANDSTONE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_RED_SANDSTONE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_BASALT_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.POLISHED_BASALT_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.END_STONE_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.END_STONE_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.PURPUR_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.PURPUR_BUTTON.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE.asItem());
                    itemGroup.add(AbdBlocks.SMOOTH_QUARTZ_BUTTON.asItem());
                });
    }

    public static final Block OAK_LOG_SLAB = register(
            "oak_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_OAK_LOG_SLAB = register(
            "stripped_oak_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block OAK_WOOD_WALL = register(
            "oak_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_OAK_WOOD_WALL = register(
            "stripped_oak_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block SPRUCE_LOG_SLAB = register(
            "spruce_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_SPRUCE_LOG_SLAB = register(
            "stripped_spruce_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block SPRUCE_WOOD_WALL = register(
            "spruce_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_SPRUCE_WOOD_WALL = register(
            "stripped_spruce_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block BIRCH_LOG_SLAB = register(
            "birch_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_BIRCH_LOG_SLAB = register(
            "stripped_birch_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block BIRCH_WOOD_WALL = register(
            "birch_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_BIRCH_WOOD_WALL = register(
            "stripped_birch_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block JUNGLE_LOG_SLAB = register(
            "jungle_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_JUNGLE_LOG_SLAB = register(
            "stripped_jungle_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block JUNGLE_WOOD_WALL = register(
            "jungle_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_JUNGLE_WOOD_WALL = register(
            "stripped_jungle_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block ACACIA_LOG_SLAB = register(
            "acacia_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_ACACIA_LOG_SLAB = register(
            "stripped_acacia_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block ACACIA_WOOD_WALL = register(
            "acacia_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_ACACIA_WOOD_WALL = register(
            "stripped_acacia_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );
    
    public static final Block DARK_OAK_LOG_SLAB = register(
            "dark_oak_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_DARK_OAK_LOG_SLAB = register(
            "stripped_dark_oak_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block DARK_OAK_WOOD_WALL = register(
            "dark_oak_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_DARK_OAK_WOOD_WALL = register(
            "stripped_dark_oak_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block MANGROVE_LOG_SLAB = register(
            "mangrove_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_MANGROVE_LOG_SLAB = register(
            "stripped_mangrove_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block MANGROVE_WOOD_WALL = register(
            "mangrove_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_MANGROVE_WOOD_WALL = register(
            "stripped_mangrove_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block CHERRY_LOG_SLAB = register(
            "cherry_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_CHERRY_LOG_SLAB = register(
            "stripped_cherry_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block CHERRY_WOOD_WALL = register(
            "cherry_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_CHERRY_WOOD_WALL = register(
            "stripped_cherry_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block PALE_OAK_LOG_SLAB = register(
            "pale_oak_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_PALE_OAK_LOG_SLAB = register(
            "stripped_pale_oak_log_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block PALE_OAK_WOOD_WALL = register(
            "pale_oak_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_PALE_OAK_WOOD_WALL = register(
            "stripped_pale_oak_wood_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block BAMBOO_BLOCK_SLAB = register(
            "bamboo_block_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block BAMBOO_BLOCK_WALL = register(
            "bamboo_block_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_BAMBOO_BLOCK_SLAB = register(
            "stripped_bamboo_block_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_BAMBOO_BLOCK_WALL = register(
            "stripped_bamboo_block_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block CRIMSON_STEM_SLAB = register(
            "crimson_stem_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_CRIMSON_STEM_SLAB = register(
            "stripped_crimson_stem_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block CRIMSON_HYPHAE_WALL = register(
            "crimson_hyphae_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_CRIMSON_HYPHAE_WALL = register(
            "stripped_crimson_hyphae_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block WARPED_STEM_SLAB = register(
            "warped_stem_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_WARPED_STEM_SLAB = register(
            "stripped_warped_stem_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block WARPED_HYPHAE_WALL = register(
            "warped_hyphae_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    public static final Block STRIPPED_WARPED_HYPHAE_WALL = register(
            "stripped_warped_hyphae_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()
                    .hardness(2.0f)
    );

    // ESA: This might change in the future if stairs ever implement a proper constructor
    public static final Block END_STONE_STAIRS = register(
            "end_stone_stairs",
            settings -> new StairsBlock(Blocks.END_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.END_STONE)
    );

    public static final Block END_STONE_BUTTON = register(
            "end_stone_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block END_STONE_PRESSURE_PLATE = register(
            "end_stone_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.PALE_YELLOW)
    );

    public static final Block PACKED_MUD_STAIRS = register(
            "packed_mud_stairs",
            settings -> new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.PACKED_MUD)
    );

    public static final Block SMOOTH_STONE_STAIRS = register(
            "smooth_stone_stairs",
            settings -> new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)
    );

    public static final Block CALCITE_STAIRS = register(
            "calcite_stairs",
            settings -> new StairsBlock(Blocks.CALCITE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.CALCITE)
    );

    public static final Block DEEPSLATE_STAIRS = register(
            "deepslate_stairs",
            settings -> new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
    );

    public static final Block DRIPSTONE_STAIRS = register(
            "dripstone_stairs",
            settings -> new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
    );

    public static final Block OBSIDIAN_STAIRS = register(
            "obsidian_stairs",
            settings -> new StairsBlock(Blocks.OBSIDIAN.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN)
    );

    public static final Block CRYING_OBSIDIAN_STAIRS = register(
            "crying_obsidian_stairs",
            settings -> new StairsBlock(Blocks.CRYING_OBSIDIAN.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)
    );

    public static final Block BASALT_STAIRS = register(
            "basalt_stairs",
            settings -> new StairsBlock(Blocks.BASALT.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BASALT)
    );

    public static final Block SMOOTH_BASALT_STAIRS = register(
            "smooth_basalt_stairs",
            settings -> new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)
    );

    public static final Block POLISHED_BASALT_STAIRS = register(
            "polished_basalt_stairs",
            settings -> new StairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)
    );

    public static final Block QUARTZ_BRICK_STAIRS = register(
            "quartz_brick_stairs",
            settings -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)
    );

    public static final Block CALCITE_SLAB = register(
            "calcite_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CALCITE)
    );

    public static final Block DEEPSLATE_SLAB = register(
            "deepslate_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
    );

    public static final Block DRIPSTONE_SLAB = register(
            "dripstone_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
    );

    public static final Block PACKED_MUD_SLAB = register(
            "packed_mud_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PACKED_MUD)
    );

    public static final Block OBSIDIAN_SLAB = register(
            "obsidian_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN)
    );

    public static final Block CRYING_OBSIDIAN_SLAB = register(
            "crying_obsidian_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)
    );

    public static final Block BASALT_SLAB = register(
            "basalt_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BASALT)
    );

    public static final Block SMOOTH_BASALT_SLAB = register(
            "smooth_basalt_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)
    );

    public static final Block POLISHED_BASALT_SLAB = register(
            "polished_basalt_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)
    );

    public static final Block END_STONE_SLAB = register(
            "end_stone_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.END_STONE)
    );

    public static final Block QUARTZ_BRICK_SLAB = register(
            "quartz_brick_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)
    );

    public static final Block STONE_WALL = register(
            "stone_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.STONE)
    );

    public static final Block SMOOTH_STONE_WALL = register(
            "smooth_stone_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)
    );

    public static final Block POLISHED_GRANITE_WALL = register(
            "polished_granite_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)
    );

    public static final Block POLISHED_DIORITE_WALL = register(
            "polished_diorite_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)
    );

    public static final Block POLISHED_ANDESITE_WALL = register(
            "polished_andesite_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)
    );

    public static final Block CALCITE_WALL = register(
            "calcite_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.CALCITE)
    );

    public static final Block DEEPSLATE_WALL = register(
            "deepslate_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE)
    );

    public static final Block DRIPSTONE_WALL = register(
            "dripstone_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)
    );

    public static final Block PACKED_MUD_WALL = register(
            "packed_mud_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PACKED_MUD)
    );

    public static final Block SMOOTH_SANDSTONE_WALL = register(
            "smooth_sandstone_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)
    );

    public static final Block SMOOTH_RED_SANDSTONE_WALL = register(
            "smooth_red_sandstone_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)
    );

    public static final Block PRISMARINE_BRICK_WALL = register(
            "prismarine_brick_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)
    );

    public static final Block DARK_PRISMARINE_WALL = register(
            "dark_prismarine_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)
    );

    public static final Block OBSIDIAN_WALL = register(
            "obsidian_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.OBSIDIAN)
    );

    public static final Block CRYING_OBSIDIAN_WALL = register(
            "crying_obsidian_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)
    );

    public static final Block NETHER_BRICK_WALL = register(
            "nether_brick_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)
    );

    public static final Block BASALT_WALL = register(
            "basalt_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BASALT)
    );

    public static final Block SMOOTH_BASALT_WALL = register(
            "smooth_basalt_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)
    );

    public static final Block POLISHED_BASALT_WALL = register(
            "polished_basalt_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)
    );

    public static final Block END_STONE_WALL = register(
            "end_stone_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.END_STONE)
    );

    public static final Block PURPUR_WALL = register(
            "purpur_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)
    );

    public static final Block QUARTZ_WALL = register(
            "quartz_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)
    );

    public static final Block QUARTZ_BRICK_WALL = register(
            "quartz_brick_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)
    );

    public static final Block SMOOTH_QUARTZ_WALL = register(
            "smooth_quartz_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)
    );

    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = register(
            "polished_granite_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block POLISHED_GRANITE_BUTTON = register(
            "polished_granite_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = register(
            "polished_diorite_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block POLISHED_DIORITE_BUTTON = register(
            "polished_diorite_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = register(
            "polished_andesite_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block POLISHED_ANDESITE_BUTTON = register(
            "polished_andesite_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = register(
            "polished_deepslate_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block POLISHED_DEEPSLATE_BUTTON = register(
            "polished_deepslate_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block SMOOTH_SANDSTONE_PRESSURE_PLATE = register(
            "smooth_sandstone_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block SMOOTH_SANDSTONE_BUTTON = register(
            "smooth_sandstone_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = register(
            "smooth_red_sandstone_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block SMOOTH_RED_SANDSTONE_BUTTON = register(
            "smooth_red_sandstone_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block POLISHED_BASALT_PRESSURE_PLATE = register(
            "polished_basalt_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block POLISHED_BASALT_BUTTON = register(
            "polished_basalt_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block PURPUR_PRESSURE_PLATE = register(
            "purpur_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block PURPUR_BUTTON = register(
            "purpur_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    public static final Block SMOOTH_QUARTZ_PRESSURE_PLATE = register(
            "smooth_quartz_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.STONE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollision()
                    .strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    public static final Block SMOOTH_QUARTZ_BUTTON = register(
            "smooth_quartz_button",
            settings -> new ButtonBlock(BlockSetType.STONE, 20, settings),
            Blocks.createButtonSettings()
    );

    // BlockSoundGroup is ignored, appears to be pulling in the WoodType sound group, probably due to
    // the WoodType requirement in the constructor
    public static final Block NETHER_BRICK_FENCE_GATE = register(
            "nether_brick_fence_gate",
            settings -> new FenceGateBlock(WoodType.SPRUCE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_RED)
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
    );

    public static final Block TERRACOTTA_STAIRS = register(
            "terracotta_stairs",
            settings -> new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.TERRACOTTA)
    );

    public static final Block TERRACOTTA_SLAB = register(
            "terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.TERRACOTTA)
    );

    public static final Block TERRACOTTA_WALL = register(
            "terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.TERRACOTTA)
    );

    public static final Block WHITE_TERRACOTTA_STAIRS = register(
            "white_terracotta_stairs",
            settings -> new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)
    );

    public static final Block WHITE_TERRACOTTA_SLAB = register(
            "white_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)
    );

    public static final Block WHITE_TERRACOTTA_WALL = register(
            "white_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register(
            "light_gray_terracotta_stairs",
            settings -> new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register(
            "light_gray_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)
    );

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = register(
            "light_gray_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)
    );

    public static final Block GRAY_TERRACOTTA_STAIRS = register(
            "gray_terracotta_stairs",
            settings -> new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)
    );

    public static final Block GRAY_TERRACOTTA_SLAB = register(
            "gray_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)
    );

    public static final Block GRAY_TERRACOTTA_WALL = register(
            "gray_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)
    );

    public static final Block BLACK_TERRACOTTA_STAIRS = register(
            "black_terracotta_stairs",
            settings -> new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)
    );

    public static final Block BLACK_TERRACOTTA_SLAB = register(
            "black_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)
    );

    public static final Block BLACK_TERRACOTTA_WALL = register(
            "black_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)
    );

    public static final Block BROWN_TERRACOTTA_STAIRS = register(
            "brown_terracotta_stairs",
            settings -> new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)
    );

    public static final Block BROWN_TERRACOTTA_SLAB = register(
            "brown_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)
    );

    public static final Block BROWN_TERRACOTTA_WALL = register(
            "brown_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)
    );

    public static final Block RED_TERRACOTTA_STAIRS = register(
            "red_terracotta_stairs",
            settings -> new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)
    );

    public static final Block RED_TERRACOTTA_SLAB = register(
            "red_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)
    );

    public static final Block RED_TERRACOTTA_WALL = register(
            "red_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)
    );

    public static final Block ORANGE_TERRACOTTA_STAIRS = register(
            "orange_terracotta_stairs",
            settings -> new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)
    );

    public static final Block ORANGE_TERRACOTTA_SLAB = register(
            "orange_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)
    );

    public static final Block ORANGE_TERRACOTTA_WALL = register(
            "orange_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)
    );

    public static final Block YELLOW_TERRACOTTA_STAIRS = register(
            "yellow_terracotta_stairs",
            settings -> new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)
    );

    public static final Block YELLOW_TERRACOTTA_SLAB = register(
            "yellow_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)
    );

    public static final Block YELLOW_TERRACOTTA_WALL = register(
            "yellow_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)
    );

    public static final Block LIME_TERRACOTTA_STAIRS = register(
            "lime_terracotta_stairs",
            settings -> new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)
    );

    public static final Block LIME_TERRACOTTA_SLAB = register(
            "lime_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)
    );

    public static final Block LIME_TERRACOTTA_WALL = register(
            "lime_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)
    );

    public static final Block GREEN_TERRACOTTA_STAIRS = register(
            "green_terracotta_stairs",
            settings -> new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)
    );

    public static final Block GREEN_TERRACOTTA_SLAB = register(
            "green_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)
    );

    public static final Block GREEN_TERRACOTTA_WALL = register(
            "green_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)
    );

    public static final Block CYAN_TERRACOTTA_STAIRS = register(
            "cyan_terracotta_stairs",
            settings -> new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)
    );

    public static final Block CYAN_TERRACOTTA_SLAB = register(
            "cyan_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)
    );

    public static final Block CYAN_TERRACOTTA_WALL = register(
            "cyan_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register(
            "light_blue_terracotta_stairs",
            settings -> new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register(
            "light_blue_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
    );

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = register(
            "light_blue_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
    );

    public static final Block BLUE_TERRACOTTA_STAIRS = register(
            "blue_terracotta_stairs",
            settings -> new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)
    );

    public static final Block BLUE_TERRACOTTA_SLAB = register(
            "blue_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)
    );

    public static final Block BLUE_TERRACOTTA_WALL = register(
            "blue_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)
    );

    public static final Block PURPLE_TERRACOTTA_STAIRS = register(
            "purple_terracotta_stairs",
            settings -> new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)
    );

    public static final Block PURPLE_TERRACOTTA_SLAB = register(
            "purple_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)
    );

    public static final Block PURPLE_TERRACOTTA_WALL = register(
            "purple_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)
    );

    public static final Block MAGENTA_TERRACOTTA_STAIRS = register(
            "magenta_terracotta_stairs",
            settings -> new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)
    );

    public static final Block MAGENTA_TERRACOTTA_SLAB = register(
            "magenta_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)
    );

    public static final Block MAGENTA_TERRACOTTA_WALL = register(
            "magenta_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)
    );

    public static final Block PINK_TERRACOTTA_STAIRS = register(
            "pink_terracotta_stairs",
            settings -> new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)
    );

    public static final Block PINK_TERRACOTTA_SLAB = register(
            "pink_terracotta_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)
    );

    public static final Block PINK_TERRACOTTA_WALL = register(
            "pink_terracotta_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)
    );

    public static final Block WHITE_CONCRETE_STAIRS = register(
            "white_concrete_stairs",
            settings -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
    );

    public static final Block WHITE_CONCRETE_SLAB = register(
            "white_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
    );

    public static final Block WHITE_CONCRETE_WALL = register(
            "white_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
    );

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register(
            "light_gray_concrete_stairs",
            settings -> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
    );

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = register(
            "light_gray_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
    );

    public static final Block LIGHT_GRAY_CONCRETE_WALL = register(
            "light_gray_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
    );

    public static final Block GRAY_CONCRETE_STAIRS = register(
            "gray_concrete_stairs",
            settings -> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
    );

    public static final Block GRAY_CONCRETE_SLAB = register(
            "gray_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
    );

    public static final Block GRAY_CONCRETE_WALL = register(
            "gray_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
    );

    public static final Block BLACK_CONCRETE_STAIRS = register(
            "black_concrete_stairs",
            settings -> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
    );

    public static final Block BLACK_CONCRETE_SLAB = register(
            "black_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
    );

    public static final Block BLACK_CONCRETE_WALL = register(
            "black_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
    );

    public static final Block BROWN_CONCRETE_STAIRS = register(
            "brown_concrete_stairs",
            settings -> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
    );

    public static final Block BROWN_CONCRETE_SLAB = register(
            "brown_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
    );

    public static final Block BROWN_CONCRETE_WALL = register(
            "brown_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
    );

    public static final Block RED_CONCRETE_STAIRS = register(
            "red_concrete_stairs",
            settings -> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
    );

    public static final Block RED_CONCRETE_SLAB = register(
            "red_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
    );

    public static final Block RED_CONCRETE_WALL = register(
            "red_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
    );

    public static final Block ORANGE_CONCRETE_STAIRS = register(
            "orange_concrete_stairs",
            settings -> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
    );

    public static final Block ORANGE_CONCRETE_SLAB = register(
            "orange_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
    );

    public static final Block ORANGE_CONCRETE_WALL = register(
            "orange_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
    );

    public static final Block YELLOW_CONCRETE_STAIRS = register(
            "yellow_concrete_stairs",
            settings -> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
    );

    public static final Block YELLOW_CONCRETE_SLAB = register(
            "yellow_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
    );

    public static final Block YELLOW_CONCRETE_WALL = register(
            "yellow_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
    );

    public static final Block LIME_CONCRETE_STAIRS = register(
            "lime_concrete_stairs",
            settings -> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
    );

    public static final Block LIME_CONCRETE_SLAB = register(
            "lime_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
    );

    public static final Block LIME_CONCRETE_WALL = register(
            "lime_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
    );

    public static final Block GREEN_CONCRETE_STAIRS = register(
            "green_concrete_stairs",
            settings -> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
    );

    public static final Block GREEN_CONCRETE_SLAB = register(
            "green_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
    );

    public static final Block GREEN_CONCRETE_WALL = register(
            "green_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
    );

    public static final Block CYAN_CONCRETE_STAIRS = register(
            "cyan_concrete_stairs",
            settings -> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
    );

    public static final Block CYAN_CONCRETE_SLAB = register(
            "cyan_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
    );

    public static final Block CYAN_CONCRETE_WALL = register(
            "cyan_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
    );

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register(
            "light_blue_concrete_stairs",
            settings -> new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
    );

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = register(
            "light_blue_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
    );

    public static final Block LIGHT_BLUE_CONCRETE_WALL = register(
            "light_blue_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
    );

    public static final Block BLUE_CONCRETE_STAIRS = register(
            "blue_concrete_stairs",
            settings -> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
    );

    public static final Block BLUE_CONCRETE_SLAB = register(
            "blue_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
    );

    public static final Block BLUE_CONCRETE_WALL = register(
            "blue_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
    );

    public static final Block PURPLE_CONCRETE_STAIRS = register(
            "purple_concrete_stairs",
            settings -> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
    );

    public static final Block PURPLE_CONCRETE_SLAB = register(
            "purple_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
    );

    public static final Block PURPLE_CONCRETE_WALL = register(
            "purple_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
    );

    public static final Block MAGENTA_CONCRETE_STAIRS = register(
            "magenta_concrete_stairs",
            settings -> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
    );

    public static final Block MAGENTA_CONCRETE_SLAB = register(
            "magenta_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
    );

    public static final Block MAGENTA_CONCRETE_WALL = register(
            "magenta_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
    );

    public static final Block PINK_CONCRETE_STAIRS = register(
            "pink_concrete_stairs",
            settings -> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), settings),
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
    );

    public static final Block PINK_CONCRETE_SLAB = register(
            "pink_concrete_slab",
            AbdSlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
    );

    public static final Block PINK_CONCRETE_WALL = register(
            "pink_concrete_wall",
            AbdWallBlock::new,
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
    );

    public static final Block BRICK_FENCE = register(
            "brick_fence",
            FenceBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(Blocks.BRICKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
    );

    public static final Block BRICK_FENCE_GATE = register(
            "brick_fence_gate",
            settings -> new FenceGateBlock(WoodType.SPRUCE, settings),
            AbstractBlock.Settings.create()
                    .mapColor(Blocks.BRICKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)
    );
}
