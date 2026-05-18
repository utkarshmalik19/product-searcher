package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long productId;
    private String productName;
    private String productType;
    private Category category;
    private double price;
    private boolean availability;
    private double rating;
}
