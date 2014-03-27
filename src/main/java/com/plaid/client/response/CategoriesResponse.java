package com.plaid.client.response;

import java.util.Arrays;
import java.util.List;

public class CategoriesResponse {

    private List<Category> categories;

    public CategoriesResponse(Category[] categories) {
        this.categories = Arrays.asList(categories);
    }
    
    public List<Category> getCategories() {
        return categories;
    }    
}
