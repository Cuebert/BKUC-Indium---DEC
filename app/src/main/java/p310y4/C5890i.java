package p310y4;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y4.i */
/* loaded from: classes.dex */
public final class C5890i implements InterfaceC5884c {

    /* renamed from: a */
    private final float f21663a;

    public C5890i(float f10) {
        this.f21663a = f10;
    }

    @Override // p310y4.InterfaceC5884c
    /* renamed from: a */
    public float mo20790a(RectF rectF) {
        return this.f21663a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5890i) && this.f21663a == ((C5890i) obj).f21663a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21663a)});
    }
}
