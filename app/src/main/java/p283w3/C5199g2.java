package p283w3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3879f;

/* renamed from: w3.g2 */
/* loaded from: classes.dex */
public final class C5199g2 {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3877d<?>> f19693a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3879f<?>> f19694b;

    /* renamed from: c */
    private final InterfaceC3877d<Object> f19695c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5199g2(Map<Class<?>, InterfaceC3877d<?>> map, Map<Class<?>, InterfaceC3879f<?>> map2, InterfaceC3877d<Object> interfaceC3877d) {
        this.f19693a = map;
        this.f19694b = map2;
        this.f19695c = interfaceC3877d;
    }

    /* renamed from: a */
    public final byte[] m19828a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C5159d2(byteArrayOutputStream, this.f19693a, this.f19694b, this.f19695c).m19786h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
