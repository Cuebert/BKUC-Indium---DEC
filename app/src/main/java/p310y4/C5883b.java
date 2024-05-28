package p310y4;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y4.b */
/* loaded from: classes.dex */
public final class C5883b implements InterfaceC5884c {

    /* renamed from: a */
    private final InterfaceC5884c f21611a;

    /* renamed from: b */
    private final float f21612b;

    public C5883b(float f10, InterfaceC5884c interfaceC5884c) {
        while (interfaceC5884c instanceof C5883b) {
            interfaceC5884c = ((C5883b) interfaceC5884c).f21611a;
            f10 += ((C5883b) interfaceC5884c).f21612b;
        }
        this.f21611a = interfaceC5884c;
        this.f21612b = f10;
    }

    @Override // p310y4.InterfaceC5884c
    /* renamed from: a */
    public float mo20790a(RectF rectF) {
        return Math.max(0.0f, this.f21611a.mo20790a(rectF) + this.f21612b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5883b)) {
            return false;
        }
        C5883b c5883b = (C5883b) obj;
        return this.f21611a.equals(c5883b.f21611a) && this.f21612b == c5883b.f21612b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21611a, Float.valueOf(this.f21612b)});
    }
}
