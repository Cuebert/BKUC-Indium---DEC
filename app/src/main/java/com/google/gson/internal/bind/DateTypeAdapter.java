package com.google.gson.internal.bind;

import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1069t;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class DateTypeAdapter extends AbstractC1071v<Date> {
    public static final InterfaceC1072w FACTORY = new InterfaceC1072w() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // p020b6.InterfaceC1072w
        public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> dateFormats;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }

    private synchronized Date deserializeToDate(String str) {
        Iterator<DateFormat> it = this.dateFormats.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return ISO8601Utils.parse(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new C1069t(str, e10);
        }
    }

    @Override // p020b6.AbstractC1071v
    public Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return deserializeToDate(jsonReader.nextString());
    }

    @Override // p020b6.AbstractC1071v
    public synchronized void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.dateFormats.get(0).format(date));
        }
    }
}
