.class final Lcom/google/android/gms/measurement/internal/f8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:J

.field final synthetic o:Lcom/google/android/gms/measurement/internal/n8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/n8;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/f8;->o:Lcom/google/android/gms/measurement/internal/n8;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/f8;->n:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f8;->o:Lcom/google/android/gms/measurement/internal/n8;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/f8;->n:J

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/n8;->q(Lcom/google/android/gms/measurement/internal/n8;J)V

    return-void
.end method
