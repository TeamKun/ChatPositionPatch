package net.teamfruit.chatpositionpatch;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("chatpositionpatch")
public class ChatPositionPatch {
    public ChatPositionPatch() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(RenderGameOverlayEvent.Chat event) {
        event.setPosY(event.getPosY() - 10);
    }
}
