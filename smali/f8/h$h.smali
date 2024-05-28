.class Lf8/h$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/e$d;


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

    iput-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le8/e$c;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {v0}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ValidationCheck: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx7/e;->v(Ljava/lang/String;)V

    .line 2
    sget-object v0, Lf8/h$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "PrePurchaseValidation limit"

    packed-switch p1, :pswitch_data_0

    .line 3
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->u(Lf8/h;)V

    .line 4
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    sget-object v0, Lf8/d$b;->J:Lf8/d$b;

    const-string v1, "PrePurchaseValidation Unknown error."

    invoke-static {p1, p2, v0, v1}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :pswitch_0
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->s(Lf8/h;)V

    .line 6
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    sget-object v0, Lf8/d$b;->t:Lf8/d$b;

    const-string v1, "PrePurchaseValidation requestBalance failed."

    invoke-static {p1, p2, v0, v1}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :pswitch_1
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->r(Lf8/h;)V

    .line 8
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    sget-object v1, Lf8/d$b;->s:Lf8/d$b;

    invoke-static {p1, p2, v1, v0}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :pswitch_2
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->r(Lf8/h;)V

    .line 10
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    sget-object v1, Lf8/d$b;->r:Lf8/d$b;

    invoke-static {p1, p2, v1, v0}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :pswitch_3
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->q(Lf8/h;)V

    .line 12
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    sget-object v0, Lf8/d$b;->q:Lf8/d$b;

    const-string v1, "PrePurchaseValidation retry"

    invoke-static {p1, p2, v0, v1}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :pswitch_4
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->o(Lf8/h;)V

    .line 14
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    sget-object v0, Lf8/d$b;->p:Lf8/d$b;

    const-string v1, "PrePurchaseValidation error"

    invoke-static {p1, p2, v0, v1}, Lf8/h;->p(Lf8/h;Ljava/lang/String;Lf8/d$b;Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :pswitch_5
    iget-object p1, p0, Lf8/h$h;->a:Lf8/h;

    invoke-static {p1}, Lf8/h;->n(Lf8/h;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
