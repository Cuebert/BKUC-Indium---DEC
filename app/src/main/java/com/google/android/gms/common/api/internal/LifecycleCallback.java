package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p308y2.C5610f;
import p308y2.C5621k0;
import p308y2.FragmentC5617i0;
import p308y2.InterfaceC5612g;
import p321z2.C5984j;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: n */
    protected final InterfaceC5612g f6153n;

    public LifecycleCallback(InterfaceC5612g interfaceC5612g) {
        this.f6153n = interfaceC5612g;
    }

    /* renamed from: c */
    public static InterfaceC5612g m7429c(Activity activity) {
        return m7430d(new C5610f(activity));
    }

    /* renamed from: d */
    protected static InterfaceC5612g m7430d(C5610f c5610f) {
        if (c5610f.m20630d()) {
            return C5621k0.m20647Z1(c5610f.m20628b());
        }
        if (c5610f.m20629c()) {
            return FragmentC5617i0.m20644d(c5610f.m20627a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC5612g getChimeraLifecycleFragmentImpl(C5610f c5610f) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void m7431a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m7432b() {
        Activity mo20636g = this.f6153n.mo20636g();
        C5984j.m21286j(mo20636g);
        return mo20636g;
    }

    /* renamed from: e */
    public void mo7433e(int i10, int i11, Intent intent) {
    }

    /* renamed from: f */
    public void mo7434f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m7435g() {
    }

    /* renamed from: h */
    public void mo7436h() {
    }

    /* renamed from: i */
    public void mo7437i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo7438j() {
    }

    /* renamed from: k */
    public void mo7439k() {
    }
}
