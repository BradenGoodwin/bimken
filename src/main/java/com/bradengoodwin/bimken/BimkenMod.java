package com.bradengoodwin.bimken;

import com.bradengoodwin.bimken.common.entity.BimkenEntity;
import com.bradengoodwin.bimken.core.init.BlockInit;
import com.bradengoodwin.bimken.core.init.EntityTypesInit;
import com.bradengoodwin.bimken.core.init.ItemInit;
import com.bradengoodwin.bimken.core.init.network.BimkenNetwork;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("bimken")
@Mod.EventBusSubscriber(modid = BimkenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BimkenMod {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bimken";

    public BimkenMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::commonSetup);

        EntityTypesInit.ENTITY_TYPES.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
           event.getRegistry().register(new BlockItem(block,
                   new Item.Properties().tab(ItemGroup.TAB_MISC)).setRegistryName(block.getRegistryName()));
        });
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        BimkenNetwork.init();

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(EntityTypesInit.BIMKEN.get(),
                    BimkenEntity.setAttributes().build());
        });
    }
}
