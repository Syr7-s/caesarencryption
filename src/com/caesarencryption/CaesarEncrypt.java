package com.caesarencryption;

public class CaesarEncrypt {
    private String text="Hello Word";
    private char[] encryptText;
    protected  void preProcessing(){
        text=text.replace(" ","");
    }
    protected void caesarEncriyption(){
        char[] textChar=text.toCharArray();
        encryptText=new char[textChar.length];
        for (int i=0; i<textChar.length;i++){
            int charNumberValue=(int)textChar[i];
            encryptText[i]=(char)(charNumberValue+3);
            System.out.println(textChar[i]+" : "+charNumberValue+" --> "+encryptText[i]+" :"+((int)encryptText[i]));
        }
        String caesarEncryptedText=String.valueOf(encryptText);
        System.out.println(caesarEncryptedText);
    }
}
