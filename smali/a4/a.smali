.class public La4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/s2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/s2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/a;->a:Lcom/google/android/gms/internal/measurement/s2;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, La4/a;->a:Lcom/google/android/gms/internal/measurement/s2;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/s2;->F(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, La4/a;->a:Lcom/google/android/gms/internal/measurement/s2;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/measurement/s2;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    iget-object v0, p0, La4/a;->a:Lcom/google/android/gms/internal/measurement/s2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/s2;->d(Z)V

    return-void
.end method
