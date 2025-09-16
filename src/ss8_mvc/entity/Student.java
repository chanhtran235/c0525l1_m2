package ss8_mvc.entity;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Person implements Serializable{
    private float score;

    public Student(){

    }

    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getName()+","+this.getScore();
    }

    public Student(int id, String name, float score) {
        super(id, name);
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }



    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                ", score = '" + score + '\'' +
                '}';
    }

}
