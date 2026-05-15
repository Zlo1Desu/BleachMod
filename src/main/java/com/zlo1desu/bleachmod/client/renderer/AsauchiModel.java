package com.zlo1desu.bleachmod.client.renderer;

import com.zlo1desu.bleachmod.BleachMod;
import com.zlo1desu.bleachmod.item.AsauchiItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AsauchiModel extends GeoModel<AsauchiItem> {
    @Override
    public ResourceLocation getModelResource(AsauchiItem animatable) {
        // Добавили папку /item/ в путь
        return new ResourceLocation(BleachMod.MODID, "geo/item/asauchi.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AsauchiItem animatable) {
        return new ResourceLocation(BleachMod.MODID, "textures/item/asauchi.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AsauchiItem animatable) {
        // Добавили папку /item/ в путь
        return new ResourceLocation(BleachMod.MODID, "animations/item/asauchi.animation.json");
    }
}