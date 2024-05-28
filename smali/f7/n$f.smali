.class public Lf7/n$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lf7/n;


# direct methods
.method public constructor <init>(Lf7/n;)V
    .locals 0

    iput-object p1, p0, Lf7/n$f;->a:Lf7/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lg9/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lf7/n$f;->a:Lf7/n;

    invoke-virtual {v0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget-object v0, p0, Lf7/n$f;->a:Lf7/n;

    .line 3
    invoke-static {v0}, Lf7/n;->t(Lf7/n;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getRootView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lf7/n$f;->a:Lf7/n;

    .line 4
    invoke-virtual {v2}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    iget-object v3, p0, Lf7/n$f;->a:Lf7/n;

    .line 5
    invoke-virtual {v3}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v3

    check-cast v3, Lcom/roblox/client/i0;

    invoke-virtual {v3}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object v3

    invoke-virtual {v3}, Lo7/a;->c()Landroid/graphics/Rect;

    move-result-object v3

    .line 6
    invoke-static {v0, v2, v1, v3}, Lg9/b;->a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lg9/b;

    move-result-object v0

    return-object v0
.end method
