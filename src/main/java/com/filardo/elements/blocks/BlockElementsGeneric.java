package com.filardo.elements.blocks;

import com.filardo.elements.creativetab.ElementsTab;
import com.filardo.elements.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockElementsGeneric extends Block
{
    public BlockElementsGeneric(Material material)
    {
        super(material);
        this.setCreativeTab(ElementsTab.ELEM_TAB);
    }

    public BlockElementsGeneric()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));

    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadate)
    {
        return this.blockIcon;
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
