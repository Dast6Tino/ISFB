package com.whoame.dich.AllDopClasses;

/**
 * Created by medwedizaa on 29.10.16.
 */

//класс который содержит основную информацию о категориях

public class Categoryes {

    private int logoCategoryes;
    private String nameCategoryes;


    public Categoryes(int logoCategoryes, String nameCategoryes) {
        this.logoCategoryes = logoCategoryes;
        this.nameCategoryes = nameCategoryes;
    }

    public int getLogoCategoryes() { return logoCategoryes; }

    public String getNameCategoryes() { return nameCategoryes; }

    public void setLogoCategoryes(int logoCategoryes) { this.logoCategoryes = logoCategoryes; }

    public void setNameCategoryes(String nameCategoryes) { this.nameCategoryes = nameCategoryes; }


}
