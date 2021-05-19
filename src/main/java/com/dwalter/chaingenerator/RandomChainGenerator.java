package com.dwalter.chaingenerator;

import java.util.Random;

public class RandomChainGenerator implements ChainGenerator {
    private static final Random RANDOM = new Random();
    private static final char[] CHAR_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'z'};
    private final int chainRange;

    public RandomChainGenerator(int chainRange) {
        this.chainRange = chainRange;
    }

    @Override
    public String getChain() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < RANDOM.nextInt(chainRange) + 1; i++) {
            sb.append(CHAR_ARRAY[RANDOM.nextInt(CHAR_ARRAY.length)]);
        }
        return sb.toString();
    }
}
