package edu.udea.macroTech.utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public abstract class GenerateUUID {

    public static String createUuid() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return (new UUID(random.nextLong(), random.nextLong())).toString().replace("-", "");
    }

}
