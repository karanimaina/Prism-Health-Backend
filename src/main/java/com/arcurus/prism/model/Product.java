package com.arcurus.prism.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Product {
	@Id
	private String id;

	@JsonProperty("productQuantity")
	private String productQuantity;

	@JsonProperty("productName")
	private String productName;

	@JsonProperty("productPrice")
	private String productPrice;

	@JsonProperty("productDescription")
	private String productDescription;

	@JsonProperty("productProvider")
	private String user;

	@JsonProperty("subCategory")
	private String subCategory;

	@JsonProperty("productVariant")
	private String productVariant;

	@JsonProperty("photos")
	private List<String> photos;

	@JsonProperty("position")
	private double[] position;

	@JsonProperty("provider")
	private Users users;

	private boolean notDisabled=true;

}