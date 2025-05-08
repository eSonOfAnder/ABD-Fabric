package com.esonofander.abd.generators;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;

public class AbdModelProvider extends FabricModelProvider {
    public AbdModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmGen) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemGen) {

    }

    @Override
    public String getName() {
        return "ABD Model Provider";
    }
}
