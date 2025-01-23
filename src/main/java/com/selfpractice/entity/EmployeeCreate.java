package com.selfpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


// As it does not create any table so won't use @Entity &@Table annotation
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class EmployeeCreate {
    private String name;
    private String email;
    private String gender;
    private String designation;
}
