package com.orangehrm.factory;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory() {
    }

    public static FrameworkConfig config(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
