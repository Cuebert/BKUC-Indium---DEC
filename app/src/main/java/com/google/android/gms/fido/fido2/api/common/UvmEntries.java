package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p004a3.C0029b;
import p321z2.C5980h;

/* loaded from: classes.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new C1463j();

    /* renamed from: n */
    private final List f6593n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UvmEntries(List list) {
        this.f6593n = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f6593n;
        return (list2 == null && uvmEntries.f6593n == null) || (list2 != null && (list = uvmEntries.f6593n) != null && list2.containsAll(list) && uvmEntries.f6593n.containsAll(this.f6593n));
    }

    public int hashCode() {
        return C5980h.m21270c(new HashSet(this.f6593n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m219w(parcel, 1, m7868x(), false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public List<UvmEntry> m7868x() {
        return this.f6593n;
    }

    /* renamed from: y */
    public final JSONArray m7869y() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f6593n != null) {
                for (int i10 = 0; i10 < this.f6593n.size(); i10++) {
                    UvmEntry uvmEntry = (UvmEntry) this.f6593n.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.m7871y());
                    jSONArray2.put((int) uvmEntry.m7870x());
                    jSONArray2.put((int) uvmEntry.m7871y());
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }
}
