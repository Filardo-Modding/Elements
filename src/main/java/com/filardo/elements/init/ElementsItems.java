package com.filardo.elements.init;

import com.filardo.elements.items.Essences.ItemAirEssence;
import com.filardo.elements.items.Essences.ItemEarthEssence;
import com.filardo.elements.items.Essences.ItemFireEssence;
import com.filardo.elements.items.Essences.ItemWaterEssence;
import com.filardo.elements.items.ItemElementsGeneric;
import com.filardo.elements.items.ItemEssenceExtractor;
import com.filardo.elements.reference.Reference;
import com.filardo.elements.util.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ElementsItems {

    public static final ItemElementsGeneric essenceExtractor = new ItemEssenceExtractor();
    public static final ItemWaterEssence essenceWater = new ItemWaterEssence();
    public static final ItemAirEssence essenceAir = new ItemAirEssence();
    public static final ItemFireEssence esssenceFire = new ItemFireEssence();
    public static final ItemEarthEssence essenceEarth = new ItemEarthEssence();

    public static void registerItems(){

        GameRegistry.registerItem(essenceExtractor, Names.Items.ESSENCE_EXTRACTOR);
        GameRegistry.registerItem(essenceAir, Names.Items.ESSENCE_AIR);
        GameRegistry.registerItem(essenceEarth, Names.Items.ESSENCE_EARTH);
        GameRegistry.registerItem(essenceWater, Names.Items.ESSENCE_WATER);
        GameRegistry.registerItem(esssenceFire, Names.Items.ESSENCE_FIRE);

    }
}
