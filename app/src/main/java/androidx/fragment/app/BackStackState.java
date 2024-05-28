package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0819t;
import androidx.lifecycle.AbstractC0839f;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0768a();

    /* renamed from: A */
    final boolean f3767A;

    /* renamed from: n */
    final int[] f3768n;

    /* renamed from: o */
    final ArrayList<String> f3769o;

    /* renamed from: p */
    final int[] f3770p;

    /* renamed from: q */
    final int[] f3771q;

    /* renamed from: r */
    final int f3772r;

    /* renamed from: s */
    final String f3773s;

    /* renamed from: t */
    final int f3774t;

    /* renamed from: u */
    final int f3775u;

    /* renamed from: v */
    final CharSequence f3776v;

    /* renamed from: w */
    final int f3777w;

    /* renamed from: x */
    final CharSequence f3778x;

    /* renamed from: y */
    final ArrayList<String> f3779y;

    /* renamed from: z */
    final ArrayList<String> f3780z;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    /* loaded from: classes.dex */
    class C0768a implements Parcelable.Creator<BackStackState> {
        C0768a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(C0798a c0798a) {
        int size = c0798a.f4092c.size();
        this.f3768n = new int[size * 5];
        if (c0798a.f4098i) {
            this.f3769o = new ArrayList<>(size);
            this.f3770p = new int[size];
            this.f3771q = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                AbstractC0819t.a aVar = c0798a.f4092c.get(i10);
                int i12 = i11 + 1;
                this.f3768n[i11] = aVar.f4109a;
                ArrayList<String> arrayList = this.f3769o;
                Fragment fragment = aVar.f4110b;
                arrayList.add(fragment != null ? fragment.f3826s : null);
                int[] iArr = this.f3768n;
                int i13 = i12 + 1;
                iArr[i12] = aVar.f4111c;
                int i14 = i13 + 1;
                iArr[i13] = aVar.f4112d;
                int i15 = i14 + 1;
                iArr[i14] = aVar.f4113e;
                iArr[i15] = aVar.f4114f;
                this.f3770p[i10] = aVar.f4115g.ordinal();
                this.f3771q[i10] = aVar.f4116h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f3772r = c0798a.f4097h;
            this.f3773s = c0798a.f4100k;
            this.f3774t = c0798a.f3956v;
            this.f3775u = c0798a.f4101l;
            this.f3776v = c0798a.f4102m;
            this.f3777w = c0798a.f4103n;
            this.f3778x = c0798a.f4104o;
            this.f3779y = c0798a.f4105p;
            this.f3780z = c0798a.f4106q;
            this.f3767A = c0798a.f4107r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0798a m4255a(FragmentManager fragmentManager) {
        C0798a c0798a = new C0798a(fragmentManager);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f3768n.length) {
            AbstractC0819t.a aVar = new AbstractC0819t.a();
            int i12 = i10 + 1;
            aVar.f4109a = this.f3768n[i10];
            if (FragmentManager.m4403H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0798a + " op #" + i11 + " base fragment #" + this.f3768n[i12]);
            }
            String str = this.f3769o.get(i11);
            if (str != null) {
                aVar.f4110b = fragmentManager.m4493h0(str);
            } else {
                aVar.f4110b = null;
            }
            aVar.f4115g = AbstractC0839f.c.values()[this.f3770p[i11]];
            aVar.f4116h = AbstractC0839f.c.values()[this.f3771q[i11]];
            int[] iArr = this.f3768n;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar.f4111c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar.f4112d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar.f4113e = i18;
            int i19 = iArr[i17];
            aVar.f4114f = i19;
            c0798a.f4093d = i14;
            c0798a.f4094e = i16;
            c0798a.f4095f = i18;
            c0798a.f4096g = i19;
            c0798a.m4750f(aVar);
            i11++;
            i10 = i17 + 1;
        }
        c0798a.f4097h = this.f3772r;
        c0798a.f4100k = this.f3773s;
        c0798a.f3956v = this.f3774t;
        c0798a.f4098i = true;
        c0798a.f4101l = this.f3775u;
        c0798a.f4102m = this.f3776v;
        c0798a.f4103n = this.f3777w;
        c0798a.f4104o = this.f3778x;
        c0798a.f4105p = this.f3779y;
        c0798a.f4106q = this.f3780z;
        c0798a.f4107r = this.f3767A;
        c0798a.m4567u(1);
        return c0798a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3768n);
        parcel.writeStringList(this.f3769o);
        parcel.writeIntArray(this.f3770p);
        parcel.writeIntArray(this.f3771q);
        parcel.writeInt(this.f3772r);
        parcel.writeString(this.f3773s);
        parcel.writeInt(this.f3774t);
        parcel.writeInt(this.f3775u);
        TextUtils.writeToParcel(this.f3776v, parcel, 0);
        parcel.writeInt(this.f3777w);
        TextUtils.writeToParcel(this.f3778x, parcel, 0);
        parcel.writeStringList(this.f3779y);
        parcel.writeStringList(this.f3780z);
        parcel.writeInt(this.f3767A ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f3768n = parcel.createIntArray();
        this.f3769o = parcel.createStringArrayList();
        this.f3770p = parcel.createIntArray();
        this.f3771q = parcel.createIntArray();
        this.f3772r = parcel.readInt();
        this.f3773s = parcel.readString();
        this.f3774t = parcel.readInt();
        this.f3775u = parcel.readInt();
        this.f3776v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3777w = parcel.readInt();
        this.f3778x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3779y = parcel.createStringArrayList();
        this.f3780z = parcel.createStringArrayList();
        this.f3767A = parcel.readInt() != 0;
    }
}
