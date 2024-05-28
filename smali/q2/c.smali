.class public interface abstract Lq2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx2/g<",
        "Lq2/h;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract a(Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;",
            ")",
            "Lg4/l<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;)Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;",
            ")",
            "Lg4/l<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/identity/SignInCredential;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lx2/b;
        }
    .end annotation
.end method

.method public abstract f(Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;)Lg4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;",
            ")",
            "Lg4/l<",
            "Lcom/google/android/gms/auth/api/identity/BeginSignInResult;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(Landroid/content/Intent;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lx2/b;
        }
    .end annotation
.end method
