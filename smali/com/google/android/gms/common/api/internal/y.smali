.class public final Lcom/google/android/gms/common/api/internal/y;
.super Ly2/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ly2/v;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/common/api/internal/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/d<",
            "Lx2/a$b;",
            "TResultT;>;"
        }
    .end annotation
.end field

.field private final c:Lg4/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg4/m<",
            "TResultT;>;"
        }
    .end annotation
.end field

.field private final d:Ly2/m;


# direct methods
.method public constructor <init>(ILcom/google/android/gms/common/api/internal/d;Lg4/m;Ly2/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/common/api/internal/d<",
            "Lx2/a$b;",
            "TResultT;>;",
            "Lg4/m<",
            "TResultT;>;",
            "Ly2/m;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Ly2/v;-><init>(I)V

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/y;->c:Lg4/m;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/y;->b:Lcom/google/android/gms/common/api/internal/d;

    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/y;->d:Ly2/m;

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/d;->c()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 3
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->c:Lg4/m;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/y;->d:Ly2/m;

    invoke-interface {v1, p1}, Ly2/m;->a(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg4/m;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->c:Lg4/m;

    invoke-virtual {v0, p1}, Lg4/m;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/internal/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/o<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->b:Lcom/google/android/gms/common/api/internal/d;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/o;->v()Lx2/a$f;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/y;->c:Lg4/m;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/d;->b(Lx2/a$b;Lg4/m;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->c:Lg4/m;

    .line 3
    invoke-virtual {v0, p1}, Lg4/m;->d(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/a0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/y;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    .line 5
    throw p1
.end method

.method public final d(Lcom/google/android/gms/common/api/internal/g;Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/y;->c:Lg4/m;

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/common/api/internal/g;->d(Lg4/m;Z)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/o;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/o<",
            "*>;)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/y;->b:Lcom/google/android/gms/common/api/internal/d;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d;->c()Z

    move-result p1

    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/o;)[Lcom/google/android/gms/common/Feature;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/o<",
            "*>;)[",
            "Lcom/google/android/gms/common/Feature;"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/y;->b:Lcom/google/android/gms/common/api/internal/d;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d;->e()[Lcom/google/android/gms/common/Feature;

    move-result-object p1

    return-object p1
.end method
