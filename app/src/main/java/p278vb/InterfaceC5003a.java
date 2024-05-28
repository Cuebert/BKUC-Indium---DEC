package p278vb;

import ac.C0082l;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: vb.a */
/* loaded from: classes.dex */
public interface InterfaceC5003a {

    /* renamed from: a */
    public static final InterfaceC5003a f19103a = new a();

    /* renamed from: vb.a$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5003a {
        a() {
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: a */
        public void mo19453a(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: b */
        public InterfaceC0090t mo19454b(File file) throws FileNotFoundException {
            return C0082l.m431j(file);
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: c */
        public InterfaceC0089s mo19455c(File file) throws FileNotFoundException {
            try {
                return C0082l.m427f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0082l.m427f(file);
            }
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: d */
        public void mo19456d(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        mo19456d(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: e */
        public InterfaceC0089s mo19457e(File file) throws FileNotFoundException {
            try {
                return C0082l.m422a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0082l.m422a(file);
            }
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: f */
        public boolean mo19458f(File file) {
            return file.exists();
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: g */
        public void mo19459g(File file, File file2) throws IOException {
            mo19453a(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // p278vb.InterfaceC5003a
        /* renamed from: h */
        public long mo19460h(File file) {
            return file.length();
        }
    }

    /* renamed from: a */
    void mo19453a(File file) throws IOException;

    /* renamed from: b */
    InterfaceC0090t mo19454b(File file) throws FileNotFoundException;

    /* renamed from: c */
    InterfaceC0089s mo19455c(File file) throws FileNotFoundException;

    /* renamed from: d */
    void mo19456d(File file) throws IOException;

    /* renamed from: e */
    InterfaceC0089s mo19457e(File file) throws FileNotFoundException;

    /* renamed from: f */
    boolean mo19458f(File file);

    /* renamed from: g */
    void mo19459g(File file, File file2) throws IOException;

    /* renamed from: h */
    long mo19460h(File file);
}
