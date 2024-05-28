package p020b6;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* renamed from: b6.q */
/* loaded from: classes.dex */
public final class C1066q extends AbstractC1061l {

    /* renamed from: b */
    private static final Class<?>[] f5298b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f5299a;

    public C1066q(Boolean bool) {
        m6346C(bool);
    }

    /* renamed from: A */
    private static boolean m6343A(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f5298b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    private static boolean m6344y(C1066q c1066q) {
        Object obj = c1066q.f5299a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: B */
    public boolean m6345B() {
        return this.f5299a instanceof String;
    }

    /* renamed from: C */
    void m6346C(Object obj) {
        if (obj instanceof Character) {
            this.f5299a = String.valueOf(((Character) obj).charValue());
        } else {
            C$Gson$Preconditions.checkArgument((obj instanceof Number) || m6343A(obj));
            this.f5299a = obj;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1066q.class != obj.getClass()) {
            return false;
        }
        C1066q c1066q = (C1066q) obj;
        if (this.f5299a == null) {
            return c1066q.f5299a == null;
        }
        if (m6344y(this) && m6344y(c1066q)) {
            return m6352v().longValue() == c1066q.m6352v().longValue();
        }
        Object obj2 = this.f5299a;
        if ((obj2 instanceof Number) && (c1066q.f5299a instanceof Number)) {
            double doubleValue = m6352v().doubleValue();
            double doubleValue2 = c1066q.m6352v().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        }
        return obj2.equals(c1066q.f5299a);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f5299a == null) {
            return 31;
        }
        if (m6344y(this)) {
            doubleToLongBits = m6352v().longValue();
        } else {
            Object obj = this.f5299a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m6352v().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: p */
    public boolean m6347p() {
        if (m6354x()) {
            return m6348q().booleanValue();
        }
        return Boolean.parseBoolean(m6353w());
    }

    /* renamed from: q */
    Boolean m6348q() {
        return (Boolean) this.f5299a;
    }

    /* renamed from: r */
    public double m6349r() {
        return m6355z() ? m6352v().doubleValue() : Double.parseDouble(m6353w());
    }

    /* renamed from: s */
    public int m6350s() {
        return m6355z() ? m6352v().intValue() : Integer.parseInt(m6353w());
    }

    /* renamed from: u */
    public long m6351u() {
        return m6355z() ? m6352v().longValue() : Long.parseLong(m6353w());
    }

    /* renamed from: v */
    public Number m6352v() {
        Object obj = this.f5299a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    /* renamed from: w */
    public String m6353w() {
        if (m6355z()) {
            return m6352v().toString();
        }
        if (m6354x()) {
            return m6348q().toString();
        }
        return (String) this.f5299a;
    }

    /* renamed from: x */
    public boolean m6354x() {
        return this.f5299a instanceof Boolean;
    }

    /* renamed from: z */
    public boolean m6355z() {
        return this.f5299a instanceof Number;
    }

    public C1066q(Number number) {
        m6346C(number);
    }

    public C1066q(String str) {
        m6346C(str);
    }
}
