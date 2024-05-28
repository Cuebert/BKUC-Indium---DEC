package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.C0340q1;
import androidx.core.util.C0654h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p279w.C5015c2;
import p279w.C5023e2;
import p279w.InterfaceC5011b2;

/* renamed from: androidx.camera.camera2.internal.b1 */
/* loaded from: classes.dex */
public class C0274b1 implements InterfaceC5011b2 {

    /* renamed from: a */
    private final C0340q1 f1250a;

    /* renamed from: b */
    private final List<C5023e2> f1251b;

    /* renamed from: c */
    private volatile boolean f1252c = false;

    /* renamed from: d */
    private volatile C5015c2 f1253d;

    public C0274b1(C0340q1 c0340q1, List<C5023e2> list) {
        C0654h.m3463b(c0340q1.f1539l == C0340q1.d.OPENED, "CaptureSession state must be OPENED. Current state:" + c0340q1.f1539l);
        this.f1250a = c0340q1;
        this.f1251b = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public void m1348a() {
        this.f1252c = true;
    }

    /* renamed from: b */
    public void m1349b(C5015c2 c5015c2) {
        this.f1253d = c5015c2;
    }
}
