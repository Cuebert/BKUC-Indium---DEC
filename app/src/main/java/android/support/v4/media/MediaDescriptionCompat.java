package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0098a;
import android.support.v4.media.C0099b;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0094a();

    /* renamed from: n */
    private final String f323n;

    /* renamed from: o */
    private final CharSequence f324o;

    /* renamed from: p */
    private final CharSequence f325p;

    /* renamed from: q */
    private final CharSequence f326q;

    /* renamed from: r */
    private final Bitmap f327r;

    /* renamed from: s */
    private final Uri f328s;

    /* renamed from: t */
    private final Bundle f329t;

    /* renamed from: u */
    private final Uri f330u;

    /* renamed from: v */
    private Object f331v;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    static class C0094a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0094a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m461a(C0098a.m479a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static final class C0095b {

        /* renamed from: a */
        private String f332a;

        /* renamed from: b */
        private CharSequence f333b;

        /* renamed from: c */
        private CharSequence f334c;

        /* renamed from: d */
        private CharSequence f335d;

        /* renamed from: e */
        private Bitmap f336e;

        /* renamed from: f */
        private Uri f337f;

        /* renamed from: g */
        private Bundle f338g;

        /* renamed from: h */
        private Uri f339h;

        /* renamed from: a */
        public MediaDescriptionCompat m465a() {
            return new MediaDescriptionCompat(this.f332a, this.f333b, this.f334c, this.f335d, this.f336e, this.f337f, this.f338g, this.f339h);
        }

        /* renamed from: b */
        public C0095b m466b(CharSequence charSequence) {
            this.f335d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0095b m467c(Bundle bundle) {
            this.f338g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0095b m468d(Bitmap bitmap) {
            this.f336e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0095b m469e(Uri uri) {
            this.f337f = uri;
            return this;
        }

        /* renamed from: f */
        public C0095b m470f(String str) {
            this.f332a = str;
            return this;
        }

        /* renamed from: g */
        public C0095b m471g(Uri uri) {
            this.f339h = uri;
            return this;
        }

        /* renamed from: h */
        public C0095b m472h(CharSequence charSequence) {
            this.f334c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0095b m473i(CharSequence charSequence) {
            this.f333b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f323n = str;
        this.f324o = charSequence;
        this.f325p = charSequence2;
        this.f326q = charSequence3;
        this.f327r = bitmap;
        this.f328s = uri;
        this.f329t = bundle;
        this.f330u = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat m461a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.C0098a.m484f(r9)
            r2.m470f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.C0098a.m486h(r9)
            r2.m473i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.C0098a.m485g(r9)
            r2.m472h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.C0098a.m480b(r9)
            r2.m466b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.C0098a.m482d(r9)
            r2.m468d(r3)
            android.net.Uri r3 = android.support.v4.media.C0098a.m483e(r9)
            r2.m469e(r3)
            android.os.Bundle r3 = android.support.v4.media.C0098a.m481c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L46
            android.support.v4.media.session.MediaSessionCompat.m507a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L5f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L59
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L59
            goto L60
        L59:
            r3.remove(r4)
            r3.remove(r6)
        L5f:
            r0 = r3
        L60:
            r2.m467c(r0)
            if (r5 == 0) goto L69
            r2.m471g(r5)
            goto L74
        L69:
            r0 = 23
            if (r1 < r0) goto L74
            android.net.Uri r0 = android.support.v4.media.C0099b.m497a(r9)
            r2.m471g(r0)
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.m465a()
            r0.f331v = r9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m461a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m462b() {
        Object obj = this.f331v;
        if (obj != null) {
            return obj;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object m489b = C0098a.a.m489b();
        C0098a.a.m494g(m489b, this.f323n);
        C0098a.a.m496i(m489b, this.f324o);
        C0098a.a.m495h(m489b, this.f325p);
        C0098a.a.m490c(m489b, this.f326q);
        C0098a.a.m492e(m489b, this.f327r);
        C0098a.a.m493f(m489b, this.f328s);
        Bundle bundle = this.f329t;
        if (i10 < 23 && this.f330u != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f330u);
        }
        C0098a.a.m491d(m489b, bundle);
        if (i10 >= 23) {
            C0099b.a.m498a(m489b, this.f330u);
        }
        Object m488a = C0098a.a.m488a(m489b);
        this.f331v = m488a;
        return m488a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f324o) + ", " + ((Object) this.f325p) + ", " + ((Object) this.f326q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C0098a.m487i(m462b(), parcel, i10);
    }
}
