package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JANI_TAB = CREATIVE_MODE_TABS.register("jani_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.JANI_2.get()))
                    .title(Component.translatable("creativetab.jani_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.JANI_2_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_4_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_8_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_16_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_32_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_64_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_128_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_256_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_512_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_1024_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_2048_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
