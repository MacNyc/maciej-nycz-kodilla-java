package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import static jdk.nashorn.internal.objects.NativeString.*;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify( "Lambda Is Coll", a -> "ABC " + a + " abc");
        poemBeautifier.beautify( "Mockito is not coll", a -> toUpperCase(a));
        poemBeautifier.beautify( "I NEED TO FIGURE SOMETHING OUT LIKE AN EXAMPLE", a -> toLowerCase(a));
        poemBeautifier.beautify( "         Java       ", a -> trim(a));
    }
}
