package com.example.mariam.andriodui_cs496;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

/**
 * Created by Mariam on 5/10/17.
 */

public class StringShuffle {

    public static String shuffleByTwo(String string){
        ArrayList<Character> result = new ArrayList<Character>();
        for (char c : string.toCharArray()) {
            result.add(c);
        }
        for (int i = 0; i < Math.floor(result.size()/2); i++){
            char temp = result.get(i);
            result.set(i, result.get(i+2));
            result.set(i+2, temp);
        }
        StringBuilder output = new StringBuilder(string.length());
        while (result.size() != 0){
            int i = 0;
            output.append(result.remove(i));
            i++;
        }
        return output.toString();
    }

    public static String shuffleByThree(String string){
        ArrayList<Character> result = new ArrayList<Character>();
        for (char c : string.toCharArray()) {
            result.add(c);
        }
        for (int i = 0; i < Math.floor(result.size()/2); i++){
            char temp = result.get(i);
            result.set(i, result.get(i+3));
            result.set(i+3, temp);
        }
        StringBuilder output = new StringBuilder(string.length());
        while (result.size() != 0){
            int i = 0;
            output.append(result.remove(i));
            i++;
        }
        return output.toString();
    }

    public static String shuffleByFour(String string){
        ArrayList<Character> result = new ArrayList<Character>();
        for (char c : string.toCharArray()) {
            result.add(c);
        }
        for (int i = 0; i < Math.floor(result.size()/2); i++){
            char temp = result.get(i);
            result.set(i, result.get(i+4));
            result.set(i+4, temp);
        }
        StringBuilder output = new StringBuilder(string.length());
        while (result.size() != 0){
            int i = 0;
            output.append(result.remove(i));
            i++;
        }
        return output.toString();
    }

    public static String shuffleRandom(String input) {
        ArrayList<Character> characters = new ArrayList<Character>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while (characters.size() != 0) {
            int randPicker = (int) (Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }


}
