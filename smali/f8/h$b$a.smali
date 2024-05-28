.class Lf8/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h$b;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf8/h$b;


# direct methods
.method constructor <init>(Lf8/h$b;)V
    .locals 0

    iput-object p1, p0, Lf8/h$b$a;->a:Lf8/h$b;

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
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    .line 2
    iget-object v1, p0, Lf8/h$b$a;->a:Lf8/h$b;

    iget-object v1, v1, Lf8/h$b;->a:Lf8/h;

    const-string v2, "QueryPurchasesAsync"

    invoke-static {v1, v2, v0}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Lf8/h$b$a;->a:Lf8/h$b;

    iget-object p1, p1, Lf8/h$b;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QuerySubsPurchases. ItemsCount: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Items: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf8/h$b$a;->a:Lf8/h$b;

    iget-object v1, v1, Lf8/h$b;->a:Lf8/h;

    .line 4
    invoke-static {v1, p2}, Lf8/h;->Q(Lf8/h;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lx7/e;->v(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lf8/h$b$a;->a:Lf8/h$b;

    iget-object p1, p1, Lf8/h$b;->a:Lf8/h;

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lf8/h;->w(Lf8/h;Ljava/util/List;Z)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed QueryPurchases. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    :goto_0
    return-void
.end method
