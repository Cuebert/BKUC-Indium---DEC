package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0114g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0107a();

    /* renamed from: n */
    final int f365n;

    /* renamed from: o */
    final long f366o;

    /* renamed from: p */
    final long f367p;

    /* renamed from: q */
    final float f368q;

    /* renamed from: r */
    final long f369r;

    /* renamed from: s */
    final int f370s;

    /* renamed from: t */
    final CharSequence f371t;

    /* renamed from: u */
    final long f372u;

    /* renamed from: v */
    List<CustomAction> f373v;

    /* renamed from: w */
    final long f374w;

    /* renamed from: x */
    final Bundle f375x;

    /* renamed from: y */
    private Object f376y;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    static class C0107a implements Parcelable.Creator<PlaybackStateCompat> {
        C0107a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f365n = i10;
        this.f366o = j10;
        this.f367p = j11;
        this.f368q = f10;
        this.f369r = j12;
        this.f370s = i11;
        this.f371t = charSequence;
        this.f372u = j13;
        this.f373v = new ArrayList(list);
        this.f374w = j14;
        this.f375x = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m521a(Object obj) {
        ArrayList arrayList;
        if (obj == null) {
            return null;
        }
        List<Object> m562d = C0114g.m562d(obj);
        if (m562d != null) {
            ArrayList arrayList2 = new ArrayList(m562d.size());
            Iterator<Object> it = m562d.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.m522a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0114g.m567i(obj), C0114g.m566h(obj), C0114g.m561c(obj), C0114g.m565g(obj), C0114g.m559a(obj), 0, C0114g.m563e(obj), C0114g.m564f(obj), arrayList, C0114g.m560b(obj), Build.VERSION.SDK_INT >= 22 ? C0115h.m572a(obj) : null);
        playbackStateCompat.f376y = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f365n + ", position=" + this.f366o + ", buffered position=" + this.f367p + ", speed=" + this.f368q + ", updated=" + this.f372u + ", actions=" + this.f369r + ", error code=" + this.f370s + ", error message=" + this.f371t + ", custom actions=" + this.f373v + ", active item id=" + this.f374w + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f365n);
        parcel.writeLong(this.f366o);
        parcel.writeFloat(this.f368q);
        parcel.writeLong(this.f372u);
        parcel.writeLong(this.f367p);
        parcel.writeLong(this.f369r);
        TextUtils.writeToParcel(this.f371t, parcel, i10);
        parcel.writeTypedList(this.f373v);
        parcel.writeLong(this.f374w);
        parcel.writeBundle(this.f375x);
        parcel.writeInt(this.f370s);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0106a();

        /* renamed from: n */
        private final String f377n;

        /* renamed from: o */
        private final CharSequence f378o;

        /* renamed from: p */
        private final int f379p;

        /* renamed from: q */
        private final Bundle f380q;

        /* renamed from: r */
        private Object f381r;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        static class C0106a implements Parcelable.Creator<CustomAction> {
            C0106a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f377n = str;
            this.f378o = charSequence;
            this.f379p = i10;
            this.f380q = bundle;
        }

        /* renamed from: a */
        public static CustomAction m522a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0114g.a.m568a(obj), C0114g.a.m571d(obj), C0114g.a.m570c(obj), C0114g.a.m569b(obj));
            customAction.f381r = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f378o) + ", mIcon=" + this.f379p + ", mExtras=" + this.f380q;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f377n);
            TextUtils.writeToParcel(this.f378o, parcel, i10);
            parcel.writeInt(this.f379p);
            parcel.writeBundle(this.f380q);
        }

        CustomAction(Parcel parcel) {
            this.f377n = parcel.readString();
            this.f378o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f379p = parcel.readInt();
            this.f380q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f365n = parcel.readInt();
        this.f366o = parcel.readLong();
        this.f368q = parcel.readFloat();
        this.f372u = parcel.readLong();
        this.f367p = parcel.readLong();
        this.f369r = parcel.readLong();
        this.f371t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f373v = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f374w = parcel.readLong();
        this.f375x = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f370s = parcel.readInt();
    }
}
