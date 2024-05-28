package p246t3;

import java.io.IOException;

/* renamed from: t3.m2 */
/* loaded from: classes.dex */
public final class C4678m2 extends IOException {
    public C4678m2(String str) {
        super(str);
    }

    public C4678m2(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
