package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class EventCategory extends AbstractEntity{

    @NotBlank(message = "Cannot be blank")
    private String name;

    @NotBlank
    public EventCategory(String name){
        this.name = name;
    }

    public EventCategory () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

