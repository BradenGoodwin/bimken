package com.bradengoodwin.bimken.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IAngerable;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public class BimkenEntity extends ChickenEntity {


    public BimkenEntity(
            EntityType<? extends ChickenEntity> type,
            World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 4.0f)
                .add(Attributes.ATTACK_DAMAGE, 1.0f)
                .add(Attributes.ATTACK_KNOCKBACK, 5.0f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        /*
        this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 8.0f));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this,
                PlayerEntity.class, true));
        */
    }

    @Override
    protected SoundEvent getDeathSound() {
        // TODO: Set this to correct death sound
        return SoundEvents.HOGLIN_DEATH;
    }

}
