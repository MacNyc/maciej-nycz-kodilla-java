package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Lambda is coll");
        poemBeautifier.beautify("Mokito is not coll");
        poemBeautifier.beautify("I need to figure something out like an example");
        poemBeautifier.beautify("I'm watching the new Tom Clancy's Jack Ryan series");
    }
}
