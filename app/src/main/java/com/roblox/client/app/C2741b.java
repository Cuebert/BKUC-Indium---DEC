package com.roblox.client.app;

import android.content.Context;
import com.roblox.client.C2909v;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5910d;

/* renamed from: com.roblox.client.app.b */
/* loaded from: classes.dex */
public class C2741b implements InterfaceC5910d {

    /* renamed from: a */
    private final int f10459a;

    /* renamed from: b */
    private final int f10460b;

    /* renamed from: com.roblox.client.app.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10461a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f10461a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10461a[EnumC5912f.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10461a[EnumC5912f.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2741b(Context context) {
        this.f10459a = context.getResources().getColor(C2909v.f11715x);
        this.f10460b = context.getResources().getColor(C2909v.f11709r);
    }

    @Override // p314y8.InterfaceC5910d
    /* renamed from: a */
    public int mo12228a(EnumC5912f enumC5912f) {
        int i10 = a.f10461a[enumC5912f.ordinal()];
        if (i10 == 1) {
            return this.f10459a;
        }
        if (i10 != 2) {
            return -1;
        }
        return this.f10460b;
    }
}
