package com.plaid.client.response.depositswitch;

import com.plaid.client.response.BaseResponse;

public final class DepositSwitchCreateResponse extends BaseResponse {
    private String depositSwitchId;

    public String getDepositSwitchId() {
        return depositSwitchId;
    }
}
