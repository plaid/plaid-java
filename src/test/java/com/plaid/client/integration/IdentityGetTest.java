package com.plaid.client.integration;

import com.plaid.client.request.IdentityGetRequest;
import com.plaid.client.request.common.Product;
import com.plaid.client.response.ErrorResponse;
import com.plaid.client.response.IdentityGetResponse;
import org.junit.Test;
import retrofit2.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class IdentityGetTest extends AbstractItemIntegrationTest {
  @Override
  protected List<Product> setupItemProducts() {
    return Arrays.asList(Product.IDENTITY);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    Response<IdentityGetResponse> response = client().service().identityGet(
      new IdentityGetRequest(getItemPublicTokenExchangeResponse().getAccessToken())
    ).execute();

    assertSuccessResponse(response);
    assertFalse(response.body().getAccounts().isEmpty());
    assertNotNull(response.body().getItem());

    List<IdentityGetResponse.AccountWithOwners> accounts = response.body().getAccounts();
    assertNotNull(accounts);

    for (IdentityGetResponse.AccountWithOwners account : accounts) {
      List<IdentityGetResponse.Identity> owners = account.getOwners();
      assertFalse(owners.isEmpty());
      for (IdentityGetResponse.Identity identity : owners) {
        assertNotNull(identity);
        assertFalse(identity.getNames().isEmpty());
        assertFalse(identity.getEmails().isEmpty());
        assertFalse(identity.getAddresses().isEmpty());
        assertFalse(identity.getPhoneNumbers().isEmpty());

        for (IdentityGetResponse.Email email : identity.getEmails()) {
          assertNotNull(email.getData());
          assertNotNull(email.getType());
          assertNotNull(email.isPrimary());
        }

        for (IdentityGetResponse.Address address : identity.getAddresses()) {
          assertNotNull(address.isPrimary());
          assertNotNull(address.getData());
          assertNotNull(address.getData().getStreet());
          assertNotNull(address.getData().getCity());
          assertNotNull(address.getData().getRegion());
          assertNotNull(address.getData().getPostalCode());
          // Sandbox data does not currently have a country set
          // assertNotNull(address.getData().getCountry());
        }

        for (IdentityGetResponse.PhoneNumber phoneNumber : identity.getPhoneNumbers()) {
          assertNotNull(phoneNumber.getData());
          assertNotNull(phoneNumber.getType());
          assertNotNull(phoneNumber.isPrimary());
        }
      }
    }
  }

  @Test
  public void testFailure() throws Exception {
    Response<IdentityGetResponse> response = client().service().identityGet(
      new IdentityGetRequest("made-up-token")
    ).execute();

    assertErrorResponse(response, ErrorResponse.ErrorType.INVALID_INPUT, "INVALID_ACCESS_TOKEN");
  }
}
