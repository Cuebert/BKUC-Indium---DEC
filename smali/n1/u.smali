.class public final synthetic Ln1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IILcom/android/billingclient/api/f;)Lcom/google/android/gms/internal/play_billing/d4;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d4;->x()Lcom/google/android/gms/internal/play_billing/c4;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/l4;->w()Lcom/google/android/gms/internal/play_billing/j4;

    move-result-object v1

    invoke-virtual {p2}, Lcom/android/billingclient/api/f;->b()I

    move-result v2

    .line 3
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/j4;->o(I)Lcom/google/android/gms/internal/play_billing/j4;

    invoke-virtual {p2}, Lcom/android/billingclient/api/f;->a()Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/play_billing/j4;->n(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/j4;

    .line 5
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/j4;->p(I)Lcom/google/android/gms/internal/play_billing/j4;

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/c4;->n(Lcom/google/android/gms/internal/play_billing/j4;)Lcom/google/android/gms/internal/play_billing/c4;

    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/c4;->p(I)Lcom/google/android/gms/internal/play_billing/c4;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/d4;

    return-object p0
.end method

.method public static b(I)Lcom/google/android/gms/internal/play_billing/h4;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/h4;->w()Lcom/google/android/gms/internal/play_billing/g4;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/g4;->o(I)Lcom/google/android/gms/internal/play_billing/g4;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/h4;

    return-object p0
.end method
