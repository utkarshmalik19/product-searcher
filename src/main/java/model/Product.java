package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.enums.Gender;
import model.enums.Size;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private String brand;
    private String category;
    private String color;
    private Gender genderRecommendation;
    private Size size;
    private double price;
    private double rating;
    private boolean available;
}
