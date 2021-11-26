package com.bradengoodwin.bimken.core.util;

import com.bradengoodwin.bimken.BimkenMod;
import com.bradengoodwin.bimken.client.entity.BimkenEntityRenderer;
import com.bradengoodwin.bimken.core.init.EntityTypesInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BimkenMod.MOD_ID, bus =
        Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.BIMKEN.get()
                , BimkenEntityRenderer::new);
    }
}
