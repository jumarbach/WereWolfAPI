package fr.ph1lou.werewolfapi.events.roles.angel;

import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class AngelTargetDeathEvent extends Event {

    private final IPlayerWW playerWW;
    private final IPlayerWW targetWW;

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public AngelTargetDeathEvent(IPlayerWW playerWW, IPlayerWW targetWW){
        this.playerWW = playerWW;
        this.targetWW =targetWW;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public IPlayerWW getPlayerWW() {
        return this.playerWW;
    }

    public IPlayerWW getTargetWW() {
        return targetWW;
    }
}

