package io.github.noeppi_noeppi.mods.bongo.event;

import io.github.noeppi_noeppi.mods.bongo.Bongo;
import io.github.noeppi_noeppi.mods.bongo.data.Team;
import io.github.noeppi_noeppi.mods.bongo.teleporters.PlayerTeleporter;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.eventbus.api.Event;

import java.util.List;

/**
 * Posted after a team got teleported. This is also posted when the no-teleporter is used.
 */
public class BongoTeleportedEvent extends Event {

    private final Bongo bongo;
    private final ServerWorld world;
    private final Team team;
    private final PlayerTeleporter teleporter;
    private final List<ServerPlayerEntity> players;

    public BongoTeleportedEvent(Bongo bongo, ServerWorld world, Team team, PlayerTeleporter teleporter, List<ServerPlayerEntity> players) {
        this.bongo = bongo;
        this.world = world;
        this.team = team;
        this.teleporter = teleporter;
        this.players = players;
    }

    public Bongo getBongo() {
        return bongo;
    }

    public ServerWorld getWorld() {
        return world;
    }

    public Team getTeam() {
        return team;
    }

    public PlayerTeleporter getTeleporter() {
        return teleporter;
    }

    public List<ServerPlayerEntity> getPlayers() {
        return players;
    }
}
