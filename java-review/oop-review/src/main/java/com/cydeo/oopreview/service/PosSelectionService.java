package com.ahmetyilmaz.oopreview.service;

import com.ahmetyilmaz.oopreview.model.payment.AuthRequest;
import com.ahmetyilmaz.oopreview.model.pos.Pos;

public interface PosSelectionService {
    Pos decidePaymentPos(AuthRequest authRequest);
}
