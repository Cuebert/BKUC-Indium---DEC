package p265u9;

import com.roblox.platform.NoObfuscate;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u9.b */
/* loaded from: classes.dex */
public class C4872b implements NoObfuscate {
    public final long conversation_id;
    public final Map<String, String>[] messages;

    public C4872b(long j10, String[] strArr) {
        this.conversation_id = j10;
        HashMap[] hashMapArr = new HashMap[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HashMap hashMap = new HashMap();
            hashMap.put("content", strArr[i10]);
            hashMapArr[i10] = hashMap;
        }
        this.messages = hashMapArr;
    }
}
