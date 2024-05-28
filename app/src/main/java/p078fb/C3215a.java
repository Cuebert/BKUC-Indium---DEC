package p078fb;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C3844i;
import p065eb.AbstractC3106a;

/* renamed from: fb.a */
/* loaded from: classes.dex */
public final class C3215a extends AbstractC3106a {
    @Override // p065eb.AbstractC3106a
    /* renamed from: c */
    public Random mo13666c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C3844i.m16252e(current, "current()");
        return current;
    }
}
