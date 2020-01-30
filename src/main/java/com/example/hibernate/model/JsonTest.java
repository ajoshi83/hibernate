package com.example.hibernate.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
//@Data
@NoArgsConstructor
@Table(name = "jsontest")
public class JsonTest {
    private Long id;
    private String name;
    //private String metadata;
    private JsonNode jsonNode;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="metadata")
    public String getMetadata() {
        return this.jsonNode.toString();
    }

    public void setMetadata(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            this.jsonNode = mapper.readTree(jsonString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Transient
    public JsonNode getJsonNode() {
        return jsonNode;
    }

    public void setJsonNode(JsonNode jsonNode) {
        this.jsonNode = jsonNode;
    }
}
