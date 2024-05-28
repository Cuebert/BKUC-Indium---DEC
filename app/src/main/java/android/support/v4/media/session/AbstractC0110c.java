package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0112e;
import android.support.v4.media.session.InterfaceC0108a;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0110c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f383a = C0112e.m553a(new a(this));

    /* renamed from: b */
    InterfaceC0108a f384b;

    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    private static class a implements C0112e.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0110c> f385a;

        a(AbstractC0110c abstractC0110c) {
            this.f385a = new WeakReference<>(abstractC0110c);
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: a */
        public void mo545a(Object obj) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                abstractC0110c.m538c(MediaMetadataCompat.m474a(obj));
            }
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: b */
        public void mo546b(int i10, int i11, int i12, int i13, int i14) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                abstractC0110c.m536a(new C0111d(i10, i11, i12, i13, i14));
            }
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: c */
        public void mo547c(Object obj) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c == null || abstractC0110c.f384b != null) {
                return;
            }
            abstractC0110c.m539d(PlaybackStateCompat.m521a(obj));
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: d */
        public void mo548d(CharSequence charSequence) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                abstractC0110c.m541f(charSequence);
            }
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: e */
        public void mo549e(String str, Bundle bundle) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                if (abstractC0110c.f384b == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0110c.m543h(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: f */
        public void mo550f() {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                abstractC0110c.m542g();
            }
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: j */
        public void mo551j(Bundle bundle) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                abstractC0110c.m537b(bundle);
            }
        }

        @Override // android.support.v4.media.session.C0112e.a
        /* renamed from: k */
        public void mo552k(List<?> list) {
            AbstractC0110c abstractC0110c = this.f385a.get();
            if (abstractC0110c != null) {
                abstractC0110c.m540e(MediaSessionCompat.QueueItem.m509b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    public static class b extends InterfaceC0108a.a {

        /* renamed from: c */
        private final WeakReference<AbstractC0110c> f386c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(AbstractC0110c abstractC0110c) {
            this.f386c = new WeakReference<>(abstractC0110c);
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: B0 */
        public void mo527B0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            AbstractC0110c abstractC0110c = this.f386c.get();
            if (abstractC0110c != null) {
                abstractC0110c.m544i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: D0 */
        public void mo528D0(String str, Bundle bundle) throws RemoteException {
            AbstractC0110c abstractC0110c = this.f386c.get();
            if (abstractC0110c != null) {
                abstractC0110c.m544i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: G */
        public void mo529G(int i10) throws RemoteException {
            AbstractC0110c abstractC0110c = this.f386c.get();
            if (abstractC0110c != null) {
                abstractC0110c.m544i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: Q */
        public void mo530Q(int i10) throws RemoteException {
            AbstractC0110c abstractC0110c = this.f386c.get();
            if (abstractC0110c != null) {
                abstractC0110c.m544i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: S */
        public void mo531S() throws RemoteException {
            AbstractC0110c abstractC0110c = this.f386c.get();
            if (abstractC0110c != null) {
                abstractC0110c.m544i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: o */
        public void mo532o(boolean z10) throws RemoteException {
        }

        @Override // android.support.v4.media.session.InterfaceC0108a
        /* renamed from: v0 */
        public void mo533v0(boolean z10) throws RemoteException {
            AbstractC0110c abstractC0110c = this.f386c.get();
            if (abstractC0110c != null) {
                abstractC0110c.m544i(11, Boolean.valueOf(z10), null);
            }
        }
    }

    /* renamed from: a */
    public void m536a(C0111d c0111d) {
    }

    /* renamed from: b */
    public void m537b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m544i(8, null, null);
    }

    /* renamed from: c */
    public void m538c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m539d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m540e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m541f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m542g() {
    }

    /* renamed from: h */
    public void m543h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m544i(int i10, Object obj, Bundle bundle) {
    }
}
