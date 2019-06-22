package com.yurylink.smiamessage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "BILL")
public class BillEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private BigDecimal value;

    public BillEntity(Long id, String name, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public BillEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }
}
