package p110i3;

import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import p110i3.InterfaceC3516a;
import p321z2.C5984j;

/* renamed from: i3.b */
/* loaded from: classes.dex */
public final class BinderC3517b<T> extends InterfaceC3516a.a {

    /* renamed from: c */
    private final Object f14503c;

    private BinderC3517b(Object obj) {
        this.f14503c = obj;
    }

    /* renamed from: J0 */
    public static <T> InterfaceC3516a m15328J0(T t10) {
        return new BinderC3517b(t10);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: n */
    public static <T> T m15329n(InterfaceC3516a interfaceC3516a) {
        if (interfaceC3516a instanceof BinderC3517b) {
            return (T) ((BinderC3517b) interfaceC3516a).f14503c;
        }
        IBinder asBinder = interfaceC3516a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            C5984j.m21286j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
