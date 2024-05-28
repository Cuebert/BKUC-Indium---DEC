package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0797a();

    /* renamed from: n */
    final String f3941n;

    /* renamed from: o */
    final String f3942o;

    /* renamed from: p */
    final boolean f3943p;

    /* renamed from: q */
    final int f3944q;

    /* renamed from: r */
    final int f3945r;

    /* renamed from: s */
    final String f3946s;

    /* renamed from: t */
    final boolean f3947t;

    /* renamed from: u */
    final boolean f3948u;

    /* renamed from: v */
    final boolean f3949v;

    /* renamed from: w */
    final Bundle f3950w;

    /* renamed from: x */
    final boolean f3951x;

    /* renamed from: y */
    final int f3952y;

    /* renamed from: z */
    Bundle f3953z;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    /* loaded from: classes.dex */
    class C0797a implements Parcelable.Creator<FragmentState> {
        C0797a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f3941n = fragment.getClass().getName();
        this.f3942o = fragment.f3826s;
        this.f3943p = fragment.f3782A;
        this.f3944q = fragment.f3791J;
        this.f3945r = fragment.f3792K;
        this.f3946s = fragment.f3793L;
        this.f3947t = fragment.f3796O;
        this.f3948u = fragment.f3833z;
        this.f3949v = fragment.f3795N;
        this.f3950w = fragment.f3827t;
        this.f3951x = fragment.f3794M;
        this.f3952y = fragment.f3812e0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3941n);
        sb2.append(" (");
        sb2.append(this.f3942o);
        sb2.append(")}:");
        if (this.f3943p) {
            sb2.append(" fromLayout");
        }
        if (this.f3945r != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3945r));
        }
        String str = this.f3946s;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3946s);
        }
        if (this.f3947t) {
            sb2.append(" retainInstance");
        }
        if (this.f3948u) {
            sb2.append(" removing");
        }
        if (this.f3949v) {
            sb2.append(" detached");
        }
        if (this.f3951x) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3941n);
        parcel.writeString(this.f3942o);
        parcel.writeInt(this.f3943p ? 1 : 0);
        parcel.writeInt(this.f3944q);
        parcel.writeInt(this.f3945r);
        parcel.writeString(this.f3946s);
        parcel.writeInt(this.f3947t ? 1 : 0);
        parcel.writeInt(this.f3948u ? 1 : 0);
        parcel.writeInt(this.f3949v ? 1 : 0);
        parcel.writeBundle(this.f3950w);
        parcel.writeInt(this.f3951x ? 1 : 0);
        parcel.writeBundle(this.f3953z);
        parcel.writeInt(this.f3952y);
    }

    FragmentState(Parcel parcel) {
        this.f3941n = parcel.readString();
        this.f3942o = parcel.readString();
        this.f3943p = parcel.readInt() != 0;
        this.f3944q = parcel.readInt();
        this.f3945r = parcel.readInt();
        this.f3946s = parcel.readString();
        this.f3947t = parcel.readInt() != 0;
        this.f3948u = parcel.readInt() != 0;
        this.f3949v = parcel.readInt() != 0;
        this.f3950w = parcel.readBundle();
        this.f3951x = parcel.readInt() != 0;
        this.f3953z = parcel.readBundle();
        this.f3952y = parcel.readInt();
    }
}
