package net.watcher.netherbiology.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.watcher.netherbiology.NetherBiology;
import net.watcher.netherbiology.entity.custom.EmberEntity;
import org.jetbrains.annotations.NotNull;


public class EmberRenderer extends MobRenderer<EmberEntity, EmberModel<EmberEntity>> {

    public EmberRenderer(EntityRendererProvider.Context context) {
        super(context, new EmberModel<>(context.bakeLayer(EmberModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull EmberEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(NetherBiology.MOD_ID, "textures/entity/ember/ember_alt.png");
    }

    @Override
    public void render(@NotNull EmberEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.scale(1f, 1f, 1f);
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}