package com.plaid.client;

import com.plaid.client.http.HttpDelegate;
import com.plaid.client.request.MappingOptions;
import com.plaid.client.response.CategoriesResponse;
import com.plaid.client.response.Institution;
import com.plaid.client.response.InstitutionsResponse;
import com.plaid.client.response.AllInstitutionsResponse;

public interface PlaidPublicClient {

    Object getEntity(String entityId);

    Institution getInstitution(String institutionId);

    InstitutionsResponse getAllInstitutions();

    AllInstitutionsResponse getAllInstitutions(Integer offset, Integer count);

    CategoriesResponse getAllCategories();

    Object getCategory(String categoryId);

    Object getCategoriesByMapping(String mapping, MappingOptions options);

    HttpDelegate getHttpDelegate();
}
