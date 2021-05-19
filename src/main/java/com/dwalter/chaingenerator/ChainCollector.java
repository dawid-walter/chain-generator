package com.dwalter.chaingenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChainCollector {
    private final com.dwalter.chaingenerator.ChainGenerator chainGenerator;
    private final List<String> list = new ArrayList<>();
    private static final Random RANDOM = new Random();
    private final int range;


    public ChainCollector(com.dwalter.chaingenerator.ChainGenerator chainGenerator, int range) {
        this.chainGenerator = chainGenerator;
        this.range = range;
    }

    public List<String> getChainCollectedList() {
        for (int i = 0; i < RANDOM.nextInt(range) + 1; i++) {
            list.add(chainGenerator.getChain());
        }
        return list;
    }
}
