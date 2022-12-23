package com.arcurus.prism.model.model;

import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;

@Data
public class Photos {
    @Id
    String id;
    Binary photo;
}
