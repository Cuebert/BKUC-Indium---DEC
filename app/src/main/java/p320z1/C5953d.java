package p320z1;

import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z1.d */
/* loaded from: classes.dex */
public final class C5953d extends AbstractC5959j {

    /* renamed from: a */
    private final List<AbstractC5962m> f21924a;

    public C5953d(List<AbstractC5962m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f21924a = list;
    }

    @Override // p320z1.AbstractC5959j
    /* renamed from: c */
    public List<AbstractC5962m> mo21180c() {
        return this.f21924a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5959j) {
            return this.f21924a.equals(((AbstractC5959j) obj).mo21180c());
        }
        return false;
    }

    public int hashCode() {
        return this.f21924a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21924a + "}";
    }
}
