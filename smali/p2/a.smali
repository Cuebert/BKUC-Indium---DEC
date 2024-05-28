.class public Lp2/a;
.super Lx2/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/l<",
        "Lp2/b;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx2/l;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 1

    invoke-virtual {p0}, Lx2/l;->a()Lx2/m;

    move-result-object v0

    check-cast v0, Lp2/b;

    invoke-interface {v0}, Lp2/b;->c()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object v0

    return-object v0
.end method
