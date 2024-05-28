package qa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import qa.C4359t;

/* renamed from: qa.y */
/* loaded from: classes.dex */
public abstract class AbstractC4364y {

    /* renamed from: qa.y$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C4359t.e f17832a;

        /* renamed from: b */
        private final Bitmap f17833b;

        /* renamed from: c */
        private final InputStream f17834c;

        /* renamed from: d */
        private final int f17835d;

        public a(Bitmap bitmap, C4359t.e eVar) {
            this((Bitmap) C4346g0.m17933d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        /* renamed from: a */
        public Bitmap m18052a() {
            return this.f17833b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m18053b() {
            return this.f17835d;
        }

        /* renamed from: c */
        public C4359t.e m18054c() {
            return this.f17832a;
        }

        /* renamed from: d */
        public InputStream m18055d() {
            return this.f17834c;
        }

        public a(InputStream inputStream, C4359t.e eVar) {
            this(null, (InputStream) C4346g0.m17933d(inputStream, "stream == null"), eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Bitmap bitmap, InputStream inputStream, C4359t.e eVar, int i10) {
            if ((inputStream != null) ^ (bitmap != null)) {
                this.f17833b = bitmap;
                this.f17834c = inputStream;
                this.f17832a = (C4359t.e) C4346g0.m17933d(eVar, "loadedFrom == null");
                this.f17835d = i10;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18048a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, C4362w c4362w) {
        int min;
        double floor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                floor = Math.floor(i12 / i10);
            } else if (i10 == 0) {
                floor = Math.floor(i13 / i11);
            } else {
                int floor2 = (int) Math.floor(i13 / i11);
                int floor3 = (int) Math.floor(i12 / i10);
                if (c4362w.f17796k) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18049b(int i10, int i11, BitmapFactory.Options options, C4362w c4362w) {
        m18048a(i10, i11, options.outWidth, options.outHeight, options, c4362w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static BitmapFactory.Options m18050d(C4362w c4362w) {
        boolean m18030c = c4362w.m18030c();
        boolean z10 = c4362w.f17802q != null;
        BitmapFactory.Options options = null;
        if (m18030c || z10) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = m18030c;
            if (z10) {
                options.inPreferredConfig = c4362w.f17802q;
            }
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m18051g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo17891c(C4362w c4362w);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo17998e() {
        return 0;
    }

    /* renamed from: f */
    public abstract a mo17892f(C4362w c4362w, int i10) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo17999h(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo18000i() {
        return false;
    }
}
