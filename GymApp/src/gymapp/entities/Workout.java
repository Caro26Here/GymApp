/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymapp.entities;

/**
 *
 * @author carol
 */
public class Workout {
    
    private int id;
    private String name;
    private int length;
    private Level difficulty;
    private String description;

    public Workout() {
    }

    public Workout(int id, String name, int length, Level difficulty, String description) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.difficulty = difficulty;
        this.description = description;
    }


    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Level getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Level difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Workout{" + "ID=" + id + ", name=" + name + ", length=" + length + ", difficulty=" + difficulty + ", description=" + description + '}';
    }
    
    
}
