package fr.ph1lou.werewolfapi.enums;
@SuppressWarnings({"unused"})
public enum ConfigBase {

    VICTORY_LOVERS("werewolf.menu.global.victory_couple"),
    CHAT("werewolf.menu.global.chat"),
    SHOW_ROLE_TO_DEATH("werewolf.menu.global.show_role_to_death"),
    SHOW_ROLE_CATEGORY_TO_DEATH("werewolf.menu.global.show_role_category_to_death"),
    HIDE_COMPOSITION("werewolf.menu.global.hide_composition"),
    VOTE("werewolf.menu.global.vote"),
    PROXIMITY_CHAT("werewolf.menu.global.proximity_chat"),
    RED_NAME_TAG("werewolf.menu.global.red_name_tag"),
    WEREWOLF_CHAT("werewolf.menu.global.werewolf_chat"),
    DOUBLE_TROLL("werewolf.menu.global.double_troll"),
    HIDE_EVENTS("werewolf.menu.global.hide_events"),
    HIDE_SCENARIOS("werewolf.menu.global.hide_scenarios"),
    LONE_WOLF("werewolf.menu.global.lone_wolf"),
    NEW_VOTE("werewolf.menu.global.new_vote"),
    HUNTER_CAN_SHOOT("werewolf.role.hunter.can_shoot"),
    HIDDEN_ROLES("werewolf.hidden_roles.display"),
    RANDOM_CUPID("werewolf.random_cupid.display"),
    SWEET_ANGEL("werewolf.role.angel.sweet_angel"),
    ORACLE_EVERY_OTHER_DAY("werewolf.role.oracle.oracle_every_other_day"),
    DETECTIVE_EVERY_OTHER_DAY("werewolf.role.detective.detective_every_other_day"),
    SEER_EVERY_OTHER_DAY("werewolf.role.seer.seer_every_other_day"),
    WITCH_AUTO_RESURRECTION("werewolf.role.witch.auto_rez_witch");

    private final String key;

    ConfigBase(String key) {
        this.key = key;
    }

    public String getKey(){
        return this.key;
    }

}