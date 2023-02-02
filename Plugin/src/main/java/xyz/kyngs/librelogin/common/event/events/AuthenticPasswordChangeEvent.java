package xyz.kyngs.librelogin.common.event.events;

import org.jetbrains.annotations.Nullable;
import xyz.kyngs.librelogin.api.LibreLoginPlugin;
import xyz.kyngs.librelogin.api.crypto.HashedPassword;
import xyz.kyngs.librelogin.api.database.User;
import xyz.kyngs.librelogin.api.event.events.PasswordChangeEvent;
import xyz.kyngs.librelogin.common.event.AuthenticPlayerBasedEvent;

public class AuthenticPasswordChangeEvent<P, S> extends AuthenticPlayerBasedEvent<P, S> implements PasswordChangeEvent<P, S> {
    private final HashedPassword oldPassword;

    public AuthenticPasswordChangeEvent(@Nullable User user, P player, LibreLoginPlugin<P, S> plugin, HashedPassword oldPassword) {
        super(user, player, plugin);
        this.oldPassword = oldPassword;
    }

    @Override
    public HashedPassword getOldPassword() {
        return oldPassword;
    }
}
