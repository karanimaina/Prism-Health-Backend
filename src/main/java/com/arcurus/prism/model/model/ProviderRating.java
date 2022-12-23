package com.arcurus.prism.model.model;

import lombok.Data;

import java.util.List;

@Data
public class ProviderRating {
    private double averageRate;
    private List<UserReview> ratings;
}
