package p261u5;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: u5.e */
/* loaded from: classes.dex */
public class C4864e {

    /* renamed from: a */
    private static final byte f18738a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f18739b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m19044b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m19045c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m19046a() {
        byte[] m19045c = m19045c(UUID.randomUUID(), new byte[17]);
        m19045c[16] = m19045c[0];
        m19045c[0] = (byte) ((f18739b & m19045c[0]) | f18738a);
        return m19044b(m19045c);
    }
}
