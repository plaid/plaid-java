package com.plaid.client;

import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.Institution;
import com.plaid.client.response.PopularInstitutionsResponse;
import com.plaid.client.response.InstitutionsResponse;

public interface PlaidPublicClient {

    Object getEntity(String entityId);

    Institution getInstitution(String institutionId);

    PopularInstitutionsResponse getPopularInstitutions();

    InstitutionsResponse getAllInstitutions(Integer offset, Integer count, String[] products);

    CategoriesResponse getAllCategories();

    Object getCategory(String categoryId);

    Object getCategoriesByMapping(String mapping, MappingOptions options);

    HttpDelegate getHttpDelegate();
}
