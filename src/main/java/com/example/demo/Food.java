package com.example.demo;

/**
 * Food is what is prepared by Cooks and ordered by Tables. Food is defined by its id, name,
 * preparation time, complexity and cooking apparatus.
 */

public class Food {
    private String name, cookingApparatus;
    private int id, prepareTime, complexity;

    public Food(String name, String cookingApparatus, int id, int prepareTime, int complexity){
        this.id = id;
        this.name = name;
        this.prepareTime = prepareTime;
        this.complexity = complexity;
        this.cookingApparatus = cookingApparatus;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrepareTime(){
        return prepareTime;
    }

    public void setPrepareTime(int prepareTime){
        if (prepareTime > 0)
            this.prepareTime = prepareTime;
    }

    public int getComplexity(){
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public String getCookingApparatus(){
        return cookingApparatus;
    }

    public void setCookingApparatus(String cookingApparatus) {
        this.cookingApparatus = cookingApparatus;
    }
}
