package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes.dex */
public final class C1611i implements InterfaceC1739q {

    /* renamed from: n */
    private final Double f6836n;

    public C1611i(Double d10) {
        if (d10 == null) {
            this.f6836n = Double.valueOf(Double.NaN);
        } else {
            this.f6836n = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return new C1611i(this.f6836n);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        return this.f6836n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        int scale;
        if (Double.isNaN(this.f6836n.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f6836n.doubleValue())) {
            return this.f6836n.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f6836n.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
            return stripTrailingZeros.toPlainString();
        }
        return format.replace("E-", "e-").replace("E", "e+");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1611i) {
            return this.f6836n.equals(((C1611i) obj).f6836n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6836n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        boolean z10 = false;
        if (!Double.isNaN(this.f6836n.doubleValue()) && this.f6836n.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if ("toString".equals(str)) {
            return new C1803u(mo8132e());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", mo8132e(), str));
    }

    public final String toString() {
        return mo8132e();
    }
}
