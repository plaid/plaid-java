package com.plaid.client.request;

import com.google.gson.annotations.JsonAdapter;
import com.plaid.client.internal.Util;
import com.plaid.client.internal.gson.DateOnlyTypeAdapterFactory;
import com.plaid.client.internal.gson.Optional;
import com.plaid.client.request.common.BaseAccessTokenRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Request for /transactions/get endpoint.
 */
public final class TransactionsGetRequest extends BaseAccessTokenRequest {
  @JsonAdapter(DateOnlyTypeAdapterFactory.class) private Date startDate;
  @JsonAdapter(DateOnlyTypeAdapterFactory.class) private Date endDate;
  private Optional<Options> options = Optional.empty();

  public TransactionsGetRequest(String accessToken, Date startDate, Date endDate) {
    super(accessToken);
    Util.notNull(startDate, "startDate");
    Util.notNull(endDate, "endDate");
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public TransactionsGetRequest withAccountIds(List<String> accountIds) {
    options = options.orElse(new Options());
    options.get().accountIds = new ArrayList<>(accountIds);
    return this;
  }

  public TransactionsGetRequest withCount(int count) {
    Util.isBetween(count, 0, 500, "count");
    options = options.orElse(new Options());
    options.get().count = count;
    return this;
  }

  public TransactionsGetRequest withOffset(int offset) {
    Util.isPositive(offset, "offset");
    options = options.orElse(new Options());
    options.get().offset = offset;
    return this;
  }

  private static class Options {
    private List<String> accountIds;
    private Integer count;
    private Integer offset;
  }
}
