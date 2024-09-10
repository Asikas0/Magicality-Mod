package net.asikaso.magicality.items;

import net.asikaso.magicality.MagicalityMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GREEN_PILL = registerItem("green_pill", new Item(new Item.Settings()));
    public static final Item BLUE_PILL = registerItem("blue_pill", new Item(new Item.Settings()));
    public static final Item RED_PILL = registerItem("red_pill", new Item(new Item.Settings()));
    public static final Item PURPLE_PILL = registerItem("purple_pill", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MagicalityMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MagicalityMod.LOGGER.info("Creation Of Items For" + MagicalityMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(GREEN_PILL);
            entries.add(BLUE_PILL);
            entries.add(RED_PILL);
            entries.add(PURPLE_PILL);
        });
    }
}
