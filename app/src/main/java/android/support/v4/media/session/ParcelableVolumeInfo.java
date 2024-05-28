package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0105a();

    /* renamed from: n */
    public int f360n;

    /* renamed from: o */
    public int f361o;

    /* renamed from: p */
    public int f362p;

    /* renamed from: q */
    public int f363q;

    /* renamed from: r */
    public int f364r;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    static class C0105a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0105a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f360n = parcel.readInt();
        this.f362p = parcel.readInt();
        this.f363q = parcel.readInt();
        this.f364r = parcel.readInt();
        this.f361o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f360n);
        parcel.writeInt(this.f362p);
        parcel.writeInt(this.f363q);
        parcel.writeInt(this.f364r);
        parcel.writeInt(this.f361o);
    }
}
