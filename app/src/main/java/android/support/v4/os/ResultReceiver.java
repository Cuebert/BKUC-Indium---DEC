package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.InterfaceC0119a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0116a();

    /* renamed from: n */
    final boolean f393n = false;

    /* renamed from: o */
    final Handler f394o = null;

    /* renamed from: p */
    InterfaceC0119a f395p;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    class C0116a implements Parcelable.Creator<ResultReceiver> {
        C0116a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    class BinderC0117b extends InterfaceC0119a.a {
        BinderC0117b() {
        }

        @Override // android.support.v4.os.InterfaceC0119a
        /* renamed from: F0 */
        public void mo575F0(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f394o;
            if (handler != null) {
                handler.post(new RunnableC0118c(i10, bundle));
            } else {
                resultReceiver.mo458a(i10, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    class RunnableC0118c implements Runnable {

        /* renamed from: n */
        final int f397n;

        /* renamed from: o */
        final Bundle f398o;

        RunnableC0118c(int i10, Bundle bundle) {
            this.f397n = i10;
            this.f398o = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo458a(this.f397n, this.f398o);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f395p = InterfaceC0119a.a.m576i(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo458a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f395p == null) {
                this.f395p = new BinderC0117b();
            }
            parcel.writeStrongBinder(this.f395p.asBinder());
        }
    }
}
