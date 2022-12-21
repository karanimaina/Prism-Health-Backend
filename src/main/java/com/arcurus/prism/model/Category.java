package com.arcurus.prism.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Category {
    @Id
    private String id;
    private String categoryType;
    private String categoryName;
    private String description;
    private String photo;
    private List<SubCategory> subCategories=new ArrayList<>();
    private boolean disabled=false;
}
