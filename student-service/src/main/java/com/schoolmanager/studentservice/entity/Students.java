package com.schoolmanager.studentservice.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
