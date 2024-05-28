package na;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0569b;
import androidx.core.content.C0587a;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1134c;

/* renamed from: na.d */
/* loaded from: classes.dex */
public abstract class AbstractC4089d {

    /* renamed from: a */
    private WeakReference<Activity> f16602a;

    /* renamed from: b */
    private MessageBus f16603b = MessageBus.m13364e();

    /* renamed from: c */
    private boolean f16604c = false;

    /* renamed from: d */
    private final Map<Integer, String[]> f16605d = new HashMap();

    /* renamed from: e */
    private int f16606e = 0;

    /* renamed from: f */
    private ArrayList<Connection> f16607f;

    public AbstractC4089d() {
        ArrayList<Connection> arrayList = new ArrayList<>();
        this.f16607f = arrayList;
        arrayList.add(this.f16603b.m13374o("PermissionsProtocol", "PermissionsRequest", new Callback() { // from class: na.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                AbstractC4089d.this.m17013m(jSONObject);
            }
        }));
        this.f16607f.add(this.f16603b.m13374o("PermissionsProtocol", "HasPermissions", new Callback() { // from class: na.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                AbstractC4089d.this.m17014n(jSONObject);
            }
        }));
        this.f16607f.add(this.f16603b.m13374o("PermissionsProtocol", "SupportsPermissions", new Callback() { // from class: na.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                AbstractC4089d.this.m17015o(jSONObject);
            }
        }));
    }

    /* renamed from: d */
    private JSONObject m17005d(String str, String[] strArr, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("missingPermissions", new JSONArray(strArr));
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str2 + ": " + e10.toString());
        }
        return jSONObject;
    }

    /* renamed from: e */
    private String[] m17006e(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            String[] strArr = new String[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                strArr[i10] = jSONArray.getString(i10);
            }
            return strArr;
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling " + str + ": " + e10.toString());
            return new String[0];
        }
    }

    /* renamed from: f */
    private static HashMap<String, String> m17007f(String str, String[] strArr) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (hashSet.contains("CAMERA_ACCESS")) {
            hashMap.put("missing_camera_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("MICROPHONE_ACCESS")) {
            hashMap.put("missing_microphone_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("LOCAL_NETWORK")) {
            hashMap.put("missing_local_network", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("CONTACTS_ACCESS")) {
            hashMap.put("missing_contacts_access", BuildConfig.FLAVOR);
        }
        if (hashSet.contains("WRITE_MEDIA_STORAGE")) {
            hashMap.put("missing_write_media_storage", BuildConfig.FLAVOR);
        }
        if (C1134c.m6537a().mo6634o0() && hashSet.contains("POST_NOTIFICATIONS")) {
            hashMap.put("missing_post_notifications", BuildConfig.FLAVOR);
        }
        hashMap.put("status", str);
        return hashMap;
    }

    /* renamed from: h */
    private void m17008h(String[] strArr) {
        WeakReference<Activity> weakReference = this.f16602a;
        if (weakReference != null && weakReference.get() != null) {
            List<String> m17011k = m17011k(strArr, this.f16602a.get());
            m17016q(m17011k.isEmpty() ? "AUTHORIZED" : "DENIED", (String[]) m17011k.toArray(new String[0]));
        } else {
            Log.e("PermissionsProtocol", "No Activity found while getting permission status");
            m17016q("DENIED", strArr);
        }
    }

    /* renamed from: i */
    private List<String> m17009i(String str) {
        ArrayList arrayList = new ArrayList();
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1879121200:
                if (str.equals("CONTACTS_ACCESS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -953256087:
                if (str.equals("POST_NOTIFICATIONS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -607707040:
                if (str.equals("WRITE_MEDIA_STORAGE")) {
                    c10 = 2;
                    break;
                }
                break;
            case -214070338:
                if (str.equals("CAMERA_ACCESS")) {
                    c10 = 3;
                    break;
                }
                break;
            case -120857063:
                if (str.equals("MICROPHONE_ACCESS")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1455814938:
                if (str.equals("LOCAL_NETWORK")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                arrayList.addAll(Arrays.asList(mo17022g(EnumC4091f.CONTACT)));
                break;
            case 1:
                if (C1134c.m6537a().mo6634o0()) {
                    arrayList.add(mo17022g(EnumC4091f.POST_NOTIFICATIONS));
                    break;
                }
                break;
            case 2:
                if (Build.VERSION.SDK_INT <= 28) {
                    arrayList.addAll(Arrays.asList(mo17022g(EnumC4091f.WRITE_EXTERNAL_STORAGE)));
                    break;
                } else {
                    Log.d("PermissionsProtocol", "WRITE_MEDIA_STORAGE requested. Permission granted by default on OS 10 and later.");
                    break;
                }
            case 3:
                arrayList.addAll(Arrays.asList(mo17022g(EnumC4091f.CAMERA)));
                break;
            case 4:
                arrayList.addAll(Arrays.asList(mo17022g(EnumC4091f.MODIFY_AUDIO_SETTINGS), mo17022g(EnumC4091f.RECORD_AUDIO)));
                break;
            case 5:
                break;
            default:
                Log.w("PermissionsProtocol", "Permission " + str + " is not supported.");
                break;
        }
        return m17018v(arrayList);
    }

    /* renamed from: j */
    private String[] m17010j(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.addAll(m17009i(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: k */
    private List<String> m17011k(String[] strArr, Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = m17009i(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (C0587a.m3027a(activity, it.next()) == -1) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private void m17012l(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            intent.addFlags(268435456);
        }
        if (i10 >= 25) {
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        context.startActivity(intent);
    }

    /* renamed from: q */
    private void m17016q(String str, String[] strArr) {
        JSONObject m17005d = m17005d(str, strArr, "HasPermissions");
        HashMap<String, String> m17007f = m17007f(str, strArr);
        Log.d("PermissionsProtocol", "Has permission response: " + m17005d.toString());
        this.f16603b.m13370i("PermissionsProtocol", "HasPermissions", m17005d, 0, m17007f);
    }

    /* renamed from: s */
    private void m17017s(String str, String[] strArr) {
        this.f16603b.m13370i("PermissionsProtocol", "PermissionsRequest", m17005d(str, strArr, "PermissionsRequest"), 0, m17007f(str, strArr));
    }

    /* renamed from: v */
    private static List<String> m17018v(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    private void m17019x(String[] strArr) {
        Log.d("PermissionsProtocol", "requestPermissionsForFeatures: " + Arrays.toString(strArr));
        String[] m17010j = m17010j(strArr);
        if (m17010j != null && m17010j.length != 0) {
            WeakReference<Activity> weakReference = this.f16602a;
            if (weakReference != null && weakReference.get() != null) {
                Activity activity = this.f16602a.get();
                if (m17011k(strArr, activity).size() == 0) {
                    m17017s("AUTHORIZED", new String[0]);
                    return;
                }
                if (C1134c.m6537a().mo6634o0() && Build.VERSION.SDK_INT >= 33 && "android.permission.POST_NOTIFICATIONS".equals(m17010j[0]) && C0569b.m2730q(activity, m17010j[0])) {
                    Log.i("PermissionsProtocol", "... TODO: show an educational UI to explain why POST_NOTIFICATIONS is needed.");
                    m17017s("DENIED", new String[0]);
                    return;
                }
                int i10 = this.f16606e;
                int i11 = (i10 % 100) + 100;
                this.f16606e = i10 + 1;
                this.f16605d.put(Integer.valueOf(i11), strArr);
                C0569b.m2729p(activity, m17010j, i11);
                return;
            }
            Log.e("PermissionsProtocol", "No Activity found while requesting permissions");
            m17017s("DENIED", strArr);
            return;
        }
        Log.e("PermissionsProtocol", "Can't request any permissions");
        m17017s("DENIED", strArr);
    }

    /* renamed from: A */
    public void m17020A(Activity activity) {
        this.f16602a = new WeakReference<>(activity);
    }

    /* renamed from: B */
    public boolean m17021B(EnumC4091f enumC4091f) {
        WeakReference<Activity> weakReference = this.f16602a;
        if (weakReference != null && weakReference.get() != null) {
            return C0569b.m2730q(this.f16602a.get(), mo17022g(enumC4091f));
        }
        Log.e("PermissionsProtocol", "No Activity found while testing permissions");
        return false;
    }

    /* renamed from: g */
    public abstract String mo17022g(EnumC4091f enumC4091f);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m17014n(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onHasPermissionRequest: " + jSONObject.toString());
        m17008h(m17006e(jSONObject, "HasPermissions"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m17013m(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onPermissionRequest: " + jSONObject.toString());
        m17019x(m17006e(jSONObject, "PermissionsRequest"));
    }

    /* renamed from: t */
    public void m17025t(int i10, String[] strArr, int[] iArr) {
        if (this.f16605d.containsKey(Integer.valueOf(i10))) {
            String[] remove = this.f16605d.remove(Integer.valueOf(i10));
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                hashMap.put(strArr[i11], Integer.valueOf(iArr[i11]));
            }
            ArrayList arrayList = new ArrayList();
            String str = "AUTHORIZED";
            for (String str2 : remove) {
                for (String str3 : m17009i(str2)) {
                    if (!hashMap.containsKey(str3) || ((Integer) hashMap.get(str3)).equals(-1)) {
                        arrayList.add(str2);
                        str = "DENIED";
                        break;
                    }
                }
            }
            m17017s(str, (String[]) arrayList.toArray(new String[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m17015o(JSONObject jSONObject) {
        Log.d("PermissionsProtocol", "onSupportsPermissionsRequest: " + jSONObject.toString());
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("CAMERA_ACCESS");
            jSONArray.put("MICROPHONE_ACCESS");
            jSONArray.put("LOCAL_NETWORK");
            jSONArray.put("CONTACTS_ACCESS");
            jSONArray.put("WRITE_MEDIA_STORAGE");
            if (C1134c.m6537a().mo6634o0()) {
                jSONArray.put("POST_NOTIFICATIONS");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("permissions", jSONArray);
            Log.d("PermissionsProtocol", "Support permissions response: " + jSONObject2.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("CAMERA_ACCESS", BuildConfig.FLAVOR);
            hashMap.put("MICROPHONE_ACCESS", BuildConfig.FLAVOR);
            hashMap.put("LOCAL_NETWORK", BuildConfig.FLAVOR);
            hashMap.put("CONTACTS_ACCESS", BuildConfig.FLAVOR);
            hashMap.put("WRITE_MEDIA_STORAGE", BuildConfig.FLAVOR);
            if (C1134c.m6537a().mo6634o0()) {
                hashMap.put("POST_NOTIFICATIONS", BuildConfig.FLAVOR);
            }
            this.f16603b.m13370i("PermissionsProtocol", "SupportsPermissions", jSONObject2, 0, hashMap);
        } catch (JSONException e10) {
            Log.e("PermissionsProtocol", "JSON exception while handling supports permissions request: " + e10.toString());
            this.f16603b.m13370i("PermissionsProtocol", "SupportsPermissions", new JSONObject(), 13, new HashMap());
        }
    }

    /* renamed from: w */
    public void m17027w(String[] strArr) {
        m17019x(strArr);
    }

    /* renamed from: y */
    public void m17028y(Context context) {
        Log.i("PermissionsProtocol", "requestPermissionsOnAppReady");
        WeakReference<Activity> weakReference = this.f16602a;
        if (weakReference != null && weakReference.get() != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                EnumC4091f enumC4091f = EnumC4091f.POST_NOTIFICATIONS;
                if (!m17021B(enumC4091f)) {
                    m17027w(new String[]{enumC4091f.toString()});
                    return;
                }
            }
            m17012l(context);
            return;
        }
        Log.e("PermissionsProtocol", "Activity is not set in requestPermissionsOnAppReady");
    }

    /* renamed from: z */
    public void m17029z() {
        Log.i("PermissionsProtocol", "requestPermissionsOnStartup: didRequest:" + this.f16604c);
        if (this.f16604c) {
            return;
        }
        this.f16604c = true;
        WeakReference<Activity> weakReference = this.f16602a;
        if (weakReference != null && weakReference.get() != null) {
            if (C1134c.m6537a().mo6642r()) {
                return;
            }
            m17019x(new String[]{"POST_NOTIFICATIONS"});
            return;
        }
        throw new IllegalStateException("Activity is not set");
    }
}
