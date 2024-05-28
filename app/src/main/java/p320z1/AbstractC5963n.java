package p320z1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: z1.n */
/* loaded from: classes.dex */
public abstract class AbstractC5963n {
    /* renamed from: a */
    static AbstractC5963n m21231a(long j10) {
        return new C5957h(j10);
    }

    /* renamed from: b */
    public static AbstractC5963n m21232b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return m21231a(Long.parseLong(jsonReader.nextString()));
                    }
                    return m21231a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo21216c();
}
