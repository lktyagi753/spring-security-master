package com.usermanagement.modelresponse;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponse {
    private long id;
    private String brand;
    private String title;
    private  String description;
    private double price;
    private List<String> imageUrls;
}