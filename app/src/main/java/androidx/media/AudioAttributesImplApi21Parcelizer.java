package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC0941a;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0941a abstractC0941a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4325a = (AudioAttributes) abstractC0941a.m6065r(audioAttributesImplApi21.f4325a, 1);
        audioAttributesImplApi21.f4326b = abstractC0941a.m6063p(audioAttributesImplApi21.f4326b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0941a abstractC0941a) {
        abstractC0941a.m6071x(false, false);
        abstractC0941a.m6045H(audioAttributesImplApi21.f4325a, 1);
        abstractC0941a.m6043F(audioAttributesImplApi21.f4326b, 2);
    }
}
