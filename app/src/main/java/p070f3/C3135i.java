package p070f3;

/* renamed from: f3.i */
/* loaded from: classes.dex */
public class C3135i {

    /* renamed from: a */
    private static final char[] f13147a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f13148b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m13794a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & 255;
            int i12 = i10 + 1;
            char[] cArr2 = f13148b;
            cArr[i10] = cArr2[i11 >>> 4];
            cArr[i12] = cArr2[i11 & 15];
            i10 = i12 + 1;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m13795b(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0); i10++) {
            char[] cArr = f13147a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }
}
