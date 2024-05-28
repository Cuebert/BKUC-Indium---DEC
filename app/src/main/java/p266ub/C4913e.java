package p266ub;

import ac.C0076f;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import p205pb.C4286e;

/* renamed from: ub.e */
/* loaded from: classes.dex */
public final class C4913e {

    /* renamed from: a */
    static final C0076f f18823a = C0076f.m388i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f18824b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f18825c = new String[64];

    /* renamed from: d */
    static final String[] f18826d = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f18826d;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = C4286e.m17753q("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f18825c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = f18825c;
            strArr3[i13 | 8] = strArr3[i13] + "|PADDED";
        }
        String[] strArr4 = f18825c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = f18825c;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f18825c;
            if (i10 >= strArr6.length) {
                return;
            }
            if (strArr6[i10] == null) {
                strArr6[i10] = f18826d[i10];
            }
            i10++;
        }
    }

    private C4913e() {
    }

    /* renamed from: a */
    static String m19195a(byte b10, byte b11) {
        if (b11 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (b10 != 2 && b10 != 3) {
            if (b10 == 4 || b10 == 6) {
                return b11 == 1 ? "ACK" : f18826d[b11];
            }
            if (b10 != 7 && b10 != 8) {
                String[] strArr = f18825c;
                String str = b11 < strArr.length ? strArr[b11] : f18826d[b11];
                if (b10 != 5 || (b11 & 4) == 0) {
                    return (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f18826d[b11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19196b(boolean z10, int i10, int i11, byte b10, byte b11) {
        String[] strArr = f18824b;
        String m17753q = b10 < strArr.length ? strArr[b10] : C4286e.m17753q("0x%02x", Byte.valueOf(b10));
        String m19195a = m19195a(b10, b11);
        Object[] objArr = new Object[5];
        objArr[0] = z10 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = m17753q;
        objArr[4] = m19195a;
        return C4286e.m17753q("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static IllegalArgumentException m19197c(String str, Object... objArr) {
        throw new IllegalArgumentException(C4286e.m17753q(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static IOException m19198d(String str, Object... objArr) throws IOException {
        throw new IOException(C4286e.m17753q(str, objArr));
    }
}
