package com.ahmetyilmaz.oopreview.posclient.client;


import com.ahmetyilmaz.oopreview.model.pos.PosClientRequest;
import com.ahmetyilmaz.oopreview.model.pos.PosClientResponse;
import com.ahmetyilmaz.oopreview.posclient.AbstractPosClient;

public class BankBPosClient extends AbstractPosClient {

    // return dummy response
    @Override
    public PosClientResponse auth(PosClientRequest posClientRequest) {
        return new PosClientResponse(1, null, posClientRequest.getRequestedAmount());
    }

    // return dummy response
    @Override
    public PosClientResponse auth3D(PosClientRequest posClientRequest) {
        return new PosClientResponse(0, "1345", posClientRequest.getRequestedAmount());
    }
}
