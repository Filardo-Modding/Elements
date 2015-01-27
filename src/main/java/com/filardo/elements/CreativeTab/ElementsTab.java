package com.filardo.elements.creativetab;

import com.filardo.elements.init.ElementsItems;
import com.filardo.elements.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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
