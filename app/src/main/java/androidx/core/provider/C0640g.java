package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.core.util.C0654h;

/* renamed from: androidx.core.provider.g */
/* loaded from: classes.dex */
public class C0640g {

    /* renamed from: androidx.core.provider.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final int f3434a;

        /* renamed from: b */
        private final b[] f3435b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f3434a = i10;
            this.f3435b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static a m3397a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* renamed from: b */
        public b[] m3398b() {
            return this.f3435b;
        }

        /* renamed from: c */
        public int m3399c() {
            return this.f3434a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f3436a;

        /* renamed from: b */
        private final int f3437b;

        /* renamed from: c */
        private final int f3438c;

        /* renamed from: d */
        private final boolean f3439d;

        /* renamed from: e */
        private final int f3440e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f3436a = (Uri) C0654h.m3467f(uri);
            this.f3437b = i10;
            this.f3438c = i11;
            this.f3439d = z10;
            this.f3440e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static b m3400a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* renamed from: b */
        public int m3401b() {
            return this.f3440e;
        }

        /* renamed from: c */
        public int m3402c() {
            return this.f3437b;
        }

        /* renamed from: d */
        public Uri m3403d() {
            return this.f3436a;
        }

        /* renamed from: e */
        public int m3404e() {
            return this.f3438c;
        }

        /* renamed from: f */
        public boolean m3405f() {
            return this.f3439d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public void mo3209a(int i10) {
            throw null;
        }

        /* renamed from: b */
        public void mo3210b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m3396a(Context context, C0638e c0638e, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C0634a c0634a = new C0634a(cVar, handler);
        if (z10) {
            return C0639f.m3390e(context, c0638e, c0634a, i10, i11);
        }
        return C0639f.m3389d(context, c0638e, i10, null, c0634a);
    }
}
