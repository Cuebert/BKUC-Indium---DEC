.class final Lcom/google/android/gms/measurement/internal/s5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Ljava/lang/String;

.field final synthetic p:J

.field final synthetic q:Landroid/os/Bundle;

.field final synthetic r:Z

.field final synthetic s:Z

.field final synthetic t:Z

.field final synthetic u:Ljava/lang/String;

.field final synthetic v:Lcom/google/android/gms/measurement/internal/m6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/m6;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/s5;->v:Lcom/google/android/gms/measurement/internal/m6;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/s5;->n:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/s5;->o:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/s5;->p:J

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/s5;->q:Landroid/os/Bundle;

    iput-boolean p7, p0, Lcom/google/android/gms/measurement/internal/s5;->r:Z

    iput-boolean p8, p0, Lcom/google/android/gms/measurement/internal/s5;->s:Z

    iput-boolean p9, p0, Lcom/google/android/gms/measurement/internal/s5;->t:Z

    iput-object p10, p0, Lcom/google/android/gms/measurement/internal/s5;->u:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/s5;->v:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/s5;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/s5;->o:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/s5;->p:J

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/s5;->q:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/google/android/gms/measurement/internal/s5;->r:Z

    iget-boolean v7, p0, Lcom/google/android/gms/measurement/internal/s5;->s:Z

    iget-boolean v8, p0, Lcom/google/android/gms/measurement/internal/s5;->t:Z

    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/s5;->u:Ljava/lang/String;

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/gms/measurement/internal/m6;->w(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method
