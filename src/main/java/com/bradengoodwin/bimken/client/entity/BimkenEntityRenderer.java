package com.bradengoodwin.bimken.client.entity;

import com.bradengoodwin.bimken.BimkenMod;
import com.bradengoodwin.bimken.client.entity.model.BimkenEntityModel;
import com.bradengoodwin.bimken.common.entity.BimkenEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BimkenEntityRenderer extends MobRenderer<BimkenEntity,
        BimkenEntityModel<BimkenEntity>> {

    public static final ResourceLocation TEXTURE =
            new ResourceLocation(BimkenMod.MOD_ID, "textures/entity/bimken/bimken.png");

    public BimkenEntityRenderer(EntityRendererManager manager) {
        super(manager, new BimkenEntityModel<>(), 0.7f);
    }


    @Override
    public ResourceLocation getTextureLocation(BimkenEntity p_110775_1_) {
        return TEXTURE;
    }
}
