package com.company;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncoder {
    /**
     * Encode inputFile writing the result to outputFile
     *
     * @param inputFilePath  - input file path (relative to resources folder)
     * @param outputFilePath - output file path (relative to resources folder)
     */

    void encode(String inputFilePath, String outputFilePath) throws IOException {

        FileWriter filewriter = new FileWriter(new File(outputFilePath));
        FileReader filereader = new FileReader(new File(inputFilePath));
        int size = (int) new File(inputFilePath).length();
        char bytes[] = new char[size];

        int i = 0;

        filereader.read(bytes);


        int[] encoded = new int[bytes.length];


        encoded[0] = bytes[0];
        for (i = 1; i < bytes.length; i++)
            encoded[i] = bytes[i] ^ encoded[i - 1];

        for (i = 0; i < bytes.length; i++)
            filewriter.write(encoded[i]);
        filewriter.close();
        filereader.close();
    }

}
