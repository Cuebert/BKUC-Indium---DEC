package p310y4;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: y4.a */
/* loaded from: classes.dex */
public final class C5882a implements InterfaceC5884c {

    /* renamed from: a */
    private final float f21610a;

    public C5882a(float f10) {
        this.f21610a = f10;
    }

    @Override // p310y4.InterfaceC5884c
    /* renamed from: a */
    public float mo20790a(RectF rectF) {
        return this.f21610a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5882a) && this.f21610a == ((C5882a) obj).f21610a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21610a)});
    }
}
