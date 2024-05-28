package p274v6;

import com.roblox.client.C2822f0;
import com.roblox.client.datastructures.NameValuePair;
import java.util.ArrayList;

/* renamed from: v6.b */
/* loaded from: classes.dex */
public class C4987b {
    /* renamed from: a */
    public void m19426a(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new NameValuePair("action", str));
        C2822f0.m12486h("saveAction", "storingCredentials", arrayList);
    }

    /* renamed from: b */
    public void m19427b(String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new NameValuePair("action", str));
        arrayList.add(new NameValuePair("error", str2));
        C2822f0.m12486h("saveAction", "storingCredentials", arrayList);
    }

    /* renamed from: c */
    public void m19428c(String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new NameValuePair("action", str));
        C2822f0.m12486h("suggestionsAction", "storingCredentials", arrayList);
    }

    /* renamed from: d */
    public void m19429d(String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new NameValuePair("action", str));
        arrayList.add(new NameValuePair("error", str2));
        C2822f0.m12486h("suggestionsAction", "storingCredentials", arrayList);
    }
}
