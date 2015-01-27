package com.filardo.elements.blocks;

import com.filardo.elements.CreativeTab.ElementsTab;
import com.filardo.elements.reference.Reference;
import com.filardo.elements.utility.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockElementsContainer extends BlockContainer {

    private IIcon iconFront;
    private IIcon iconTop;
    private IIcon iconBack;

    public BlockElementsContainer()
    {
        super(Material.rock);
        this.setBlockName(Names.Blocks.ESSENCE_INFUSER);
        this.setCreativeTab(ElementsTab.ELEM_TAB);
        this.setBlockTextureName(Names.Blocks.ESSENCE_INFUSER);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        this.iconFront = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_front");
        this.iconTop = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_top");
        this.iconBack = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_back");
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        switch (side){
            case 1: return this.iconTop;
            case 0: return this.iconBack;
            case 2: return this.iconBack;
            case 3: return this.iconFront;
            default: return this.blockIcon;

        }
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
