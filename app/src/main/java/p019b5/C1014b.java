package p019b5;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p031c5.C1130a;
import p295x2.C5507b;

/* renamed from: b5.b */
/* loaded from: classes.dex */
public class C1014b extends C5507b {

    /* renamed from: o */
    private final Throwable f5191o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1014b(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i10), C1130a.m6524a(i10))));
        if (i10 != 0) {
            this.f5191o = th;
            return;
        }
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f5191o;
    }
}
