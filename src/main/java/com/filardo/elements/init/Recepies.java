package com.filardo.elements.init;

import com.filardo.elements.Elements;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recepies {

    public static void init()
    {
        // Essence Extractor
        GameRegistry.addShapedRecipe(new ItemStack(ElementsItems.essenceExtractor, 1),
                "adw", " s ", "fse",
                'a', Items.feather, 'w', Items.water_bucket, 'd', Items.diamond,
                's', Items.stick, 'f', Items.blaze_powder, 'e', Blocks.dirt);
        // Machine Frame
        GameRegistry.addShapedRecipe(new ItemStack(ElementsBlocks.machineFrame, 1),
                "a w", " b ", "f e",
                'a', ElementsItems.essenceAir, 'w', ElementsItems.essenceWater, 'b', Blocks.iron_block,
                'f', ElementsItems.esssenceFire, 'e', ElementsItems.essenceEarth);

    }
}
