package com.caesarencryption;

public class CaesarEncrypt {
    private String text="Hello Word";
    protected void caesarEncriyption(){
        char[] textChar=text.toCharArray();
        for (int i=0; i<textChar.length;i++){
            int charNumberValue=(int)textChar[i];
            System.out.println(textChar[i]+" : "+charNumberValue);
        }
    }
}
