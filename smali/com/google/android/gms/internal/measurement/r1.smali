.class final Lcom/google/android/gms/internal/measurement/r1;
.super Lcom/google/android/gms/internal/measurement/i2;
.source "SourceFile"


# instance fields
.field final synthetic r:Landroid/app/Activity;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Ljava/lang/String;

.field final synthetic u:Lcom/google/android/gms/internal/measurement/s2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/s2;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/r1;->u:Lcom/google/android/gms/internal/measurement/s2;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/r1;->r:Landroid/app/Activity;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/r1;->s:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/r1;->t:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/i2;-><init>(Lcom/google/android/gms/internal/measurement/s2;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/r1;->u:Lcom/google/android/gms/internal/measurement/s2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/s2;->p(Lcom/google/android/gms/internal/measurement/s2;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/f1;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/r1;->r:Landroid/app/Activity;

    .line 2
    invoke-static {v0}, Li3/b;->J0(Ljava/lang/Object;)Li3/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/r1;->s:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/r1;->t:Ljava/lang/String;

    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/i2;->n:J

    .line 3
    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/f1;->setCurrentScreen(Li3/a;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
