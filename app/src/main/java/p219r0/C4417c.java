package p219r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C4417c {

    /* renamed from: a */
    private final c f17991a;

    /* renamed from: r0.c$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final Uri f17993a;

        /* renamed from: b */
        private final ClipDescription f17994b;

        /* renamed from: c */
        private final Uri f17995c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f17993a = uri;
            this.f17994b = clipDescription;
            this.f17995c = uri2;
        }

        @Override // p219r0.C4417c.c
        /* renamed from: a */
        public ClipDescription mo18210a() {
            return this.f17994b;
        }

        @Override // p219r0.C4417c.c
        /* renamed from: b */
        public Object mo18211b() {
            return null;
        }

        @Override // p219r0.C4417c.c
        /* renamed from: c */
        public Uri mo18212c() {
            return this.f17993a;
        }

        @Override // p219r0.C4417c.c
        /* renamed from: d */
        public void mo18213d() {
        }

        @Override // p219r0.C4417c.c
        /* renamed from: e */
        public Uri mo18214e() {
            return this.f17995c;
        }
    }

    /* renamed from: r0.c$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        ClipDescription mo18210a();

        /* renamed from: b */
        Object mo18211b();

        /* renamed from: c */
        Uri mo18212c();

        /* renamed from: d */
        void mo18213d();

        /* renamed from: e */
        Uri mo18214e();
    }

    public C4417c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17991a = new a(uri, clipDescription, uri2);
        } else {
            this.f17991a = new b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C4417c m18204f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C4417c(new a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m18205a() {
        return this.f17991a.mo18212c();
    }

    /* renamed from: b */
    public ClipDescription m18206b() {
        return this.f17991a.mo18210a();
    }

    /* renamed from: c */
    public Uri m18207c() {
        return this.f17991a.mo18214e();
    }

    /* renamed from: d */
    public void m18208d() {
        this.f17991a.mo18213d();
    }

    /* renamed from: e */
    public Object m18209e() {
        return this.f17991a.mo18211b();
    }

    /* renamed from: r0.c$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        final InputContentInfo f17992a;

        a(Object obj) {
            this.f17992a = (InputContentInfo) obj;
        }

        @Override // p219r0.C4417c.c
        /* renamed from: a */
        public ClipDescription mo18210a() {
            return this.f17992a.getDescription();
        }

        @Override // p219r0.C4417c.c
        /* renamed from: b */
        public Object mo18211b() {
            return this.f17992a;
        }

        @Override // p219r0.C4417c.c
        /* renamed from: c */
        public Uri mo18212c() {
            return this.f17992a.getContentUri();
        }

        @Override // p219r0.C4417c.c
        /* renamed from: d */
        public void mo18213d() {
            this.f17992a.requestPermission();
        }

        @Override // p219r0.C4417c.c
        /* renamed from: e */
        public Uri mo18214e() {
            return this.f17992a.getLinkUri();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f17992a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C4417c(c cVar) {
        this.f17991a = cVar;
    }
}
