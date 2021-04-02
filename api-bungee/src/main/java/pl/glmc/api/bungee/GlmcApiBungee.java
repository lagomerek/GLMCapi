package pl.glmc.api.bungee;

import pl.glmc.api.common.LuckPermsHook;
import pl.glmc.api.common.economy.Economy;
import pl.glmc.api.common.economy.EconomyFactory;
import pl.glmc.api.common.packet.PacketService;

public interface GlmcApiBungee {

    /**
     * Gets LuckPermsHook instance which is
     * used to provide LuckPerms API data
     *
     * @return LuckPerms API Hook
     */
    LuckPermsHook getLuckPermsHook();

    /**
     * Gets EconomyFactory
     *
     * @return EconomyFactory
     */
    EconomyFactory getEconomyFactory();

    /**
     * Gets default player bank economy
     *
     * @return player bank economy
     */
    Economy getPlayerBankEconomy();

    /**
     * Gets default player cash economy
     *
     * @return player cash economy
     */
    Economy getPlayerCashEconomy();

    /**
     *
     * @return
     */
    PacketService getPacketService();
}
