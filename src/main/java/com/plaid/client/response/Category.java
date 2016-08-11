package com.plaid.client.response;


import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Category implements Serializable {

    private String id;
    private List<String> hierarchy;
    private List<Mapping> mappings;
    
    @JsonProperty("_id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<String> getHierarchy() {
        return hierarchy;
    }
    public void setHierarchy(List<String> hierarchy) {
        this.hierarchy = hierarchy;
    }
    public List<Mapping> getMappings() {
        return mappings;
    }
    public void setMappings(List<Mapping> mappings) {
        this.mappings = mappings;
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Mapping implements Serializable {
        private String mapType;
        private List<String> hierarchy;
        
        @JsonProperty("map_type")
        public String getMapType() {
            return mapType;
        }
        public void setMapType(String mapType) {
            this.mapType = mapType;
        }
        public List<String> getHierarchy() {
            return hierarchy;
        }
        public void setHierarchy(List<String> hierarchy) {
            this.hierarchy = hierarchy;
        }
    }
    
}
