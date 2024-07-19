package com.gdg_market.app.product.model;

import com.gdg_market.app.utils.model.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "product__products")
public class Product extends BaseModel {
    @Column(name = "name", length = 256)
    private String name;

    @Column(name = "image_url", length = 512)
    private String imageURL;

    @Column(name = "price")
    private long price;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;
}
