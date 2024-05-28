package p020b6;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: b6.v */
/* loaded from: classes.dex */
public abstract class AbstractC1071v<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b6.v$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1071v<T> {
        a() {
        }

        @Override // p020b6.AbstractC1071v
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) AbstractC1071v.this.read(jsonReader);
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
            } else {
                AbstractC1071v.this.write(jsonWriter, t10);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(AbstractC1061l abstractC1061l) {
        try {
            return read(new JsonTreeReader(abstractC1061l));
        } catch (IOException e10) {
            throw new C1062m(e10);
        }
    }

    public final AbstractC1071v<T> nullSafe() {
        return new a();
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t10) throws IOException {
        write(new JsonWriter(writer), t10);
    }

    public final AbstractC1061l toJsonTree(T t10) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t10);
            return jsonTreeWriter.get();
        } catch (IOException e10) {
            throw new C1062m(e10);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t10) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
