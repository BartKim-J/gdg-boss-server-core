package com.gdg_market.app.product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private Long id;
    private String name;
    private String imageURL;

    public ProductResponseDTO(Long id, String name, String imageURL) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
    }
}
