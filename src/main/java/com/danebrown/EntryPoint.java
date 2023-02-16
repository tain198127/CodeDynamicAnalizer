package com.danebrown;

import java.lang.instrument.Instrumentation;

public class EntryPoint {
    public static void premain(String arg, Instrumentation inst) {
        String packages = arg;
        System.out.println("==================premain==============");

    }
}