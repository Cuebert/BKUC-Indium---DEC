.class final Lp3/g0;
.super Lp3/e0;
.source "SourceFile"


# instance fields
.field final synthetic c:Lp3/h0;


# direct methods
.method constructor <init>(Lp3/h0;)V
    .locals 0

    iput-object p1, p0, Lp3/g0;->c:Lp3/h0;

    invoke-direct {p0}, Lp3/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v0, p0, Lp3/g0;->c:Lp3/h0;

    new-instance v1, Lp3/f0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lp3/f0;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lx2/m;)V

    return-void
.end method

.method public final m0(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    iget-object v0, p0, Lp3/g0;->c:Lp3/h0;

    new-instance v1, Lp3/f0;

    invoke-direct {v1, p1, p2}, Lp3/f0;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lx2/m;)V

    return-void
.end method
