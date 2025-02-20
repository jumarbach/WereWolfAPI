package fr.ph1lou.werewolfapi.events.roles.will_o_the_wisp;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class WillOTheWispTeleportEvent extends Event implements Cancellable {


    private boolean cancel = false;
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW playerWW;



    private final int numberUse;

    public WillOTheWispTeleportEvent(IPlayerWW playerWW, int numberUse){
        this.playerWW=playerWW;
        this.numberUse=numberUse;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel=cancel;
    }

    public IPlayerWW getPlayerWW() {
        return playerWW;
    }

    public int getNumberUse() {
        return numberUse;
    }
}
