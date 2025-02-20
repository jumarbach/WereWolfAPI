package fr.ph1lou.werewolfapi.game;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IStuffManager {

    List<ItemStack> getDeathLoot();
    Inventory getStartLoot();
    void clearDeathLoot();
    void clearStartLoot();
    void addDeathLoot(ItemStack i);
    void loadStuffChill();
    void loadAllStuffMeetUP();
    void loadAllStuffDefault();
    void load(String configName);
    void save(String configName);
    Map<String, List<ItemStack>> getStuffRoles();
    Map<UUID, Inventory> getTempStuff();

}
