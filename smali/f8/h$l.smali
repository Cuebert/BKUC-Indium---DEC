.class Lf8/h$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->c0(Lcom/android/billingclient/api/Purchase;)V
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

    iput-object p1, p0, Lf8/h$l;->b:Lf8/h;

    iput-object p2, p0, Lf8/h$l;->a:Lcom/android/billingclient/api/Purchase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/f;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result p2

    .line 2
    iget-object v0, p0, Lf8/h$l;->b:Lf8/h;

    const-string v1, "ConsumePurchase"

    invoke-static {v0, v1, p2}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 3
    :goto_0
    iget-object v3, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {v3}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OnConsumeResponse. Success: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ". Message: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {v3, p1}, Lx7/e;->v(Ljava/lang/String;)V

    const-string p1, "rbx.purchaseflow"

    if-eqz v2, :cond_3

    .line 6
    iget-object p2, p0, Lf8/h$l;->b:Lf8/h;

    iget-object v1, p0, Lf8/h$l;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p2, v1}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->G()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {p2}, Lf8/h;->S(Lf8/h;)Z

    move-result p2

    .line 8
    :goto_1
    iget-object v1, p0, Lf8/h$l;->b:Lf8/h;

    sget-object v2, Lf8/d$b;->n:Lf8/d$b;

    invoke-static {v1, v3, v2}, Lf8/h;->D(Lf8/h;Ljava/lang/String;Lf8/d$b;)V

    .line 9
    iget-object v1, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {v1, v3, p2}, Lf8/h;->T(Lf8/h;Ljava/lang/String;Z)Lcom/android/billingclient/api/g;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {v2, v3, v1, p2, v0}, Lf8/h;->E(Lf8/h;Ljava/lang/String;Lcom/android/billingclient/api/g;ZZ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v2

    .line 12
    invoke-static {v1, p2}, Lf8/h;->j0(Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lf8/h$l;->b:Lf8/h;

    .line 13
    invoke-static {v0, v1, p2}, Lf8/h;->i(Lf8/h;Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-static {v1, p2}, Lf8/h;->k0(Lcom/android/billingclient/api/g;Z)J

    move-result-wide v6

    .line 15
    invoke-virtual/range {v2 .. v7}, Lx7/e;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_2

    .line 16
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to find skuDetails: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    :goto_2
    iget-object p2, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {p2}, Lf8/h;->N(Lf8/h;)Ljava/util/Hashtable;

    move-result-object p2

    iget-object v0, p0, Lf8/h$l;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 18
    iget-object p2, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {p2}, Lf8/h;->N(Lf8/h;)Ljava/util/Hashtable;

    move-result-object p2

    iget-object v0, p0, Lf8/h$l;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 19
    :cond_3
    iget-object v0, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {v0, v1, p2}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    .line 20
    iget-object p2, p0, Lf8/h$l;->b:Lf8/h;

    invoke-static {p2}, Lf8/h;->O(Lf8/h;)V

    .line 21
    iget-object p2, p0, Lf8/h$l;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$l;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p2, v0}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lf8/d$b;->v:Lf8/d$b;

    const-string v2, "OnAcknowledgePurchaseResponse failure"

    invoke-static {p2, v0, v1, v2}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :cond_4
    :goto_3
    const-string p2, "End consume flow."

    .line 22
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
