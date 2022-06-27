package com.plaid.client.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.plaid.client.model.DepositoryAccountSubtype;
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.DepositoryFilter;
import com.plaid.client.model.LinkTokenAccountFilters;
import com.plaid.client.model.LinkTokenCreateRequest;
import com.plaid.client.model.LinkTokenCreateDepositoryFilter;
import com.plaid.client.model.LinkTokenCreateRequestAuth;
import com.plaid.client.model.LinkTokenCreateRequestUser;
import com.plaid.client.model.LinkTokenCreateResponse;
import com.plaid.client.model.Products;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import retrofit2.Response;

public class LinkTokenCreateTest extends AbstractItemIntegrationTest {

	@Override
	protected List<Products> setupItemProducts() {
		return Collections.singletonList(Products.AUTH);
	}

	@Override
	protected String setupItemInstitutionId() {
		return TARTAN_BANK_INSTITUTION_ID;
	}

	@Test
	public void testSuccess() throws Exception {
		String clientUserId = Long.toString((new Date()).getTime());

		LinkTokenCreateRequestUser user = new LinkTokenCreateRequestUser()
		.clientUserId(clientUserId);

		LinkTokenCreateRequest request = new LinkTokenCreateRequest()
			.user(user)
			.clientName("very nice client name")
			.products(Arrays.asList(Products.AUTH))
			.countryCodes(Arrays.asList(CountryCode.US))
			.language("en");

		Response<LinkTokenCreateResponse> response = client()
			.linkTokenCreate(request)
			.execute();

		assertSuccessResponse(response);
		assertNotNull(response.body().getLinkToken());
		assertTrue(response.body().getExpiration().isAfter(OffsetDateTime.now()));
	}

	@Test
	public void testSuccess_full() throws Exception {
		String clientUserId = Long.toString((new Date()).getTime());

		LinkTokenCreateRequestUser user = new LinkTokenCreateRequestUser()
			.clientUserId(clientUserId)
			.legalName("legal name")
			.phoneNumber("4155558888")
			.emailAddress("email@address.com");

		DepositoryFilter types = new DepositoryFilter()
		.accountSubtypes(Arrays.asList(DepositoryAccountSubtype.CHECKING));

		LinkTokenAccountFilters accountFilters = new LinkTokenAccountFilters()
		.depository(types);

		LinkTokenCreateRequest request = new LinkTokenCreateRequest()
			.user(user)
			.clientName("very nice client name")
			.products(Arrays.asList(Products.AUTH))
			.countryCodes(Arrays.asList(CountryCode.US))
			.language("en")
			.webhook("https://example.com/webhook")
			.linkCustomizationName("default")
			.accountFilters(accountFilters);

		Response<LinkTokenCreateResponse> response = client()
			.linkTokenCreate(request)
			.execute();

		assertSuccessResponse(response);
		assertNotNull(response.body().getLinkToken());
		assertTrue(response.body().getExpiration().isAfter(OffsetDateTime.now()));
	}

	@Test
	public void testSuccess_auth() throws Exception {
		String clientUserId = Long.toString((new Date()).getTime());

		LinkTokenCreateRequestUser user = new LinkTokenCreateRequestUser()
			.clientUserId(clientUserId)
			.legalName("legal name")
			.phoneNumber("4155558888")
			.emailAddress("email@address.com");

		DepositoryFilter types = new DepositoryFilter()
		.accountSubtypes(Arrays.asList(DepositoryAccountSubtype.CHECKING));

		LinkTokenAccountFilters accountFilters = new LinkTokenAccountFilters()
		.depository(types);

		LinkTokenCreateRequestAuth auth = new LinkTokenCreateRequestAuth()
			.automatedMicrodepositsEnabled(true)
			.instantMatchEnabled(true)
			.sameDayMicrodepositsEnabled(true)
			.authTypeSelectEnabled(true);

		LinkTokenCreateRequest request = new LinkTokenCreateRequest()
			.user(user)
			.clientName("very nice client name")
			.products(Arrays.asList(Products.AUTH))
			.countryCodes(Arrays.asList(CountryCode.US))
			.language("en")
			.webhook("https://example.com/webhook")
			.linkCustomizationName("default")
			.accountFilters(accountFilters)
			.auth(auth);

		Response<LinkTokenCreateResponse> response = client()
			.linkTokenCreate(request)
			.execute();

		assertSuccessResponse(response);
		assertNotNull(response.body().getLinkToken());
		assertTrue(response.body().getExpiration().isAfter(OffsetDateTime.now()));
	}
}
