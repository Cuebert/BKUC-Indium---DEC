.class Lf8/h$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->F0(Lcom/android/billingclient/api/Purchase;Z)V
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

    iput-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iput-object p2, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/j$b;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "VerifyPurchase. Response="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".ReceiptId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    .line 2
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lx7/e;->v(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->z(Lf8/h;)Le8/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->z(Lf8/h;)Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->d()V

    .line 6
    :cond_0
    sget-object v0, Le8/j$b;->n:Le8/j$b;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->A(Lf8/h;)V

    .line 8
    :cond_1
    sget-object v0, Lf8/h$c;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    .line 9
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {p1}, Lf8/h;->J(Lf8/h;)V

    .line 10
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1, v0}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lf8/d$b;->J:Lf8/d$b;

    const-string v2, "launchVerifyPurchaseReceipt unknown error"

    invoke-static {p1, v0, v1, v2}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_2
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {p1}, Lf8/h;->I(Lf8/h;)V

    .line 12
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1, v0}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lf8/d$b;->D:Lf8/d$b;

    const-string v2, "launchVerifyPurchaseReceipt empty response"

    invoke-static {p1, v0, v1, v2}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_3
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {p1}, Lf8/h;->H(Lf8/h;)V

    .line 14
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1, v0}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lf8/d$b;->C:Lf8/d$b;

    const-string v2, "launchVerifyPurchaseReceipt error"

    invoke-static {p1, v0, v1, v2}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    :goto_0
    return-void

    .line 15
    :cond_4
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1, v0}, Lf8/h;->g(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v2

    .line 16
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-static {p1, v0}, Lf8/h;->B(Lf8/h;Lcom/android/billingclient/api/Purchase;)Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "rbx.purchaseflow"

    const-string v0, "Receipt Verification Successful for Subscription"

    .line 17
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v0, v2}, Lf8/h;->C(Lf8/h;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 19
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    .line 20
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v1

    invoke-virtual {v1}, Lb9/c;->f()I

    move-result v1

    .line 21
    invoke-static {v2}, Le8/h;->d(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v1, v3

    .line 22
    invoke-virtual {v0, v1}, Lb9/c;->r(I)V

    .line 23
    :cond_5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->V0()Z

    move-result v0

    if-nez v0, :cond_6

    .line 24
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    sget-object v1, Lf8/d$b;->n:Lf8/d$b;

    invoke-static {v0, v2, v1}, Lf8/h;->D(Lf8/h;Ljava/lang/String;Lf8/d$b;)V

    .line 25
    :cond_6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->G()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v1, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-static {v0, v1}, Lf8/h;->B(Lf8/h;Lcom/android/billingclient/api/Purchase;)Z

    move-result v0

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->S(Lf8/h;)Z

    move-result v0

    .line 26
    :goto_1
    iget-object v1, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {v1, v2, v0}, Lf8/h;->T(Lf8/h;Ljava/lang/String;Z)Lcom/android/billingclient/api/g;

    move-result-object v1

    .line 27
    iget-object v3, p0, Lf8/h$j;->b:Lf8/h;

    const/4 v4, 0x0

    invoke-static {v3, v2, v1, v0, v4}, Lf8/h;->E(Lf8/h;Ljava/lang/String;Lcom/android/billingclient/api/g;ZZ)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 28
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    invoke-static {p1}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object p1

    .line 29
    invoke-static {v1, v0}, Lf8/h;->j0(Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lf8/h$j;->b:Lf8/h;

    .line 30
    invoke-static {v4, v1, v0}, Lf8/h;->i(Lf8/h;Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object v4

    .line 31
    invoke-static {v1, v0}, Lf8/h;->k0(Lcom/android/billingclient/api/g;Z)J

    move-result-wide v5

    move-object v1, p1

    .line 32
    invoke-virtual/range {v1 .. v6}, Lx7/e;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_2

    .line 33
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to find skuDetails: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    :cond_9
    :goto_2
    iget-object p1, p0, Lf8/h$j;->b:Lf8/h;

    iget-object v0, p0, Lf8/h$j;->a:Lcom/android/billingclient/api/Purchase;

    invoke-static {p1, v0}, Lf8/h;->G(Lf8/h;Lcom/android/billingclient/api/Purchase;)V

    return-void
.end method
