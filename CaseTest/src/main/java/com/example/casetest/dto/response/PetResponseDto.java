package com.example.casetest.dto.response;

import com.example.casetest.entity.CategoryPet;
import lombok.Data;

@Data
public class PetResponseDto {
    private Long id;
    private String namePet;
    private String gender;
    private String age;

    private CategoryPet categoryPet;
    private Double weight;
    private String avatar;
//    private boolean isStatus = true;
    private Integer price;
    private int quantity;
    private String description;
}
