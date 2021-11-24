package com.bradengoodwin.bimken.common.events;

import com.bradengoodwin.bimken.BimkenMod;
import com.bradengoodwin.bimken.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod.EventBusSubscriber(modid = BimkenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ExampleEvents {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        // Do nothing
    }

    @SubscribeEvent
    public static void onPlayerToss(ItemTossEvent event) {
        /* Gives player a diamond when item is tossed while standing on EXAMPLE_BLOCK */
        PlayerEntity player = event.getPlayer();
        World world = player.getCommandSenderWorld();
        BlockState state = world.getBlockState(player.blockPosition().below());
        Logger logger = LogManager.getLogger(BimkenMod.MOD_ID);

        logger.log(Level.DEBUG, String.format("Player %s dropped item %s\n" +
                "While standing on %s",
                player.getScoreboardName(),
                event.getEntityItem().getName().getString(),
                state.getBlock().toString()));


        if(state.getBlock() == BlockInit.EXAMPLE_BLOCK.get()){
            player.addItem(new ItemStack(Items.DIAMOND));
        }
    }
}
