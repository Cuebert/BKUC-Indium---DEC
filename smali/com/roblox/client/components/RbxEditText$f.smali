.class Lcom/roblox/client/components/RbxEditText$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxEditText;->setHintText(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lcom/roblox/client/components/RbxEditText;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iput-object p2, p0, Lcom/roblox/client/components/RbxEditText$f;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v1, v0}, Lcom/roblox/client/components/RbxEditText;->d(Lcom/roblox/client/components/RbxEditText;Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    .line 3
    iget-object v2, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v2, v2, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 4
    new-instance v2, Landroid/graphics/Paint;

    iget-object v3, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v3, v3, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 5
    iget-object v3, p0, Lcom/roblox/client/components/RbxEditText$f;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    .line 6
    iget-object v4, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v4, v4, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_0

    .line 7
    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v3, p0, Lcom/roblox/client/components/RbxEditText$f;->n:Ljava/lang/String;

    iget-object v4, v1, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v5, v5, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v5, v5, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getPaddingRight()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v1, v3, v2, v4}, Lcom/roblox/client/components/RbxEditText;->k(Ljava/lang/String;Landroid/graphics/Paint;F)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/roblox/client/d1;->n(Landroid/content/Context;F)F

    move-result v1

    .line 8
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    iget-object v0, v0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 9
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/roblox/client/components/RbxEditText;->c(Lcom/roblox/client/components/RbxEditText;Z)Z

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$f;->o:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0, v1}, Lcom/roblox/client/components/RbxEditText;->f(Lcom/roblox/client/components/RbxEditText;F)F

    return-void
.end method
