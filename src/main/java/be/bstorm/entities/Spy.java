package be.bstorm.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("Spy")
public class Spy extends Member {

    private String codeName;

    public Spy() {}

    public Spy(String name,String codeName) {
        super(name);
        this.codeName = codeName;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
}
