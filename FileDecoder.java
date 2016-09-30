package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDecoder {

    void decode(String inputFilePath, String outputFilePath) throws IOException {
        Scanner sc = new Scanner(new File(inputFilePath));

        FileWriter filewriter = new FileWriter(new File(outputFilePath));
        FileReader filereader = new FileReader(new File(inputFilePath));
        int size = (int) new File(inputFilePath).length();
        char[] encoded = new char[size];

        int i = 0;

        filereader.read(encoded);


        int[] decoded = new int[encoded.length];


        decoded[0] = encoded[0];
        for (i = 1; i < encoded.length; i++)
            decoded[i] = encoded[i] ^ encoded[i - 1];

        for (i = 0; i < encoded.length; i++)
            filewriter.write(decoded[i]);
        filewriter.close();
        filereader.close();
    }
}
