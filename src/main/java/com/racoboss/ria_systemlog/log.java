package com.racoboss.ria_systemlog;

import java.util.Arrays;

public final class log {

    static String prefix = "[RIA_SystemLog] ";

    public static void Message(String... args) {
        if (args == null || args.length == 0) return;

        Arrays.stream(args).forEach(s -> {
            if (s.equalsIgnoreCase("")) System.out.println();
            else System.out.println(prefix + s);
        });
    }


}
