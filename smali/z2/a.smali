.class public Lz2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;)Lx2/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lx2/k;

    invoke-direct {v0, p0}, Lx2/k;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lx2/b;

    invoke-direct {v0, p0}, Lx2/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
