package com.daria.caesarsCipher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Encoder
{
    Alphabets alphabets = new Alphabets();
    List<Character> engAlphabetList = alphabets.getENG_ALPHABET_LIST();
    List<Character> ruAlphabetList = alphabets.getRU_ALPHABET_LIST();


    public String encode(String text, int key)
    {
        StringBuilder newText = new StringBuilder();
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите язык: Английский - нажмите E; Русский - нажмите R");
        String choice = console.nextLine();
        int index=0;
        if (choice.equalsIgnoreCase("E"))
        {
            for (char e : text.toCharArray())
            {
                index = (engAlphabetList.indexOf(e) + key) % engAlphabetList.size();
                newText.append((char)index);
            }
        }
        else if (choice.equalsIgnoreCase("R"))
        {
            for (char e : text.toCharArray())
            {
                index = (ruAlphabetList.indexOf(e) + key) % ruAlphabetList.size();
                newText.append((char)index);
            }
        }
        else System.out.println("Неверная команда");

        return newText.toString();
    }

    public void writingToFile(String filePath, String text, String declaration) throws IOException
    {
        StringBuilder outStringBuilder = new StringBuilder(filePath);
        outStringBuilder.insert(filePath.length()-4, declaration);
        Path outFilePath = Paths.get(outStringBuilder.toString());
        Files.writeString(outFilePath, text);
    }


}
