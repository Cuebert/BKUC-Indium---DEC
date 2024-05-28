package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r9 */
/* loaded from: classes.dex */
public final class C1765r9 extends C1691n {

    /* renamed from: o */
    private final C1509c f7207o;

    public C1765r9(C1509c c1509c) {
        this.f7207o = c1509c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C1691n, com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            C1745q5.m8722h("getEventName", 0, list);
            return new C1803u(this.f7207o.m7968b().m7935d());
        }
        if (c10 == 1) {
            C1745q5.m8722h("getParamValue", 1, list);
            return C1762r6.m8765b(this.f7207o.m7968b().m7934c(c1728p4.m8655b(list.get(0)).mo8132e()));
        }
        if (c10 == 2) {
            C1745q5.m8722h("getParams", 0, list);
            Map<String, Object> m7936e = this.f7207o.m7968b().m7936e();
            C1691n c1691n = new C1691n();
            for (String str2 : m7936e.keySet()) {
                c1691n.mo8137o(str2, C1762r6.m8765b(m7936e.get(str2)));
            }
            return c1691n;
        }
        if (c10 == 3) {
            C1745q5.m8722h("getTimestamp", 0, list);
            return new C1611i(Double.valueOf(this.f7207o.m7968b().m7932a()));
        }
        if (c10 != 4) {
            if (c10 != 5) {
                return super.mo8138p(str, c1728p4, list);
            }
            C1745q5.m8722h("setParamValue", 2, list);
            String mo8132e = c1728p4.m8655b(list.get(0)).mo8132e();
            InterfaceC1739q m8655b = c1728p4.m8655b(list.get(1));
            this.f7207o.m7968b().m7938g(mo8132e, C1745q5.m8720f(m8655b));
            return m8655b;
        }
        C1745q5.m8722h("setEventName", 1, list);
        InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(0));
        if (!InterfaceC1739q.f7165b.equals(m8655b2) && !InterfaceC1739q.f7166c.equals(m8655b2)) {
            this.f7207o.m7968b().m7937f(m8655b2.mo8132e());
            return new C1803u(m8655b2.mo8132e());
        }
        throw new IllegalArgumentException("Illegal event name");
    }
}
