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
 * Request for /investments/transactions/get endpoint.
 */
public final class InvestmentsTransactionsGetRequest extends BaseAccessTokenRequest {
  @JsonAdapter(DateOnlyTypeAdapterFactory.class)
  private Date startDate;
  @JsonAdapter(DateOnlyTypeAdapterFactory.class)
  private Date endDate;
  private Optional<BaseOptions> options = Optional.empty();

  public InvestmentsTransactionsGetRequest(String accessToken, Date startDate, Date endDate) {
    super(accessToken);
    Util.notNull(startDate, "startDate");
    Util.notNull(endDate, "endDate");
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public InvestmentsTransactionsGetRequest withAccountIds(List<String> accountIds) {
    options = options.orElse(new Options());
    options.get().accountIds = new ArrayList<>(accountIds);
    return this;
  }

  public InvestmentsTransactionsGetRequest withCount(int count) {
    options = options.orElse(new Options());
    options.get().count = count;
    validateOptions(this.options.get());
    return this;
  }

  public InvestmentsTransactionsGetRequest withOffset(int offset) {
    Util.isPositive(offset, "offset");
    options = options.orElse(new Options());
    options.get().offset = offset;
    validateOptions(this.options.get());
    return this;
  }

  private void validateOptions(BaseOptions options) {
    if (options.count != null) {
      Util.isBetween(options.count, 0, 500, "count");
    }

    if (options.offset != null) {
      Util.isPositive(options.offset, "offset");
    }
  }

  public InvestmentsTransactionsGetRequest withOptions(Options options) {
    Util.notNull(options, "options");

    this.options = Optional.of(options);
    validateOptions(this.options.get());
    return this;
  }

  public static class BaseOptions {
    public List<String> accountIds;
    public Integer count;
    public Integer offset;

    private BaseOptions() {
    }
  }

  public static class Options extends BaseOptions {
  }
}
