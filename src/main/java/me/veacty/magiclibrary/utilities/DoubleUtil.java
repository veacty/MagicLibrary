package me.veacty.magiclibrary.utilities;

public final class DoubleUtil {

    private DoubleUtil() {
        throw new UnsupportedOperationException("Utility class can't be initialized");
    }

    public static Double friendlyFormat(Double amount) {
        int i = (int) (amount * 100);
        return i / 100D;
    }

}

