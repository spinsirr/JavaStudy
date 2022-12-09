package com.exception;

import org.jetbrains.annotations.NotNull;

public class ExTestDrive {

    public static void main(String @NotNull [] args) {
        String test = args[0];
        System.out.print("t");
        try {
            MyEx.doRisky(test);
            System.out.print("r");
            System.out.print("o");
        } catch (MyEx e){
            System.out.print("a");
        }finally {
            System.out.print("w");
            System.out.println("s");
        }
    }
}
