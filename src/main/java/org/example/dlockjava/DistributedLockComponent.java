package org.example.dlockjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DistributedLockComponent {

    final DistributedLockComponentLocked distributedLockComponentLocked;

    Logger log = LoggerFactory.getLogger(DistributedLockComponentLocked.class);

    public DistributedLockComponent(DistributedLockComponentLocked distributedLockComponentLocked) {
        this.distributedLockComponentLocked = distributedLockComponentLocked;
    }

    public void initFunction() {
        try {
            distributedLockComponentLocked.testLock("alpha-key");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
