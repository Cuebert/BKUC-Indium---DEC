package p280w0;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p232s0.AbstractC4490b;
import p232s0.C4491b0;
import p232s0.C4494e;
import p232s0.C4496g;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C5100b {

    /* renamed from: a */
    public static final a f19361a = new a(null);

    /* renamed from: w0.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final Bundle m19741a(AbstractC4490b request, Context context) {
            int i10;
            C3844i.m16253f(request, "request");
            C3844i.m16253f(context, "context");
            Bundle m18467b = request.m18467b();
            Bundle m18472a = request.m18468c().m18472a();
            if (request instanceof C4494e) {
                i10 = C4491b0.f18209c;
            } else {
                i10 = request instanceof C4496g ? C4491b0.f18208b : C4491b0.f18207a;
            }
            m18472a.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i10));
            m18467b.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", m18472a);
            return m18467b;
        }
    }
}
