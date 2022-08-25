package org.example.dlockjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@DistributedLock
@Component
public class DistributedLockComponentLocked {

    Logger log = LoggerFactory.getLogger(DistributedLockComponentLocked.class);

    public void testLock(@KeyVariable String str) throws InterruptedException {
        log.info("Starting the function");
        Thread.sleep(15000);
        log.info("Exiting the function");
    }
}