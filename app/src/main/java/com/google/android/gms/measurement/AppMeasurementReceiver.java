package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p018b4.C0995i;
import p018b4.InterfaceC0994h;
import p041d1.AbstractC2959a;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC2959a implements InterfaceC0994h {

    /* renamed from: c */
    private C0995i f7933c;

    @Override // p018b4.InterfaceC0994h
    /* renamed from: a */
    public void mo6224a(Context context, Intent intent) {
        AbstractC2959a.m13387c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f7933c == null) {
            this.f7933c = new C0995i(this);
        }
        this.f7933c.m6225a(context, intent);
    }
}
