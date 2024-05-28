.class public final synthetic Lcom/google/android/gms/measurement/internal/b8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/android/gms/measurement/internal/d8;

.field public final synthetic o:Lcom/google/android/gms/measurement/internal/i3;

.field public final synthetic p:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/d8;Lcom/google/android/gms/measurement/internal/i3;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/b8;->n:Lcom/google/android/gms/measurement/internal/d8;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/b8;->o:Lcom/google/android/gms/measurement/internal/i3;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/b8;->p:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/b8;->n:Lcom/google/android/gms/measurement/internal/d8;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/b8;->o:Lcom/google/android/gms/measurement/internal/i3;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/b8;->p:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/d8;->d(Lcom/google/android/gms/measurement/internal/i3;Landroid/app/job/JobParameters;)V

    return-void
.end method
