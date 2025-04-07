package co.uk.moistymonsoon.notjustboots.item;

import co.uk.moistymonsoon.notjustboots.NotJustBoots;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NotJustBoots.MOD_ID);

    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerItem("test_item",
             Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
