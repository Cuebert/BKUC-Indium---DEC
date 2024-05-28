package p321z2;

import android.content.Context;
import android.content.res.Resources;
import p282w2.C5107e;

/* renamed from: z2.l */
/* loaded from: classes.dex */
public class C5988l {

    /* renamed from: a */
    private final Resources f22056a;

    /* renamed from: b */
    private final String f22057b;

    public C5988l(Context context) {
        C5984j.m21286j(context);
        Resources resources = context.getResources();
        this.f22056a = resources;
        this.f22057b = resources.getResourcePackageName(C5107e.f19372a);
    }

    /* renamed from: a */
    public String m21296a(String str) {
        int identifier = this.f22056a.getIdentifier(str, "string", this.f22057b);
        if (identifier == 0) {
            return null;
        }
        return this.f22056a.getString(identifier);
    }
}
