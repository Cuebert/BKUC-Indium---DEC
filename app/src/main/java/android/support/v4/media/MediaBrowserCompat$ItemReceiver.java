package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    /* renamed from: a */
    protected void mo458a(int i10, Bundle bundle) {
        MediaSessionCompat.m507a(bundle);
        if (i10 != 0) {
            throw null;
        }
        if (bundle != null) {
            if (bundle.containsKey("media_item")) {
                Parcelable parcelable = bundle.getParcelable("media_item");
                if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
