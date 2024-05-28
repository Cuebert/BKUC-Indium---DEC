.class Lcom/roblox/client/components/j$d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/j;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/components/j;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/j;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/j$d;->a:Lcom/roblox/client/components/j;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/components/j$d;->a:Lcom/roblox/client/components/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/roblox/client/components/j;->d(Lcom/roblox/client/components/j;Z)Z

    .line 3
    iget-object p1, p0, Lcom/roblox/client/components/j$d;->a:Lcom/roblox/client/components/j;

    invoke-static {p1}, Lcom/roblox/client/components/j;->e(Lcom/roblox/client/components/j;)V

    return-void
.end method
