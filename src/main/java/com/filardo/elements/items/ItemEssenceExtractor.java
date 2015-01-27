package com.filardo.elements.items;

import com.filardo.elements.init.ElementsItems;
import com.filardo.elements.utility.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class ItemEssenceExtractor extends ItemElementsGeneric {

    public ItemEssenceExtractor()
    {
        super();
        this.setUnlocalizedName(Names.Items.ESSENCE_EXTRACTOR);
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
        if (world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.river){
            player.inventory.addItemStackToInventory(new ItemStack(ElementsItems.essenceWater, 1));
        }
        else if (world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.jungle){
            player.inventory.addItemStackToInventory(new ItemStack(ElementsItems.essenceEarth, 1));
        }
        else if (world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.hell){
            player.inventory.addItemStackToInventory(new ItemStack(ElementsItems.esssenceFire, 1));
        }
        else if (world.getBiomeGenForCoords((int)player.posX, (int)player.posZ) == BiomeGenBase.extremeHills){
            player.inventory.addItemStackToInventory(new ItemStack(ElementsItems.essenceAir, 1));
        }
        return item;
    }
}
