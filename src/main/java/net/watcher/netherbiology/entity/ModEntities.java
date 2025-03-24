package net.watcher.netherbiology.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.watcher.netherbiology.NetherBiology;
import net.watcher.netherbiology.entity.custom.EmberEntity;
import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
    DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, NetherBiology.MOD_ID);

public static final Supplier<EntityType<EmberEntity>> Ember =
        ENTITY_TYPES.register("ember", () -> EntityType.Builder.of(EmberEntity::new, MobCategory.MONSTER)
                .sized(1.0f, 1.5f).build("ember"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
