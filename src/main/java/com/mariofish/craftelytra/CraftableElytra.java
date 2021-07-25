package com.mariofish.craftelytra;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CraftableElytra implements ModInitializer {

    public static final String MODID = "craftelytra";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static CraftableElytra INSTANCE;
    public static final Item ELYTRA_WING = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    @Override
    public void onInitialize() {
        INSTANCE = this;
        Registry.register(Registry.ITEM, new Identifier(MODID, "elytra_wing"), ELYTRA_WING);
        LOGGER.info("Craftable Elytra setup complete!");
    }
}
