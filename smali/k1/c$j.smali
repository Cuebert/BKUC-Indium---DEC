.class Lk1/c$j;
.super Lk1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/c;->r(Landroid/view/ViewGroup;Lk1/r;Lk1/r;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Lk1/c;


# direct methods
.method constructor <init>(Lk1/c;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk1/c$j;->c:Lk1/c;

    iput-object p2, p0, Lk1/c$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lk1/m;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lk1/c$j;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lk1/l;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lk1/v;->c(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lk1/c$j;->a:Z

    return-void
.end method

.method public b(Lk1/l;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk1/c$j;->a:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lk1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lk1/v;->c(Landroid/view/ViewGroup;Z)V

    .line 3
    :cond_0
    invoke-virtual {p1, p0}, Lk1/l;->Z(Lk1/l$f;)Lk1/l;

    return-void
.end method

.method public d(Lk1/l;)V
    .locals 1

    iget-object p1, p0, Lk1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lk1/v;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public e(Lk1/l;)V
    .locals 1

    iget-object p1, p0, Lk1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lk1/v;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method
