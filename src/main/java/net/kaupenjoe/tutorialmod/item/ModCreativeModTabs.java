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
                        pOutput.accept(ModBlocks.JANI_4096_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_8k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_16k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_32k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_65k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_131k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_262k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_524k_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_1m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_2m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_4m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_8m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_16m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_32m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_64m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_128m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_256m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_512m_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_1b_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_2b_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_4B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_8B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_16B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_32B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_64B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_128B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_256B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_512B_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_1T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_2T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_4T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_8T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_16T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_32T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_64T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_128T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_256T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_512T_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_1QD_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_2QD_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_4QD_BLOCK.get());
                        pOutput.accept(ModBlocks.JANI_8QD_BLOCK.get());
                        // ADD BLOCKS HERE
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
