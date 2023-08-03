package me.petterim1.llamabridge;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import net.lldv.llamaeconomy.components.event.*;

public class EventsTranslatorLlama2EAPI implements Listener {

    private final Loader loader;

    public EventsTranslatorLlama2EAPI(Loader loader) {
        this.loader = loader;
    }

    @EventHandler
    public void handle(AddMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new me.onebone.economyapi.event.money.AddMoneyEvent(event.getPlayer(), event.getAmount()));
    }

    @EventHandler
    public void handle(PlayerAddMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new me.onebone.economyapi.event.money.AddMoneyEvent(event.getPlayer().getName(), event.getAmount()));
    }

    @EventHandler
    public void handle(ReduceMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new me.onebone.economyapi.event.money.ReduceMoneyEvent(event.getPlayer(), event.getAmount()));
    }

    @EventHandler
    public void handle(PlayerReduceMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new me.onebone.economyapi.event.money.ReduceMoneyEvent(event.getPlayer().getName(), event.getAmount()));
    }

    @EventHandler
    public void handle(SetMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new me.onebone.economyapi.event.money.SetMoneyEvent(event.getPlayer(), event.getAmount()));
    }

    @EventHandler
    public void handle(PlayerSetMoneyEvent event) {
        loader.getServer().getPluginManager().callEvent(new me.onebone.economyapi.event.money.SetMoneyEvent(event.getPlayer().getName(), event.getAmount()));
    }

    @EventHandler
    public void handle(PlayerPayMoneyEvent event) {
        loader.getLogger().warning("LlamaBridge cannot translate PlayerPayMoneyEvent called from a plugin", new Throwable());
    }
}
