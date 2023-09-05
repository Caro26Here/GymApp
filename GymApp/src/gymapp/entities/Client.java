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
public class Client {
    
    private String name;
    private int id;
    private int age;
    private float height;
    private float weight;
    private String goal;

    public Client() {
    }
    
    public Client(String name, int ID, int age, float height, float weight, String goal) {
        this.name = name;
        this.id = ID;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
        
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", ID=" + id + ", age=" + age + ", height=" + height + ", weight=" + weight + ", goal=" + goal + '}';
    }
}
