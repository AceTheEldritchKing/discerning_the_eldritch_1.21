package net.acetheeldritchking.discerning_the_eldritch.registries;

import net.acetheeldritchking.discerning_the_eldritch.DiscerningTheEldritch;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistries {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DiscerningTheEldritch.MOD_ID);

    public static final DeferredItem<Item> CORRUPTED_CLOTH = ITEMS.register("corrupted_cloth",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
