package p101h8;

import java.util.UUID;

/* renamed from: h8.q */
/* loaded from: classes.dex */
public class C3443q {
    /* renamed from: a */
    public static boolean m15153a(String str) {
        try {
            return str.equals(UUID.fromString(str).toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }
}
