package com.kodilla.stream.beautifier;

import java.util.*;

public class PoemBeutifier {

    public static void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
