package net.watcher.netherbiology.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Monster;
import net.watcher.netherbiology.NetherBiology;
import net.watcher.netherbiology.entity.custom.EmberEntity;
import org.jetbrains.annotations.NotNull;

public class EmberModel<T extends EmberEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION;

    static {
        LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(NetherBiology.MOD_ID, "ember"), "main");
    }

    private final ModelPart head;
    private final ModelPart flame;
    private final ModelPart body;
    private final ModelPart spikes;
    private final ModelPart spike1;
    private final ModelPart spike3;
    private final ModelPart spike2;
    private final ModelPart sticks;
    private final ModelPart stick1;
    private final ModelPart stick2;
    private final ModelPart stick3;
    private final ModelPart stick4;

    public EmberModel(ModelPart root) {
        this.head = root.getChild("head");
        this.flame = this.head.getChild("flame");
        this.body = root.getChild("body");
        this.spikes = this.body.getChild("spikes");
        this.spike1 = this.spikes.getChild("spike1");
        this.spike3 = this.spikes.getChild("spike3");
        this.spike2 = this.spikes.getChild("spike2");
        this.sticks = this.body.getChild("sticks");
        this.stick1 = this.sticks.getChild("stick1");
        this.stick2 = this.sticks.getChild("stick2");
        this.stick3 = this.sticks.getChild("stick3");
        this.stick4 = this.sticks.getChild("stick4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(40, 0).addBox(-3.0F, -1.0F, -4.5F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(32, 20).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition horn3_r1 = head.addOrReplaceChild("horn3_r1", CubeListBuilder.create().texOffs(40, 6).addBox(1.0F, -10.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition horn2_r1 = head.addOrReplaceChild("horn2_r1", CubeListBuilder.create().texOffs(40, 6).addBox(1.0F, -10.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition flame = head.addOrReplaceChild("flame", CubeListBuilder.create().texOffs(32, 28).addBox(0.0F, -8.0F, -1.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -9.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 36).addBox(2.0F, -14.0F, -4.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 26.0F, 3.0F));

        PartDefinition spikes = body.addOrReplaceChild("spikes", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -11.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

        PartDefinition spike1 = spikes.addOrReplaceChild("spike1", CubeListBuilder.create().texOffs(16, 36).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition spike3 = spikes.addOrReplaceChild("spike3", CubeListBuilder.create().texOffs(32, 36).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition spike2 = spikes.addOrReplaceChild("spike2", CubeListBuilder.create().texOffs(24, 36).addBox(-1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition sticks = body.addOrReplaceChild("sticks", CubeListBuilder.create(), PartPose.offset(6.0F, -11.0F, -6.0F));

        PartDefinition stick1 = sticks.addOrReplaceChild("stick1", CubeListBuilder.create().texOffs(8, 36).addBox(2.0F, -14.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 1.0F));

        PartDefinition stick2 = sticks.addOrReplaceChild("stick2", CubeListBuilder.create().texOffs(8, 36).addBox(1.0F, -5.0F, 9.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition stick3 = sticks.addOrReplaceChild("stick3", CubeListBuilder.create().texOffs(8, 36).addBox(-10.0F, -2.0F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition stick4 = sticks.addOrReplaceChild("stick4", CubeListBuilder.create().texOffs(8, 36).addBox(-9.0F, -4.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(EmberEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
    
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay);
    }
    @Override
    public @NotNull ModelPart root() {
        return body;
    }
}
