package com.ezHax.ezHax;

import com.ezHax.ezHax.proxy.CommonProxy;
import com.ezHax.ezHax.util.Refrence;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MODID, name = Refrence.NAME, version = Refrence.VERSION)
public class Main
{

    @Mod.Instance
    public Main instance;

    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(instance);
    }

    @EventHandler
    public void postInit(FMLPreInitializationEvent event) {

    }
}
