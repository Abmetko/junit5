package com.wimix;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;

public class SetupExtension implements BeforeAllCallback, ExtensionContext.Store.CloseableResource {

    private static boolean started = false;

    @Override
    public void beforeAll(ExtensionContext context) {
        if (!started) {
            started = true;
            System.out.println("START: " + LocalDateTime.now());
            context.getRoot().getStore(GLOBAL).put("any unique name", this);
        }
    }

    @Override
    public void close() {
        System.out.println("FINISH: " + LocalDateTime.now());
    }
}