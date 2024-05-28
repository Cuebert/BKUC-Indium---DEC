package androidx.media;

import androidx.versionedparcelable.AbstractC0941a;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0941a abstractC0941a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4324a = (AudioAttributesImpl) abstractC0941a.m6069v(audioAttributesCompat.f4324a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0941a abstractC0941a) {
        abstractC0941a.m6071x(false, false);
        abstractC0941a.m6050M(audioAttributesCompat.f4324a, 1);
    }
}
