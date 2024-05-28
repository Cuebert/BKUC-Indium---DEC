.class Landroidx/appcompat/widget/b$d$a;
.super Landroidx/appcompat/widget/ForwardingListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/b$d;-><init>(Landroidx/appcompat/widget/b;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/appcompat/widget/b;

.field final synthetic o:Landroidx/appcompat/widget/b$d;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/b$d;Landroid/view/View;Landroidx/appcompat/widget/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/b$d$a;->o:Landroidx/appcompat/widget/b$d;

    iput-object p3, p0, Landroidx/appcompat/widget/b$d$a;->n:Landroidx/appcompat/widget/b;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/ForwardingListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public getPopup()Lk/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/b$d$a;->o:Landroidx/appcompat/widget/b$d;

    iget-object v0, v0, Landroidx/appcompat/widget/b$d;->n:Landroidx/appcompat/widget/b;

    iget-object v0, v0, Landroidx/appcompat/widget/b;->L:Landroidx/appcompat/widget/b$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/i;->e()Landroidx/appcompat/view/menu/h;

    move-result-object v0

    return-object v0
.end method

.method public onForwardingStarted()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/b$d$a;->o:Landroidx/appcompat/widget/b$d;

    iget-object v0, v0, Landroidx/appcompat/widget/b$d;->n:Landroidx/appcompat/widget/b;

    invoke-virtual {v0}, Landroidx/appcompat/widget/b;->M()Z

    const/4 v0, 0x1

    return v0
.end method

.method public onForwardingStopped()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/b$d$a;->o:Landroidx/appcompat/widget/b$d;

    iget-object v0, v0, Landroidx/appcompat/widget/b$d;->n:Landroidx/appcompat/widget/b;

    iget-object v1, v0, Landroidx/appcompat/widget/b;->N:Landroidx/appcompat/widget/b$c;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/b;->C()Z

    const/4 v0, 0x1

    return v0
.end method
