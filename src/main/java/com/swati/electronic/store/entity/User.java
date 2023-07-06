package com.swati.electronic.store.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
@Id
@Column(name="userid")
private Integer id;

@Column(name = "username")
private String name;

}
