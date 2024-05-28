package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Method;
import p093h0.C3356a;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C0942b extends AbstractC0941a {

    /* renamed from: d */
    private final SparseIntArray f5025d;

    /* renamed from: e */
    private final Parcel f5026e;

    /* renamed from: f */
    private final int f5027f;

    /* renamed from: g */
    private final int f5028g;

    /* renamed from: h */
    private final String f5029h;

    /* renamed from: i */
    private int f5030i;

    /* renamed from: j */
    private int f5031j;

    /* renamed from: k */
    private int f5032k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0942b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C3356a(), new C3356a(), new C3356a());
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: A */
    public void mo6038A(byte[] bArr) {
        if (bArr != null) {
            this.f5026e.writeInt(bArr.length);
            this.f5026e.writeByteArray(bArr);
        } else {
            this.f5026e.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: C */
    protected void mo6040C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5026e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: E */
    public void mo6042E(int i10) {
        this.f5026e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: G */
    public void mo6044G(Parcelable parcelable) {
        this.f5026e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: I */
    public void mo6046I(String str) {
        this.f5026e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: a */
    public void mo6051a() {
        int i10 = this.f5030i;
        if (i10 >= 0) {
            int i11 = this.f5025d.get(i10);
            int dataPosition = this.f5026e.dataPosition();
            this.f5026e.setDataPosition(i11);
            this.f5026e.writeInt(dataPosition - i11);
            this.f5026e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: b */
    protected AbstractC0941a mo6052b() {
        Parcel parcel = this.f5026e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f5031j;
        if (i10 == this.f5027f) {
            i10 = this.f5028g;
        }
        return new C0942b(parcel, dataPosition, i10, this.f5029h + "  ", this.f5022a, this.f5023b, this.f5024c);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: g */
    public boolean mo6054g() {
        return this.f5026e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: i */
    public byte[] mo6056i() {
        int readInt = this.f5026e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5026e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: k */
    protected CharSequence mo6058k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5026e);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: m */
    public boolean mo6060m(int i10) {
        while (this.f5031j < this.f5028g) {
            int i11 = this.f5032k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f5026e.setDataPosition(this.f5031j);
            int readInt = this.f5026e.readInt();
            this.f5032k = this.f5026e.readInt();
            this.f5031j += readInt;
        }
        return this.f5032k == i10;
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: o */
    public int mo6062o() {
        return this.f5026e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: q */
    public <T extends Parcelable> T mo6064q() {
        return (T) this.f5026e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: s */
    public String mo6066s() {
        return this.f5026e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: w */
    public void mo6070w(int i10) {
        mo6051a();
        this.f5030i = i10;
        this.f5025d.put(i10, this.f5026e.dataPosition());
        mo6042E(0);
        mo6042E(i10);
    }

    @Override // androidx.versionedparcelable.AbstractC0941a
    /* renamed from: y */
    public void mo6072y(boolean z10) {
        this.f5026e.writeInt(z10 ? 1 : 0);
    }

    private C0942b(Parcel parcel, int i10, int i11, String str, C3356a<String, Method> c3356a, C3356a<String, Method> c3356a2, C3356a<String, Class> c3356a3) {
        super(c3356a, c3356a2, c3356a3);
        this.f5025d = new SparseIntArray();
        this.f5030i = -1;
        this.f5032k = -1;
        this.f5026e = parcel;
        this.f5027f = i10;
        this.f5028g = i11;
        this.f5031j = i10;
        this.f5029h = str;
    }
}
