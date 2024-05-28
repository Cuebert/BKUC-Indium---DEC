package androidx.media;

import androidx.versionedparcelable.AbstractC0941a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0941a abstractC0941a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4327a = abstractC0941a.m6063p(audioAttributesImplBase.f4327a, 1);
        audioAttributesImplBase.f4328b = abstractC0941a.m6063p(audioAttributesImplBase.f4328b, 2);
        audioAttributesImplBase.f4329c = abstractC0941a.m6063p(audioAttributesImplBase.f4329c, 3);
        audioAttributesImplBase.f4330d = abstractC0941a.m6063p(audioAttributesImplBase.f4330d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0941a abstractC0941a) {
        abstractC0941a.m6071x(false, false);
        abstractC0941a.m6043F(audioAttributesImplBase.f4327a, 1);
        abstractC0941a.m6043F(audioAttributesImplBase.f4328b, 2);
        abstractC0941a.m6043F(audioAttributesImplBase.f4329c, 3);
        abstractC0941a.m6043F(audioAttributesImplBase.f4330d, 4);
    }
}
