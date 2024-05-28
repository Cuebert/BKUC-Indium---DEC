package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1069t;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class SqlDateTypeAdapter extends AbstractC1071v<Date> {
    public static final InterfaceC1072w FACTORY = new InterfaceC1072w() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // p020b6.InterfaceC1072w
        public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

    @Override // p020b6.AbstractC1071v
    public synchronized Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.format.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new C1069t(e10);
        }
    }

    @Override // p020b6.AbstractC1071v
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.format.format((java.util.Date) date));
    }
}
