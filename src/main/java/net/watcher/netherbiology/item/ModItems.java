package net.watcher.netherbiology.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.watcher.netherbiology.NetherBiology;
import net.watcher.netherbiology.entity.ModEntities;

public class ModItems {
public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NetherBiology.MOD_ID);

public static final DeferredItem<Item> EMBER_SPAWN_EGG = ITEMS.register("ember_spawn_egg",
        () -> new DeferredSpawnEggItem(ModEntities.Ember, 0xffa60, 0xffac00,
                new Item.Properties()));

public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}
