package me.veacty.magiclibrary.utilities;

import com.google.common.base.Verify;

import java.util.concurrent.ThreadLocalRandom;

public final class RandomUtil {

    private RandomUtil() {
        throw new UnsupportedOperationException("Utility class can't be initialized");
    }

    public static int randomInteger(int minimum, int maximum) throws IllegalArgumentException {
        Verify.verify(maximum > minimum, "Maximum integer can't be smaller than minimum");
        return ThreadLocalRandom.current().nextInt(maximum - minimum + 1) + minimum;
    }

    public static double randomDouble(double minimum, double maximum) throws IllegalArgumentException {
        Verify.verify(maximum > minimum, "Maximum double can't be smaller than minimum");
        return ThreadLocalRandom.current().nextDouble(maximum - minimum + 1) + minimum;
    }

    public static float randomFloat(float minimum, float maximum) throws IllegalArgumentException {
        Verify.verify(maximum > minimum, "Maximum float can't be smaller than minimum");
        return ThreadLocalRandom.current().nextFloat() * (maximum - minimum) + minimum;
    }

    public static boolean randomChance(double randomChance) {
        return (randomChance >= 100.0D) || (randomChance >= randomDouble(0.0D, 100.0D));
    }
}
