package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.measurement.w9 */
/* loaded from: classes.dex */
public final class C1845w9 {
    /* renamed from: a */
    public static String m8945a(InterfaceC1813u9 interfaceC1813u9, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m8948d(interfaceC1813u9, sb2, 0);
        return sb2.toString();
    }

    /* renamed from: b */
    public static final void m8946b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8946b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8946b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(C1766ra.m8767a(AbstractC1731p7.m8664u((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1731p7) {
            sb2.append(": \"");
            sb2.append(C1766ra.m8767a((AbstractC1731p7) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1732p8) {
            sb2.append(" {");
            m8948d((AbstractC1732p8) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i10 + 2;
            m8946b(sb2, i13, "key", entry.getKey());
            m8946b(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj.toString());
    }

    /* renamed from: c */
    private static final String m8947c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    private static void m8948d(InterfaceC1813u9 interfaceC1813u9, StringBuilder sb2, int i10) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC1813u9.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m8946b(sb2, i10, m8947c(concat), AbstractC1732p8.m8669m(method2, interfaceC1813u9, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m8946b(sb2, i10, m8947c(concat2), AbstractC1732p8.m8669m(method3, interfaceC1813u9, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object m8669m = AbstractC1732p8.m8669m(method4, interfaceC1813u9, new Object[0]);
                    if (method5 == null) {
                        if (m8669m instanceof Boolean) {
                            if (((Boolean) m8669m).booleanValue()) {
                                m8946b(sb2, i10, m8947c(concat3), m8669m);
                            }
                        } else if (m8669m instanceof Integer) {
                            if (((Integer) m8669m).intValue() != 0) {
                                m8946b(sb2, i10, m8947c(concat3), m8669m);
                            }
                        } else if (m8669m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m8669m).floatValue()) != 0) {
                                m8946b(sb2, i10, m8947c(concat3), m8669m);
                            }
                        } else if (!(m8669m instanceof Double)) {
                            if (m8669m instanceof String) {
                                equals = m8669m.equals(BuildConfig.FLAVOR);
                            } else if (m8669m instanceof AbstractC1731p7) {
                                equals = m8669m.equals(AbstractC1731p7.f7144o);
                            } else if (m8669m instanceof InterfaceC1813u9) {
                                if (m8669m != ((InterfaceC1813u9) m8669m).mo8462h()) {
                                    m8946b(sb2, i10, m8947c(concat3), m8669m);
                                }
                            } else {
                                if ((m8669m instanceof Enum) && ((Enum) m8669m).ordinal() == 0) {
                                }
                                m8946b(sb2, i10, m8947c(concat3), m8669m);
                            }
                            if (!equals) {
                                m8946b(sb2, i10, m8947c(concat3), m8669m);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) m8669m).doubleValue()) != 0) {
                            m8946b(sb2, i10, m8947c(concat3), m8669m);
                        }
                    } else if (((Boolean) AbstractC1732p8.m8669m(method5, interfaceC1813u9, new Object[0])).booleanValue()) {
                        m8946b(sb2, i10, m8947c(concat3), m8669m);
                    }
                }
            }
        }
        if (!(interfaceC1813u9 instanceof AbstractC1700n8)) {
            C1830va c1830va = ((AbstractC1732p8) interfaceC1813u9).zzc;
            if (c1830va != null) {
                c1830va.m8921g(sb2, i10);
                return;
            }
            return;
        }
        throw null;
    }
}
