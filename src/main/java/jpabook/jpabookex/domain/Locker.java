package jpabook.jpabookex.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Locker {

    @Id @GeneratedValue
    @Column(name = "lockerId")
    private Long id;

    private String name;

}
