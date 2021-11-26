package com.bradengoodwin.bimken.client.entity.model;


// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.bradengoodwin.bimken.common.entity.BimkenEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BimkenEntityModel<T extends BimkenEntity> extends EntityModel<T> {
    private final ModelRenderer Root;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer UpperBeak2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer LowerBeak;
    private final ModelRenderer cube_r8;
    private final ModelRenderer LeftWing2;
    private final ModelRenderer RightWing2;
    private final ModelRenderer RightLeg;
    private final ModelRenderer RightFoot;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer LeftFoot;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;

    public BimkenEntityModel() {
        texWidth = 48;
        texHeight = 48;

        Root = new ModelRenderer(this);
        Root.setPos(0.0F, 16.25F, 0.0F);


        Body = new ModelRenderer(this);
        Body.setPos(0.0F, 4.0F, 0.0F);
        Root.addChild(Body);
        Body.texOffs(0, 0).addBox(-4.0F, -8.25F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -8.5F, -2.0F);
        Body.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.1345F, 0.0F, 0.0F);
        cube_r1.texOffs(17, 24).addBox(-0.5F, -6.5051F, 4.5707F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r1.texOffs(26, 31).addBox(-0.5F, -6.2051F, 3.8207F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -8.5F, -2.0F);
        Body.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.4399F, 0.0F, 0.0F);
        cube_r2.texOffs(30, 31).addBox(-0.5F, -7.2135F, 3.9005F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(0, 32).addBox(-0.5F, -7.2135F, 4.9005F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, -8.5F, -2.0F);
        Body.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.7453F, 0.0F, 0.0F);
        cube_r3.texOffs(31, 23).addBox(-0.5F, -8.1929F, 3.8662F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r3.texOffs(32, 8).addBox(-0.5F, -8.1929F, 4.8662F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -8.5F, -2.0F);
        Body.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.829F, 0.0F, 0.0F);
        cube_r4.texOffs(4, 32).addBox(-0.5F, -4.8457F, 2.1827F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(25, 16).addBox(-0.5F, -5.5957F, 3.1827F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(17, 16).addBox(-0.5F, -5.5957F, 4.1827F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, -8.5F, -2.0F);
        Body.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        cube_r5.texOffs(8, 32).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(22, 30).addBox(-0.5F, -2.5F, 0.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(0, 0).addBox(-0.5F, -3.5F, 1.25F, 1.0F, 5.0F, 2.0F, 0.0F, false);

        UpperBeak2 = new ModelRenderer(this);
        UpperBeak2.setPos(0.0F, -4.0F, -4.0F);
        Body.addChild(UpperBeak2);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, -0.25F, -0.5F);
        UpperBeak2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        cube_r6.texOffs(24, 24).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, -0.25F, 0.5F);
        UpperBeak2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        cube_r7.texOffs(15, 31).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        LowerBeak = new ModelRenderer(this);
        LowerBeak.setPos(0.0F, 2.0F, 0.0F);
        UpperBeak2.addChild(LowerBeak);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, -0.25F, 0.5F);
        LowerBeak.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0F);
        cube_r8.texOffs(27, 28).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        LeftWing2 = new ModelRenderer(this);
        LeftWing2.setPos(4.05F, -4.5F, -3.0F);
        Body.addChild(LeftWing2);
        setRotationAngle(LeftWing2, -0.3927F, 0.0F, 0.0F);
        LeftWing2.texOffs(0, 24).addBox(-0.05F, -1.731F, 0.4043F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        LeftWing2.texOffs(24, 0).addBox(-0.05F, -0.731F, -0.3457F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        LeftWing2.texOffs(9, 24).addBox(-0.05F, 0.269F, -0.3457F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        LeftWing2.texOffs(25, 16).addBox(-0.05F, 1.019F, -0.3457F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        RightWing2 = new ModelRenderer(this);
        RightWing2.setPos(-3.95F, -4.5F, -3.0F);
        Body.addChild(RightWing2);
        setRotationAngle(RightWing2, -0.3927F, 0.0F, 0.0F);
        RightWing2.texOffs(16, 16).addBox(-1.05F, -1.731F, 0.4043F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        RightWing2.texOffs(0, 16).addBox(-1.05F, -0.731F, -0.3457F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        RightWing2.texOffs(9, 16).addBox(-1.05F, 0.269F, -0.3457F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        RightWing2.texOffs(17, 24).addBox(-1.05F, 1.019F, -0.3457F, 1.0F, 1.0F, 5.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setPos(-1.25F, 20.0F, 0.5F);
        RightLeg.texOffs(9, 16).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        RightFoot = new ModelRenderer(this);
        RightFoot.setPos(0.0F, 3.5F, 0.0F);
        RightLeg.addChild(RightFoot);
        RightFoot.texOffs(9, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.25F, -0.5F);
        RightFoot.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, -0.3054F, 0.0F);
        cube_r9.texOffs(9, 24).addBox(-0.4F, -0.75F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.0F, 0.25F, -0.5F);
        RightFoot.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.3054F, 0.0F);
        cube_r10.texOffs(0, 27).addBox(-0.6F, -0.75F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setPos(1.25F, 20.0F, 0.5F);
        LeftLeg.texOffs(0, 16).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        LeftFoot = new ModelRenderer(this);
        LeftFoot.setPos(0.0F, 3.5F, 0.0F);
        LeftLeg.addChild(LeftFoot);
        LeftFoot.texOffs(24, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, 0.25F, -0.5F);
        LeftFoot.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, -0.3054F, 0.0F);
        cube_r11.texOffs(0, 24).addBox(-0.4F, -0.75F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, 0.25F, -0.5F);
        LeftFoot.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.3054F, 0.0F);
        cube_r12.texOffs(24, 0).addBox(-0.6F, -0.75F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(BimkenEntity entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Root.render(matrixStack, buffer, packedLight, packedOverlay);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
