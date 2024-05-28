.class final Ly2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ly2/d0;


# direct methods
.method constructor <init>(Ly2/d0;)V
    .locals 0

    iput-object p1, p0, Ly2/a0;->n:Ly2/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly2/a0;->n:Ly2/d0;

    invoke-static {v0}, Ly2/d0;->K0(Ly2/d0;)Ly2/c0;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Ly2/c0;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
