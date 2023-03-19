package com.example.a2laboratorinisdarbasft2023.extra;

public class TextCounter {
    public static int getWordsCount(String input) {
        String words = input.trim();
        return words.split("\\\\s+").length;

    }
}
