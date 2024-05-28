.class final Lcom/android/billingclient/api/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/n;


# instance fields
.field private final a:Lcom/google/android/gms/internal/play_billing/o4;

.field private final b:Lcom/android/billingclient/api/q;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/o4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/android/billingclient/api/q;

    invoke-direct {v0, p1}, Lcom/android/billingclient/api/q;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/android/billingclient/api/p;->b:Lcom/android/billingclient/api/q;

    iput-object p2, p0, Lcom/android/billingclient/api/p;->a:Lcom/google/android/gms/internal/play_billing/o4;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/h4;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/z4;->x()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/p;->a:Lcom/google/android/gms/internal/play_billing/o4;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->p(Lcom/google/android/gms/internal/play_billing/o4;)Lcom/google/android/gms/internal/play_billing/y4;

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->o(Lcom/google/android/gms/internal/play_billing/h4;)Lcom/google/android/gms/internal/play_billing/y4;

    iget-object p1, p0, Lcom/android/billingclient/api/p;->b:Lcom/android/billingclient/api/q;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/z4;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/q;->a(Lcom/google/android/gms/internal/play_billing/z4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "BillingLogger"

    const-string v0, "Unable to log."

    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/d5;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/z4;->x()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/p;->a:Lcom/google/android/gms/internal/play_billing/o4;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->p(Lcom/google/android/gms/internal/play_billing/o4;)Lcom/google/android/gms/internal/play_billing/y4;

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->q(Lcom/google/android/gms/internal/play_billing/d5;)Lcom/google/android/gms/internal/play_billing/y4;

    iget-object p1, p0, Lcom/android/billingclient/api/p;->b:Lcom/android/billingclient/api/q;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/z4;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/q;->a(Lcom/google/android/gms/internal/play_billing/z4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "BillingLogger"

    const-string v0, "Unable to log."

    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/play_billing/d4;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/z4;->x()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/p;->a:Lcom/google/android/gms/internal/play_billing/o4;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->p(Lcom/google/android/gms/internal/play_billing/o4;)Lcom/google/android/gms/internal/play_billing/y4;

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/y4;->n(Lcom/google/android/gms/internal/play_billing/d4;)Lcom/google/android/gms/internal/play_billing/y4;

    iget-object p1, p0, Lcom/android/billingclient/api/p;->b:Lcom/android/billingclient/api/q;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/z0;->h()Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/z4;

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/q;->a(Lcom/google/android/gms/internal/play_billing/z4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "BillingLogger"

    const-string v0, "Unable to log."

    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
