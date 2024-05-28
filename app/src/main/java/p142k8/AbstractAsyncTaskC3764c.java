package p142k8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import p035c9.C1149i;
import p035c9.C1151k;
import p155l8.EnumC3898b;
import qa.C4359t;
import qa.InterfaceC4338c0;
import qa.InterfaceC4342e0;

/* renamed from: k8.c */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC3764c extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private InterfaceC4342e0 f15780a = new C1149i.a();

    /* renamed from: b */
    private Context f15781b;

    /* renamed from: c */
    private long f15782c;

    /* renamed from: d */
    private EnumC3898b f15783d;

    /* renamed from: e */
    private String f15784e;

    /* renamed from: k8.c$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4338c0 {
        a() {
        }

        @Override // qa.InterfaceC4338c0
        /* renamed from: a */
        public void mo15999a(Drawable drawable) {
            C1151k.m6708b("Failed to get thumbnail bitmap. error: " + drawable);
            AbstractAsyncTaskC3764c.this.mo15997d(null);
        }

        @Override // qa.InterfaceC4338c0
        /* renamed from: b */
        public void mo16000b(Drawable drawable) {
        }

        @Override // qa.InterfaceC4338c0
        /* renamed from: c */
        public void mo16001c(Bitmap bitmap, C4359t.e eVar) {
            AbstractAsyncTaskC3764c.this.mo15997d(bitmap);
        }
    }

    /* renamed from: k8.c$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15786a;

        static {
            int[] iArr = new int[EnumC3898b.values().length];
            f15786a = iArr;
            try {
                iArr[EnumC3898b.user.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public AbstractAsyncTaskC3764c(Context context, long j10, EnumC3898b enumC3898b, String str) {
        this.f15781b = context;
        this.f15782c = j10;
        this.f15783d = enumC3898b;
        this.f15784e = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (p070f3.C3139m.m13810a(r7) == false) goto L50;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m15994a(long r5, java.lang.String r7) {
        /*
            r4 = this;
            h8.p r0 = p101h8.C3442p.m15144c()
            java.lang.String r0 = r0.m15149f(r5)
            if (r0 != 0) goto L65
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L65
            n9.d r1 = p179n9.C4083g.m16979d()     // Catch: java.io.IOException -> L61
            r9.l r1 = r1.mo16974g()     // Catch: java.io.IOException -> L61
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch: java.io.IOException -> L61
            java.lang.String r6 = "150x150"
            java.lang.String r2 = "Png"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.io.IOException -> L61
            gc.b r5 = r1.m18309b(r5, r6, r2, r3)     // Catch: java.io.IOException -> L61
            gc.t r5 = r5.mo14637c()     // Catch: java.io.IOException -> L61
            boolean r6 = r5.m14735f()     // Catch: java.io.IOException -> L61
            if (r6 == 0) goto L57
            java.lang.Object r5 = r5.m14731a()     // Catch: java.io.IOException -> L61
            w9.b r5 = (p289w9.C5482b) r5     // Catch: java.io.IOException -> L61
            if (r5 == 0) goto L5e
            java.util.List<w9.a> r6 = r5.data     // Catch: java.io.IOException -> L61
            if (r6 == 0) goto L5e
            int r6 = r6.size()     // Catch: java.io.IOException -> L61
            if (r6 <= 0) goto L5e
            java.util.List<w9.a> r6 = r5.data     // Catch: java.io.IOException -> L61
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch: java.io.IOException -> L61
            if (r6 == 0) goto L5e
            java.util.List<w9.a> r5 = r5.data     // Catch: java.io.IOException -> L61
            java.lang.Object r5 = r5.get(r7)     // Catch: java.io.IOException -> L61
            w9.a r5 = (p289w9.C5481a) r5     // Catch: java.io.IOException -> L61
            java.lang.String r5 = r5.imageUrl     // Catch: java.io.IOException -> L61
            r7 = r5
            goto L5f
        L57:
            boolean r5 = p070f3.C3139m.m13810a(r7)     // Catch: java.io.IOException -> L61
            if (r5 != 0) goto L5e
            goto L5f
        L5e:
            r7 = r0
        L5f:
            r0 = r7
            goto L65
        L61:
            r5 = move-exception
            r5.printStackTrace()
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p142k8.AbstractAsyncTaskC3764c.m15994a(long, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private void m15995c(Context context, String str) {
        C4359t.m18005p(context).m18013k(str).m18046g(this.f15780a).m18044e(new a());
    }

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public String doInBackground(Void... voidArr) {
        String m15994a;
        EnumC3898b enumC3898b = this.f15783d;
        if (enumC3898b == null) {
            return null;
        }
        try {
            if (b.f15786a[enumC3898b.ordinal()] != 1) {
                m15994a = this.f15784e;
            } else {
                m15994a = m15994a(this.f15782c, this.f15784e);
            }
            return m15994a;
        } catch (Exception e10) {
            C1151k.m6708b("failed to retrieve thumbnail. Exception: " + e10);
            return null;
        }
    }

    /* renamed from: d */
    public abstract void mo15997d(Bitmap bitmap);

    @Override // android.os.AsyncTask
    /* renamed from: e */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m15995c(this.f15781b, str);
        } else {
            mo15997d(null);
        }
    }
}
