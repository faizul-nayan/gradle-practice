package com.nayan.customtextview;

/**
 * Created by Faizul Haque Nayan on 18/05/07.
 */

public class AlphabateChecking {

    private Model mModel;
    private int vowel;
    private int consonent;

    public AlphabateChecking(Model mModel) {
        this.mModel = mModel;
        String fullName = mModel.getFirstName()+mModel.getLastName();

        if(!fullName.isEmpty()){
            char[] characters = fullName.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                if (characters[i]=='a'||characters[i]=='e'||characters[i]=='i'||characters[i]=='o'||characters[i]=='u'||
                        characters[i]=='A'||characters[i]=='E'||characters[i]=='I'||characters[i]=='O'||characters[i]=='U'){
                    vowel++;
                }
                else {
                    consonent++;
                }
            }
        }
    }
    
    public int getVowel(){
        return vowel;
    }
    public int getConsonent(){
        return consonent;
    }
    public String getFullName(){
        return mModel.getFirstName()+" "+mModel.getLastName();
    }
}
