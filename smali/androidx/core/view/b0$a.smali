.class Landroidx/core/view/b0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/b0;->i(Landroid/view/View;Landroidx/core/view/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/view/c0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroidx/core/view/b0;


# direct methods
.method constructor <init>(Landroidx/core/view/b0;Landroidx/core/view/c0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/view/b0$a;->c:Landroidx/core/view/b0;

    iput-object p2, p0, Landroidx/core/view/b0$a;->a:Landroidx/core/view/c0;

    iput-object p3, p0, Landroidx/core/view/b0$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/b0$a;->a:Landroidx/core/view/c0;

    iget-object v0, p0, Landroidx/core/view/b0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/c0;->onAnimationCancel(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/b0$a;->a:Landroidx/core/view/c0;

    iget-object v0, p0, Landroidx/core/view/b0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/c0;->onAnimationEnd(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/b0$a;->a:Landroidx/core/view/c0;

    iget-object v0, p0, Landroidx/core/view/b0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/c0;->onAnimationStart(Landroid/view/View;)V

    return-void
.end method
