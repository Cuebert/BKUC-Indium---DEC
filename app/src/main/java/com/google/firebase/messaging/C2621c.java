package com.google.firebase.messaging;

import java.util.Locale;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes.dex */
public final class C2621c extends Exception {

    /* renamed from: n */
    private final int f10278n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2621c(String str) {
        super(str);
        int i10 = 4;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.hashCode();
            char c10 = 65535;
            switch (lowerCase.hashCode()) {
                case -1743242157:
                    if (lowerCase.equals("service_not_available")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1290953729:
                    if (lowerCase.equals("toomanymessages")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -920906446:
                    if (lowerCase.equals("invalid_parameters")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -617027085:
                    if (lowerCase.equals("messagetoobig")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -95047692:
                    if (lowerCase.equals("missing_to")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 3;
                    break;
                case 2:
                case 4:
                    i10 = 1;
                    break;
                case 3:
                    i10 = 2;
                    break;
            }
            this.f10278n = i10;
        }
        i10 = 0;
        this.f10278n = i10;
    }
}
