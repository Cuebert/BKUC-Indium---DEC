.class Lcom/roblox/client/login/mvp/ActivityLoginMVP$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/login/mvp/ActivityLoginMVP;->N1(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/login/mvp/ActivityLoginMVP;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$e;->a:Lcom/roblox/client/login/mvp/ActivityLoginMVP;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    check-cast p1, Landroidx/appcompat/app/b;

    const/4 v0, -0x2

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object v1

    const/4 v2, -0x1

    .line 2
    invoke-virtual {p1, v2}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object p1

    .line 3
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-direct {v2, v0, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    invoke-virtual {p1, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-virtual {v1}, Landroid/widget/Button;->invalidate()V

    .line 7
    invoke-virtual {p1}, Landroid/widget/Button;->invalidate()V

    return-void
.end method
