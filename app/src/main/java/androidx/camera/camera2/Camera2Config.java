package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.camera2.internal.C0269a1;
import androidx.camera.camera2.internal.C0284d1;
import androidx.camera.camera2.internal.C0358v;
import androidx.camera.core.C0459p1;
import androidx.camera.core.C0469s;
import androidx.camera.core.C0477u;
import androidx.camera.core.C0497z;
import java.util.Set;
import p194p.C4207a;
import p194p.C4208b;
import p279w.AbstractC5033h0;
import p279w.InterfaceC5005a0;
import p279w.InterfaceC5067p2;
import p279w.InterfaceC5096z;

/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements C0497z.b {
        @Override // androidx.camera.core.C0497z.b
        public C0497z getCameraXConfig() {
            return Camera2Config.m1324c();
        }
    }

    /* renamed from: c */
    public static C0497z m1324c() {
        C4208b c4208b = new InterfaceC5005a0.a() { // from class: p.b
            @Override // p279w.InterfaceC5005a0.a
            /* renamed from: a */
            public final InterfaceC5005a0 mo17635a(Context context, AbstractC5033h0 abstractC5033h0, C0469s c0469s) {
                return new C0358v(context, abstractC5033h0, c0469s);
            }
        };
        C4207a c4207a = new InterfaceC5096z.a() { // from class: p.a
            @Override // p279w.InterfaceC5096z.a
            /* renamed from: a */
            public final InterfaceC5096z mo17634a(Context context, Object obj, Set set) {
                InterfaceC5096z m1325d;
                m1325d = Camera2Config.m1325d(context, obj, set);
                return m1325d;
            }
        };
        return new C0497z.a().m2331c(c4208b).m2332d(c4207a).m2335g(new InterfaceC5067p2.c() { // from class: p.c
            @Override // p279w.InterfaceC5067p2.c
            /* renamed from: a */
            public final InterfaceC5067p2 mo17636a(Context context) {
                InterfaceC5067p2 m1326e;
                m1326e = Camera2Config.m1326e(context);
                return m1326e;
            }
        }).m2330a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC5096z m1325d(Context context, Object obj, Set set) throws C0459p1 {
        try {
            return new C0269a1(context, obj, set);
        } catch (C0477u e10) {
            throw new C0459p1(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC5067p2 m1326e(Context context) throws C0459p1 {
        return new C0284d1(context);
    }
}
