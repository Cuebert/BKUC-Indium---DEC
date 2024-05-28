package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C0654h;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;

/* renamed from: androidx.core.view.c */
/* loaded from: classes.dex */
public final class C0666c {

    /* renamed from: a */
    private final f f3572a;

    /* renamed from: androidx.core.view.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final c f3573a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3573a = new b(clipData, i10);
            } else {
                this.f3573a = new d(clipData, i10);
            }
        }

        /* renamed from: a */
        public C0666c m3618a() {
            return this.f3573a.mo3622a();
        }

        /* renamed from: b */
        public a m3619b(Bundle bundle) {
            this.f3573a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public a m3620c(int i10) {
            this.f3573a.mo3624c(i10);
            return this;
        }

        /* renamed from: d */
        public a m3621d(Uri uri) {
            this.f3573a.mo3623b(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.c$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final ContentInfo.Builder f3574a;

        b(ClipData clipData, int i10) {
            this.f3574a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.C0666c.c
        /* renamed from: a */
        public C0666c mo3622a() {
            return new C0666c(new e(this.f3574a.build()));
        }

        @Override // androidx.core.view.C0666c.c
        /* renamed from: b */
        public void mo3623b(Uri uri) {
            this.f3574a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0666c.c
        /* renamed from: c */
        public void mo3624c(int i10) {
            this.f3574a.setFlags(i10);
        }

        @Override // androidx.core.view.C0666c.c
        public void setExtras(Bundle bundle) {
            this.f3574a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        C0666c mo3622a();

        /* renamed from: b */
        void mo3623b(Uri uri);

        /* renamed from: c */
        void mo3624c(int i10);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.c$d */
    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a */
        ClipData f3575a;

        /* renamed from: b */
        int f3576b;

        /* renamed from: c */
        int f3577c;

        /* renamed from: d */
        Uri f3578d;

        /* renamed from: e */
        Bundle f3579e;

        d(ClipData clipData, int i10) {
            this.f3575a = clipData;
            this.f3576b = i10;
        }

        @Override // androidx.core.view.C0666c.c
        /* renamed from: a */
        public C0666c mo3622a() {
            return new C0666c(new g(this));
        }

        @Override // androidx.core.view.C0666c.c
        /* renamed from: b */
        public void mo3623b(Uri uri) {
            this.f3578d = uri;
        }

        @Override // androidx.core.view.C0666c.c
        /* renamed from: c */
        public void mo3624c(int i10) {
            this.f3577c = i10;
        }

        @Override // androidx.core.view.C0666c.c
        public void setExtras(Bundle bundle) {
            this.f3579e = bundle;
        }
    }

    /* renamed from: androidx.core.view.c$e */
    /* loaded from: classes.dex */
    private static final class e implements f {

        /* renamed from: a */
        private final ContentInfo f3580a;

        e(ContentInfo contentInfo) {
            this.f3580a = (ContentInfo) C0654h.m3467f(contentInfo);
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: a */
        public ClipData mo3625a() {
            return this.f3580a.getClip();
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: b */
        public int mo3626b() {
            return this.f3580a.getFlags();
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: c */
        public ContentInfo mo3627c() {
            return this.f3580a;
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: d */
        public int mo3628d() {
            return this.f3580a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3580a + "}";
        }
    }

    /* renamed from: androidx.core.view.c$f */
    /* loaded from: classes.dex */
    private interface f {
        /* renamed from: a */
        ClipData mo3625a();

        /* renamed from: b */
        int mo3626b();

        /* renamed from: c */
        ContentInfo mo3627c();

        /* renamed from: d */
        int mo3628d();
    }

    /* renamed from: androidx.core.view.c$g */
    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a */
        private final ClipData f3581a;

        /* renamed from: b */
        private final int f3582b;

        /* renamed from: c */
        private final int f3583c;

        /* renamed from: d */
        private final Uri f3584d;

        /* renamed from: e */
        private final Bundle f3585e;

        g(d dVar) {
            this.f3581a = (ClipData) C0654h.m3467f(dVar.f3575a);
            this.f3582b = C0654h.m3464c(dVar.f3576b, 0, 5, "source");
            this.f3583c = C0654h.m3466e(dVar.f3577c, 1);
            this.f3584d = dVar.f3578d;
            this.f3585e = dVar.f3579e;
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: a */
        public ClipData mo3625a() {
            return this.f3581a;
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: b */
        public int mo3626b() {
            return this.f3583c;
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: c */
        public ContentInfo mo3627c() {
            return null;
        }

        @Override // androidx.core.view.C0666c.f
        /* renamed from: d */
        public int mo3628d() {
            return this.f3582b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3581a.getDescription());
            sb2.append(", source=");
            sb2.append(C0666c.m3612e(this.f3582b));
            sb2.append(", flags=");
            sb2.append(C0666c.m3611a(this.f3583c));
            Uri uri = this.f3584d;
            String str2 = BuildConfig.FLAVOR;
            if (uri == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", hasLinkUri(" + this.f3584d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f3585e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    C0666c(f fVar) {
        this.f3572a = fVar;
    }

    /* renamed from: a */
    static String m3611a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    /* renamed from: e */
    static String m3612e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C0666c m3613g(ContentInfo contentInfo) {
        return new C0666c(new e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m3614b() {
        return this.f3572a.mo3625a();
    }

    /* renamed from: c */
    public int m3615c() {
        return this.f3572a.mo3626b();
    }

    /* renamed from: d */
    public int m3616d() {
        return this.f3572a.mo3628d();
    }

    /* renamed from: f */
    public ContentInfo m3617f() {
        ContentInfo mo3627c = this.f3572a.mo3627c();
        Objects.requireNonNull(mo3627c);
        return mo3627c;
    }

    public String toString() {
        return this.f3572a.toString();
    }
}
