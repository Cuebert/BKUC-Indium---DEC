package p135k1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: k1.r */
/* loaded from: classes.dex */
public class C3740r {

    /* renamed from: b */
    public View f15719b;

    /* renamed from: a */
    public final Map<String, Object> f15718a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC3734l> f15720c = new ArrayList<>();

    @Deprecated
    public C3740r() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3740r)) {
            return false;
        }
        C3740r c3740r = (C3740r) obj;
        return this.f15719b == c3740r.f15719b && this.f15718a.equals(c3740r.f15718a);
    }

    public int hashCode() {
        return (this.f15719b.hashCode() * 31) + this.f15718a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f15719b + "\n") + "    values:";
        for (String str2 : this.f15718a.keySet()) {
            str = str + "    " + str2 + ": " + this.f15718a.get(str2) + "\n";
        }
        return str;
    }

    public C3740r(View view) {
        this.f15719b = view;
    }
}
