package p004a3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public class C0028a {

    /* renamed from: a3.a$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static int m167A(Parcel parcel) {
        int m187r = m187r(parcel);
        int m194y = m194y(parcel, m187r);
        int m181l = m181l(m187r);
        int dataPosition = parcel.dataPosition();
        if (m181l == 20293) {
            int i10 = m194y + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m187r))), parcel);
    }

    /* renamed from: B */
    private static void m168B(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    /* renamed from: C */
    private static void m169C(Parcel parcel, int i10, int i11) {
        int m194y = m194y(parcel, i10);
        if (m194y == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + m194y + " (0x" + Integer.toHexString(m194y) + ")", parcel);
    }

    /* renamed from: a */
    public static Bundle m170a(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m194y);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m171b(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m194y);
        return createByteArray;
    }

    /* renamed from: c */
    public static byte[][] m172c(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m194y);
        return bArr;
    }

    /* renamed from: d */
    public static int[] m173d(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m194y);
        return createIntArray;
    }

    /* renamed from: e */
    public static <T extends Parcelable> T m174e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m194y);
        return createFromParcel;
    }

    /* renamed from: f */
    public static String m175f(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m194y);
        return readString;
    }

    /* renamed from: g */
    public static String[] m176g(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m194y);
        return createStringArray;
    }

    /* renamed from: h */
    public static ArrayList<String> m177h(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m194y);
        return createStringArrayList;
    }

    /* renamed from: i */
    public static <T> T[] m178i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m194y);
        return tArr;
    }

    /* renamed from: j */
    public static <T> ArrayList<T> m179j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m194y);
        return createTypedArrayList;
    }

    /* renamed from: k */
    public static void m180k(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    /* renamed from: l */
    public static int m181l(int i10) {
        return (char) i10;
    }

    /* renamed from: m */
    public static boolean m182m(Parcel parcel, int i10) {
        m169C(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: n */
    public static Boolean m183n(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        if (m194y == 0) {
            return null;
        }
        m168B(parcel, i10, m194y, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: o */
    public static double m184o(Parcel parcel, int i10) {
        m169C(parcel, i10, 8);
        return parcel.readDouble();
    }

    /* renamed from: p */
    public static Double m185p(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        if (m194y == 0) {
            return null;
        }
        m168B(parcel, i10, m194y, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: q */
    public static Float m186q(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        if (m194y == 0) {
            return null;
        }
        m168B(parcel, i10, m194y, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: r */
    public static int m187r(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: s */
    public static IBinder m188s(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m194y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m194y);
        return readStrongBinder;
    }

    /* renamed from: t */
    public static int m189t(Parcel parcel, int i10) {
        m169C(parcel, i10, 4);
        return parcel.readInt();
    }

    /* renamed from: u */
    public static Integer m190u(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        if (m194y == 0) {
            return null;
        }
        m168B(parcel, i10, m194y, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: v */
    public static long m191v(Parcel parcel, int i10) {
        m169C(parcel, i10, 8);
        return parcel.readLong();
    }

    /* renamed from: w */
    public static Long m192w(Parcel parcel, int i10) {
        int m194y = m194y(parcel, i10);
        if (m194y == 0) {
            return null;
        }
        m168B(parcel, i10, m194y, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: x */
    public static short m193x(Parcel parcel, int i10) {
        m169C(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: y */
    public static int m194y(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* renamed from: z */
    public static void m195z(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m194y(parcel, i10));
    }
}
