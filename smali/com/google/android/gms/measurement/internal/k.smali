.class final Lcom/google/android/gms/measurement/internal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lcom/google/android/gms/measurement/internal/i5;

.field final synthetic o:Lcom/google/android/gms/measurement/internal/l;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/l;Lcom/google/android/gms/measurement/internal/i5;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/k;->o:Lcom/google/android/gms/measurement/internal/l;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/k;->n:Lcom/google/android/gms/measurement/internal/i5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k;->n:Lcom/google/android/gms/measurement/internal/i5;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/i5;->f()Lcom/google/android/gms/measurement/internal/b;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k;->n:Lcom/google/android/gms/measurement/internal/i5;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/i5;->b()Lcom/google/android/gms/measurement/internal/k4;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/measurement/internal/k4;->z(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k;->o:Lcom/google/android/gms/measurement/internal/l;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->e()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/k;->o:Lcom/google/android/gms/measurement/internal/l;

    const-wide/16 v2, 0x0

    .line 4
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/l;->a(Lcom/google/android/gms/measurement/internal/l;J)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/k;->o:Lcom/google/android/gms/measurement/internal/l;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->c()V

    :cond_1
    return-void
.end method
