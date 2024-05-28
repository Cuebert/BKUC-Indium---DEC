.class final Lm4/a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm4/a;->b(Lm4/d;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm4/d;


# direct methods
.method constructor <init>(Lm4/d;)V
    .locals 0

    iput-object p1, p0, Lm4/a$a;->a:Lm4/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lm4/a$a;->a:Lm4/d;

    invoke-interface {p1}, Lm4/d;->a()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lm4/a$a;->a:Lm4/d;

    invoke-interface {p1}, Lm4/d;->b()V

    return-void
.end method
