package p094h1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: h1.b */
/* loaded from: classes.dex */
final class C3365b implements Closeable {

    /* renamed from: n */
    private final File f14115n;

    /* renamed from: o */
    private final long f14116o;

    /* renamed from: p */
    private final File f14117p;

    /* renamed from: q */
    private final RandomAccessFile f14118q;

    /* renamed from: r */
    private final FileChannel f14119r;

    /* renamed from: s */
    private final FileLock f14120s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1.b$a */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1.b$b */
    /* loaded from: classes.dex */
    public static class b extends File {

        /* renamed from: n */
        public long f14122n;

        public b(File file, String str) {
            super(file, str);
            this.f14122n = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3365b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f14115n = file;
        this.f14117p = file2;
        this.f14116o = m14882z(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f14118q = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f14119r = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f14120s = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                m14878c(this.f14119r);
                throw e;
            } catch (Error e11) {
                e = e11;
                m14878c(this.f14119r);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                m14878c(this.f14119r);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e13) {
            m14878c(this.f14118q);
            throw e13;
        }
    }

    /* renamed from: O */
    private static boolean m14873O(Context context, File file, long j10, String str) {
        SharedPreferences m14880i = m14880i(context);
        if (m14880i.getLong(str + "timestamp", -1L) == m14881l(file)) {
            if (m14880i.getLong(str + "crc", -1L) == j10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: T */
    private List<b> m14874T(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f14115n.getName() + ".classes";
        SharedPreferences m14880i = m14880i(context);
        int i10 = m14880i.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            b bVar = new b(this.f14117p, str2 + i11 + ".zip");
            if (bVar.isFile()) {
                bVar.f14122n = m14882z(bVar);
                long j10 = m14880i.getLong(str + "dex.crc." + i11, -1L);
                long j11 = m14880i.getLong(str + "dex.time." + i11, -1L);
                long lastModified = bVar.lastModified();
                if (j11 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = m14880i;
                    if (j10 == bVar.f14122n) {
                        arrayList.add(bVar);
                        i11++;
                        m14880i = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f14122n);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: W */
    private List<b> m14875W() throws IOException {
        boolean z10;
        String str = this.f14115n.getName() + ".classes";
        m14877b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f14115n);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                b bVar = new b(this.f14117p, str + i10 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    m14879e(zipFile, entry, bVar, str);
                    try {
                        bVar.f14122n = m14882z(bVar);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f14122n);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (z11) {
                    i10++;
                    entry = zipFile.getEntry("classes" + i10 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
            return arrayList;
        } finally {
        }
    }

    /* renamed from: X */
    private static void m14876X(Context context, String str, long j10, long j11, List<b> list) {
        SharedPreferences.Editor edit = m14880i(context).edit();
        edit.putLong(str + "timestamp", j10);
        edit.putLong(str + "crc", j11);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i10, bVar.f14122n);
            edit.putLong(str + "dex.time." + i10, bVar.lastModified());
            i10++;
        }
        edit.commit();
    }

    /* renamed from: b */
    private void m14877b() {
        File[] listFiles = this.f14117p.listFiles(new a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f14117p.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    /* renamed from: c */
    private static void m14878c(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    /* renamed from: e */
    private static void m14879e(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + file.getPath());
                    if (createTempFile.renameTo(file)) {
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            m14878c(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: i */
    private static SharedPreferences m14880i(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: l */
    private static long m14881l(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: z */
    private static long m14882z(File file) throws IOException {
        long m14886c = C3366c.m14886c(file);
        return m14886c == -1 ? m14886c - 1 : m14886c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public List<? extends File> m14883Q(Context context, String str, boolean z10) throws IOException {
        List<b> m14875W;
        List<b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f14115n.getPath() + ", " + z10 + ", " + str + ")");
        if (this.f14120s.isValid()) {
            if (!z10 && !m14873O(context, this.f14115n, this.f14116o, str)) {
                try {
                    list = m14874T(context, str);
                } catch (IOException e10) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                    m14875W = m14875W();
                    m14876X(context, str, m14881l(this.f14115n), this.f14116o, m14875W);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            if (z10) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            m14875W = m14875W();
            m14876X(context, str, m14881l(this.f14115n), this.f14116o, m14875W);
            list = m14875W;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14120s.release();
        this.f14119r.close();
        this.f14118q.close();
    }
}
