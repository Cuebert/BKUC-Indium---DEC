.class Landroidx/fragment/app/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/k;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/fragment/app/q;

.field final synthetic o:Landroidx/fragment/app/k;


# direct methods
.method constructor <init>(Landroidx/fragment/app/k;Landroidx/fragment/app/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/k$a;->o:Landroidx/fragment/app/k;

    iput-object p2, p0, Landroidx/fragment/app/k$a;->n:Landroidx/fragment/app/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/k$a;->n:Landroidx/fragment/app/q;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->k()Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/k$a;->n:Landroidx/fragment/app/q;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->m()V

    .line 3
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->U:Landroid/view/View;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/k$a;->o:Landroidx/fragment/app/k;

    iget-object v0, v0, Landroidx/fragment/app/k;->n:Landroidx/fragment/app/FragmentManager;

    invoke-static {p1, v0}, Landroidx/fragment/app/z;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/z;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/z;->j()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
