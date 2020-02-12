package com.ywc;

import java.util.Arrays;

class ReverseString {

    public void reverseString(char[] s) {
        recursive(s.length, s);
        System.out.println(Arrays.toString(s));
    }

    public void recursive(int index, char[] s) {
        if (index <= s.length / 2) {
            return;
        }
        char temp = s[s.length - index];
        s[s.length - index] = s[index - 1];
        s[index - 1] = temp;
        recursive(index - 1, s);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'a', 'b', 'c', 'd'});
    }
}