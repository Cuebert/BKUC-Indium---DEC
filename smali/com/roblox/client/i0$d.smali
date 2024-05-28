.class Lcom/roblox/client/i0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/i0;->y1(ZLcom/roblox/client/i0$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/i0$g;

.field final synthetic o:Lcom/roblox/client/i0;


# direct methods
.method constructor <init>(Lcom/roblox/client/i0;Lcom/roblox/client/i0$g;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/i0$d;->o:Lcom/roblox/client/i0;

    iput-object p2, p0, Lcom/roblox/client/i0$d;->n:Lcom/roblox/client/i0$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/i0$d;->n:Lcom/roblox/client/i0$g;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, p2, v0}, Lcom/roblox/client/i0$g;->a(ZZ)V

    :cond_0
    return-void
.end method
