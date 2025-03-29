package net.watcher.netherbiology.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.watcher.netherbiology.NetherBiology;

public class ModTags {
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(NetherBiology.MOD_ID, name));
        }
    }
}
