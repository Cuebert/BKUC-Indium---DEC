.class Lcom/roblox/client/components/RbxProgressButton$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxProgressButton;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/components/RbxProgressButton;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxProgressButton;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxProgressButton$g;->n:Lcom/roblox/client/components/RbxProgressButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton$g;->n:Lcom/roblox/client/components/RbxProgressButton;

    invoke-static {v0}, Lcom/roblox/client/components/RbxProgressButton;->a(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/RbxProgressButton$i;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->n:Lcom/roblox/client/components/RbxProgressButton$i;

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton$g;->n:Lcom/roblox/client/components/RbxProgressButton;

    invoke-static {v0}, Lcom/roblox/client/components/RbxProgressButton;->k(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/components/RbxProgressButton$g;->n:Lcom/roblox/client/components/RbxProgressButton;

    invoke-static {v0}, Lcom/roblox/client/components/RbxProgressButton;->k(Lcom/roblox/client/components/RbxProgressButton;)Lcom/roblox/client/components/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/roblox/client/components/e;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method
