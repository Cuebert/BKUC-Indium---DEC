package ca;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ca.c */
/* loaded from: classes.dex */
public class C1162c {

    /* renamed from: a */
    private MessageBus f5502a;

    /* renamed from: b */
    private Context f5503b;

    /* renamed from: c */
    private ArrayList<Connection> f5504c;

    /* renamed from: ca.c$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private static C1162c f5505a = new C1162c(MessageBus.m13364e());
    }

    /* renamed from: c */
    private JSONArray m6759c() throws JSONException {
        String str;
        JSONArray jSONArray = new JSONArray();
        Context context = this.f5503b;
        if (context == null) {
            return jSONArray;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        if (query.getCount() > 0) {
            while (query.moveToNext()) {
                int parseInt = Integer.parseInt(query.getString(query.getColumnIndex("has_phone_number")));
                String string = query.getString(query.getColumnIndex("display_name"));
                if (parseInt > 0 && !string.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    long j10 = query.getLong(query.getColumnIndex("contact_id"));
                    Cursor query2 = this.f5503b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data2", "data3"}, "name_raw_contact_id = " + query.getLong(query.getColumnIndex("name_raw_contact_id")) + " AND mimetype = ?", new String[]{"vnd.android.cursor.item/name"}, null);
                    boolean moveToNext = query2.moveToNext();
                    String str2 = BuildConfig.FLAVOR;
                    if (moveToNext) {
                        str2 = query2.getString(query2.getColumnIndex("data2"));
                        str = query2.getString(query2.getColumnIndex("data3"));
                    } else {
                        str = BuildConfig.FLAVOR;
                    }
                    query2.close();
                    jSONObject.put("firstname", str2);
                    jSONObject.put("lastname", str);
                    Cursor query3 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + j10, null, null);
                    JSONArray jSONArray2 = new JSONArray();
                    while (query3.moveToNext()) {
                        jSONArray2.put(query3.getString(query3.getColumnIndex("data1")));
                    }
                    jSONObject.put("phonenumber", jSONArray2);
                    jSONArray.put(jSONObject);
                    query3.close();
                }
            }
        }
        query.close();
        return jSONArray;
    }

    /* renamed from: d */
    private String m6760d() {
        Context context = this.f5503b;
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getResources().getConfiguration().getLocales().get(0).getCountry();
        }
        return context.getResources().getConfiguration().locale.getCountry();
    }

    /* renamed from: j */
    public static C1162c m6763j() {
        return b.f5505a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void m6761e(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onGetContacts: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray m6759c = m6759c();
            if (m6759c.length() > 0) {
                jSONObject2.put("countryCode", m6760d());
                jSONObject2.put("contacts", m6759c);
            }
            this.f5502a.m13370i("ContactsProtocol", "getContacts", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while handling get contacts request: " + e10.toString());
            this.f5502a.m13370i("ContactsProtocol", "getContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m6762f(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onSupportsContacts: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", true);
            this.f5502a.m13370i("ContactsProtocol", "SupportsContacts", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while handling supports contacts request: " + e10.toString());
            this.f5502a.m13370i("ContactsProtocol", "SupportsContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* renamed from: i */
    public void m6766i(Context context) {
        this.f5503b = context;
    }

    private C1162c(MessageBus messageBus) {
        ArrayList<Connection> arrayList = new ArrayList<>();
        this.f5504c = arrayList;
        this.f5502a = messageBus;
        arrayList.add(messageBus.m13374o("ContactsProtocol", "getContacts", new Callback() { // from class: ca.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1162c.this.m6761e(jSONObject);
            }
        }));
        this.f5504c.add(messageBus.m13374o("ContactsProtocol", "SupportsContacts", new Callback() { // from class: ca.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C1162c.this.m6762f(jSONObject);
            }
        }));
    }
}
