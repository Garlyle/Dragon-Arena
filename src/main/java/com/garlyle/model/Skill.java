package com.garlyle.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Skill {
    @Id
    Long id;
    String name;
    String description;
    Integer cooldown;
    Integer cost;
    String classes;
}
