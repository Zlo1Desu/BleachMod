package com.zlo1desu.bleachmod.init;

import com.zlo1desu.bleachmod.BleachMod;
import com.zlo1desu.bleachmod.item.AsauchiItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // Создаем реестр, который будет собирать все наши предметы
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BleachMod.MODID);

    // Регистрируем сам меч Асаучи
    // Tiers.IRON означает, что по прочности и урону он будет базово как железный меч
    // 3 - это бонусный урон, -2.4f - скорость атаки (стандарт для мечей)
    public static final RegistryObject<Item> ASAUCHI = ITEMS.register("asauchi",
            () -> new AsauchiItem(Tiers.IRON, 3, -2.4f, new Item.Properties()));

    // Метод для подключения этого реестра к самому моду
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
