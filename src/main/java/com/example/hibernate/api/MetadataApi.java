package com.example.hibernate.api;

import com.example.hibernate.api.request.MetaDataRequest;
import com.example.hibernate.model.JsonTest;
import com.example.hibernate.repository.JsonTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetadataApi {
    @Autowired
    private JsonTestRepository jsonTestRepository;

    @PostMapping("/metadata")
    public void saveMetadata(@RequestBody MetaDataRequest request) {
        JsonTest jsonTest = new JsonTest();
        jsonTest.setName(request.getName());
        jsonTest.setJsonNode(request.getMetadata());
        jsonTestRepository.save(jsonTest);
    }
}
