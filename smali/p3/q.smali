.class public final synthetic Lp3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/k;


# instance fields
.field public final synthetic a:Lp3/z;

.field public final synthetic b:Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;


# direct methods
.method public synthetic constructor <init>(Lp3/z;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/q;->a:Lp3/z;

    iput-object p2, p0, Lp3/q;->b:Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lp3/q;->a:Lp3/z;

    iget-object v1, p0, Lp3/q;->b:Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    check-cast p1, Lp3/a0;

    check-cast p2, Lg4/m;

    .line 1
    new-instance v2, Lp3/x;

    invoke-direct {v2, v0, p2}, Lp3/x;-><init>(Lp3/z;Lg4/m;)V

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lp3/k;

    .line 3
    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 4
    invoke-virtual {p1, v2, p2}, Lp3/k;->K0(Lp3/h;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V

    return-void
.end method
