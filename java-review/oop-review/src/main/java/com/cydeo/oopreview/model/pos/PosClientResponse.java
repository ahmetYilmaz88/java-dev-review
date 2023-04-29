package com.ahmetyilmaz.oopreview.model.pos;


import com.ahmetyilmaz.oopreview.model.AbstractPosClientResponse;

import java.math.BigDecimal;

public class PosClientResponse extends AbstractPosClientResponse {
    public PosClientResponse(int result, String errorCde, BigDecimal amount) {
        super(result, errorCde, amount);
    }
}
