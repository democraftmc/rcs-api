package fr.democraft.rcs.apiprovider;
import group.aelysium.rustyconnector.common.modules.ExternalModuleBuilder;
import group.aelysium.rustyconnector.common.modules.Module;
import group.aelysium.rustyconnector.proxy.ProxyKernel;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ApiProvider implements Module {
    public static ClassicLogger logger;

    @Override
    public @Nullable Component details() {
        return Component.text("Provides smart server management features.");
    }

    @Override
    public void close() throws Exception {}

    public static class Builder extends ExternalModuleBuilder<ApiProvider> {
        @Override
        public void bind(@NotNull ProxyKernel kernel, @NotNull ApiProvider instance) {
            ApiProvider.logger = new ClassicLogger();
            logger.log("Smart API Provider module loaded.");
        }

        @NotNull
        @Override
        public ApiProvider onStart(@NotNull Context context) throws Exception {
            return new ApiProvider();
        }
    }
}
