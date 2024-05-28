package backtraceio.library.models.json;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Annotations {
    public static Map<String, Object> getAnnotations(Object obj, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("Environment Variables", System.getenv());
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("Exception", new AnnotationException(obj));
        return hashMap;
    }
}
