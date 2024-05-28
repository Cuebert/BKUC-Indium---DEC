package p020b6;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: b6.l */
/* loaded from: classes.dex */
public abstract class AbstractC1061l {
    /* renamed from: c */
    public C1058i m6334c() {
        if (m6337k()) {
            return (C1058i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C1064o m6335e() {
        if (m6339m()) {
            return (C1064o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: i */
    public C1066q m6336i() {
        if (m6340o()) {
            return (C1066q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: k */
    public boolean m6337k() {
        return this instanceof C1058i;
    }

    /* renamed from: l */
    public boolean m6338l() {
        return this instanceof C1063n;
    }

    /* renamed from: m */
    public boolean m6339m() {
        return this instanceof C1064o;
    }

    /* renamed from: o */
    public boolean m6340o() {
        return this instanceof C1066q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            Streams.write(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
