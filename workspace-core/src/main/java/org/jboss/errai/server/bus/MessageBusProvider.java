package org.jboss.errai.server.bus;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;


@Singleton
public class MessageBusProvider implements Provider<MessageBus> {
    private final MessageBus bus;

    @Inject
    public MessageBusProvider(MessageBus bus) {
        this.bus = bus;
    }

    public MessageBus get() {
        return bus;
    }
}
