.class Lcom/roblox/client/signup/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a;->I3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/Runnable;

.field final synthetic o:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$j;->o:Lcom/roblox/client/signup/a;

    iput-object p2, p0, Lcom/roblox/client/signup/a$j;->n:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/roblox/client/signup/a$j;->o:Lcom/roblox/client/signup/a;

    sget-object v0, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    invoke-static {p1, v0}, Lcom/roblox/client/signup/a;->G2(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$a0;)Lcom/roblox/client/signup/a$a0;

    .line 2
    iget-object p1, p0, Lcom/roblox/client/signup/a$j;->o:Lcom/roblox/client/signup/a;

    iget-object p1, p1, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    iget-object v0, p0, Lcom/roblox/client/signup/a$j;->n:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$j;->o:Lcom/roblox/client/signup/a;

    iget-object p1, p1, Lcom/roblox/client/signup/a;->a1:Lcom/roblox/client/components/RbxLoadingEditText;

    iget-object v0, p0, Lcom/roblox/client/signup/a$j;->n:Ljava/lang/Runnable;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

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
