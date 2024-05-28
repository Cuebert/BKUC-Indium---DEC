package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0796a();

    /* renamed from: n */
    ArrayList<FragmentState> f3933n;

    /* renamed from: o */
    ArrayList<String> f3934o;

    /* renamed from: p */
    BackStackState[] f3935p;

    /* renamed from: q */
    int f3936q;

    /* renamed from: r */
    String f3937r;

    /* renamed from: s */
    ArrayList<String> f3938s;

    /* renamed from: t */
    ArrayList<Bundle> f3939t;

    /* renamed from: u */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3940u;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    /* loaded from: classes.dex */
    class C0796a implements Parcelable.Creator<FragmentManagerState> {
        C0796a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f3937r = null;
        this.f3938s = new ArrayList<>();
        this.f3939t = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f3933n);
        parcel.writeStringList(this.f3934o);
        parcel.writeTypedArray(this.f3935p, i10);
        parcel.writeInt(this.f3936q);
        parcel.writeString(this.f3937r);
        parcel.writeStringList(this.f3938s);
        parcel.writeTypedList(this.f3939t);
        parcel.writeTypedList(this.f3940u);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3937r = null;
        this.f3938s = new ArrayList<>();
        this.f3939t = new ArrayList<>();
        this.f3933n = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3934o = parcel.createStringArrayList();
        this.f3935p = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3936q = parcel.readInt();
        this.f3937r = parcel.readString();
        this.f3938s = parcel.createStringArrayList();
        this.f3939t = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3940u = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
