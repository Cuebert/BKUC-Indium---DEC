.class public final synthetic Lp3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/k;


# instance fields
.field public final synthetic a:Lp3/o;

.field public final synthetic b:Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;


# direct methods
.method public synthetic constructor <init>(Lp3/o;Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/l;->a:Lp3/o;

    iput-object p2, p0, Lp3/l;->b:Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lp3/l;->a:Lp3/o;

    iget-object v1, p0, Lp3/l;->b:Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    check-cast p1, Lp3/t0;

    check-cast p2, Lg4/m;

    .line 1
    new-instance v2, Lp3/n;

    invoke-direct {v2, v0, p2}, Lp3/n;-><init>(Lp3/o;Lg4/m;)V

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lp3/d;

    .line 3
    invoke-static {v1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    .line 4
    invoke-virtual {p1, v2, p2}, Lp3/d;->n(Lp3/j;Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)V

    return-void
.end method
