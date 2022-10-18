package com.example.FleetStudio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class County {
    @Id
    @Column
    private String fips;
    @Column
    private String state;
    @Column
    private String name;
}
