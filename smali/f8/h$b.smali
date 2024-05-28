.class Lf8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf8/h;


# direct methods
.method constructor <init>(Lf8/h;)V
    .locals 0

    iput-object p1, p0, Lf8/h$b;->a:Lf8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/f;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/f;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result p2

    .line 2
    iget-object v0, p0, Lf8/h$b;->a:Lf8/h;

    const-string v1, "QueryPurchaseHistoryAsync"

    invoke-static {v0, v1, p2}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 3
    :goto_0
    iget-object v0, p0, Lf8/h$b;->a:Lf8/h;

    invoke-static {v0}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OnSubsPurchaseHistoryResponse. Success: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ". Message: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Lx7/e;->v(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lf8/h$b;->a:Lf8/h;

    invoke-virtual {v0}, Lf8/h;->v0()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-nez p2, :cond_2

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed QueryPurchaseHistory: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.purchaseflow"

    invoke-static {p2, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 8
    :cond_2
    invoke-static {}, Ln1/l;->a()Ln1/l$a;

    move-result-object p1

    const-string p2, "subs"

    .line 9
    invoke-virtual {p1, p2}, Ln1/l$a;->b(Ljava/lang/String;)Ln1/l$a;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ln1/l$a;->a()Ln1/l;

    move-result-object p1

    .line 11
    iget-object p2, p0, Lf8/h$b;->a:Lf8/h;

    invoke-static {p2}, Lf8/h;->v(Lf8/h;)Lf8/i;

    move-result-object p2

    new-instance v0, Lf8/h$b$a;

    invoke-direct {v0, p0}, Lf8/h$b$a;-><init>(Lf8/h$b;)V

    invoke-interface {p2, p1, v0}, Lf8/i;->j(Ln1/l;Ln1/i;)V

    return-void
.end method
