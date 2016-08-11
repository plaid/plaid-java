package com.plaid.client.response;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CategoriesResponse implements Serializable {

    private List<Category> categories;

    public CategoriesResponse(Category[] categories) {
        this.categories = Arrays.asList(categories);
    }
    
    public List<Category> getCategories() {
        return categories;
    }    
}
