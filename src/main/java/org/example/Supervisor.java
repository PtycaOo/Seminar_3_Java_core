package org.example;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Data
public class Supervisor extends Personal{

    public Supervisor(String name, LocalDate age, int salary) {
        super(name,age,salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
