.class final Lcom/google/android/gms/internal/measurement/u1;
.super Lcom/google/android/gms/internal/measurement/i2;
.source "SourceFile"


# instance fields
.field final synthetic r:Ljava/lang/String;

.field final synthetic s:Lcom/google/android/gms/internal/measurement/s2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/s2;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/u1;->s:Lcom/google/android/gms/internal/measurement/s2;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/u1;->r:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/i2;-><init>(Lcom/google/android/gms/internal/measurement/s2;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/u1;->s:Lcom/google/android/gms/internal/measurement/s2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s2;->p(Lcom/google/android/gms/internal/measurement/s2;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f1;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/u1;->r:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/i2;->o:J

    .line 2
    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/f1;->endAdUnitExposure(Ljava/lang/String;J)V

    return-void
.end method
