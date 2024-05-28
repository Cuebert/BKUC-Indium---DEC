package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1874y6;
import com.google.android.gms.internal.measurement.AbstractC1890z6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* loaded from: classes.dex */
public abstract class AbstractC1890z6<MessageType extends AbstractC1890z6<MessageType, BuilderType>, BuilderType extends AbstractC1874y6<MessageType, BuilderType>> implements InterfaceC1813u9 {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> void m9142c(Iterable<T> iterable, List<? super T> list) {
        C1860x8.m9009e(iterable);
        if (iterable instanceof InterfaceC1536d9) {
            List<?> mo8006d = ((InterfaceC1536d9) iterable).mo8006d();
            InterfaceC1536d9 interfaceC1536d9 = (InterfaceC1536d9) list;
            int size = list.size();
            for (Object obj : mo8006d) {
                if (obj == null) {
                    int size2 = interfaceC1536d9.size();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2 - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size3 = interfaceC1536d9.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        } else {
                            interfaceC1536d9.remove(size3);
                        }
                    }
                    throw new NullPointerException(sb3);
                }
                if (obj instanceof AbstractC1731p7) {
                    interfaceC1536d9.mo8010j((AbstractC1731p7) obj);
                } else {
                    interfaceC1536d9.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof InterfaceC1503ba)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    int size5 = list.size();
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(size5 - size4);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        } else {
                            list.remove(size6);
                        }
                    }
                    throw new NullPointerException(sb5);
                }
                list.add(t10);
            }
            return;
        }
        list.addAll(iterable);
    }

    /* renamed from: b */
    public int mo8677b() {
        throw null;
    }

    /* renamed from: e */
    public void mo8679e(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813u9
    /* renamed from: f */
    public final AbstractC1731p7 mo8864f() {
        try {
            int mo8680g = mo8680g();
            AbstractC1731p7 abstractC1731p7 = AbstractC1731p7.f7144o;
            byte[] bArr = new byte[mo8680g];
            AbstractC1859x7 m8998c = AbstractC1859x7.m8998c(bArr);
            mo8678d(m8998c);
            m8998c.m9003d();
            return new C1699n7(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* renamed from: i */
    public final byte[] m9143i() {
        try {
            byte[] bArr = new byte[mo8680g()];
            AbstractC1859x7 m8998c = AbstractC1859x7.m8998c(bArr);
            mo8678d(m8998c);
            m8998c.m9003d();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
