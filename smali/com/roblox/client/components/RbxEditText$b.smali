.class Lcom/roblox/client/components/RbxEditText$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxEditText;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/components/RbxEditText;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText$b;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$b;->a:Lcom/roblox/client/components/RbxEditText;

    iget-object v0, v0, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
