package p065eb;

import java.util.Random;
import kotlin.jvm.internal.C3844i;

/* renamed from: eb.b */
/* loaded from: classes.dex */
public final class C3107b extends AbstractC3106a {

    /* renamed from: p */
    private final a f13047p = new a();

    /* renamed from: eb.b$a */
    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p065eb.AbstractC3106a
    /* renamed from: c */
    public Random mo13666c() {
        Random random = this.f13047p.get();
        C3844i.m16252e(random, "implStorage.get()");
        return random;
    }
}
