.class public final synthetic Lcom/roblox/client/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/RbxKeyboard;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/g0;->a:Lcom/roblox/client/RbxKeyboard;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/g0;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-static {v0, p1, p2}, Lcom/roblox/client/RbxKeyboard;->a(Lcom/roblox/client/RbxKeyboard;Landroid/view/View;Z)V

    return-void
.end method
