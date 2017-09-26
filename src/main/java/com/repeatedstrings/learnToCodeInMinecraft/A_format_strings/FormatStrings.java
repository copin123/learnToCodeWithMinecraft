package com.repeatedstrings.learnToCodeInMinecraft.A_format_strings;

import com.repeatedstrings.learnToCodeInMinecraft.Config.Config;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Config.MODID, version = Config.VERSION)
public class FormatStrings
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("Hello Minecraft World!");

        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
