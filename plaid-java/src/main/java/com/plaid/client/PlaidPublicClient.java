package com.plaid.client;

import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;

public interface PlaidPublicClient {

    Object getEntity(String entityId);
    
    Object getInstitution(String institutionId);
    
    Object getAllInstitutions();
    
    CategoriesResponse getAllCategories();
    
    Object getCategory(String categoryId);
    
    Object getCategoriesByMapping(String mapping, MappingOptions options);
    
}
