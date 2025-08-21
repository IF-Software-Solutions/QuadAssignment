package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;


@Getter
@Setter
@Entity
@AllArgsConstructor
public class Categories {

    private int id;
    private String name;


    @Override
    public String toString() {
        return "categories{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
