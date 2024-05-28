.class Lf8/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->i1(Lcom/android/billingclient/api/c;)V
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

    iput-object p1, p0, Lf8/h$d;->a:Lf8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result p1

    .line 2
    iget-object v0, p0, Lf8/h$d;->a:Lf8/h;

    const-string v1, "StartConnection"

    invoke-static {v0, v1, p1}, Lf8/h;->h(Lf8/h;Ljava/lang/String;I)V

    const-string v0, "rbx.purchaseflow"

    if-nez p1, :cond_0

    const-string p1, "Google Billing Client is setup"

    .line 3
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lf8/h$d;->a:Lf8/h;

    sget-object v0, Lf8/h$m;->p:Lf8/h$m;

    invoke-static {p1, v0}, Lf8/h;->j(Lf8/h;Lf8/h$m;)Lf8/h$m;

    goto :goto_0

    :cond_0
    const-string p1, "Google Billing Client is not setup"

    .line 5
    invoke-static {v0, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object p1, p0, Lf8/h$d;->a:Lf8/h;

    sget-object v0, Lf8/h$m;->n:Lf8/h$m;

    invoke-static {p1, v0}, Lf8/h;->j(Lf8/h;Lf8/h$m;)Lf8/h$m;

    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "rbx.purchaseflow"

    const-string v1, "Google Billing Client disconnected"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf8/h$d;->a:Lf8/h;

    sget-object v1, Lf8/h$m;->n:Lf8/h$m;

    invoke-static {v0, v1}, Lf8/h;->j(Lf8/h;Lf8/h$m;)Lf8/h$m;

    return-void
.end method
