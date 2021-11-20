package com.bradengoodwin.bimken.core.init;

import com.bradengoodwin.bimken.BimkenMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.tools.Tool;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BimkenMod.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register(
            "example_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL,
                    MaterialColor.COLOR_BROWN).strength(5f, 6f).harvestTool(
                    ToolType.PICKAXE).harvestLevel(2).sound(SoundType.BAMBOO)));
}

