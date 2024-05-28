package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.x0 */
/* loaded from: classes.dex */
public abstract class AbstractC2061x0 {

    /* renamed from: a */
    private static final Logger f7880a = Logger.getLogger(AbstractC1970k0.class.getName());

    /* renamed from: b */
    private static final String f7881b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC2061x0() {
    }

    /* renamed from: b */
    public static C2005p0 m9678b(Class cls) {
        String format;
        ClassLoader classLoader = AbstractC2061x0.class.getClassLoader();
        if (cls.equals(C2005p0.class)) {
            format = f7881b;
        } else if (cls.getPackage().equals(AbstractC2061x0.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (C2005p0) cls.cast(((AbstractC2061x0) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m9679a());
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException(e10);
                    } catch (NoSuchMethodException e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (InvocationTargetException e12) {
                    throw new IllegalStateException(e12);
                }
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC2061x0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C2005p0) cls.cast(((AbstractC2061x0) it.next()).m9679a()));
                } catch (ServiceConfigurationError e14) {
                    f7880a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (C2005p0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2005p0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    /* renamed from: a */
    protected abstract C2005p0 m9679a();
}
