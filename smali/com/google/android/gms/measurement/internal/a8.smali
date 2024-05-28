.class public final synthetic Lcom/google/android/gms/measurement/internal/a8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/android/gms/measurement/internal/d8;

.field public final synthetic o:I

.field public final synthetic p:Lcom/google/android/gms/measurement/internal/i3;

.field public final synthetic q:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/d8;ILcom/google/android/gms/measurement/internal/i3;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a8;->n:Lcom/google/android/gms/measurement/internal/d8;

    iput p2, p0, Lcom/google/android/gms/measurement/internal/a8;->o:I

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/a8;->p:Lcom/google/android/gms/measurement/internal/i3;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/a8;->q:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a8;->n:Lcom/google/android/gms/measurement/internal/d8;

    iget v1, p0, Lcom/google/android/gms/measurement/internal/a8;->o:I

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a8;->p:Lcom/google/android/gms/measurement/internal/i3;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/a8;->q:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/d8;->c(ILcom/google/android/gms/measurement/internal/i3;Landroid/content/Intent;)V

    return-void
.end method
