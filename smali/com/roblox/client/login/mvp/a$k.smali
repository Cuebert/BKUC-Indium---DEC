.class Lcom/roblox/client/login/mvp/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/login/mvp/a;->S2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/login/mvp/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/a$k;->n:Lcom/roblox/client/login/mvp/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a$k;->n:Lcom/roblox/client/login/mvp/a;

    invoke-static {p1}, Lcom/roblox/client/login/mvp/a;->C2(Lcom/roblox/client/login/mvp/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a$k;->n:Lcom/roblox/client/login/mvp/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/roblox/client/login/mvp/a;->D2(Lcom/roblox/client/login/mvp/a;Z)Z

    .line 3
    iget-object p1, p0, Lcom/roblox/client/login/mvp/a$k;->n:Lcom/roblox/client/login/mvp/a;

    iget-object p1, p1, Lcom/roblox/client/login/mvp/a;->T0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->r()V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
