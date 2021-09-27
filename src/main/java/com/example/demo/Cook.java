package com.example.demo;

/**
 * Cook is defined by his rank, name, proficiency and catch-phrase.
 */

public class Cook {
    private String name, catchPhrase;
    private int rank, proficiency;

    public Cook(String name, String catchPhrase, int rank, int proficiency){
        this.name = name;
        this.rank = rank;
        this.proficiency = proficiency;
        this.catchPhrase = catchPhrase;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank(){
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getProficiency(){
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }
}
