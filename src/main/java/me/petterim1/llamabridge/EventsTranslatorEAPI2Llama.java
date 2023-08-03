package me.petterim1.llamabridge;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import me.onebone.economyapi.event.money.AddMoneyEvent;
import me.onebone.economyapi.event.money.ReduceMoneyEvent;
import me.onebone.economyapi.event.money.SetMoneyEvent;

public class EventsTranslatorEAPI2Llama implements Listener {

    private final Loader loader;

    public EventsTranslatorEAPI2Llama(Loader loader) {
        this.loader = loader;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void handle(AddMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new net.lldv.llamaeconomy.components.event.AddMoneyEvent(event.getPlayer(), event.getAmount()));
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void handle(ReduceMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new net.lldv.llamaeconomy.components.event.ReduceMoneyEvent(event.getPlayer(), event.getAmount()));
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void handle(SetMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new net.lldv.llamaeconomy.components.event.SetMoneyEvent(event.getPlayer(), event.getAmount()));
    }
}
