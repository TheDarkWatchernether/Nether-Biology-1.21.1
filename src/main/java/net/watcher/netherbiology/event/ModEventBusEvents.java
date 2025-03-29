package net.watcher.netherbiology.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.watcher.netherbiology.NetherBiology;
import net.watcher.netherbiology.entity.ModEntities;
import net.watcher.netherbiology.entity.client.EmberModel;
import net.watcher.netherbiology.entity.custom.EmberEntity;

@EventBusSubscriber(modid = NetherBiology.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
@SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(EmberModel.LAYER_LOCATION, EmberModel::createBodyLayer);
    }
@SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
    event.put(ModEntities.Ember.get(), EmberEntity.createAttributes().build());
    }

}
