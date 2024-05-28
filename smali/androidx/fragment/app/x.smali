.class Landroidx/fragment/app/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/c;
.implements Landroidx/lifecycle/z;


# instance fields
.field private final n:Landroidx/fragment/app/Fragment;

.field private final o:Landroidx/lifecycle/y;

.field private p:Landroidx/lifecycle/m;

.field private q:Landroidx/savedstate/b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    .line 3
    iput-object v0, p0, Landroidx/fragment/app/x;->q:Landroidx/savedstate/b;

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/x;->n:Landroidx/fragment/app/Fragment;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/x;->o:Landroidx/lifecycle/y;

    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/f$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method b()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroidx/lifecycle/m;

    invoke-direct {v0, p0}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/l;)V

    iput-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    .line 3
    invoke-static {p0}, Landroidx/savedstate/b;->a(Landroidx/savedstate/c;)Landroidx/savedstate/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x;->q:Landroidx/savedstate/b;

    :cond_0
    return-void
.end method

.method c()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x;->q:Landroidx/savedstate/b;

    invoke-virtual {v0, p1}, Landroidx/savedstate/b;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x;->q:Landroidx/savedstate/b;

    invoke-virtual {v0, p1}, Landroidx/savedstate/b;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public f()Landroidx/lifecycle/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/x;->b()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    return-object v0
.end method

.method g(Landroidx/lifecycle/f$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x;->p:Landroidx/lifecycle/m;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/m;->o(Landroidx/lifecycle/f$c;)V

    return-void
.end method

.method public i0()Landroidx/lifecycle/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/x;->b()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/x;->o:Landroidx/lifecycle/y;

    return-object v0
.end method

.method public l()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/x;->b()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/x;->q:Landroidx/savedstate/b;

    invoke-virtual {v0}, Landroidx/savedstate/b;->b()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    return-object v0
.end method
