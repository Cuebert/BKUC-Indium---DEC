.class final Lcom/google/android/gms/internal/measurement/p2;
.super Lcom/google/android/gms/internal/measurement/i2;
.source "SourceFile"


# instance fields
.field final synthetic r:Landroid/app/Activity;

.field final synthetic s:Lcom/google/android/gms/internal/measurement/b1;

.field final synthetic t:Lcom/google/android/gms/internal/measurement/r2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/r2;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/b1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/p2;->t:Lcom/google/android/gms/internal/measurement/r2;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/p2;->r:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/p2;->s:Lcom/google/android/gms/internal/measurement/b1;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/r2;->n:Lcom/google/android/gms/internal/measurement/s2;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/i2;-><init>(Lcom/google/android/gms/internal/measurement/s2;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/p2;->t:Lcom/google/android/gms/internal/measurement/r2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/r2;->n:Lcom/google/android/gms/internal/measurement/s2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s2;->p(Lcom/google/android/gms/internal/measurement/s2;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f1;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/p2;->r:Landroid/app/Activity;

    .line 2
    invoke-static {v1}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/p2;->s:Lcom/google/android/gms/internal/measurement/b1;

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/i2;->o:J

    .line 3
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/f1;->onActivitySaveInstanceState(Li3/a;Lcom/google/android/gms/internal/measurement/i1;J)V

    return-void
.end method
