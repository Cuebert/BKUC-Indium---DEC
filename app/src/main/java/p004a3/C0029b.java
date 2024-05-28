package p004a3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: a3.b */
/* loaded from: classes.dex */
public class C0029b {
    /* renamed from: A */
    private static void m196A(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m197a(Parcel parcel) {
        return m220x(parcel, 20293);
    }

    /* renamed from: b */
    public static void m198b(Parcel parcel, int i10) {
        m221y(parcel, i10);
    }

    /* renamed from: c */
    public static void m199c(Parcel parcel, int i10, boolean z10) {
        m222z(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: d */
    public static void m200d(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            m222z(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            m222z(parcel, i10, 0);
        }
    }

    /* renamed from: e */
    public static void m201e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeBundle(bundle);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: f */
    public static void m202f(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeByteArray(bArr);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: g */
    public static void m203g(Parcel parcel, int i10, byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m222z(parcel, i10, 0);
                return;
            }
            return;
        }
        int m220x = m220x(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m221y(parcel, m220x);
    }

    /* renamed from: h */
    public static void m204h(Parcel parcel, int i10, double d10) {
        m222z(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    /* renamed from: i */
    public static void m205i(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            m222z(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            m222z(parcel, i10, 0);
        }
    }

    /* renamed from: j */
    public static void m206j(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            m222z(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            m222z(parcel, i10, 0);
        }
    }

    /* renamed from: k */
    public static void m207k(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: l */
    public static void m208l(Parcel parcel, int i10, int i11) {
        m222z(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    /* renamed from: m */
    public static void m209m(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeIntArray(iArr);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: n */
    public static void m210n(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            m222z(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            m222z(parcel, i10, 0);
        }
    }

    /* renamed from: o */
    public static void m211o(Parcel parcel, int i10, long j10) {
        m222z(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    /* renamed from: p */
    public static void m212p(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            m222z(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            m222z(parcel, i10, 0);
        }
    }

    /* renamed from: q */
    public static void m213q(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: r */
    public static void m214r(Parcel parcel, int i10, short s10) {
        m222z(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    /* renamed from: s */
    public static void m215s(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeString(str);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: t */
    public static void m216t(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeStringArray(strArr);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: u */
    public static void m217u(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m222z(parcel, i10, 0);
            }
        } else {
            int m220x = m220x(parcel, i10);
            parcel.writeStringList(list);
            m221y(parcel, m220x);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m218v(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                m222z(parcel, i10, 0);
                return;
            }
            return;
        }
        int m220x = m220x(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m196A(parcel, t10, i11);
            }
        }
        m221y(parcel, m220x);
    }

    /* renamed from: w */
    public static <T extends Parcelable> void m219w(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m222z(parcel, i10, 0);
                return;
            }
            return;
        }
        int m220x = m220x(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m196A(parcel, t10, 0);
            }
        }
        m221y(parcel, m220x);
    }

    /* renamed from: x */
    private static int m220x(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: y */
    private static void m221y(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: z */
    private static void m222z(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
