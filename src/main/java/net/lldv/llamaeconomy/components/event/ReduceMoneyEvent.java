package net.lldv.llamaeconomy.components.event;

import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author LlamaDevelopment
 */
@Getter
@RequiredArgsConstructor
public class ReduceMoneyEvent extends Event {

    private final String player;
    private final double amount;
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }
}
