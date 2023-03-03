package com.ahmetyilmaz.oopreview.model.pos;


import com.ahmetyilmaz.oopreview.model.AbstractPosClientRequest;

import java.math.BigDecimal;

public class PosClientRequest extends AbstractPosClientRequest {
    public PosClientRequest(BigDecimal requestedAmount) {
        super(requestedAmount);
    }
}
