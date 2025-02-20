package fr.ph1lou.werewolfapi.events.lovers;

import fr.ph1lou.werewolfapi.events.game.life_cycle.AnnouncementDeathEvent;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;

public class AnnouncementLoverDeathEvent extends AnnouncementDeathEvent {
    /**
     * @param playerWW     the player dead
     * @param targetPlayer the player who will show the message
     * @param format       the message
     */
    public AnnouncementLoverDeathEvent(IPlayerWW playerWW, IPlayerWW targetPlayer, String format) {
        super(playerWW, targetPlayer, format);
    }
}
