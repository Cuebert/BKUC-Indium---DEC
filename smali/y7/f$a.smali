.class Ly7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/f;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/widget/SearchView;

.field final synthetic b:Ly7/f;


# direct methods
.method constructor <init>(Ly7/f;Landroidx/appcompat/widget/SearchView;)V
    .locals 0

    iput-object p1, p0, Ly7/f$a;->b:Ly7/f;

    iput-object p2, p0, Ly7/f$a;->a:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {p1}, Ly7/f;->c(Ly7/f;)Landroid/view/Menu;

    move-result-object v0

    iget-object v1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {v1}, Ly7/f;->d(Ly7/f;)Landroid/view/MenuItem;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Ly7/f;->e(Ly7/f;Landroid/view/Menu;Landroid/view/MenuItem;Z)V

    .line 2
    iget-object p1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {p1}, Ly7/f;->f(Ly7/f;)Ly7/f$e;

    move-result-object v0

    invoke-interface {v0}, Ly7/f$e;->b()I

    move-result v0

    const-string v1, "searchClose"

    invoke-static {p1, v0, v1}, Ly7/f;->g(Ly7/f;ILjava/lang/String;)V

    return v2
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {p1}, Ly7/f;->a(Ly7/f;)Lcom/roblox/client/components/RobloxToolbar;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Ly7/f$a;->a:Landroidx/appcompat/widget/SearchView;

    new-instance v0, Ly7/f$a$a;

    invoke-direct {v0, p0}, Ly7/f$a$a;-><init>(Ly7/f$a;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    .line 3
    :cond_0
    iget-object p1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {p1}, Ly7/f;->c(Ly7/f;)Landroid/view/Menu;

    move-result-object v0

    iget-object v1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {v1}, Ly7/f;->d(Ly7/f;)Landroid/view/MenuItem;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Ly7/f;->e(Ly7/f;Landroid/view/Menu;Landroid/view/MenuItem;Z)V

    .line 4
    iget-object p1, p0, Ly7/f$a;->b:Ly7/f;

    invoke-static {p1}, Ly7/f;->f(Ly7/f;)Ly7/f$e;

    move-result-object v0

    invoke-interface {v0}, Ly7/f$e;->b()I

    move-result v0

    const-string v1, "searchOpen"

    invoke-static {p1, v0, v1}, Ly7/f;->g(Ly7/f;ILjava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
