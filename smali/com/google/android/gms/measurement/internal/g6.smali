.class final Lcom/google/android/gms/measurement/internal/g6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lb4/a;

.field final synthetic o:J

.field final synthetic p:I

.field final synthetic q:J

.field final synthetic r:Z

.field final synthetic s:Lcom/google/android/gms/measurement/internal/m6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/m6;Lb4/a;JIJZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/g6;->s:Lcom/google/android/gms/measurement/internal/m6;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/g6;->n:Lb4/a;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/g6;->o:J

    iput p5, p0, Lcom/google/android/gms/measurement/internal/g6;->p:I

    iput-wide p6, p0, Lcom/google/android/gms/measurement/internal/g6;->q:J

    iput-boolean p8, p0, Lcom/google/android/gms/measurement/internal/g6;->r:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g6;->s:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g6;->n:Lb4/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m6;->K(Lb4/a;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g6;->s:Lcom/google/android/gms/measurement/internal/m6;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/g6;->o:J

    const/4 v3, 0x0

    .line 2
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/m6;->z(JZ)V

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/g6;->s:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/g6;->n:Lb4/a;

    iget v6, p0, Lcom/google/android/gms/measurement/internal/g6;->p:I

    iget-wide v7, p0, Lcom/google/android/gms/measurement/internal/g6;->q:J

    iget-boolean v10, p0, Lcom/google/android/gms/measurement/internal/g6;->r:Z

    const/4 v9, 0x1

    .line 3
    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/measurement/internal/m6;->d0(Lcom/google/android/gms/measurement/internal/m6;Lb4/a;IJZZ)V

    return-void
.end method
