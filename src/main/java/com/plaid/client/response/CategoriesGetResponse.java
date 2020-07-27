package com.plaid.client.response;

import java.util.List;

/**
 * Response to /categories/get endpoint.
 */
public class CategoriesGetResponse extends BaseResponse {
  private List<Category> categories;

  public List<Category> getCategories() {
    return categories;
  }

  public static class Category {
    private String group;
    private List<String> hierarchy;
    private String categoryId;

    public String getGroup() {
      return group;
    }

    public List<String> getHierarchy() {
      return hierarchy;
    }

    public String getCategoryId() {
      return categoryId;
    }
  }
}
