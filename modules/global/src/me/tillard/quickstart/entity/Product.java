package me.tillard.quickstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "QUICKSTART_PRODUCT")
@Entity(name = "quickstart$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 5850247574309821851L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}