package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1518c8;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k8 */
/* loaded from: classes.dex */
public abstract class AbstractC1652k8<T extends C1518c8> {

    /* renamed from: a */
    private static final Logger f6932a = Logger.getLogger(AbstractC1859x7.class.getName());

    /* renamed from: b */
    private static final String f6933b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC1652k8() {
    }

    /* renamed from: b */
    public static <T extends C1518c8> T m8354b(Class<T> cls) {
        String format;
        ClassLoader classLoader = AbstractC1652k8.class.getClassLoader();
        if (cls.equals(C1518c8.class)) {
            format = f6933b;
        } else if (cls.getPackage().equals(AbstractC1652k8.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC1652k8) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m8355a());
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
            Iterator it = ServiceLoader.load(AbstractC1652k8.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC1652k8) it.next()).m8355a()));
                } catch (ServiceConfigurationError e14) {
                    Logger logger = f6932a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    protected abstract T m8355a();
}
