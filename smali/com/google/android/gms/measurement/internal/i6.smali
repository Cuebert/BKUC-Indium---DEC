.class final Lcom/google/android/gms/measurement/internal/i6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lb4/a;

.field final synthetic o:I

.field final synthetic p:J

.field final synthetic q:Z

.field final synthetic r:Lcom/google/android/gms/measurement/internal/m6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/m6;Lb4/a;IJZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/i6;->r:Lcom/google/android/gms/measurement/internal/m6;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/i6;->n:Lb4/a;

    iput p3, p0, Lcom/google/android/gms/measurement/internal/i6;->o:I

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/i6;->p:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/i6;->q:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/i6;->r:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/i6;->n:Lb4/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m6;->K(Lb4/a;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/i6;->r:Lcom/google/android/gms/measurement/internal/m6;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/i6;->n:Lb4/a;

    iget v4, p0, Lcom/google/android/gms/measurement/internal/i6;->o:I

    iget-wide v5, p0, Lcom/google/android/gms/measurement/internal/i6;->p:J

    iget-boolean v8, p0, Lcom/google/android/gms/measurement/internal/i6;->q:Z

    const/4 v7, 0x0

    .line 2
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/m6;->d0(Lcom/google/android/gms/measurement/internal/m6;Lb4/a;IJZZ)V

    return-void
.end method
