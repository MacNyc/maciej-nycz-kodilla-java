package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify();
        poemBeautifier.beautify();
        poemBeautifier.beautify();
        poemBeautifier.beautify();
    }
}
