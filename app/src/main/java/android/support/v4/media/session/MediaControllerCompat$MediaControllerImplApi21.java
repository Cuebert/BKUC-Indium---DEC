package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0110c;
import android.support.v4.media.session.InterfaceC0109b;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0573f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f348a;

    /* renamed from: b */
    private final List<AbstractC0110c> f349b;

    /* renamed from: c */
    private HashMap<AbstractC0110c, BinderC0101a> f350c;

    /* renamed from: d */
    final MediaSessionCompat.Token f351d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: n */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f352n;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f352n.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f348a) {
                mediaControllerCompat$MediaControllerImplApi21.f351d.m515b(InterfaceC0109b.a.m535i(C0573f.m2763a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f351d.m516c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m500a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC0101a extends AbstractC0110c.b {
        BinderC0101a(AbstractC0110c abstractC0110c) {
            super(abstractC0110c);
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: I0 */
        public void mo501I0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: d */
        public void mo502d(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: f */
        public void mo503f() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: j */
        public void mo504j(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: k */
        public void mo505k(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: y */
        public void mo506y(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m500a() {
        if (this.f351d.m514a() == null) {
            return;
        }
        for (AbstractC0110c abstractC0110c : this.f349b) {
            BinderC0101a binderC0101a = new BinderC0101a(abstractC0110c);
            this.f350c.put(abstractC0110c, binderC0101a);
            abstractC0110c.f384b = binderC0101a;
            try {
                this.f351d.m514a().mo534u(binderC0101a);
                abstractC0110c.m544i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f349b.clear();
    }
}
