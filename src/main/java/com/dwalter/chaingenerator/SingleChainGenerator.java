package com.dwalter.chaingenerator;

import java.util.Random;

public class SingleChainGenerator implements ChainGenerator {
    private static final Random RANDOM = new Random();
    private final String baseString;
    private final int chainRange;

    public SingleChainGenerator(String baseString, int chainRange) {
        this.baseString = baseString;
        this.chainRange = chainRange;
    }

    @Override
    public String getChain() {
        return baseString.repeat(RANDOM.nextInt(chainRange) + 1);
    }
}
