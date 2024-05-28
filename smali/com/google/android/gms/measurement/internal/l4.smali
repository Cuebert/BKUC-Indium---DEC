.class final Lcom/google/android/gms/measurement/internal/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lcom/google/android/gms/measurement/internal/k5;

.field final synthetic o:Lcom/google/android/gms/measurement/internal/m4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/m4;Lcom/google/android/gms/measurement/internal/k5;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/l4;->o:Lcom/google/android/gms/measurement/internal/m4;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/l4;->n:Lcom/google/android/gms/measurement/internal/k5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/l4;->o:Lcom/google/android/gms/measurement/internal/m4;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/l4;->n:Lcom/google/android/gms/measurement/internal/k5;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/m4;->a(Lcom/google/android/gms/measurement/internal/m4;Lcom/google/android/gms/measurement/internal/k5;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/l4;->o:Lcom/google/android/gms/measurement/internal/m4;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/l4;->n:Lcom/google/android/gms/measurement/internal/k5;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/k5;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m4;->m(Lcom/google/android/gms/internal/measurement/zzcl;)V

    return-void
.end method
