package p232s0;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: s0.b */
/* loaded from: classes.dex */
public abstract class AbstractC4490b {

    /* renamed from: i */
    public static final a f18193i = new a(null);

    /* renamed from: a */
    private final String f18194a;

    /* renamed from: b */
    private final Bundle f18195b;

    /* renamed from: c */
    private final Bundle f18196c;

    /* renamed from: d */
    private final boolean f18197d;

    /* renamed from: e */
    private final boolean f18198e;

    /* renamed from: f */
    private final b f18199f;

    /* renamed from: g */
    private final String f18200g;

    /* renamed from: h */
    private final boolean f18201h;

    /* renamed from: s0.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    public AbstractC4490b(String type, Bundle credentialData, Bundle candidateQueryData, boolean z10, boolean z11, b displayInfo, String str, boolean z12) {
        C3844i.m16253f(type, "type");
        C3844i.m16253f(credentialData, "credentialData");
        C3844i.m16253f(candidateQueryData, "candidateQueryData");
        C3844i.m16253f(displayInfo, "displayInfo");
        this.f18194a = type;
        this.f18195b = credentialData;
        this.f18196c = candidateQueryData;
        this.f18197d = z10;
        this.f18198e = z11;
        this.f18199f = displayInfo;
        this.f18200g = str;
        this.f18201h = z12;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z11);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z12);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z11);
    }

    /* renamed from: a */
    public final Bundle m18466a() {
        return this.f18196c;
    }

    /* renamed from: b */
    public final Bundle m18467b() {
        return this.f18195b;
    }

    /* renamed from: c */
    public final b m18468c() {
        return this.f18199f;
    }

    /* renamed from: d */
    public final String m18469d() {
        return this.f18200g;
    }

    /* renamed from: e */
    public final String m18470e() {
        return this.f18194a;
    }

    /* renamed from: f */
    public final boolean m18471f() {
        return this.f18197d;
    }

    /* renamed from: s0.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final a f18202e = new a(null);

        /* renamed from: a */
        private final CharSequence f18203a;

        /* renamed from: b */
        private final CharSequence f18204b;

        /* renamed from: c */
        private final Icon f18205c;

        /* renamed from: d */
        private final String f18206d;

        /* renamed from: s0.b$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C3840e c3840e) {
                this();
            }
        }

        public b(CharSequence userId, CharSequence charSequence, Icon icon, String str) {
            C3844i.m16253f(userId, "userId");
            this.f18203a = userId;
            this.f18204b = charSequence;
            this.f18205c = icon;
            this.f18206d = str;
            if (!(userId.length() > 0)) {
                throw new IllegalArgumentException("userId should not be empty".toString());
            }
        }

        /* renamed from: a */
        public final Bundle m18472a() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", this.f18203a);
            if (!TextUtils.isEmpty(this.f18204b)) {
                bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", this.f18204b);
            }
            if (!TextUtils.isEmpty(this.f18206d)) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", this.f18206d);
            }
            return bundle;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(CharSequence userId, CharSequence charSequence) {
            this(userId, charSequence, null, null);
            C3844i.m16253f(userId, "userId");
        }
    }
}
