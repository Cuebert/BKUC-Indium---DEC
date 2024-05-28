package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
class C0112e {

    /* renamed from: android.support.v4.media.session.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo545a(Object obj);

        /* renamed from: b */
        void mo546b(int i10, int i11, int i12, int i13, int i14);

        /* renamed from: c */
        void mo547c(Object obj);

        /* renamed from: d */
        void mo548d(CharSequence charSequence);

        /* renamed from: e */
        void mo549e(String str, Bundle bundle);

        /* renamed from: f */
        void mo550f();

        /* renamed from: j */
        void mo551j(Bundle bundle);

        /* renamed from: k */
        void mo552k(List<?> list);
    }

    /* renamed from: android.support.v4.media.session.e$b */
    /* loaded from: classes.dex */
    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f392a;

        public b(T t10) {
            this.f392a = t10;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f392a.mo546b(playbackInfo.getPlaybackType(), c.m555b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m507a(bundle);
            this.f392a.mo551j(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f392a.mo545a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f392a.mo547c(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f392a.mo552k(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f392a.mo548d(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f392a.mo550f();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m507a(bundle);
            this.f392a.mo549e(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static AudioAttributes m554a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m555b(Object obj) {
            return m556c(m554a(obj));
        }

        /* renamed from: c */
        private static int m556c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m553a(a aVar) {
        return new b(aVar);
    }
}
