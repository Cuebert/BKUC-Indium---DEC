.class Lf8/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/j;


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

    iput-object p1, p0, Lf8/h$i;->a:Lf8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/f;Ljava/util/List;)V
    .locals 2
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
    iget-object v0, p0, Lf8/h$i;->a:Lf8/h;

    invoke-static {v0}, Lf8/h;->v(Lf8/h;)Lf8/i;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x7

    if-eq p1, p2, :cond_1

    .line 3
    iget-object p1, p0, Lf8/h$i;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->y(Lf8/h;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lf8/d$b;->F:Lf8/d$b;

    const-string v1, "onPurchasesUpdated failed"

    invoke-static {p1, p2, v0, v1}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lf8/h$i;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->x(Lf8/h;)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p0, Lf8/h$i;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->y(Lf8/h;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lf8/d$b;->w:Lf8/d$b;

    const-string v1, "User cancelled"

    invoke-static {p1, p2, v0, v1}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lf8/h$i;->a:Lf8/h;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lf8/h;->w(Lf8/h;Ljava/util/List;Z)V

    :goto_0
    return-void
.end method
