package org.example;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
public class Personal {
    private String name;
    private LocalDate date;
    private int salary;

    public static void salaryUp(int x, Office b){
        for(Personal personal:b) {
            if (personal.getClass() != Supervisor.class) {
                int newSalary = personal.getSalary() + x;
                personal.setSalary(newSalary);
            }
        }
    }

    /*Вот компаратор НО в задании не написано где его надо применить и для чего конкретно он тут нужен*/
    public int compareTo(@NonNull Personal o){
        return date.compareTo(o.date);
    }

    @Override
    public String toString() {
        return name + " Дата рождения " + date + " ЗП: " + salary;
    }
}
