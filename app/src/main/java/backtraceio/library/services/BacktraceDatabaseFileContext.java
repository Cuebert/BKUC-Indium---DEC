package backtraceio.library.services;

import backtraceio.library.common.FileHelper;
import backtraceio.library.interfaces.DatabaseFileContext;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class BacktraceDatabaseFileContext implements DatabaseFileContext {
    private static final transient String LOG_TAG = "BacktraceDatabaseFileContext";
    private final File _databaseDirectory;
    private final String _databasePath;
    private final long _maxDatabaseSize;
    private final int _maxRecordNumber;
    private final String recordFilterRegex = ".*-record.json";
    private final String _crashpadDatabasePathPrefix = "crashpad";

    public BacktraceDatabaseFileContext(String str, long j10, int i10) {
        this._databasePath = str;
        this._maxDatabaseSize = j10;
        this._maxRecordNumber = i10;
        this._databaseDirectory = new File(str);
    }

    @Override // backtraceio.library.interfaces.DatabaseFileContext
    public void clear() {
        BacktraceLogger.m6448d(LOG_TAG, "Removing all files from database file context");
        Iterator<File> it = getAll().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @Override // backtraceio.library.interfaces.DatabaseFileContext
    public Iterable<File> getAll() {
        File[] listFiles = this._databaseDirectory.listFiles();
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    @Override // backtraceio.library.interfaces.DatabaseFileContext
    public Iterable<File> getRecords() {
        BacktraceLogger.m6448d(LOG_TAG, "Getting files from file context");
        final Pattern compile = Pattern.compile(".*-record.json");
        File[] listFiles = this._databaseDirectory.listFiles(new FileFilter() { // from class: backtraceio.library.services.BacktraceDatabaseFileContext.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return compile.matcher(file.getName()).matches();
            }
        });
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    @Override // backtraceio.library.interfaces.DatabaseFileContext
    public void removeOrphaned(Iterable<BacktraceDatabaseRecord> iterable) {
        BacktraceLogger.m6448d(LOG_TAG, "Removing orphaned files from file context");
        ArrayList arrayList = new ArrayList();
        Iterator<BacktraceDatabaseRecord> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f5357id.toString());
        }
        for (File file : getAll()) {
            if (!file.isDirectory() || !file.getName().endsWith("crashpad")) {
                if (!FileHelper.getFileExtension(file).equals("json")) {
                    BacktraceLogger.m6448d(LOG_TAG, "Deleting file - it is not a JSON file");
                    file.delete();
                } else {
                    int lastIndexOf = file.getName().lastIndexOf(45);
                    if (lastIndexOf == -1) {
                        BacktraceLogger.m6448d(LOG_TAG, "Deleting file - name is incorrect");
                        file.delete();
                    } else if (!arrayList.contains(file.getName().substring(0, lastIndexOf))) {
                        BacktraceLogger.m6448d(LOG_TAG, "Deleting file - file id is not in existing collection");
                        file.delete();
                    }
                }
            }
        }
    }

    @Override // backtraceio.library.interfaces.DatabaseFileContext
    public boolean validFileConsistency() {
        BacktraceLogger.m6448d(LOG_TAG, "Checking the consistency of files in file context");
        long j10 = 0;
        long j11 = 0;
        for (File file : getAll()) {
            if (file.getName().matches(".*-record.json")) {
                j10++;
                int i10 = this._maxRecordNumber;
                if (i10 != 0 && i10 < j10) {
                    BacktraceLogger.m6451w(LOG_TAG, "Total number of records is bigger than allowed");
                    return false;
                }
            }
            j11 += file.length();
            long j12 = this._maxDatabaseSize;
            if (j12 != 0 && j11 > j12) {
                BacktraceLogger.m6451w(LOG_TAG, "Database size is bigger than allowed");
                return false;
            }
        }
        return true;
    }
}
