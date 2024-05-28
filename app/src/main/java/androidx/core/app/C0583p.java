package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.p */
/* loaded from: classes.dex */
public final class C0583p {

    /* renamed from: a */
    private final String f3243a;

    /* renamed from: b */
    private final CharSequence f3244b;

    /* renamed from: c */
    private final CharSequence[] f3245c;

    /* renamed from: d */
    private final boolean f3246d;

    /* renamed from: e */
    private final int f3247e;

    /* renamed from: f */
    private final Bundle f3248f;

    /* renamed from: g */
    private final Set<String> f3249g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.p$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m3008a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m3009b(C0583p c0583p) {
            Set<String> m3001d;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c0583p.m3006i()).setLabel(c0583p.m3005h()).setChoices(c0583p.m3002e()).setAllowFreeFormInput(c0583p.m3000c()).addExtras(c0583p.m3004g());
            if (Build.VERSION.SDK_INT >= 26 && (m3001d = c0583p.m3001d()) != null) {
                Iterator<String> it = m3001d.iterator();
                while (it.hasNext()) {
                    b.m3014d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.m3016b(addExtras, c0583p.m3003f());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        static Bundle m3010c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.p$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static void m3011a(C0583p c0583p, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C0583p.m2997a(c0583p), intent, map);
        }

        /* renamed from: b */
        static Set<String> m3012b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        /* renamed from: c */
        static Map<String, Uri> m3013c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        /* renamed from: d */
        static RemoteInput.Builder m3014d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.p$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m3015a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        /* renamed from: b */
        static RemoteInput.Builder m3016b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* renamed from: androidx.core.app.p$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f3250a;

        /* renamed from: d */
        private CharSequence f3253d;

        /* renamed from: e */
        private CharSequence[] f3254e;

        /* renamed from: b */
        private final Set<String> f3251b = new HashSet();

        /* renamed from: c */
        private final Bundle f3252c = new Bundle();

        /* renamed from: f */
        private boolean f3255f = true;

        /* renamed from: g */
        private int f3256g = 0;

        public d(String str) {
            if (str != null) {
                this.f3250a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        /* renamed from: a */
        public C0583p m3017a() {
            return new C0583p(this.f3250a, this.f3253d, this.f3254e, this.f3255f, this.f3256g, this.f3252c, this.f3251b);
        }

        /* renamed from: b */
        public d m3018b(CharSequence charSequence) {
            this.f3253d = charSequence;
            return this;
        }
    }

    C0583p(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f3243a = str;
        this.f3244b = charSequence;
        this.f3245c = charSequenceArr;
        this.f3246d = z10;
        this.f3247e = i10;
        this.f3248f = bundle;
        this.f3249g = set;
        if (m3003f() == 2 && !m3000c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    static RemoteInput m2997a(C0583p c0583p) {
        return a.m3009b(c0583p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RemoteInput[] m2998b(C0583p[] c0583pArr) {
        if (c0583pArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0583pArr.length];
        for (int i10 = 0; i10 < c0583pArr.length; i10++) {
            remoteInputArr[i10] = m2997a(c0583pArr[i10]);
        }
        return remoteInputArr;
    }

    /* renamed from: j */
    public static Bundle m2999j(Intent intent) {
        return a.m3010c(intent);
    }

    /* renamed from: c */
    public boolean m3000c() {
        return this.f3246d;
    }

    /* renamed from: d */
    public Set<String> m3001d() {
        return this.f3249g;
    }

    /* renamed from: e */
    public CharSequence[] m3002e() {
        return this.f3245c;
    }

    /* renamed from: f */
    public int m3003f() {
        return this.f3247e;
    }

    /* renamed from: g */
    public Bundle m3004g() {
        return this.f3248f;
    }

    /* renamed from: h */
    public CharSequence m3005h() {
        return this.f3244b;
    }

    /* renamed from: i */
    public String m3006i() {
        return this.f3243a;
    }

    /* renamed from: k */
    public boolean m3007k() {
        return (m3000c() || (m3002e() != null && m3002e().length != 0) || m3001d() == null || m3001d().isEmpty()) ? false : true;
    }
}
