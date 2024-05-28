package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* loaded from: classes.dex */
public final class C2273r3 {

    /* renamed from: a */
    private final String f8467a;

    /* renamed from: b */
    private final Bundle f8468b;

    /* renamed from: c */
    private Bundle f8469c;

    /* renamed from: d */
    final /* synthetic */ C2326w3 f8470d;

    public C2273r3(C2326w3 c2326w3, String str, Bundle bundle) {
        this.f8470d = c2326w3;
        C5984j.m21282f("default_event_parameters");
        this.f8467a = "default_event_parameters";
        this.f8468b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m10226a() {
        char c10;
        if (this.f8469c == null) {
            String string = this.f8470d.m10319o().getString(this.f8467a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 != 2) {
                                this.f8470d.f8118a.mo9765d().m10048r().m9894b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f8470d.f8118a.mo9765d().m10048r().m9893a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f8469c = bundle;
                } catch (JSONException unused2) {
                    this.f8470d.f8118a.mo9765d().m10048r().m9893a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f8469c == null) {
                this.f8469c = this.f8468b;
            }
        }
        return this.f8469c;
    }

    /* renamed from: b */
    public final void m10227b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f8470d.m10319o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f8467a);
        } else {
            String str = this.f8467a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f8470d.f8118a.mo9765d().m10048r().m9894b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f8470d.f8118a.mo9765d().m10048r().m9894b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f8469c = bundle;
    }
}
