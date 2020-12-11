package com.caesarencryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaesarEncrypt caesarEncrypt=new CaesarEncrypt();
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Encrypted Text: ");
        String text=reader.nextLine();
        caesarEncrypt.preProcessing(text);
        caesarEncrypt.caesarEncriyption();
    }
}
