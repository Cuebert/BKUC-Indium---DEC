package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.play_billing.i2 */
/* loaded from: classes.dex */
public final class C1958i2 {

    /* renamed from: a */
    private static final char[] f7681a;

    static {
        char[] cArr = new char[80];
        f7681a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m9386a(InterfaceC1944g2 interfaceC1944g2, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m9389d(interfaceC1944g2, sb2, 0);
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m9387b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9387b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9387b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m9388c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(C1945g3.m9352a(new C2066y(((String) obj).getBytes(C1950h1.f7676b))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1914c0) {
            sb2.append(": \"");
            sb2.append(C1945g3.m9352a((AbstractC1914c0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1922d1) {
            sb2.append(" {");
            m9389d((AbstractC1922d1) obj, sb2, i10 + 2);
            sb2.append("\n");
            m9388c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            m9387b(sb2, i12, "key", entry.getKey());
            m9387b(sb2, i12, "value", entry.getValue());
            sb2.append("\n");
            m9388c(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* renamed from: c */
    private static void m9388c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f7681a, 0, i11);
            i10 -= i11;
        }
    }

    /* renamed from: d */
    private static void m9389d(InterfaceC1944g2 interfaceC1944g2, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC1944g2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m9387b(sb2, i10, substring.substring(0, substring.length() - 4), AbstractC1922d1.m9291l(method2, interfaceC1944g2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m9387b(sb2, i10, substring.substring(0, substring.length() - 3), AbstractC1922d1.m9291l(method, interfaceC1944g2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m9291l = AbstractC1922d1.m9291l(method4, interfaceC1944g2, new Object[0]);
                    if (method5 == null) {
                        if (m9291l instanceof Boolean) {
                            if (!((Boolean) m9291l).booleanValue()) {
                            }
                            m9387b(sb2, i10, substring, m9291l);
                        } else if (m9291l instanceof Integer) {
                            if (((Integer) m9291l).intValue() == 0) {
                            }
                            m9387b(sb2, i10, substring, m9291l);
                        } else if (m9291l instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m9291l).floatValue()) == 0) {
                            }
                            m9387b(sb2, i10, substring, m9291l);
                        } else if (!(m9291l instanceof Double)) {
                            if (m9291l instanceof String) {
                                equals = m9291l.equals(BuildConfig.FLAVOR);
                            } else if (m9291l instanceof AbstractC1914c0) {
                                equals = m9291l.equals(AbstractC1914c0.f7634o);
                            } else if (m9291l instanceof InterfaceC1944g2) {
                                if (m9291l == ((InterfaceC1944g2) m9291l).mo9300f()) {
                                }
                                m9387b(sb2, i10, substring, m9291l);
                            } else {
                                if ((m9291l instanceof Enum) && ((Enum) m9291l).ordinal() == 0) {
                                }
                                m9387b(sb2, i10, substring, m9291l);
                            }
                            if (equals) {
                            }
                            m9387b(sb2, i10, substring, m9291l);
                        } else {
                            if (Double.doubleToRawLongBits(((Double) m9291l).doubleValue()) == 0) {
                            }
                            m9387b(sb2, i10, substring, m9291l);
                        }
                    } else {
                        if (!((Boolean) AbstractC1922d1.m9291l(method5, interfaceC1944g2, new Object[0])).booleanValue()) {
                        }
                        m9387b(sb2, i10, substring, m9291l);
                    }
                }
            }
            i11 = 3;
        }
        if (!(interfaceC1944g2 instanceof AbstractC1901a1)) {
            C1966j3 c1966j3 = ((AbstractC1922d1) interfaceC1944g2).zzc;
            if (c1966j3 != null) {
                c1966j3.m9464i(sb2, i10);
                return;
            }
            return;
        }
        throw null;
    }
}
