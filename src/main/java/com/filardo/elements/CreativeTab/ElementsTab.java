package com.filardo.elements.CreativeTab;

import com.filardo.elements.init.ElementsItems;
import com.filardo.elements.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.sql.Ref;

public class ElementsTab {
    public static final CreativeTabs ELEM_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ElementsItems.essenceExtractor;
        }
    };
}
