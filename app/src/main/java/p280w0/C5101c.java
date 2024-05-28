package p280w0;

import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import org.json.JSONObject;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public final class C5101c {

    /* renamed from: a */
    public static final a f19362a = new a(null);

    /* renamed from: w0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final boolean m19742a(String jsonString) {
            C3844i.m16253f(jsonString, "jsonString");
            if (jsonString.length() == 0) {
                return false;
            }
            try {
                new JSONObject(jsonString);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
