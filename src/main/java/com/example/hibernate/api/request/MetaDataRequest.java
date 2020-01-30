package com.example.hibernate.api.request;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetaDataRequest {
    private String name;
    //private String metadata;
    private JsonNode metadata;
}
