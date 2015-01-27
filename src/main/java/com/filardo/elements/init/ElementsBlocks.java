package com.filardo.elements.init;

import com.filardo.elements.blocks.BlockElementsContainer;
import com.filardo.elements.blocks.BlockElementsGeneric;
import com.filardo.elements.blocks.BlockMachineFrame;
import com.filardo.elements.reference.Reference;
import com.filardo.elements.util.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ElementsBlocks {

    public static final BlockContainer essenceInfuser = new BlockElementsContainer();
    public static final BlockElementsGeneric machineFrame = new BlockMachineFrame();

    public static void registerBlocks(){

        GameRegistry.registerBlock(essenceInfuser, Names.Blocks.ESSENCE_INFUSER);
        GameRegistry.registerBlock(machineFrame, Names.Blocks.MACHINE_FRAME);

    }
}
