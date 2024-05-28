.class Lk1/l$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/l;->c0(Landroid/animation/Animator;Lh0/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh0/a;

.field final synthetic b:Lk1/l;


# direct methods
.method constructor <init>(Lk1/l;Lh0/a;)V
    .locals 0

    iput-object p1, p0, Lk1/l$b;->b:Lk1/l;

    iput-object p2, p0, Lk1/l$b;->a:Lh0/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/l$b;->a:Lh0/a;

    invoke-virtual {v0, p1}, Lh0/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lk1/l$b;->b:Lk1/l;

    iget-object v0, v0, Lk1/l;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lk1/l$b;->b:Lk1/l;

    iget-object v0, v0, Lk1/l;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
