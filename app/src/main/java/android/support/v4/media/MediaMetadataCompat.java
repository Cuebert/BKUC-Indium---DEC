package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p093h0.C3356a;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: p */
    static final C3356a<String, Integer> f340p;

    /* renamed from: q */
    private static final String[] f341q;

    /* renamed from: r */
    private static final String[] f342r;

    /* renamed from: s */
    private static final String[] f343s;

    /* renamed from: n */
    final Bundle f344n;

    /* renamed from: o */
    private Object f345o;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes.dex */
    static class C0096a implements Parcelable.Creator<MediaMetadataCompat> {
        C0096a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C3356a<String, Integer> c3356a = new C3356a<>();
        f340p = c3356a;
        c3356a.put("android.media.metadata.TITLE", 1);
        c3356a.put("android.media.metadata.ARTIST", 1);
        c3356a.put("android.media.metadata.DURATION", 0);
        c3356a.put("android.media.metadata.ALBUM", 1);
        c3356a.put("android.media.metadata.AUTHOR", 1);
        c3356a.put("android.media.metadata.WRITER", 1);
        c3356a.put("android.media.metadata.COMPOSER", 1);
        c3356a.put("android.media.metadata.COMPILATION", 1);
        c3356a.put("android.media.metadata.DATE", 1);
        c3356a.put("android.media.metadata.YEAR", 0);
        c3356a.put("android.media.metadata.GENRE", 1);
        c3356a.put("android.media.metadata.TRACK_NUMBER", 0);
        c3356a.put("android.media.metadata.NUM_TRACKS", 0);
        c3356a.put("android.media.metadata.DISC_NUMBER", 0);
        c3356a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c3356a.put("android.media.metadata.ART", 2);
        c3356a.put("android.media.metadata.ART_URI", 1);
        c3356a.put("android.media.metadata.ALBUM_ART", 2);
        c3356a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c3356a.put("android.media.metadata.USER_RATING", 3);
        c3356a.put("android.media.metadata.RATING", 3);
        c3356a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c3356a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c3356a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c3356a.put("android.media.metadata.DISPLAY_ICON", 2);
        c3356a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c3356a.put("android.media.metadata.MEDIA_ID", 1);
        c3356a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c3356a.put("android.media.metadata.MEDIA_URI", 1);
        c3356a.put("android.media.metadata.ADVERTISEMENT", 0);
        c3356a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f341q = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f342r = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f343s = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0096a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f344n = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m474a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0100c.m499a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f345o = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f344n);
    }
}
