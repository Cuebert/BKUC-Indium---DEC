package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1069t;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class TimeTypeAdapter extends AbstractC1071v<Time> {
    public static final InterfaceC1072w FACTORY = new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // p020b6.InterfaceC1072w
        public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

    @Override // p020b6.AbstractC1071v
    public synchronized Time read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.format.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new C1069t(e10);
        }
    }

    @Override // p020b6.AbstractC1071v
    public synchronized void write(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.format.format((Date) time));
    }
}
