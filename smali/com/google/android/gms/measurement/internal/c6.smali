.class final Lcom/google/android/gms/measurement/internal/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic o:Lcom/google/android/gms/measurement/internal/m6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/m6;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/c6;->o:Lcom/google/android/gms/measurement/internal/m6;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/c6;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c6;->n:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/c6;->n:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/c6;->o:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m4;->z()Lcom/google/android/gms/measurement/internal/f;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/c6;->o:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/m4;

    .line 2
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/m4;->B()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v3

    .line 3
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/a3;->s()Ljava/lang/String;

    move-result-object v3

    .line 4
    sget-object v4, Lcom/google/android/gms/measurement/internal/x2;->N:Lcom/google/android/gms/measurement/internal/w2;

    .line 5
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/f;->r(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/w2;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/c6;->n:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/c6;->n:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 9
    throw v1

    :catchall_1
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1
.end method
