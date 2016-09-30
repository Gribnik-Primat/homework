package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // 1) read input and ouput filenames (relative to resources folder e.g. input.txt output.txt)
        String inputFilePath = "test.txt";
        String outputFilePath = "test1.txt";

        // 2) Create XorFileEncoder implementing FileEncoder interface
        FileEncoder encoder = new FileEncoder();
        encoder.encode(inputFilePath, outputFilePath);

        // 3) Create XorFileDecoder implementing FileDecoder interface
        FileDecoder decoder = new FileDecoder();
        decoder.decode(outputFilePath, inputFilePath);
    }
}
