package com.daria.caesarsCipher;

import java.util.ArrayList;
import java.util.List;

public class Alphabets
{

    private final String ENG_ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String RU_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";


    public List<Character> getAlphabetList(String alphabet)
    {
        List<Character> alphabetList = new ArrayList<>();

        for(char c : alphabet.toCharArray())
        {
            alphabetList.add(c);
        }
        return alphabetList;
    }

    private final List<Character> ENG_ALPHABET_LIST = getAlphabetList(ENG_ALPHABET);
    private final List<Character> RU_ALPHABET_LIST = getAlphabetList(RU_ALPHABET);


    public List<Character> getENG_ALPHABET_LIST()
    {
        return ENG_ALPHABET_LIST;
    }

    public List<Character> getRU_ALPHABET_LIST()
    {
        return RU_ALPHABET_LIST;
    }
}
