package backtraceio.library.interfaces;

import java.io.IOException;

/* loaded from: classes.dex */
public interface DatabaseRecordWriter {
    String write(Object obj, String str) throws IOException;

    String write(byte[] bArr, String str) throws IOException;
}
