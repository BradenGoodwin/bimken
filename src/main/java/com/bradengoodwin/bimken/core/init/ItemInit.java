package com.bradengoodwin.bimken.core.init;

import com.bradengoodwin.bimken.BimkenMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BimkenMod.MOD_ID);
    public static final RegistryObject<Item> BIMKEN_SPAWN_EGG = ITEMS.register(
            "bimken_spawn_egg",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
