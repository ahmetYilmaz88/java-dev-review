package com.ahmetyilmaz.oopreview.service;


import com.ahmetyilmaz.oopreview.model.payment.PaymentResponse;
import com.ahmetyilmaz.oopreview.model.payment.AuthRequest;

public interface PaymentService {
    PaymentResponse auth(AuthRequest authRequest);

    PaymentResponse auth3D(AuthRequest auth3DRequest);
}
