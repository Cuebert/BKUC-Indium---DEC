package p232s0;

import android.os.Bundle;
import kotlin.jvm.internal.C3844i;

/* renamed from: s0.d */
/* loaded from: classes.dex */
public class C4493d extends AbstractC4492c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4493d(String type, Bundle data) {
        super(type, data);
        C3844i.m16253f(type, "type");
        C3844i.m16253f(data, "data");
        if (!(type.length() > 0)) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
    }
}
