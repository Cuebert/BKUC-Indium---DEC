.class Lcom/roblox/client/i0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/i0;->w1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/i0;


# direct methods
.method constructor <init>(Lcom/roblox/client/i0;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/i0$b;->n:Lcom/roblox/client/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/i0$b;->n:Lcom/roblox/client/i0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/roblox/client/i0;->f1(Lcom/roblox/client/i0;Landroidx/appcompat/app/b;)Landroidx/appcompat/app/b;

    return-void
.end method
