package p073f6;

import androidx.annotation.RecentlyNonNull;
import java.util.EnumMap;
import java.util.Map;
import p087g6.EnumC3301l;
import p099h6.EnumC3406a;
import p271v3.C4958i0;
import p271v3.C4960j0;
import p321z2.C5980h;

/* renamed from: f6.b */
/* loaded from: classes.dex */
public abstract class AbstractC3159b {

    /* renamed from: d */
    private static final Map<EnumC3406a, String> f13189d = new EnumMap(EnumC3406a.class);

    /* renamed from: e */
    @RecentlyNonNull
    public static final Map<EnumC3406a, String> f13190e = new EnumMap(EnumC3406a.class);

    /* renamed from: a */
    private final String f13191a;

    /* renamed from: b */
    private final EnumC3406a f13192b;

    /* renamed from: c */
    private final EnumC3301l f13193c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3159b)) {
            return false;
        }
        AbstractC3159b abstractC3159b = (AbstractC3159b) obj;
        return C5980h.m21269b(this.f13191a, abstractC3159b.f13191a) && C5980h.m21269b(this.f13192b, abstractC3159b.f13192b) && C5980h.m21269b(this.f13193c, abstractC3159b.f13193c);
    }

    public int hashCode() {
        return C5980h.m21270c(this.f13191a, this.f13192b, this.f13193c);
    }

    @RecentlyNonNull
    public String toString() {
        C4958i0 m19384a = C4960j0.m19384a("RemoteModel");
        m19384a.m19383a("modelName", this.f13191a);
        m19384a.m19383a("baseModel", this.f13192b);
        m19384a.m19383a("modelType", this.f13193c);
        return m19384a.toString();
    }
}
