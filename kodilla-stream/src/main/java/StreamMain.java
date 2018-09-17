package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.reference.FuncionalDecorator;

import static jdk.nashorn.internal.objects.NativeString.*;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify( "Lambda Is Coll", FuncionalDecorator::addABC);
        poemBeautifier.beautify( "Mockito is not coll", FuncionalDecorator::toUpper);
        poemBeautifier.beautify( "I NEED TO FIGURE SOMETHING OUT LIKE AN EXAMPLE", a -> toLowerCase(a));
        poemBeautifier.beautify( "         Java       ", a -> trim(a));
    }
}
