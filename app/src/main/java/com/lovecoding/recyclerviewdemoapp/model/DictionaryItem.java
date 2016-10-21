package com.lovecoding.recyclerviewdemoapp.model;

/**
 * Created by ouentheara on 10/21/2016 AD.
 */

public class DictionaryItem {
    String word;
    String difinition;

    public DictionaryItem(String word, String difinition) {
        this.word = word;
        this.difinition = difinition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDifinition() {
        return difinition;
    }

    public void setDifinition(String difinition) {
        this.difinition = difinition;
    }


}
