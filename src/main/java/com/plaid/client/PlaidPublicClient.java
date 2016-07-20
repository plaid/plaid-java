package com.plaid.client;

import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.*;

public interface PlaidPublicClient {

    Object getEntity(String entityId);
    
    InstitutionResponse getInstitution(String institutionId);
    
    InstitutionsResponse getAllInstitutions();

    LongTailInstitutionsResponse getAllLongTailInstitutions(Integer offset, Integer count);
    
    CategoriesResponse getAllCategories();
    
    Object getCategory(String categoryId);
    
    Object getCategoriesByMapping(String mapping, MappingOptions options);
    
    HttpDelegate getHttpDelegate();
}
