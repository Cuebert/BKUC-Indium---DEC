package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
class C0099b {

    /* renamed from: android.support.v4.media.b$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        public static void m498a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m497a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
