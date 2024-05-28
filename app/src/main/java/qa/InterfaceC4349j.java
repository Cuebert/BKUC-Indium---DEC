package qa;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: qa.j */
/* loaded from: classes.dex */
public interface InterfaceC4349j {

    /* renamed from: qa.j$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final InputStream f17696a;

        /* renamed from: b */
        final Bitmap f17697b;

        /* renamed from: c */
        final boolean f17698c;

        /* renamed from: d */
        final long f17699d;

        public a(InputStream inputStream, boolean z10, long j10) {
            if (inputStream != null) {
                this.f17696a = inputStream;
                this.f17697b = null;
                this.f17698c = z10;
                this.f17699d = j10;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        /* renamed from: a */
        public Bitmap m17982a() {
            return this.f17697b;
        }

        /* renamed from: b */
        public long m17983b() {
            return this.f17699d;
        }

        /* renamed from: c */
        public InputStream m17984c() {
            return this.f17696a;
        }
    }

    /* renamed from: qa.j$b */
    /* loaded from: classes.dex */
    public static class b extends IOException {

        /* renamed from: n */
        final boolean f17700n;

        /* renamed from: o */
        final int f17701o;

        public b(String str, int i10, int i11) {
            super(str);
            this.f17700n = EnumC4356q.m17995b(i10);
            this.f17701o = i11;
        }
    }

    /* renamed from: a */
    a mo17925a(Uri uri, int i10) throws IOException;
}
