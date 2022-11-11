package com.daria.caesarsCipher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
    public static void main(String[] args)
    {
        String command = args[0];
        String path = args[1];
        int key = Integer.parseInt(args[2]);
        Path filePath = Paths.get(path);
        try {
            String text = Files.readString(filePath);
            Alphabets alphabets = new Alphabets();


            Encoder encoder = new Encoder();
            if ("encode".equals(command))
            {
                String encodedText = encoder.encode(text, key);
                encoder.writingToFile(path, encodedText, "(encoded)");
            }
            else if ("decode".equals(command))
            {
                String decodedText = encoder.encode(text, -key);
                encoder.writingToFile(path, decodedText, "(decoded)");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
