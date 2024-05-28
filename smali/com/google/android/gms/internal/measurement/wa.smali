.class final Lcom/google/android/gms/internal/measurement/wa;
.super Lcom/google/android/gms/internal/measurement/ua;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/ua<",
        "Lcom/google/android/gms/internal/measurement/va;",
        "Lcom/google/android/gms/internal/measurement/va;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/ua;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/va;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/va;->a()I

    move-result p1

    return p1
.end method

.method final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/va;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/va;->b()I

    move-result p1

    return p1
.end method

.method final synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/p8;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/p8;->zzc:Lcom/google/android/gms/internal/measurement/va;

    return-object p1
.end method

.method final bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/va;->c()Lcom/google/android/gms/internal/measurement/va;

    move-result-object v0

    check-cast p2, Lcom/google/android/gms/internal/measurement/va;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/va;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/va;

    .line 2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/va;->d(Lcom/google/android/gms/internal/measurement/va;Lcom/google/android/gms/internal/measurement/va;)Lcom/google/android/gms/internal/measurement/va;

    move-result-object p1

    return-object p1
.end method

.method final synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/va;->e()Lcom/google/android/gms/internal/measurement/va;

    move-result-object v0

    return-object v0
.end method

.method final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/google/android/gms/internal/measurement/va;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/measurement/va;->h(ILjava/lang/Object;)V

    return-void
.end method

.method final g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/measurement/p8;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/p8;->zzc:Lcom/google/android/gms/internal/measurement/va;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/va;->f()V

    return-void
.end method

.method final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/measurement/va;

    check-cast p1, Lcom/google/android/gms/internal/measurement/p8;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/p8;->zzc:Lcom/google/android/gms/internal/measurement/va;

    return-void
.end method

.method final synthetic i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/y7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/measurement/va;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/va;->i(Lcom/google/android/gms/internal/measurement/y7;)V

    return-void
.end method
