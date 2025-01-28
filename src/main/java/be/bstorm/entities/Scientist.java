package be.bstorm.entities;

import jakarta.persistence.Entity;

@Entity
public class Scientist extends Member {

    private String fieldOfStudy;

    public Scientist() {
    }

    public Scientist(String name, String fieldOfStudy) {
        super(name);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
