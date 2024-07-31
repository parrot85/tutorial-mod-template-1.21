package net.silvercurve4746.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.silvercurve4746.tutorialmod.Tutorialmod;



public class ModItems {
    public static final Item Adamant = registerItem(name:"adamant", new Item(new FabricItem.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Tutorialmod.MOD_ID,name),item);
    }

  public static void registerModItems(){
      Tutorialmod.LOGGER.info("Registering Mod Items for" + Tutorialmod.MOD_ID);
  }

}
