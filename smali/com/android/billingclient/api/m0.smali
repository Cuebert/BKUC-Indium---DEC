.class final Lcom/android/billingclient/api/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ln1/i;

.field final synthetic c:Lcom/android/billingclient/api/d;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d;Ljava/lang/String;Ln1/i;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/m0;->c:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/m0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/m0;->b:Ln1/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/m0;->c:Lcom/android/billingclient/api/d;

    iget-object v1, p0, Lcom/android/billingclient/api/m0;->a:Ljava/lang/String;

    const/16 v2, 0x9

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/d;->x(Lcom/android/billingclient/api/d;Ljava/lang/String;I)Ln1/d0;

    move-result-object v0

    invoke-virtual {v0}, Ln1/d0;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/m0;->b:Ln1/i;

    invoke-virtual {v0}, Ln1/d0;->a()Lcom/android/billingclient/api/f;

    move-result-object v2

    invoke-virtual {v0}, Ln1/d0;->b()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v1, v2, v0}, Ln1/i;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/android/billingclient/api/m0;->b:Ln1/i;

    invoke-virtual {v0}, Ln1/d0;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->s()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ln1/i;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
