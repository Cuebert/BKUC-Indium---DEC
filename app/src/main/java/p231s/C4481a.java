package p231s;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C4481a {

    /* renamed from: a */
    private final c f18167a;

    /* renamed from: s.a$a */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: a */
        private final InputConfiguration f18168a;

        a(Object obj) {
            this.f18168a = (InputConfiguration) obj;
        }

        @Override // p231s.C4481a.c
        /* renamed from: b */
        public Object mo18431b() {
            return this.f18168a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f18168a, ((c) obj).mo18431b());
            }
            return false;
        }

        public int hashCode() {
            return this.f18168a.hashCode();
        }

        public String toString() {
            return this.f18168a.toString();
        }
    }

    /* renamed from: s.a$b */
    /* loaded from: classes.dex */
    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: s.a$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: b */
        Object mo18431b();
    }

    private C4481a(c cVar) {
        this.f18167a = cVar;
    }

    /* renamed from: b */
    public static C4481a m18429b(Object obj) {
        int i10;
        if (obj == null || (i10 = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (i10 >= 31) {
            return new C4481a(new b(obj));
        }
        return new C4481a(new a(obj));
    }

    /* renamed from: a */
    public Object m18430a() {
        return this.f18167a.mo18431b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4481a) {
            return this.f18167a.equals(((C4481a) obj).f18167a);
        }
        return false;
    }

    public int hashCode() {
        return this.f18167a.hashCode();
    }

    public String toString() {
        return this.f18167a.toString();
    }
}
