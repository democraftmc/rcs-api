package fr.democraft.rcs.api.events;

import group.aelysium.rustyconnector.common.events.Event;
import group.aelysium.rustyconnector.proxy.family.Family;
import org.jetbrains.annotations.NotNull;

public class CreatePhysicalServer extends Event.Cancelable {
    public final String providerId;
    public final Family family;

    public CreatePhysicalServer(@NotNull String providerId, @NotNull Family family) {
        super();
        this.providerId = providerId;
        this.family = family;
    }
}
