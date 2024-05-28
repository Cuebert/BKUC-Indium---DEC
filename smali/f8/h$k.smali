.class Lf8/h$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->W(Lcom/android/billingclient/api/Purchase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/android/billingclient/api/Purchase;

.field final synthetic b:Lf8/h;


# direct methods
.method constructor <init>(Lf8/h;Lcom/android/billingclient/api/Purchase;)V
    .locals 0

    iput-object p1, p0, Lf8/h$k;->b:Lf8/h;

    iput-object p2, p0, Lf8/h$k;->a:Lcom/android/billingclient/api/Purchase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/f;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    .line 2
    iget-object v1, p0, Lf8/h$k;->b:Lf8/h;

    const-string v2, "AcknowledgePurchase"

    invoke-static {v1, v2, v0}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v1, p0, Lf8/h$k;->b:Lf8/h;

    invoke-static {v1}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OnAcknowledgePurchaseResponse. Success: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ". Message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {v1, p1}, Lx7/e;->v(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->V0()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_1

    .line 7
    iget-object p1, p0, Lf8/h$k;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$k;->a:Lcom/android/billingclient/api/Purchase;

    sget-object v1, Lf8/d$b;->n:Lf8/d$b;

    invoke-static {p1, v0, v1}, Lf8/h;->K(Lf8/h;Lcom/android/billingclient/api/Purchase;Lf8/d$b;)V

    goto :goto_1

    :cond_1
    const-string p1, "rbx.purchaseflow"

    const-string v0, "Failed to acknowledge Purchase"

    .line 8
    invoke-static {p1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object p1, p0, Lf8/h$k;->b:Lf8/h;

    invoke-static {p1}, Lf8/h;->L(Lf8/h;)V

    .line 10
    iget-object p1, p0, Lf8/h$k;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$k;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1, v0}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lf8/d$b;->u:Lf8/d$b;

    const-string v2, "OnAcknowledgePurchaseResponse failure"

    invoke-static {p1, v0, v1, v2}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :goto_1
    return-void

    .line 11
    :cond_2
    iget-object p1, p0, Lf8/h$k;->b:Lf8/h;

    iget-object v1, p0, Lf8/h$k;->a:Lcom/android/billingclient/api/Purchase;

    invoke-static {p1, v1, v0}, Lf8/h;->M(Lf8/h;Lcom/android/billingclient/api/Purchase;Z)V

    return-void
.end method
