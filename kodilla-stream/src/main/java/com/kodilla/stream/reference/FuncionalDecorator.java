package com.kodilla.stream.reference;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class FuncionalDecorator {
    public static String addABC(String a) {
        return "ABC " + a +" ABC";
    }

    public static String toUpper(String a) {
        return toUpperCase(a);
    }
}
