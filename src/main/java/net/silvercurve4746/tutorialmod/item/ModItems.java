package net.silvercurve4746.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.silvercurve4746.tutorialmod.Tutorialmod;
import org.jetbrains.annotations.NotNull;

public class ModItems {
    public static final Item ADAMANT = registerItem("adamant", new Item(new Item.Settings() ));

    public static void addItemsToIngredientItemGroup(@NotNull FabricItemGroupEntries entries) {
       entries.add(ADAMANT);
    }

private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name), item);
}
    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID );


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems;addItemsToIngredientTabItemGroup);
    }
}
