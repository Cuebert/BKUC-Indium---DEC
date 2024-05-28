package sb;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.net.ProtocolException;
import p193ob.EnumC4173e0;

/* renamed from: sb.k */
/* loaded from: classes.dex */
public final class C4562k {

    /* renamed from: a */
    public final EnumC4173e0 f18329a;

    /* renamed from: b */
    public final int f18330b;

    /* renamed from: c */
    public final String f18331c;

    public C4562k(EnumC4173e0 enumC4173e0, int i10, String str) {
        this.f18329a = enumC4173e0;
        this.f18330b = i10;
        this.f18331c = str;
    }

    /* renamed from: a */
    public static C4562k m18644a(String str) throws IOException {
        EnumC4173e0 enumC4173e0;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    enumC4173e0 = EnumC4173e0.HTTP_1_0;
                } else if (charAt == 1) {
                    enumC4173e0 = EnumC4173e0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            enumC4173e0 = EnumC4173e0.HTTP_1_0;
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = BuildConfig.FLAVOR;
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C4562k(enumC4173e0, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18329a == EnumC4173e0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f18330b);
        if (this.f18331c != null) {
            sb2.append(' ');
            sb2.append(this.f18331c);
        }
        return sb2.toString();
    }
}
