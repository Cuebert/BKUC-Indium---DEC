package com.roblox.protocols.example;

import androidx.annotation.Keep;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ExampleProtocol {

    /* renamed from: com.roblox.protocols.example.ExampleProtocol$a */
    /* loaded from: classes.dex */
    class C2943a implements Callback {
        C2943a() {
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* renamed from: a */
        public void mo6401a(JSONObject jSONObject) {
        }
    }

    public ExampleProtocol() {
        MessageBus.m13364e().m13372m(MessageBus.getMessageId(getProtocolName(), getPoloId()), new C2943a());
    }

    private static native String getPoloId();

    private static native String getProtocolName();

    @Keep
    public static native void initializeAndroidExampleProtocol();
}
