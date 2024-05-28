package p309y3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3879f;

/* renamed from: y3.d */
/* loaded from: classes.dex */
public final class C5667d {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3877d<?>> f20894a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3879f<?>> f20895b;

    /* renamed from: c */
    private final InterfaceC3877d<Object> f20896c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5667d(Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d) {
        this.f20894a = map;
        this.f20895b = map2;
        this.f20896c = interfaceC3877d;
    }

    /* renamed from: a */
    public final byte[] m20669a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C5746k8(byteArrayOutputStream, this.f20894a, this.f20895b, this.f20896c).m20707h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
