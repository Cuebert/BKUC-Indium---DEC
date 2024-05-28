package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0138a();

    /* renamed from: n */
    private final IntentSender f466n;

    /* renamed from: o */
    private final Intent f467o;

    /* renamed from: p */
    private final int f468p;

    /* renamed from: q */
    private final int f469q;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    /* loaded from: classes.dex */
    class C0138a implements Parcelable.Creator<IntentSenderRequest> {
        C0138a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    /* loaded from: classes.dex */
    public static final class C0139b {

        /* renamed from: a */
        private IntentSender f470a;

        /* renamed from: b */
        private Intent f471b;

        /* renamed from: c */
        private int f472c;

        /* renamed from: d */
        private int f473d;

        public C0139b(IntentSender intentSender) {
            this.f470a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest m632a() {
            return new IntentSenderRequest(this.f470a, this.f471b, this.f472c, this.f473d);
        }

        /* renamed from: b */
        public C0139b m633b(Intent intent) {
            this.f471b = intent;
            return this;
        }

        /* renamed from: c */
        public C0139b m634c(int i10, int i11) {
            this.f473d = i10;
            this.f472c = i11;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f466n = intentSender;
        this.f467o = intent;
        this.f468p = i10;
        this.f469q = i11;
    }

    /* renamed from: a */
    public Intent m626a() {
        return this.f467o;
    }

    /* renamed from: b */
    public int m627b() {
        return this.f468p;
    }

    /* renamed from: c */
    public int m628c() {
        return this.f469q;
    }

    /* renamed from: d */
    public IntentSender m629d() {
        return this.f466n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f466n, i10);
        parcel.writeParcelable(this.f467o, i10);
        parcel.writeInt(this.f468p);
        parcel.writeInt(this.f469q);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f466n = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f467o = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f468p = parcel.readInt();
        this.f469q = parcel.readInt();
    }
}
