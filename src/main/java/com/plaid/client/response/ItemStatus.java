package com.plaid.client.response;

import com.plaid.client.request.common.Product;

import java.util.List;

public final class ItemStatus {
  private List<Product> availableProducts;
  private List<Product> billedProducts;
  private ErrorResponse error;
  private String institutionId;
  private String itemId;
  private String webhook;

  public List<Product> getAvailableProducts() {
    return availableProducts;
  }

  public List<Product> getBilledProducts() {
    return billedProducts;
  }

  public ErrorResponse getError() {
    return error;
  }

  public String getInstitutionId() {
    return institutionId;
  }

  public String getItemId() {
    return itemId;
  }

  public String getWebhook() {
    return webhook;
  }
}
