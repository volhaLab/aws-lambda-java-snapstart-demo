package com.example.demo.config;

import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import org.crac.Context;
import org.crac.Core;
import org.crac.Resource;

@Slf4j
@Singleton
public class CracResource implements Resource {

    public CracResource() {
        Core.getGlobalContext().register(this);
    }

    @Override
    public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
        log.info("Called beforeCheckpoint() method");
        // put here code to disconnect resources
    }

    @Override
    public void afterRestore(Context<? extends Resource> context) throws Exception {
        log.info("Called afterRestore() method");
        // put here code to re-establish connections to resources
        // or generate 'random' values
    }
}
