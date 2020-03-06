package com.smile.springjpacrud.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String email;

    @Column
    private Integer gender;

    @OneToOne
    @JoinColumn(name = "d_id", referencedColumnName = "id")
    private Department department;

    @Column
    private Date birth;
}
