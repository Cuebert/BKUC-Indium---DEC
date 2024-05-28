.class public final synthetic Lp3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/k;


# instance fields
.field public final synthetic a:Lp3/z;

.field public final synthetic b:Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;


# direct methods
.method public synthetic constructor <init>(Lp3/z;Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/t;->a:Lp3/z;

    iput-object p2, p0, Lp3/t;->b:Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lp3/t;->a:Lp3/z;

    iget-object v1, p0, Lp3/t;->b:Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    check-cast p1, Lp3/a0;

    check-cast p2, Lg4/m;

    invoke-virtual {v0, v1, p1, p2}, Lp3/z;->y(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;Lp3/a0;Lg4/m;)V

    return-void
.end method
