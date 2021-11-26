package com.bradengoodwin.bimken.core.init;

import com.bradengoodwin.bimken.BimkenMod;
import com.bradengoodwin.bimken.common.entity.BimkenEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BimkenMod.MOD_ID);

    public static final RegistryObject<EntityType<BimkenEntity>> BIMKEN =
            ENTITY_TYPES.register("bimken",
                    () -> EntityType.Builder.of(BimkenEntity::new,
                            EntityClassification.CREATURE).sized(1.0f, 1.0f).build(
                            new ResourceLocation(BimkenMod.MOD_ID,
                                    "bimken").toString()));
}
