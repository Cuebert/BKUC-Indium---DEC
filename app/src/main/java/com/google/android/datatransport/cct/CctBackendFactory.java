package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p016b2.AbstractC0976h;
import p016b2.InterfaceC0972d;
import p016b2.InterfaceC0981m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC0972d {
    @Override // p016b2.InterfaceC0972d
    public InterfaceC0981m create(AbstractC0976h abstractC0976h) {
        return new C1307d(abstractC0976h.mo6153b(), abstractC0976h.mo6156e(), abstractC0976h.mo6155d());
    }
}
