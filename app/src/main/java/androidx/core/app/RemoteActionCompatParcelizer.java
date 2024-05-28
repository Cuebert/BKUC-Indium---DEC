package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0941a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0941a abstractC0941a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3048a = (IconCompat) abstractC0941a.m6069v(remoteActionCompat.f3048a, 1);
        remoteActionCompat.f3049b = abstractC0941a.m6059l(remoteActionCompat.f3049b, 2);
        remoteActionCompat.f3050c = abstractC0941a.m6059l(remoteActionCompat.f3050c, 3);
        remoteActionCompat.f3051d = (PendingIntent) abstractC0941a.m6065r(remoteActionCompat.f3051d, 4);
        remoteActionCompat.f3052e = abstractC0941a.m6055h(remoteActionCompat.f3052e, 5);
        remoteActionCompat.f3053f = abstractC0941a.m6055h(remoteActionCompat.f3053f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0941a abstractC0941a) {
        abstractC0941a.m6071x(false, false);
        abstractC0941a.m6050M(remoteActionCompat.f3048a, 1);
        abstractC0941a.m6041D(remoteActionCompat.f3049b, 2);
        abstractC0941a.m6041D(remoteActionCompat.f3050c, 3);
        abstractC0941a.m6045H(remoteActionCompat.f3051d, 4);
        abstractC0941a.m6073z(remoteActionCompat.f3052e, 5);
        abstractC0941a.m6073z(remoteActionCompat.f3053f, 6);
    }
}
