package com.plaid.client;

import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.InstitutionsResponse;

public interface PlaidPublicClient {

    Object getEntity(String entityId);
    
    Object getInstitution(String institutionId);
    
    InstitutionsResponse getAllInstitutions();
    
    CategoriesResponse getAllCategories();
    
    Object getCategory(String categoryId);
    
    Object getCategoriesByMapping(String mapping, MappingOptions options);
    
    HttpDelegate getHttpDelegate();
}
