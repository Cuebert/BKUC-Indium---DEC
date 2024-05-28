.class final Lcom/google/android/gms/internal/measurement/f2;
.super Lcom/google/android/gms/internal/measurement/i2;
.source "SourceFile"


# instance fields
.field final synthetic r:Z

.field final synthetic s:Lcom/google/android/gms/internal/measurement/s2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/s2;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/s2;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/f2;->r:Z

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/i2;-><init>(Lcom/google/android/gms/internal/measurement/s2;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f2;->s:Lcom/google/android/gms/internal/measurement/s2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s2;->p(Lcom/google/android/gms/internal/measurement/s2;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f1;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/f2;->r:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/f1;->setDataCollectionEnabled(Z)V

    return-void
.end method
