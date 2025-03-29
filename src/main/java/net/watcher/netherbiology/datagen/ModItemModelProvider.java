package net.watcher.netherbiology.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.watcher.netherbiology.NetherBiology;
import net.watcher.netherbiology.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, NetherBiology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.EMBER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
