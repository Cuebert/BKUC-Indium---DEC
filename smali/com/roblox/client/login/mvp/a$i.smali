.class Lcom/roblox/client/login/mvp/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/login/mvp/a;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/login/mvp/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a$i;->a:Lcom/roblox/client/login/mvp/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/login/mvp/a$i;->a:Lcom/roblox/client/login/mvp/a;

    const-string v0, "username"

    invoke-static {p1, v0, p2}, Lcom/roblox/client/login/mvp/a;->B2(Lcom/roblox/client/login/mvp/a;Ljava/lang/String;Z)V

    return-void
.end method
