.class public Lf8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/i;


# instance fields
.field private a:Lcom/android/billingclient/api/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static k(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->e()Ljava/util/List;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/h;Ln1/g;)V
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/c;->g(Lcom/android/billingclient/api/h;Ln1/g;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/f;
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/c;->c(Ljava/lang/String;)Lcom/android/billingclient/api/f;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln1/a;Ln1/b;)V
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/c;->a(Ln1/a;Ln1/b;)V

    return-void
.end method

.method public d(Lcom/android/billingclient/api/c;)V
    .locals 0

    iput-object p1, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    return-void
.end method

.method public e(Ln1/e;Ln1/f;)V
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/c;->b(Ln1/e;Ln1/f;)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c;->d()Z

    move-result v0

    return v0
.end method

.method public g(Ln1/k;Ln1/h;)V
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/c;->h(Ln1/k;Ln1/h;)V

    return-void
.end method

.method public h(Landroid/app/Activity;Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/f;
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/c;->e(Landroid/app/Activity;Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/f;

    move-result-object p1

    return-object p1
.end method

.method public i(Ln1/d;)V
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/c;->j(Ln1/d;)V

    return-void
.end method

.method public j(Ln1/l;Ln1/i;)V
    .locals 1

    iget-object v0, p0, Lf8/a;->a:Lcom/android/billingclient/api/c;

    invoke-virtual {v0, p1, p2}, Lcom/android/billingclient/api/c;->i(Ln1/l;Ln1/i;)V

    return-void
.end method
