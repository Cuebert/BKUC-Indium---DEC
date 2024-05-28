package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActivityChooserModel extends DataSetObservable {

    /* renamed from: n */
    static final String f970n = ActivityChooserModel.class.getSimpleName();

    /* renamed from: o */
    private static final Object f971o = new Object();

    /* renamed from: p */
    private static final Map<String, ActivityChooserModel> f972p = new HashMap();

    /* renamed from: d */
    final Context f976d;

    /* renamed from: e */
    final String f977e;

    /* renamed from: f */
    private Intent f978f;

    /* renamed from: m */
    private OnChooseActivityListener f985m;

    /* renamed from: a */
    private final Object f973a = new Object();

    /* renamed from: b */
    private final List<ActivityResolveInfo> f974b = new ArrayList();

    /* renamed from: c */
    private final List<HistoricalRecord> f975c = new ArrayList();

    /* renamed from: g */
    private ActivitySorter f979g = new C0184a();

    /* renamed from: h */
    private int f980h = 50;

    /* renamed from: i */
    boolean f981i = true;

    /* renamed from: j */
    private boolean f982j = false;

    /* renamed from: k */
    private boolean f983k = true;

    /* renamed from: l */
    private boolean f984l = false;

    /* loaded from: classes.dex */
    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    /* loaded from: classes.dex */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        @Override // java.lang.Comparable
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }
    }

    /* loaded from: classes.dex */
    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    /* loaded from: classes.dex */
    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight);
        }

        public int hashCode() {
            ComponentName componentName = this.activity;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.time;
            return ((((hashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public String toString() {
            return "[; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        public HistoricalRecord(ComponentName componentName, long j10, float f10) {
            this.activity = componentName;
            this.time = j10;
            this.weight = f10;
        }
    }

    /* loaded from: classes.dex */
    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserModel$a */
    /* loaded from: classes.dex */
    private static final class C0184a implements ActivitySorter {

        /* renamed from: a */
        private final Map<ComponentName, ActivityResolveInfo> f986a = new HashMap();

        C0184a() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            Map<ComponentName, ActivityResolveInfo> map = this.f986a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ActivityResolveInfo activityResolveInfo = list.get(i10);
                activityResolveInfo.weight = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f10;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserModel$b */
    /* loaded from: classes.dex */
    public final class AsyncTaskC0185b extends AsyncTask<Object, Void, Void> {
        AsyncTaskC0185b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
        
            if (r15 != null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00d3, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        
            if (r15 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
        
            if (r15 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
        
            if (r15 == null) goto L30;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.AsyncTaskC0185b.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private ActivityChooserModel(Context context, String str) {
        this.f976d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            this.f977e = str + ".xml";
            return;
        }
        this.f977e = str;
    }

    /* renamed from: a */
    private boolean m1083a(HistoricalRecord historicalRecord) {
        boolean add = this.f975c.add(historicalRecord);
        if (add) {
            this.f983k = true;
            m1088l();
            m1087k();
            m1091r();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: c */
    private void m1084c() {
        boolean m1086j = m1086j() | m1089m();
        m1088l();
        if (m1086j) {
            m1091r();
            notifyChanged();
        }
    }

    /* renamed from: d */
    public static ActivityChooserModel m1085d(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (f971o) {
            Map<String, ActivityChooserModel> map = f972p;
            activityChooserModel = map.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new ActivityChooserModel(context, str);
                map.put(str, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    /* renamed from: j */
    private boolean m1086j() {
        if (!this.f984l || this.f978f == null) {
            return false;
        }
        this.f984l = false;
        this.f974b.clear();
        List<ResolveInfo> queryIntentActivities = this.f976d.getPackageManager().queryIntentActivities(this.f978f, 0);
        int size = queryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f974b.add(new ActivityResolveInfo(queryIntentActivities.get(i10)));
        }
        return true;
    }

    /* renamed from: k */
    private void m1087k() {
        if (this.f982j) {
            if (this.f983k) {
                this.f983k = false;
                if (TextUtils.isEmpty(this.f977e)) {
                    return;
                }
                new AsyncTaskC0185b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f975c), this.f977e);
                return;
            }
            return;
        }
        throw new IllegalStateException("No preceding call to #readHistoricalData");
    }

    /* renamed from: l */
    private void m1088l() {
        int size = this.f975c.size() - this.f980h;
        if (size <= 0) {
            return;
        }
        this.f983k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f975c.remove(0);
        }
    }

    /* renamed from: m */
    private boolean m1089m() {
        if (!this.f981i || !this.f983k || TextUtils.isEmpty(this.f977e)) {
            return false;
        }
        this.f981i = false;
        this.f982j = true;
        m1090n();
        return true;
    }

    /* renamed from: n */
    private void m1090n() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.f976d.openFileInput(this.f977e);
            try {
                try {
                    try {
                        newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        for (int i10 = 0; i10 != 1 && i10 != 2; i10 = newPullParser.next()) {
                        }
                    } catch (XmlPullParserException e10) {
                        Log.e(f970n, "Error reading historical recrod file: " + this.f977e, e10);
                        if (openFileInput == null) {
                            return;
                        }
                    }
                } catch (IOException e11) {
                    Log.e(f970n, "Error reading historical recrod file: " + this.f977e, e11);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<HistoricalRecord> list = this.f975c;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (next != 3 && next != 4) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new HistoricalRecord(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* renamed from: r */
    private boolean m1091r() {
        if (this.f979g == null || this.f978f == null || this.f974b.isEmpty() || this.f975c.isEmpty()) {
            return false;
        }
        this.f979g.sort(this.f978f, this.f974b, Collections.unmodifiableList(this.f975c));
        return true;
    }

    /* renamed from: b */
    public Intent m1092b(int i10) {
        synchronized (this.f973a) {
            if (this.f978f == null) {
                return null;
            }
            m1084c();
            ActivityInfo activityInfo = this.f974b.get(i10).resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f978f);
            intent.setComponent(componentName);
            if (this.f985m != null) {
                if (this.f985m.onChooseActivity(this, new Intent(intent))) {
                    return null;
                }
            }
            m1083a(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: e */
    public ResolveInfo m1093e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f973a) {
            m1084c();
            resolveInfo = this.f974b.get(i10).resolveInfo;
        }
        return resolveInfo;
    }

    /* renamed from: f */
    public int m1094f() {
        int size;
        synchronized (this.f973a) {
            m1084c();
            size = this.f974b.size();
        }
        return size;
    }

    /* renamed from: g */
    public int m1095g(ResolveInfo resolveInfo) {
        synchronized (this.f973a) {
            m1084c();
            List<ActivityResolveInfo> list = this.f974b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10).resolveInfo == resolveInfo) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* renamed from: h */
    public ResolveInfo m1096h() {
        synchronized (this.f973a) {
            m1084c();
            if (this.f974b.isEmpty()) {
                return null;
            }
            return this.f974b.get(0).resolveInfo;
        }
    }

    /* renamed from: i */
    public int m1097i() {
        int size;
        synchronized (this.f973a) {
            m1084c();
            size = this.f975c.size();
        }
        return size;
    }

    /* renamed from: o */
    public void m1098o(int i10) {
        synchronized (this.f973a) {
            m1084c();
            ActivityResolveInfo activityResolveInfo = this.f974b.get(i10);
            ActivityResolveInfo activityResolveInfo2 = this.f974b.get(0);
            float f10 = activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : 1.0f;
            ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
            m1083a(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
        }
    }

    /* renamed from: p */
    public void m1099p(Intent intent) {
        synchronized (this.f973a) {
            if (this.f978f == intent) {
                return;
            }
            this.f978f = intent;
            this.f984l = true;
            m1084c();
        }
    }

    /* renamed from: q */
    public void m1100q(OnChooseActivityListener onChooseActivityListener) {
        synchronized (this.f973a) {
            this.f985m = onChooseActivityListener;
        }
    }
}
