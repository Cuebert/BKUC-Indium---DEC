.class Landroidx/appcompat/widget/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private n:Landroidx/appcompat/widget/b$e;

.field final synthetic o:Landroidx/appcompat/widget/b;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/b;Landroidx/appcompat/widget/b$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/b$c;->o:Landroidx/appcompat/widget/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Landroidx/appcompat/widget/b$c;->n:Landroidx/appcompat/widget/b$e;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/b$c;->o:Landroidx/appcompat/widget/b;

    invoke-static {v0}, Landroidx/appcompat/widget/b;->w(Landroidx/appcompat/widget/b;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/b$c;->o:Landroidx/appcompat/widget/b;

    invoke-static {v0}, Landroidx/appcompat/widget/b;->x(Landroidx/appcompat/widget/b;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->d()V

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/b$c;->o:Landroidx/appcompat/widget/b;

    invoke-static {v0}, Landroidx/appcompat/widget/b;->y(Landroidx/appcompat/widget/b;)Landroidx/appcompat/view/menu/k;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/b$c;->n:Landroidx/appcompat/widget/b$e;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/i;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/b$c;->o:Landroidx/appcompat/widget/b;

    iget-object v1, p0, Landroidx/appcompat/widget/b$c;->n:Landroidx/appcompat/widget/b$e;

    iput-object v1, v0, Landroidx/appcompat/widget/b;->L:Landroidx/appcompat/widget/b$e;

    .line 6
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/b$c;->o:Landroidx/appcompat/widget/b;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/b;->N:Landroidx/appcompat/widget/b$c;

    return-void
.end method
