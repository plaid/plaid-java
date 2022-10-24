package com.plaid.client.integration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.plaid.client.model.AccountIdentity;
import com.plaid.client.model.Address;
import com.plaid.client.model.Email;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.PlaidErrorType;
import com.plaid.client.model.IdentityGetRequest;
import com.plaid.client.model.IdentityGetResponse;
import com.plaid.client.model.Owner;
import com.plaid.client.model.PhoneNumber;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class IdentityGetTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.IDENTITY);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testSuccess() throws Exception {
    IdentityGetRequest identityGetRequest = new IdentityGetRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken());

    Response<IdentityGetResponse> response = client()
      .identityGet(identityGetRequest)
      .execute();

    assertSuccessResponse(response);
    assertFalse(response.body().getAccounts().isEmpty());
    assertNotNull(response.body().getItem());

    List<AccountIdentity> accounts = response.body().getAccounts();
    assertNotNull(accounts);

    for (AccountIdentity account : accounts) {
      List<Owner> owners = account.getOwners();
      assertFalse(owners.isEmpty());
      for (Owner owner : owners) {
        assertNotNull(owner);
        assertFalse(owner.getNames().isEmpty());
        assertFalse(owner.getEmails().isEmpty());
        assertFalse(owner.getAddresses().isEmpty());
        assertFalse(owner.getPhoneNumbers().isEmpty());

        for (Email email : owner.getEmails()) {
          assertNotNull(email.getData());
          assertNotNull(email.getType());
          assertNotNull(email.getPrimary());
        }

        for (Address address : owner.getAddresses()) {
          assertNotNull(address.getPrimary());
          assertNotNull(address.getData());
          assertNotNull(address.getData().getStreet());
          assertNotNull(address.getData().getCity());
          assertNotNull(address.getData().getRegion());
          assertNotNull(address.getData().getPostalCode());
          // assertNotNull(address.getData().getCountry());
        }

        for (PhoneNumber phoneNumber : owner.getPhoneNumbers()) {
          assertNotNull(phoneNumber.getData());
          assertNotNull(phoneNumber.getType());
          assertNotNull(phoneNumber.getPrimary());
        }
      }
    }
  }

  @Test
  public void testFailure() throws Exception {
    IdentityGetRequest identityGetRequest = new IdentityGetRequest()
      .accessToken("made-up-token");

    Response<IdentityGetResponse> response = client()
      .identityGet(identityGetRequest)
      .execute();

    assertErrorResponse(
      response,
      PlaidErrorType.INVALID_INPUT,
      "INVALID_ACCESS_TOKEN"
    );
  }
}
