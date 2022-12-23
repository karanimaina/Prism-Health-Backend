package com.arcurus.prism.model.model;

import lombok.Data;

@Data
public class SubCategory {
	private String categoryName;
	private String subCategoryName;
	private String description;
	private String photos;
	private boolean disabled;
}