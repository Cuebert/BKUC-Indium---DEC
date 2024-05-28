.class Lf8/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->K0(Lf8/h$p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf8/h$p;

.field final synthetic b:Lf8/h;


# direct methods
.method constructor <init>(Lf8/h;Lf8/h$p;)V
    .locals 0

    iput-object p1, p0, Lf8/h$e;->b:Lf8/h;

    iput-object p2, p0, Lf8/h$e;->a:Lf8/h$p;

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
            "Lcom/android/billingclient/api/g;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result v0

    .line 2
    iget-object v1, p0, Lf8/h$e;->b:Lf8/h;

    const-string v2, "QueryProductDetailsAsync"

    invoke-static {v1, v2, v0}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    const-string v1, "rbx.purchaseflow"

    if-nez v0, :cond_2

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Returned INAPP ProductDetails. Count = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/g;

    .line 5
    iget-object v0, p0, Lf8/h$e;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->t(Lf8/h;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq p2, v0, :cond_0

    .line 6
    iget-object v0, p0, Lf8/h$e;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->t(Lf8/h;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lf8/h$e;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->t(Lf8/h;)Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "queryInAppProduct Success. Count = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lf8/h$e;->b:Lf8/h;

    invoke-static {p2}, Lf8/h;->t(Lf8/h;)Ljava/util/Hashtable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Hashtable;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object p1, p0, Lf8/h$e;->b:Lf8/h;

    sget-object p2, Lf8/h$m;->p:Lf8/h$m;

    invoke-static {p1, p2}, Lf8/h;->F(Lf8/h;Lf8/h$m;)Lf8/h$m;

    goto :goto_1

    .line 10
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed queryInAppProduct. BillingResult: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iget-object p1, p0, Lf8/h$e;->b:Lf8/h;

    sget-object p2, Lf8/h$m;->n:Lf8/h$m;

    invoke-static {p1, p2}, Lf8/h;->F(Lf8/h;Lf8/h$m;)Lf8/h$m;

    .line 12
    :goto_1
    iget-object p1, p0, Lf8/h$e;->a:Lf8/h$p;

    if-eqz p1, :cond_3

    .line 13
    invoke-interface {p1}, Lf8/h$p;->a()V

    :cond_3
    return-void
.end method
