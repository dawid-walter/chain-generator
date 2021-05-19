package com.dwalter.chaingenerator;

public class App {
    public static void main(String[] args) {
        ChainGenerator singleChainGenerator = new SingleChainGenerator("o", 50);
        ChainGenerator randomChainGenerator = new RandomChainGenerator(50);

        ChainGenerator anonymousClassTest = new ChainGenerator() {
            @Override
            public String getChain() {
                return "test1";
            }
        };

        ChainCollector lambdaExpressionTest = new ChainCollector(() -> "test2", 50);

        ChainCollector chainCollector1 = new ChainCollector(singleChainGenerator, 50);
        ChainCollector chainCollector2 = new ChainCollector(randomChainGenerator, 50);
        ChainCollector chainCollector3 = new ChainCollector(anonymousClassTest, 50);

        System.out.println("Single chain");
        chainCollector1.getChainCollectedList().forEach(System.out::println);
        System.out.println("=====================================================================");
        System.out.println("");

        System.out.println("Random chain");
        chainCollector2.getChainCollectedList().forEach(System.out::println);
        System.out.println("=====================================================================");
        System.out.println("");

        System.out.println("AnonymousClass");
        chainCollector3.getChainCollectedList().forEach(System.out::println);
        System.out.println("=====================================================================");
        System.out.println("");

        System.out.println("Lambda Expression");
        lambdaExpressionTest.getChainCollectedList().forEach(System.out::println);
        System.out.println("=====================================================================");
    }
}
