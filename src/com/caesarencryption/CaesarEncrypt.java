package com.caesarencryption;

public class CaesarEncrypt {
    private  String text;
    private char[] encryptText;
    private char[] turkishAlphabet = {'ğ', 'ı', 'ü', 'ö', 'ç', 'Ğ', 'İ', 'Ü', 'Ö', 'Ç'};
    private char[] latinAlphabet = {'g', 'i', 'u', 'o', 'c', 'G', 'I', 'U', 'O', 'C'};
    int charNumberValue;
    protected  void preProcessing(String textOld){
        this.text=textOld;
        text=text.replace(" ","");
        text = text.replaceAll("\\p{Punct}|[0-9]", "");
        text = text.trim();
        if (turkishAlphabet.length==latinAlphabet.length){
            for (int i=0; i<turkishAlphabet.length;i++){
                text=text.replace(turkishAlphabet[i],latinAlphabet[i]);
            }
        } text=text.toLowerCase();
    }
    protected void caesarEncriyption(){
        char[] textChar=text.toCharArray();
        encryptText=new char[textChar.length];
        for (int i=0; i<textChar.length;i++){
            if (textChar[i]=='x'){
                encryptText[i]='a';
                System.out.println(textChar[i]+" --> "+encryptText[i]+" :"+((int)encryptText[i]));
            }else if(textChar[i]=='y'){
                encryptText[i]='b';
                System.out.println(textChar[i]+" --> "+encryptText[i]+" :"+((int)encryptText[i]));
            }
            else if(textChar[i]=='z'){
                encryptText[i]='c';
                System.out.println(textChar[i]+" --> "+encryptText[i]+" :"+((int)encryptText[i]));
            }
           else{
                charNumberValue=(int)textChar[i];
                encryptText[i]=(char)(charNumberValue+3);
                System.out.println(textChar[i]+" : "+charNumberValue+" --> "+encryptText[i]+" :"+((int)encryptText[i]));
            }
        }
        String caesarEncryptedText=String.valueOf(encryptText);
        System.out.println(caesarEncryptedText);
    }
}
