package com.plaid.client;

import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.*;

public interface PlaidPublicClient {

    Object getEntity(String entityId);

    Institution getInstitution(String institutionId);

    PopularInstitutionsResponse getPopularInstitutions();

    InstitutionsResponse getAllInstitutions(Integer offset, Integer count, String[] products);

    CategoriesResponse getAllCategories();

    Object getCategory(String categoryId);

    Object getCategoriesByMapping(String mapping, MappingOptions options);

    HttpDelegate getHttpDelegate();

    InstitutionSearch searchForInstitution(String institutionId);
}
